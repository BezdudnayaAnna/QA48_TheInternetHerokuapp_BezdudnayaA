package com.herokuapp.tests;

import com.herokuapp.pages.DragAndDropPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDragAndDrop();
    }

    @Test
    public void dragAndDropTest(){
        new DragAndDropPage(driver).standardDragAndDrop().verifyDragAndDrop("B");
    }
}
