package com.example.lottery.infrastructure.dao;

import com.example.lottery.infrastructure.po.Award;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author banana69
 */
@Mapper
public interface IAwardDao extends BaseMapper<Award> {

    void insertList(List<Award> req);
}
