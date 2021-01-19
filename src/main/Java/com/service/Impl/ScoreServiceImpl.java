package com.service.Impl;

import com.dao.ScoreDao;
import com.pojo.Score;
import com.service.ScoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:17
 * Date:2021-01-15 11:47
 * Description:<描述>
 */
@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreDao scoreDao;

    @Override
    public List<Score> getScoreInfo() {
        List<Score> scoreInfo = scoreDao.getScoreInfo();
        return scoreInfo;
    }
}
