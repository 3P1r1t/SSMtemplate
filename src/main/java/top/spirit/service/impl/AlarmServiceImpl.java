package top.spirit.service.impl;

import org.springframework.stereotype.Service;
import top.spirit.entity.AlarmResultStatus;
import top.spirit.entity.WaterAlarmRule;
import top.spirit.repository.AlarmRepository;
import top.spirit.service.AlarmService;

import java.util.List;
import java.util.Map;

//获得水质报警规则
@Service
public class AlarmServiceImpl implements AlarmService {

    private final AlarmRepository alarmRepository;

    public AlarmServiceImpl(AlarmRepository alarmRepository) {
        this.alarmRepository = alarmRepository;
    }


    @Override
    public List<AlarmResultStatus> findAlarmResultAll() {
        return alarmRepository.findAlarmResultAll();
    }

    @Override
    public List<AlarmResultStatus> findAlarmResultOn() {
        return alarmRepository.findAlarmResultOn();
    }

    @Override
    public List<AlarmResultStatus> findAlarmResultOff() {
        return alarmRepository.findAlarmResultOff();
    }

    @Override
    public List<WaterAlarmRule> findWaterAlarmRuleAll() {
        return alarmRepository.findWaterAlarmRuleAll();
    }

    @Override
    public WaterAlarmRule findWaterAlarmRuleOn() {
        return alarmRepository.findWaterAlarmRuleOn();
    }

    @Override
    public int insertAlarmWater(Map map) {
        return alarmRepository.insertAlarmWater(map);
    }

    @Override
    public int insertWaterAlarmRule(Map map) {
        return alarmRepository.insertWaterAlarmRule(map);
    }

    @Override
    public int deleteWaterAlarmRule(int id) {
        return alarmRepository.deleteWaterAlarmRule(id);
    }

    @Override
    public int updateWaterAlarmRule(int id, Map map) {
        return alarmRepository.updateWaterAlarmRule(id,map);
    }
}
