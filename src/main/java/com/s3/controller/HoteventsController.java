package com.s3.controller;

import com.s3.pojo.Comments;
import com.s3.pojo.Hotevents;
import com.s3.service.CommentsService;
import com.s3.service.HoteventsService;
import com.s3.util.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class HoteventsController {
    @Resource
    CommentsService commentService;
    @Resource
    HoteventsService hoteventsService;
    @RequestMapping("/")
    public String index(){
        return "redirect:/getLimit";
    }
    @RequestMapping("/getLimit")
    public String getLimit(String keyWord,
                           @RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex, Model model){
        model.addAttribute("page",hoteventsService.get4Page(keyWord, pageIndex, 2));
        return "index";
    }
    @RequestMapping("/getList")
    @ResponseBody
    public PageUtil<Hotevents> getList(String keyWord,@RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex){
        return hoteventsService.get4Page(keyWord,pageIndex,2);
    }
    @RequestMapping("/Ping")
    public String Ping(Integer id,Model model){
        model.addAttribute("id",id);
        return "ping";
    }
    @RequestMapping("/showPin")
    @ResponseBody
    public Hotevents showPin(Integer id){

        return hoteventsService.getByid(id);
    }

    @RequestMapping("/doadd")
    @ResponseBody
    public String doadd(Comments comments){
        if (commentService.add(comments)>0){
            hoteventsService.update(comments.getHotId());
            return "1";
        }
        return "0";
    }

}

