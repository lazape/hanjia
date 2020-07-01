package com.hanjia.mapper;

import com.hanjia.entity.Attribute;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttributeMapper {

    String getEffectByName(String name);

    List<Attribute> getAllAttributes();

    Attribute getAttributeById(int id);

    void updateEffectById(@Param("effect") String effect, @Param("id") int id);

    void updateEffectByName(@Param("effect") String effect, @Param("name")String name);

    void addAttribute(Attribute attribute);
}
