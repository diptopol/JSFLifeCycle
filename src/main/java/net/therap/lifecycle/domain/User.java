package net.therap.lifecycle.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlInputText;
import javax.faces.event.ValueChangeEvent;
import java.awt.event.ActionEvent;

/**
 * Created with IntelliJ IDEA.
 * User: diptopol
 * Date: 9/9/13
 * Time: 12:23 AM
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean
@RequestScoped
public class User {

    Logger logger = LoggerFactory.getLogger(User.class);

    private String username;

    private HtmlInputText inputText;


    public User() {
        log("Constructed");
    }



    public HtmlInputText getInputText() {
        log(inputText);
        return inputText;
    }

    public void setInputText(HtmlInputText inputText) {
        log(inputText);
        this.inputText = inputText;
    }

    public String getUsername() {
        log(username);
        return username;
    }

    public void setUsername(String username) {
        log(username);
        this.username = username;
    }


    public void inputChanged(ValueChangeEvent event) {
        log("input Change :" + event.getOldValue() + " to " + event.getNewValue());
    }

    private void log(Object object) {
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        logger.info("UserBean " + methodName + ": " + object);
    }

    public String doAction() {
        log("success");
        return "success";
    }


}
