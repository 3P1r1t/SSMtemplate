package top.spirit.service;

import top.spirit.entity.AutoStatus;
import top.spirit.entity.WaterAlarmRule;

import java.util.List;
import java.util.Map;

public interface AutoResultService {
    //返回所有自动规则
    public List<AutoStatus> findAutoResultAll();
    //返回开启的自动规则
    public AutoStatus findAutoResultOn();
    //插入自动执行后的结果
    public int insertAutoResult(Map map);
    //插入新的自动规则
    public int insertAutoRule(Map map);
    //删除规则
    public int deleteAutoRule(int id);
    //更新规则
    public int updateAutoRule(int id, Map map);
}
