package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.HoversPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoversTests extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getHover();
    }

    @Test
    public void hoversTests(){
        new HoversPage(driver).hoverUser().verifyHover();

    }
}
