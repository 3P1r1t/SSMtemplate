package top.spirit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.spirit.service.BookService;

@Controller
@RequestMapping("/book")
public class BookHandler {
    @Autowired
    private BookService bookService;
    @GetMapping("/findAll")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("newWaterdata");
        mv.addObject("list",bookService.findAll2());
        return mv;
    }
}
