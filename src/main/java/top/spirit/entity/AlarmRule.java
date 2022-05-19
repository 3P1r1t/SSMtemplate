package top.spirit.entity;

import lombok.Data;

@Data
public class AlarmRule {
    private int alarm_id;
    private int water_id;
    private int pool_id;
    private int alarm_level;
    private String alarm_type;
    private int alarm_mod;
    private int out_of_range_type;
    private int alarm_status;
}
