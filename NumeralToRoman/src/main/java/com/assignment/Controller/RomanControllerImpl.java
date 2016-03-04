package com.assignment.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by manasa on 04/03/16.
 */

@RequestMapping("/convertToRoman")
public class RomanControllerImpl implements NumericController {

    @RequestMapping("/{number}")
    public ModelAndView getRomanNumber(@PathVariable("number") int number){
        ModelAndView modelAndView = new ModelAndView("display");
        modelAndView.addObject("romanValue", "TestView"+number);
        return modelAndView;
    }
}
