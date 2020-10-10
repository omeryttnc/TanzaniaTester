package tz;

public class MaliGlbLoginPage {
    public MaliGlbLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()=' Seller Join Now']")
    public WebElement sellerJoinNow;
    @FindBy(id = "vender_type")
    public WebElement agentSellerButton;
    @FindBy(id = "vender_name")
    public WebElement agentFullName;
    @FindBy(id = "email")
    public WebElement agentMail;
    @FindBy(id = "sub_domain")
    public WebElement agentSubDomain;
    @FindBy(id = "vender_mobile")
    public WebElement agentMobile;
    @FindBy (xpath = "//select[@name='country']")
    public WebElement country;
    @FindBy(id = "select_state")
    public WebElement agentState;
    @FindBy(id = "select_city")
    public WebElement agentCity;
    @FindBy(id = "vender_address")
    public WebElement agentAddress;
    @FindBy(id = "zip_code_input")
    public WebElement agentPostCode;
    @FindBy (xpath = "//select[@name='category']")
    public WebElement category;
    @FindBy(id = "password")
    public WebElement agentPassword;
    @FindBy(xpath = "(//button[@name='submit'])[1]")
    public WebElement agentRegisterButton;
    @FindBy(xpath = "(//p[@class='text-center'])[2]")
    public WebElement agentSuccessMessage;
}
