package top.spirit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import top.spirit.service.AlarmService;
import top.spirit.service.WaterService;

import top.spirit.unit.SMS;
import top.spirit.unit.WaterCompare;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;


@Controller
public class ToAlarmHandler {
    private final AlarmService alarmService;
    private final WaterService waterService;
    private final WaterCompare waterCompare;

    public ToAlarmHandler(AlarmService alarmService, WaterService waterService, WaterCompare waterCompare) {
        this.alarmService = alarmService;
        this.waterService = waterService;
        this.waterCompare = waterCompare;
    }


    @GetMapping("/ToAlarm")
    public ModelAndView MonitorRuleOn() throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("waterMonitorRule");
        Map map =waterCompare.outOfRangeCompare(alarmService.findWaterAlarmRuleOn(),waterService.findNewData());
        int a = (int) map.get("flag");
        if ((int)map.get("flag")>0){
            Date date=new Date();
            SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            map.put("alarm_status",1);
            map.put("alarm_time",df.format(date));
            map.put("alarm_rule_id", alarmService.findWaterAlarmRuleOn().getId());
            map.put("if_view",0);
            String message ="";
            for (String str: (ArrayList<String>)map.get("message")){
                if (message!=""){
                    message = message+","+str;
                }
                else {
                    message += str;
                }
            }
            map.put("alarm_message",message);
            alarmService.insertAlarmWater(map);
//            System.out.println("[DEBUG]pool_id:"+(int)map.get("pool_id"));
//            System.out.println("[DEBUG]message:"+message);
//            int i = (int) map.get("pool_id");
//            int range = (int)(Math.random()*10000);
            String smsinfo_title = "【AAS系统预警Demo】";
            String ssminfo_body ="【"+message+"】";
//            SMS.sendTemplateSMS("18001066772","1",new String[]{smsinfo_title,"氧浓度过高PH过低"});

        }
        mv.addObject("AlarmList",waterCompare.outOfRangeCompare(alarmService.findWaterAlarmRuleOn(),waterService.findNewData()));
        return mv;
    }

}
