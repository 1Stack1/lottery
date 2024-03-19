package com.example.lottery.rpc.res;

import java.io.Serializable;

import com.example.lottery.common.Result;
import com.example.lottery.rpc.dto.AwardDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.

 * @author: banana69
 * @date: 2023/4/19/16:18
 * @description:  抽奖结果
 */
@NoArgsConstructor
@AllArgsConstructor
public class DrawRes extends Result implements Serializable{

    private AwardDTO awardDTO;

    public DrawRes(String code, String info) {
        super(code, info);
    }

    public AwardDTO getAwardDTO() {
        return awardDTO;
    }

    public void setAwardDTO(AwardDTO awardDTO) {
        this.awardDTO = awardDTO;
    }
}
