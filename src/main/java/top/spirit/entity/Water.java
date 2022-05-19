package top.spirit.entity;


import lombok.Data;

@Data
//水质状态
public class Water {
    private int water_id;
    private double water_oxy;
    private double water_tem;
    private double water_an;
    private double water_ph;
    private double water_salt;
    private String add_time;
    private int pool_id;

}
