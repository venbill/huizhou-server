package com.superstar.model.shop.Vm;

import com.superstar.model.shop.GoodsComment;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午10:22 2018/10/15.
 */
public class GoodsCommentDetail extends GoodsComment{

    /**
     * 客户头像
     */
    private String cusPicture;

    /**
     * 客户昵称
     */
    private String nick;

    public String getCusPicture() {
        return cusPicture;
    }

    public void setCusPicture(String cusPicture) {
        this.cusPicture = cusPicture;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
