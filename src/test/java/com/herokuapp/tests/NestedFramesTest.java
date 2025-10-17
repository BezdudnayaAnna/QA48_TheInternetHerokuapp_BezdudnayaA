package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.frames.FramesPage;
import com.herokuapp.pages.frames.NestedFramesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NestedFramesTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getFrames();
        new FramesPage(driver).getNestedFrames();

    }

    @Test
    public void handleFrameTop(){
        new NestedFramesPage(driver).handleFrameTop();
    }

    @Test
    public void handleFrameBottom(){
        new NestedFramesPage(driver).handleFrameBottom();
    }
}
