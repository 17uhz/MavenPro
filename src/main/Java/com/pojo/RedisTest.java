package com.pojo;

import java.io.Serializable;

/**
 * Author:17
 * Date:2021-02-21 19:02
 * Description:<描述>
 */
public class RedisTest implements Serializable {

    private String id;
    private String name;

    public RedisTest() {
    }

    public RedisTest(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "RedisTest{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
