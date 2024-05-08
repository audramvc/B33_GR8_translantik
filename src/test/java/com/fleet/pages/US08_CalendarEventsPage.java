package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class US08_CalendarEventsPage {

    public US08_CalendarEventsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
