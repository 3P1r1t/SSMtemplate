package top.spirit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.spirit.entity.Water;
import top.spirit.repository.WaterRepository;
import top.spirit.service.WaterService;

import java.util.List;

@Service
public class WaterServiceImpl implements WaterService {

    @Autowired
    private WaterRepository waterRepository;

    @Override
    public List<Water> findAll() {
        return waterRepository.findAll();
    }

    @Override
    public Water findNewData() {
        return waterRepository.findNewData();
    }
}
