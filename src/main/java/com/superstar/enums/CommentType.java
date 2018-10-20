package com.superstar.enums;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午9:12 2018/10/18.
 */
public enum  CommentType {
    Good(1,5,5),
    Middle(2,1,5),
    Poor(3,0,1);


    private int type;
    private double minScore;
    private double maxScore;

    CommentType(int type, double minScore, double maxScore) {
        this.type = type;
        this.minScore = minScore;
        this.maxScore = maxScore;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getMinScore() {
        return minScore;
    }

    public void setMinScore(double minScore) {
        this.minScore = minScore;
    }

    public double getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(double maxScore) {
        this.maxScore = maxScore;
    }
}
