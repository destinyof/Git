package com.ck.controller;

import com.ck.entity.BookType;
import com.ck.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class booktypecontroller {
    @Autowired
    private  BookTypeService bookTypeService;

    @RequestMapping("queryalltype")
    public String queryalltype(ModelMap map){
        List<BookType> querytypes = bookTypeService.querytypes();
        map.put("typelist", querytypes);
        return "p_list";
    }
}
