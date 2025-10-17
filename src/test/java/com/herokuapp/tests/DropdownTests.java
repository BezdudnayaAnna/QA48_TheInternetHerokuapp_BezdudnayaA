package com.herokuapp.tests;

import com.herokuapp.pages.DropdownPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTests extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDropdown();
    }

    @Test
    public void dropdownTests(){
        new DropdownPage(driver).selectOption("Option 2").verifyOption("Option 2");
    }
}
