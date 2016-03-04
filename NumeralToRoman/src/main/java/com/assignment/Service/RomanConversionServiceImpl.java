package com.assignment.Service;

import com.assignment.Util.RomanDictionary;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;


/**
 * Service to convert the numeric to Roman number
 */
@Service
public class RomanConversionServiceImpl implements RomanConversionService {

    private static Logger LOGGER = Logger.getLogger(RomanConversionServiceImpl.class);
    private RomanDictionary romanDictionary;

    public RomanConversionServiceImpl(RomanDictionary romanDictionary) {
        this.romanDictionary = romanDictionary;
    }

    public RomanConversionServiceImpl(){

    }
    /**
     * converts the given number to roman
     *
     * @param number- numeric value to be converted
     * @return the converted Roman value
     */
    public String convertToRoman(int number) {
        StringBuilder result = new StringBuilder();
        LOGGER.info("Converting the number:"+number+ "to Roman");
        while (number > 0) {
            for (Integer key : romanDictionary.getRomanDictionaryMap().keySet()) {
                if (number / key >= 1) {
                    result = result.append(romanDictionary.getValue(key));
                    number -= key;
                    break;
                }
            }
        }
        LOGGER.info("Roman Number:"+result);
        return result.toString();
    }

    public RomanDictionary getRomanDictionary() {
        return romanDictionary;
    }

    public void setRomanDictionary(RomanDictionary romanDictionary) {
        this.romanDictionary = romanDictionary;
    }
}
