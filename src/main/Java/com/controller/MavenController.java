package com.controller;

import com.pojo.Score;
import com.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Author:17
 * Date:2021-01-15 11:41
 * Description:<描述>
 */
@Controller
public class MavenController {

    @Autowired
    private ScoreService service;

    @RequestMapping("/scoreInfo")
    @ResponseBody
    public List<Score> getScoreInfo(HttpServletRequest request){
        String mark = request.getParameter("mark");
        System.out.println(mark);
        List<Score> scoreInfo = service.getScoreInfo();
        return scoreInfo;
    }

}
