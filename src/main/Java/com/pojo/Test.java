package com.pojo;

/**
 * Author:17
 * Date:2021-01-15 22:59
 * Description:<描述>
 */
public class Test {
    private String mark;

    public Test() {
    }

    public Test(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Test{" +
                "mark='" + mark + '\'' +
                '}';
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
