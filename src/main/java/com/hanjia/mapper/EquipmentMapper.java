package com.hanjia.mapper;

import com.hanjia.entity.Equipment;
import com.hanjia.entity.Suit;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentMapper {

    Equipment getEquipmentByName(String name);

    List<Equipment> getAllEquipments();

    Suit getSuitByName(String name);

    void update(Equipment equipment);

    void add(@Param("equipments") List<Equipment> equipments);

    void delete(String id);

}
