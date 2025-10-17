package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.tabs.NewTabPage;
import com.herokuapp.pages.tabs.WindowsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowsTests extends TestBase{
    @BeforeMethod
    public void  precondition(){
        new HomePage(driver).getMultipleWindows();
        new WindowsPage(driver).getNewTab(1);
    }

    @Test
    public void windowsTests(){
        new NewTabPage(driver).veryfiNewTabTitle("New Window");
    }
}
