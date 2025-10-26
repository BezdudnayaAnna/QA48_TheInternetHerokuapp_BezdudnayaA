package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.HorizontalSliderPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HorizontalSliderTests extends TestBase{
    @BeforeMethod
    public void precondition (){
        new HomePage(driver).getHorizontalSlider();
    }

    @Test
    public void horizontalSliderTests(){
        new HorizontalSliderPage(driver).moveSlider().verifySliderValue("4");
    }
}
