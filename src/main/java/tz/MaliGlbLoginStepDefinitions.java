package tz;

public class MaliGlbLoginStepDefinitions {
    MaliGlbLoginPage maliGlbLoginPage = new MaliGlbLoginPage();
    @When("user click Seller Join Now")
    public void user_click_seller_join_now() {
        maliGlbLoginPage.sellerJoinNow.click();
    }

    @When("user select agent seller to register")
    public void user_select_agent_seller_to_register() {
        maliGlbLoginPage.agentSellerButton.click();
    }

    @When("user fill all and mandatory fields")
    public void user_fill_all_and_mandatory_fields() {
        maliGlbLoginPage.agentFullName.sendKeys(ConfigReader.getProperty("agent_name"));
        maliGlbLoginPage.agentMail.sendKeys(ConfigReader.getProperty("agent_email"));
        maliGlbLoginPage.agentSubDomain.sendKeys(ConfigReader.getProperty("agent_subdomain"));
        maliGlbLoginPage.agentMobile.sendKeys(ConfigReader.getProperty("agent_mobile"));
        Select select = new Select(maliGlbLoginPage.country);
        select.selectByVisibleText(ConfigReader.getProperty("agent_country"));
        maliGlbLoginPage.agentState.sendKeys(ConfigReader.getProperty("agent_state"));
        maliGlbLoginPage.agentCity.sendKeys(ConfigReader.getProperty("agent_city"));
        maliGlbLoginPage.agentAddress.sendKeys(ConfigReader.getProperty("agent_address"));
        maliGlbLoginPage.agentPostCode.sendKeys(ConfigReader.getProperty("agent_postal_code"));
        Select select1 = new Select(maliGlbLoginPage.category);
        select1.selectByVisibleText(ConfigReader.getProperty("agent_category"));
        maliGlbLoginPage.agentPassword.sendKeys(ConfigReader.getProperty("agent_password"));
    }

    @When("user clicks Register button")
    public void user_clicks_register_button() {
        maliGlbLoginPage.agentRegisterButton.click();
    }

    @Then("verify successful message")
    public void verify_successful_message() {
        assertEquals(maliGlbLoginPage.agentSuccessMessage.getText(),
                ConfigReader.getProperty("expected_agent_success_message"));
    }
}
