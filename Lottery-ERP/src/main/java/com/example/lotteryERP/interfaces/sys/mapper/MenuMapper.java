package com.example.lotteryERP.interfaces.sys.mapper;

import com.example.lotteryERP.interfaces.sys.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface MenuMapper extends BaseMapper<Menu> {

    List<String> selectPermsByUserId(Long userid);
}
