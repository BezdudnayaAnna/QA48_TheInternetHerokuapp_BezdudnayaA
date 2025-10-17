package com.herokuapp.pages;

import com.herokuapp.pages.frames.FramesPage;
import com.herokuapp.pages.tabs.WindowsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/javascript_alerts']")
    WebElement jSAlertsLink;

    public AlertsPage getJavaScriptAlerts() {
        click(jSAlertsLink);
        return new AlertsPage(driver);
    }

    @FindBy(css = "a[href='/frames']")
    WebElement frames;

    public FramesPage getFrames() {
        click(frames);
        return new FramesPage(driver);

    }

    @FindBy(css = "a[href='/windows']")
    WebElement window;

    public WindowsPage getMultipleWindows() {
        click(window);
        return new WindowsPage(driver);
    }

    @FindBy(css = "a[href='/dropdown']")
    WebElement dropdown;

    public DropdownPage getDropdown() {
        click(dropdown);
        return new DropdownPage(driver);
    }
}
