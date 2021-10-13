package com.s3.service;

import com.s3.pojo.Hotevents;
import com.s3.util.PageUtil;

import java.util.List;

public interface HoteventsService {
    PageUtil<Hotevents> get4Page(String keyWord, Integer pageIndex, Integer pageSize);
    Hotevents getByid(Integer id);
    int update(Integer id);
}
