package com.B33_GR8_translantik.step_definitions;

import com.B33_GR8_translantik.pages.BasePage;
import com.B33_GR8_translantik.pages.US03_PinbarPage;
import com.B33_GR8_translantik.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US03_pinbarStepDefs extends BasePage {

    //LoginPage page = new LoginPage();
    US03_PinbarPage page = new US03_PinbarPage();

    @When("User clicks the Learn how to use this space link")
    public void user_clicks_the_learn_how_to_use_this_space_link() {

        page.learnHowToUseThisSpace.click();


    }

    @Then("User sees How to Use Pinbar and Use the pin icon on the right top corner of page to create fast access link in the pinbar.")
    public void user_sees_how_to_use_pinbar_and_use_the_pin_icon_on_the_right_top_corner_of_page_to_create_fast_access_link_in_the_pinbar() {

        String actualText = page.howToUsePinbar.getText();
        String expectedText = "How To Use Pinbar";

        Assert.assertEquals(expectedText, actualText);

        String actualText2 = page.usePinIconOnTheRightTopCornerOfPageToCreateFastAccessLinkInThePinbar.getText();
        String expectedText2 = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";

        Assert.assertEquals(expectedText2, actualText2);



    }

    @Then("User sees an image on the page")
    public void user_sees_an_image_on_the_page() {

        BrowserUtils.waitForVisibility(page.image, 20);
        boolean imagePresent = page.image.isDisplayed();
        Assert.assertTrue(imagePresent);
    }

}
