package top.spirit.service.impl;

import org.springframework.stereotype.Service;
import top.spirit.entity.AutoStatus;
import top.spirit.repository.AutoRepository;
import top.spirit.service.AutoResultService;

import java.util.List;
import java.util.Map;
@Service
public class AutoResultServiceImpl implements AutoResultService {
    private final AutoRepository autoRepository;

    public AutoResultServiceImpl(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }


    @Override
    public List<AutoStatus> findAutoResultAll() {
        return autoRepository.findAutoRuleAll();
    }

    @Override
    public AutoStatus findAutoResultOn() {
        return autoRepository.findAutoRuleOn();
    }

    @Override
    public int insertAutoResult(Map map) {
        return autoRepository.insertAutoResult(map);
    }

    @Override
    public int insertAutoRule(Map map) {
        return autoRepository.insertAutoRule(map);
    }

    @Override
    public int deleteAutoRule(int id) {
        return autoRepository.deleteAutoRule(id);
    }

    @Override
    public int updateAutoRule(int id, Map map) {
        return autoRepository.updateAutoRule(id,map);
    }


}
