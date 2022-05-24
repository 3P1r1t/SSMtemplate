package top.spirit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.spirit.service.impl.AlarmServiceImpl;
//获取预警结果的controller
@Controller
@RequestMapping("/GetAlarmResult")
public class AlarmResultHandler {

        @Autowired
        private AlarmServiceImpl alarmResultStatusService;

        @GetMapping("/findAlarmResultAll")
        public ModelAndView findAll() {
            ModelAndView mv = new ModelAndView();
            mv.setViewName("待填写");
            mv.addObject("list", alarmResultStatusService.findAlarmResultAll());
            System.out.println(mv);
            return mv;
        }
        @GetMapping("/findAlarmResultOn")
        public ModelAndView findOn() {
            ModelAndView mv = new ModelAndView();
            mv.setViewName("待填写");
            mv.addObject("list", alarmResultStatusService.findAlarmResultOn());
            System.out.println(mv);
            return mv;
        }
    @GetMapping("/findAlarmResultOff")
    public ModelAndView findOff() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("待填写");
        mv.addObject("list", alarmResultStatusService.findAlarmResultOff());
        System.out.println(mv);
        return mv;
    }

    }

