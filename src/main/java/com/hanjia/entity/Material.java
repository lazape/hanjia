package com.hanjia.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Material {
    private int id;
    private String name;
    private String source;
    private String effect;
}
