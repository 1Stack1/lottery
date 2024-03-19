package com.example.lottery.domain.strategy.service.draw;

import com.example.lottery.domain.strategy.model.req.DrawReq;
import com.example.lottery.domain.strategy.model.res.DrawResult;

/**
 * @author banana69
 */
public interface IDrawExec {
    DrawResult doDrawExec(DrawReq req);
}
