package com.s3.mapper;

import com.s3.pojo.Comments;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentsMapper {
    List<Comments>getAll(Integer id);
    int add(Comments comments);
}
