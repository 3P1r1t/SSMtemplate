package top.spirit.entity;

import lombok.Data;

@Data
//水质预警规则
public class WaterAlarmRule {
    private int id;
    private int on_status;
    private double oxy_max;
    private double oxy_min;
    private double tem_max;
    private double tem_min;
    private double an_max;
    private double an_min;
    private double ph_max;
    private double ph_min;
    private double salt_max;
    private double salt_min;
}
