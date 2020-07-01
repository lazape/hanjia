package com.hanjia.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Equipment {
    private String id;
    private String name;
    /**最大词条数*/
    private int entry;
    /**穿戴等级需求和其他要求，以；（中文的）隔开*/
    private String claim;
    /**固定词条，以；（中文的）隔开*/
    private String constantEntry;
    /**浮动词条，以；（中文的）隔开*/
    private String floatEntry;
    /**稀有词条，以；（中文的）隔开*/
    private String scarce;
    /**所属套装的ID*/
    private String suitId;
    /**如果是武器的话存在武功类别的区别，比如剑系武器，刀系武器等*/
    private String type;
}
