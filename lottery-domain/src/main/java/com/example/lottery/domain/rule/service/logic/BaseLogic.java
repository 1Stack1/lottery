package com.example.lottery.domain.rule.service.logic;

import com.example.lottery.common.Constants;
import com.example.lottery.domain.rule.model.req.DecisionMatterReq;
import com.example.lottery.domain.rule.model.vo.TreeNodeLineVO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: banana69
 * @date: 2023/04/18/14:07
 * @description: 规则基础抽象类
 */
public abstract class BaseLogic implements LogicFilter {
    @Override
    public Long filter(String matterValue, List<TreeNodeLineVO> treeNodeLineInfoList) {
        for(TreeNodeLineVO nodeLine : treeNodeLineInfoList){
            if(decisionLogic(matterValue, nodeLine)){
                return nodeLine.getNodeIdTo();
            }
        }
        return Constants.Global.TREE_NULL_NODE;
    }

    /**
     * 获取规则比对值
     * @param decisionMatter 决策物料
     * @return 比对值
     */

    @Override
    public  abstract String matterValue(DecisionMatterReq decisionMatter);

    private boolean  decisionLogic(String matterValue, TreeNodeLineVO nodeLine){
        switch (nodeLine.getRuleLimitType()){
            case Constants.RuleLimitType.EQUAL:
                return matterValue.equals(nodeLine.getRuleLimitValue());
            case Constants.RuleLimitType.GT:
                return Double.parseDouble(matterValue) > Double.parseDouble(nodeLine.getRuleLimitValue());
            case Constants.RuleLimitType.LT:
                return Double.parseDouble(matterValue) < Double.parseDouble(nodeLine.getRuleLimitValue());
            case Constants.RuleLimitType.GE:
                return Double.parseDouble(matterValue) >= Double.parseDouble(nodeLine.getRuleLimitValue());
            case Constants.RuleLimitType.LE:
                return Double.parseDouble(matterValue) <= Double.parseDouble(nodeLine.getRuleLimitValue());
            default:
                return false;
        }
    }
}
