package com.s3.service;

import com.s3.pojo.Comments;

import java.util.List;

public interface CommentsService {
    List<Comments> getAll(Integer id);
    int add(Comments comments);
}
