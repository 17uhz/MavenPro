package com.dao;

import com.pojo.Score;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author:17
 * Date:2021-01-15 11:43
 * Description:<描述>
 */
@Mapper
public interface ScoreDao {
    List<Score> getScoreInfo();
}
