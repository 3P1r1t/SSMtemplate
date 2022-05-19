package top.spirit.repository;

import top.spirit.entity.Water;

import java.util.List;

public interface WaterRepository {
    public List<Water> findAll();
    public Water findNewData();
}
