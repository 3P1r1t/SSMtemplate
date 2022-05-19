package top.spirit.repository;

import top.spirit.entity.AutoStatus;

import java.util.List;

public interface AutoRepository {
    public List<AutoStatus> findAll();
    public AutoStatus findOn();

}
