package com.ck.controller;

import com.ck.entity.BookInfo;
import com.ck.entity.BookType;
import com.ck.service.BookInfoService;
import com.ck.service.BookTypeService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Controller
public class bookinfocontroller {
    @Autowired
    private BookInfoService bookInfoService;
    @Autowired
    private BookTypeService bookTypeService;
    @RequestMapping("overquery")
    public String queryinfos(ModelMap map,@RequestParam HashMap hmap,int page){
        Page<BookInfo> queryinfos = bookInfoService.overqueryall(hmap,page);
        List<BookType> querytypes = bookTypeService.querytypes();
        map.put("infolist", queryinfos.getResult());
        map.put("typelist",querytypes);
        map.put("this",queryinfos.getPageNum());
        map.put("All",queryinfos.getPages());
        map.put("Sevart",queryinfos.getPageSize());
        return "p_list";
    }
    @RequestMapping("queryadd")
    public  String queryadd(ModelMap map){
        List<BookType> querytypes = bookTypeService.querytypes();
        map.put("typelist", querytypes);
        return "p_add";
    }

    @RequestMapping("addinfo")
    public String addinfo(BookInfo bookInfo, int tid, MultipartFile file, HttpSession session,String time){
        BookType bookType = new BookType();
        bookType.setBtid(tid);
        bookInfo.setBookType(bookType);
        String filename = file.getOriginalFilename();
        filename = filename.replace(
                filename.substring(0, filename.lastIndexOf(".")),
                UUID.randomUUID().toString());
        bookInfo.setImgurl(filename);
        filename= session.getServletContext().getRealPath("/images/book_img/")+filename;
        try {
            file.transferTo(new File(filename));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date parse = simpleDateFormat.parse(time );
            bookInfo.setDtime(parse);
            bookInfoService.addinfo(bookInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:overquery";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String delete(@RequestParam int[] id){
        bookInfoService.deletebyid(id);
        return "1";
    }

}
