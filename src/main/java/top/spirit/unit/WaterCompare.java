package top.spirit.unit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import top.spirit.entity.Water;
import top.spirit.entity.WaterAlarmRule;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
public class WaterCompare {
    public  Map<String, Object> outOfRangeCompare(WaterAlarmRule waterAlarmRule, Water water) {
        //是否有越界
        int flag = 0;
        Map<String, Object> info = new HashMap<>();
        List<String> messageList = new ArrayList<String>();
        //water属性
        int water_id = water.getWater_id();
        int pool_id = water.getPool_id();
        double water_an = water.getWater_an();
        double water_ph = water.getWater_ph();
        double water_oxy = water.getWater_oxy();
        double water_salt = water.getWater_salt();
        double water_tem = water.getWater_tem();
        //rule属性
        int rule_id = waterAlarmRule.getId();
        double an_max = waterAlarmRule.getAn_max();
        double an_min = waterAlarmRule.getAn_min();
        double oxy_max = waterAlarmRule.getOxy_max();
        double oxy_min = waterAlarmRule.getOxy_min();
        double ph_max = waterAlarmRule.getPh_max();
        double ph_min = waterAlarmRule.getPh_min();
        double salt_max = waterAlarmRule.getSalt_max();
        double salt_min = waterAlarmRule.getSalt_min();
        double tem_max = waterAlarmRule.getTem_max();
        double tem_min = waterAlarmRule.getTem_min();
        //对其进行比对
        info.put("water_id",water_id);
        info.put("rule_id",rule_id);
        info.put("pool_id",pool_id);
        if (water_an < an_min) {
            info.put("water_an", 0);
            messageList.add("氨氮低于阈值");
            flag+=1;
        }
        if (water_an > an_max) {
            info.put("water_an", 1);
            messageList.add("氨氮高于阈值");
            flag+=1;
        }
        if (water_oxy < oxy_min) {
            info.put("water_oxy", 0);
            messageList.add("氧浓度低于阈值");
            flag+=1;
        }
        if (water_oxy > oxy_max) {
            info.put("water_oxy", 1);
            messageList.add("氧浓度高于阈值");
            flag+=1;
        }
        if (water_ph < ph_min) {
            info.put("water_ph", 0);
            messageList.add("PH值低于阈值");
            flag+=1;
        }
        if (water_ph > ph_max) {
            info.put("water_ph", 1);
            messageList.add("PH值高于阈值");
            flag+=1;
        }
        if (water_salt < salt_min) {
            info.put("water_salt", 0);
            messageList.add("盐度低于阈值");
            flag+=1;
        }
        if (water_salt > salt_max) {
            info.put("water_salt", 1);
            messageList.add("盐度高于阈值");
            flag+=1;
        }
        if (water_tem < tem_min) {
            info.put("water_tem", 0);
            messageList.add("温度低于阈值");
            flag+=1;
        }
        if (water_tem > tem_max) {
            info.put("water_tem", 1);
            messageList.add("温度高于阈值");
            flag+=1;
        }
        info.put("flag",flag);
        info.put("message",messageList);
        System.out.println(info);
        System.out.println(info.get("message"));
        return info;
    }

}
