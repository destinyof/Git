package com.ck.service.impl;

import com.ck.dao.bookinfoDao;
import com.ck.entity.BookInfo;
import com.ck.service.BookInfoService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class BookInfoServiceImpl implements BookInfoService {
    @Autowired
    private bookinfoDao bookinfoDao;



    @Override
    public Page<BookInfo> overqueryall(HashMap map, int pagenum) {
        Page<BookInfo> page = PageHelper.startPage(pagenum, 5);
        bookinfoDao.overqueryall(map);
        return  page;
    }

    @Override
    public void addinfo(BookInfo bookInfo) {
        bookinfoDao.addinfo(bookInfo);
    }

    @Override
    public void deletebyid(int[] id) {
        bookinfoDao.deletebyid(id);
    }
}
