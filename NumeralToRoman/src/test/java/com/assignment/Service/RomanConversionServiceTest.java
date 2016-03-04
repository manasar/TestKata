package com.assignment.Service;

import com.assignment.Util.RomanDictionary;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for RomanConversionService
 */
public class RomanConversionServiceTest {

    private RomanConversionService romanConversionService;
    private RomanDictionary romanDictionary;

    @Before
    public void setup() {
        romanDictionary = new RomanDictionary();
        romanDictionary.populateRomanDictionary();
        romanConversionService = new RomanConversionServiceImpl(romanDictionary);
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
    public void convertToRomanTest_RandomValue_XII(){
        String result = romanConversionService.convertToRoman(12);
        Assert.assertEquals("XII",result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertToRomanTest_RandomValue_Exception1(){
        String result = romanConversionService.convertToRoman(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertToRomanTest_RandomValue_Exception2(){
        String result = romanConversionService.convertToRoman(5000);
    }

}
