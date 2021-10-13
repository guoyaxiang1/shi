package com.s3.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Hotevents {
    private Integer id;
    private String keyWord;
    private String hotContent;
    private Integer searchSum;
    private String createDate;
    private List<Comments> commentslist;
}
