package top.spirit.service;

import top.spirit.entity.Water;

import java.util.List;

public interface WaterService {
    public List<Water> findAll();
    public Water findNewData();
}
