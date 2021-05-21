package com.ck.dao;

import com.ck.entity.BookType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface booktypeDao {
    @Select("select * from booktype")
    public List<BookType> querytypes();

    @Select("select * from booktype where btid=#{0}")
    public  BookType querytypebyid(int id);
}
