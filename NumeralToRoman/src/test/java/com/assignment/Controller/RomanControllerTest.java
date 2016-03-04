package com.assignment.Controller;

import com.assignment.Service.RomanConversionService;
import com.assignment.Service.RomanConversionServiceImpl;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.web.servlet.ModelAndView;

import static org.mockito.Mockito.when;

/**
 * Test class for RomanController
 */
@RunWith(MockitoJUnitRunner.class)
public class RomanControllerTest {
    private NumericController numericController;
    private RomanConversionService romanConversionService;

    @Before
    public void setup(){
        romanConversionService = Mockito.mock(RomanConversionServiceImpl.class);
        numericController =  new RomanControllerImpl(romanConversionService);

    }

    @Test
    public void getRomanNumber_Number_valueset(){
        int number = 1;
        when(romanConversionService.convertToRoman(number)).thenReturn("I");
        ModelAndView modelAndView = numericController.getRomanNumber(number);
        Assert.assertEquals("I",modelAndView.getModel().get("romanValue"));
    }

}
