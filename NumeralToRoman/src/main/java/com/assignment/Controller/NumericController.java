package com.assignment.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by manasa on 04/03/16.
 */
public interface NumericController {
    ModelAndView getRomanNumber(@PathVariable("number") int number);
}
