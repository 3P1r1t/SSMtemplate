package top.spirit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.spirit.service.BookService;
import top.spirit.service.WaterService;

@Controller
@RequestMapping("/Water")
public class WaterHandler {
    @Autowired
    private WaterService waterService;

    @GetMapping("/findAll")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("list", waterService.findAll());
        return mv;
    }
    @GetMapping("/findNewData")
    public ModelAndView findNewData() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("findnewdata");
        mv.addObject("list", waterService.findNewData());
        return mv;
    }
}
