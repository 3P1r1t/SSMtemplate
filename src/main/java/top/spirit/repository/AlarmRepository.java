package top.spirit.repository;

import top.spirit.entity.AlarmResultStatus;
import top.spirit.entity.WaterAlarmRule;

import java.util.List;
import java.util.Map;

public interface AlarmRepository {
    //查找报警结果
    public List<AlarmResultStatus> findAlarmResultAll();
    public List<AlarmResultStatus> findAlarmResultOn();
    public List<AlarmResultStatus> findAlarmResultOff();
    //返回规则列表
    public List<WaterAlarmRule> findWaterAlarmRuleAll();
    //返回开启的规则
    public WaterAlarmRule findWaterAlarmRuleOn();
    //向数据库插入越界的水
    public int insertAlarmWater(Map map);
    //向数据库插入规则
    public int insertWaterAlarmRule(Map map);
    //删除规则
    public int deleteWaterAlarmRule(int id);
    //更新规则
    public int updateWaterAlarmRule(int id,Map map);
}
