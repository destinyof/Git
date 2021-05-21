package com.ck.service;

import com.ck.entity.BookInfo;
import com.github.pagehelper.Page;

import java.util.HashMap;
import java.util.List;

public interface BookInfoService {


    public Page<BookInfo> overqueryall(HashMap map,int pagenum);

    public void addinfo(BookInfo bookInfo);

    public void deletebyid(int[] id);
}
