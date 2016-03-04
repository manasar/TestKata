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
    public void setup(){
        romanConversionService = new RomanConversionServiceImpl();
    }

    @Test
    public void convertToRomanTest(){
        String result = romanConversionService.convertToRoman(1);
        Assert.assertEquals(result,"I");
    }
}
