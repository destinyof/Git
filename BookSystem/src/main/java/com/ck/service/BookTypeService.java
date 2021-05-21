package com.ck.service;

import com.ck.entity.BookType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookTypeService {
    public List<BookType> querytypes();

    public  BookType querytypebyid(int id);
}
