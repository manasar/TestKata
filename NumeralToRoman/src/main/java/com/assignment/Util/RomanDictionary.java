package com.assignment.Util;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Roman Dictionary which maps between numbers and Roman number
 *
 */
public class RomanDictionary implements InitializingBean,DisposableBean {
    private static Logger LOGGER = Logger.getLogger(RomanDictionary.class);

    private SortedMap<Integer,String> romanDictionaryMap;

    public RomanDictionary() {
        this.romanDictionaryMap = new TreeMap<Integer, String>(Collections.reverseOrder());
    }

    public SortedMap<Integer, String> getRomanDictionaryMap() {
        return romanDictionaryMap;
    }

    public void setRomanDictionaryMap(SortedMap<Integer, String> romanDictionaryMap) {
        this.romanDictionaryMap = romanDictionaryMap;
    }

    /**
     * populates the roman dictionary
     */
    public void populateRomanDictionary() {
        LOGGER.debug("populating the roman dictionary");
        romanDictionaryMap.put(1,"I");
        romanDictionaryMap.put(4,"VI");
        romanDictionaryMap.put(5,"V");
        romanDictionaryMap.put(9,"IX");
        romanDictionaryMap.put(10,"X");
        romanDictionaryMap.put(40,"XL");
        romanDictionaryMap.put(50,"L");
        romanDictionaryMap.put(90,"XC");
        romanDictionaryMap.put(100,"C");
        romanDictionaryMap.put(400,"CD");
        romanDictionaryMap.put(500,"D");
        romanDictionaryMap.put(900,"CM");
        romanDictionaryMap.put(1000,"M");
    }

    public String getValue(int key){
        return getRomanDictionaryMap().get(key);
    }

    public void afterPropertiesSet() throws Exception {
        populateRomanDictionary();
    }

    public void destroy() throws Exception {
        romanDictionaryMap.clear();
    }
}
