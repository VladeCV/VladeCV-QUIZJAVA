/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fundacionjala.app.quizz.model.configuration;
import org.fundacionjala.app.quizz.model.validator.ValidatorType;
/**
 *
 * @author CVCF
 */
public class NumericConfiguration extends QuestionConfiguration {

    public NumericConfiguration() {
        super(true, ValidatorType.REQUIRED, ValidatorType.MIN, ValidatorType.MAX);//To change body of generated methods, choose Tools | Templates.
    }

}
