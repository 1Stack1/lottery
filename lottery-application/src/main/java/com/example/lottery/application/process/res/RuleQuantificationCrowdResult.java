package com.example.lottery.application.process.res;

import com.example.lottery.common.Result;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: banana69
 * @date: 2023/04/19/15:35
 * @description:
 */
public class RuleQuantificationCrowdResult extends Result {
    /** 活动ID */
    private Long activityId;

    public RuleQuantificationCrowdResult(String code, String info) {
        super(code, info);
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }


}
