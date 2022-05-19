package top.spirit.entity;

import lombok.Data;

@Data
public class AutoResult {
    private int id;
    private int oxy;
    private int tem;
    private int an;
    private int ph;
    private int salt;
    private int feed;
    private int out_of_range_type;
    private int alarm_id;
}
