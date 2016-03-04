package com.assignment.Controller;

import com.assignment.Service.RomanConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller for handling numeric-to-roman request
 */
@RequestMapping("/convertToRoman")
public class RomanControllerImpl implements NumericController {

    private RomanConversionService romanConversionService;

    /**
     * gets the roman number for the given numeric
     *
     * @param number- numeric value to be converted
     * @return the converted Roman value
     */
    @RequestMapping("/{number}")
    public ModelAndView getRomanNumber(@PathVariable("number") int number){
        ModelAndView modelAndView = new ModelAndView("display");
        modelAndView.addObject("romanValue", "TestView"+number);
        return modelAndView;
    }

    public RomanConversionService getRomanConversionService() {
        return romanConversionService;
    }

    public void setRomanConversionService(RomanConversionService romanConversionService) {
        this.romanConversionService = romanConversionService;
    }
}
