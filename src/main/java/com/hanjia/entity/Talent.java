package com.hanjia.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 心决信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Talent {
    private String id;
    private String name;
    /**简介*/
    private String synopsis;
    /**器值*/
    private int value;
    /**心决属性*/
    private String attributes;
    /**心决位置*/
    private int position;
}
