package top.spirit.entity;

import lombok.Data;

@Data
public class AlarmResultStatus {
    private int alarm_id;
    private int water_id;
    private int pool_id;
    private int alarm_rule_id;
    private int alarm_status;
    private String alarm_time;
    private int water_oxy;
    private int water_tem;
    private int water_an;
    private int water_ph;
    private int water_salt;
    private int alarm_level;
    private String alarm_message;
    private int alarm_mod;
}
