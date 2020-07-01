package com.hanjia.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Suit {
    private String id;
    /**套装名称*/
    private String name;
    /**作用（词条），以；（中文的）隔开*/
    private String effect;
}
