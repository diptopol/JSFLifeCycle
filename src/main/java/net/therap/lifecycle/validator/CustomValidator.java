package net.therap.lifecycle.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Created with IntelliJ IDEA.
 * User: diptopol
 * Date: 9/9/13
 * Time: 1:51 AM
 * To change this template use File | Settings | File Templates.
 */
@FacesValidator("customValidator")
public class CustomValidator implements Validator {
    Logger logger = LoggerFactory.getLogger(CustomValidator.class);
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        logger.info("Custom Validator validate: " + o);
    }
}
