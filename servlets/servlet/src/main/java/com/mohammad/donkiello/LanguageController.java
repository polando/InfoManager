package com.mohammad.donkiello;

import org.primefaces.event.ToggleEvent;
import org.primefaces.model.Visibility;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 * Created by ussocom on 3/7/2017.
 */

@ManagedBean(name="languageController")
@SessionScoped
public class LanguageController  implements Serializable {

    private Boolean isEnglish;
    private String ButtonValue;


    @PostConstruct
    public void init() {
            setLanguage(true,"Persian");
    }

    public Boolean getEnglish() {
        return isEnglish;
    }

    public void setEnglish(Boolean english) {
        isEnglish = english;
    }

    public String getButtonValue() {
        return ButtonValue;
    }

    public void setButtonValue(String buttonValue) {
        ButtonValue = buttonValue;
    }

    public void changeLanguage()
    {
      if(isEnglish) {
         setLanguage(false,"English");
      }
      else {
         setLanguage(true,"Persian");
      }

    }

    public void setLanguage(Boolean b,String buttonValue)
    {
        isEnglish = b;
        ButtonValue = buttonValue;
    }
}