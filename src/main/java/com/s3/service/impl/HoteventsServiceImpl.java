package com.s3.service.impl;

import com.s3.mapper.HoteventsMapper;
import com.s3.pojo.Hotevents;
import com.s3.service.HoteventsService;
import com.s3.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HoteventsServiceImpl implements HoteventsService {
    @Resource
    HoteventsMapper mapper;
    @Override
    public PageUtil<Hotevents> get4Page(String keyWord, Integer pageIndex, Integer pageSize) {
        PageUtil<Hotevents>pageUtil=new PageUtil<>();
        pageUtil.setPageIndex(pageIndex);
        pageUtil.setPageSize(pageSize);
        pageUtil.setTotalCount(mapper.getCount(keyWord));
        pageUtil.setList(mapper.get4Page(keyWord,(pageIndex-1)*pageSize,pageSize));
        return pageUtil;
    }

    @Override
    public Hotevents getByid(Integer id) {
        return mapper.getByid(id);
    }

    @Override
    public int update(Integer id) {
        return mapper.update(id);
    }
}
