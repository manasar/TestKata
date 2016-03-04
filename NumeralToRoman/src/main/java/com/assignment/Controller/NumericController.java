package com.assignment.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller for handling numeric-to-roman request
 */
public interface NumericController {
    ModelAndView getRomanNumber(@PathVariable("number") int number);
}
