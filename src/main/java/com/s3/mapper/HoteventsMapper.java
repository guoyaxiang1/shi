package com.s3.mapper;

import com.s3.pojo.Hotevents;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HoteventsMapper {
    int getCount(@Param("keyWord") String keyWord);
    List<Hotevents>get4Page(@Param("keyWord") String keyWord,@Param("pageIndex") Integer pageIndex,@Param("pageSize") Integer pageSize);
    Hotevents getByid(Integer id);
    int update(Integer id);
}
