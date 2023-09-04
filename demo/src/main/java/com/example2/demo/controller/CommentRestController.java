package com.example2.demo.controller;

import com.example2.demo.dao.CommentDAO;
import com.example2.demo.dao.CommentJdbcDAO;
import com.example2.demo.model.CommentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import java.util.List;
import java.util.Map;

@RestController
public class CommentRestController {

    @Autowired
    private CommentDAO commentDAO;

    @GetMapping(value = "/test")
    public String testRequest(){
        List<CommentModel> commentList = commentDAO.selectAllCommentList();
        CommentModel cmt = commentList.get(0); // 테스트로 하나만 꺼내서 찍기.

        return String.format("번호: %s, 작성자: %s, 댓글: %s, 날짜: %s",
                cmt.getNo(),
                cmt.getAuthor(),
                cmt.getComment(),
                StringUtils.toString(cmt.getDate())
        );
    }

}
