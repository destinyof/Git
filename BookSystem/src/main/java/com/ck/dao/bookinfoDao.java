package com.ck.dao;

import com.ck.entity.BookInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.faces.annotation.RequestMap;
import java.util.HashMap;
import java.util.List;

public interface bookinfoDao {

    public List<BookInfo> overqueryall(HashMap map);

    @Insert("insert into bookinfo values(seq_bookinfo.nextval,#{bname},#{price},#{bookType.btid},#{dtime},#{imgurl},#{state})")
    public void addinfo(BookInfo bookInfo);

    public void deletebyid(int[] id);
}
