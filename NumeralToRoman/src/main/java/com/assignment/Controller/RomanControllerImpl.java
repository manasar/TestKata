package com.assignment.Controller;

import com.assignment.Service.RomanConversionService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller for handling numeric-to-roman request
 */
@RequestMapping("/convertToRoman")
public class RomanControllerImpl implements NumericController {

    private static Logger LOGGER = Logger.getLogger(RomanControllerImpl.class);
    private RomanConversionService romanConversionService;

    /**
     * gets the roman number for the given numeric
     *
     * @param number- numeric value to be converted
     * @return the converted Roman value
     */
    @RequestMapping("/{number}")
    public ModelAndView getRomanNumber(@PathVariable("number") int number){
        LOGGER.debug("Inside RomanController:input value-"+number);
        ModelAndView modelAndView = new ModelAndView("display");
        String romanNumber = romanConversionService.convertToRoman(number);
        modelAndView.addObject("romanValue", romanNumber);
        LOGGER.debug("Exit RomanController");
        return modelAndView;
    }

    public RomanConversionService getRomanConversionService() {
        return romanConversionService;
    }

    public RomanControllerImpl(RomanConversionService romanConversionService) {
        this.romanConversionService = romanConversionService;
    }

    public RomanControllerImpl(){

    }

    public void setRomanConversionService(RomanConversionService romanConversionService) {
        this.romanConversionService = romanConversionService;
    }
}
