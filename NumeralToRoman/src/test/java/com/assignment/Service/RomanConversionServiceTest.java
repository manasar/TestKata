package com.assignment.Service;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for RomanConversionService
 */
public class RomanConversionServiceTest {

    private RomanConversionService romanConversionService;

    @Before
    public void setup() {
        romanConversionService = new RomanConversionServiceImpl();
    }


    @Test
    public void convertToRomanTest_minValue_I(){
        String result = romanConversionService.convertToRoman(1);
        Assert.assertEquals(result, "I");
    }

    @Test
    public void convertToRomanTest_maxValue_MMMCMXCIX(){
        String result = romanConversionService.convertToRoman(3999);
        Assert.assertEquals("MMMCMXCIX",result);
    }

    @Test
    public void convertToRomanTest_RandomValue_MMMCMXCIX(){
        String result = romanConversionService.convertToRoman(12);
        Assert.assertEquals("XII",result);
    }

}
