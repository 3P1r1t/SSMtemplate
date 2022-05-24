package top.spirit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.spirit.service.AlarmService;

@Controller
@RequestMapping("/Monitor")
public class AlarmRuleHandler {
    @Autowired
    private AlarmService alarmService;

    @GetMapping("/monitorRuleOn")
    public ModelAndView MonitorRuleOn() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("waterMonitorRule");
        mv.addObject("WaterAlarmRuleOn", alarmService.findWaterAlarmRuleOn());
        return mv;
    }
    @GetMapping("/monitorRuleAll")
    public ModelAndView MonitorRuleAll() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("waterMonitorRule");
        System.out.println("=============="+alarmService.findWaterAlarmRuleAll().toString());
        mv.addObject("WaterAlarmRuleAll", alarmService.findWaterAlarmRuleAll());
        return mv;
    }
}
