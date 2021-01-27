/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fundacionjala.app.quizz.model.validator;

import java.util.List;

/**
 *
 * @author CVCF
 */
public class MaxValidator implements Validator<Integer, Integer>{
     private static final String ERROR_MESSAGE = "The value must be less than ";

    @Override
    public void validate(Integer value, Integer conditionValue, List<String> errors) {
        if (value > conditionValue) {
            errors.add(ERROR_MESSAGE + conditionValue);
        }
    }
}
