package top.spirit.repository;

import top.spirit.entity.AutoStatus;

import java.util.List;
import java.util.Map;

public interface AutoRepository {
    public List<AutoStatus> findAutoRuleAll();
    public AutoStatus findAutoRuleOn();
    public int insertAutoResult(Map map);
    public int insertAutoRule(Map map);
    public int deleteAutoRule(int id);
    public int updateAutoRule(int id,Map map);
}
