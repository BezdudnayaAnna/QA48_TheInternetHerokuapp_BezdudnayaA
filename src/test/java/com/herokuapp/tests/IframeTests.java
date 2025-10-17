package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.frames.FramesPage;
import com.herokuapp.pages.frames.IframesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframeTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getFrames();
        new FramesPage(driver).getIframes();
    }

    @Test
    public void IframeTests(){
        new IframesPage(driver).verifyIframeByText();
    }
}
