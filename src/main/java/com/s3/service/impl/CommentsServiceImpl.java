package com.s3.service.impl;

import com.s3.mapper.CommentsMapper;
import com.s3.pojo.Comments;
import com.s3.service.CommentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService {
    @Resource
    CommentsMapper mapper;
    @Override
    public List<Comments> getAll(Integer id) {
        return mapper.getAll(id);
    }

    @Override
    public int add(Comments comments) {
        return mapper.add(comments);
    }
}
