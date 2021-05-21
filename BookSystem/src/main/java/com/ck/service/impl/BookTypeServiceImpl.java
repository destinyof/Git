package com.ck.service.impl;

import com.ck.dao.booktypeDao;
import com.ck.entity.BookType;
import com.ck.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookTypeServiceImpl implements BookTypeService {
    @Autowired
    private booktypeDao booktypeDao;
    @Override
    public List<BookType> querytypes() {
        return booktypeDao.querytypes();
    }

    @Override
    public BookType querytypebyid(int id) {
        return booktypeDao.querytypebyid(id);
    }
}
