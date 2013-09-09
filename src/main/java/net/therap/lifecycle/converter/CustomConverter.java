package net.therap.lifecycle.converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * Created with IntelliJ IDEA.
 * User: diptopol
 * Date: 9/9/13
 * Time: 1:45 AM
 * To change this template use File | Settings | File Templates.
 */
@FacesConverter("customConverter")
public class CustomConverter implements Converter {

    Logger logger = LoggerFactory.getLogger(CustomConverter.class);
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        logger.info("Custom Converter getAsObject: " + s);
        return s;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        logger.info("Custom Converter getAsString: " + o);
        return (String) o;
    }
}
