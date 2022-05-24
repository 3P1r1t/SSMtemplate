package top.spirit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import top.spirit.entity.Water;
import top.spirit.service.WaterService;

import java.util.List;

@Controller
@RequestMapping("/Water")
public class WaterHandler {
    @Autowired
    private WaterService waterService;

//    @RequestMapping(value ="/findWaterAll", produces={"application/json; charset=UTF-8"})
//    @ResponseBody
//    public ModelAndView findAll() {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("index");
//        mv.addObject("list", waterService.findAll());
//        return mv;
//    }
    @RequestMapping(value ="/findWaterAll", produces={"application/json; charset=UTF-8"})
    @ResponseBody
    public List<Water> findAll(){
        return waterService.findAll();
    }

//    @RequestMapping("/findWaterNew")
//    @ResponseBody
//    public ModelAndView findNewWaterData() {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("newWaterdata");
//        mv.addObject("list", waterService.findNewData());
//        return mv;
//    }
@RequestMapping(value ="/findWaterNew", produces={"application/json; charset=UTF-8"})
@ResponseBody
    public Water findNewWaterData() {
        return waterService.findNewData();
    }

}
