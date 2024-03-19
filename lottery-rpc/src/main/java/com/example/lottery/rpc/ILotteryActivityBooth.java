package com.example.lottery.rpc;

import com.example.lottery.rpc.req.DrawReq;
import com.example.lottery.rpc.req.QuantificationDrawReq;
import com.example.lottery.rpc.res.DrawRes;

/**
 * @author: banana69
 * @date: 2023/4/19/16:00
 * @description: 抽奖活动展台接口
 */

public interface ILotteryActivityBooth {
    /**
     * 指定活动抽奖
     * @param drawReq 请求参数
     * @return        抽奖结果
     */
    DrawRes doDraw(DrawReq drawReq);

    /**
     * 量化人群抽奖
     * @param quantificationDrawReq 请求参数
     * @return                      抽奖结果
     */
    DrawRes doQuantificationDraw(QuantificationDrawReq quantificationDrawReq);

}
