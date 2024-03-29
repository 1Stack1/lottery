package com.example.lotteryERP.interfaces.lottery.service;

import com.example.lotteryERP.domain.activity.model.ActivityListPageReq;
import com.example.lotteryERP.infrastrusture.common.EasyResult;
import com.example.lotteryERP.interfaces.lottery.dto.Activity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: banana69
 * @date: 2023/04/23/23:08
 * @description:
 */
public interface IActivityService extends IService<Activity>  {
    /**
     * 查询活动分页数据
     * @param req   入参
     * @return      结果
     */
    EasyResult<?> queryActivityListPage(ActivityListPageReq req);
}
