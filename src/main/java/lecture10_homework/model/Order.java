package lecture10_homework.model;

import lecture10_homework.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Order extends Common {
    private By personaRadioBtn = By.id("natural_customer");
    private By firstNameInput = By.id("billing:firstname");
    private By lastNameInput = By.id("billing:lastname");
    private By emailInput = By.id("billing:email");
    private By phoneInput = By.id("billing:telephone");
    private By addressStreetInput = By.id("billing:street1");
    private By addressCityInput = By.id("billing:city");
    private By addressRegionDrpDwn = By.id("billing:region_id");
    private By addressZipInput = By.id("billing:postcode");
    private By addressCountryDrpDown = By.id("billing:country_id");
    private By regNewAccoutCheckBox = By.id("register_new_account");
    private By regNewAccoutPassword = By.id("billing:customer_password");
    private By regNewAccoutPasswordConfirm = By.id("billing:confirm_password");
    private By addressShippingCheckBox = By.id("ship_to_same_address");
    private By shipByOmnivaRadioButton = By.id("s_method_scandipost24");
    private By shipByOmnivaDrpDown = By.id("s_method_scandipost24_extra_box");
    private By shipByCourierRadioBtn = By.id("s_method_dlw_dlw_lv");
    private By shipByLatvianPostRadioBtn = By.id("s_method_tablerate_bestway");
    private By shipByDirectRadioBtn = By.id("s_method_shippingrates_jr_default");
    private By shipByPickUpInShopRadioBtn = By.id("s_method_payonpickup_payonpickup");
    private By shipByPickUpInShopDrpDown = By.id("s_method_payonpickup_payonpickup_shop");
    private By payByVoucherCheckBox = By.id("giftvoucher");
    private By payByVoucherCodeInput = By.id("giftvoucher_code");
    private By payByBankTransferRadioBtn = By.id("p_method_banktransfer");
    private By payByPaypalRadioBtn = By.id("p_method_paypal_express");
    private By payBySwedbankRadioBtn = By.id("p_method_banklinkswedlv");
    private By payByVisaRadioBtn = By.id("p_method_firstdatalv");
    private By couponCodeInput = By.id("coupon_code");
    private By commentInput = By.id("id_comments");

    private By price=By.xpath("//table[@id='checkout-review-table']//h3/parent::td/following-sibling::td[1]//span[@class='price']");
    private By productName=By.xpath("//table[@id='checkout-review-table']//h3[@class='product-name']");

    public By getPersonaRadioBtn() {
        return personaRadioBtn;
    }

    public void setPersonaRadioBtn(By personaRadioBtn) {
        this.personaRadioBtn = personaRadioBtn;
    }

    public By getFirstNameInput() {
        return firstNameInput;
    }

    public void setFirstNameInput(By firstNameInput) {
        this.firstNameInput = firstNameInput;
    }

    public By getLastNameInput() {
        return lastNameInput;
    }

    public void setLastNameInput(By lastNameInput) {
        this.lastNameInput = lastNameInput;
    }

    public By getEmailInput() {
        return emailInput;
    }

    public void setEmailInput(By emailInput) {
        this.emailInput = emailInput;
    }

    public By getPhoneInput() {
        return phoneInput;
    }

    public void setPhoneInput(By phoneInput) {
        this.phoneInput = phoneInput;
    }

    public By getAddressStreetInput() {
        return addressStreetInput;
    }

    public void setAddressStreetInput(By addressStreetInput) {
        this.addressStreetInput = addressStreetInput;
    }

    public By getAddressCityInput() {
        return addressCityInput;
    }

    public void setAddressCityInput(By addressCityInput) {
        this.addressCityInput = addressCityInput;
    }

    public By getAddressRegionDrpDwn() {
        return addressRegionDrpDwn;
    }

    public void setAddressRegionDrpDwn(By addressRegionDrpDwn) {
        this.addressRegionDrpDwn = addressRegionDrpDwn;
    }

    public By getAddressZipInput() {
        return addressZipInput;
    }

    public void setAddressZipInput(By addressZipInput) {
        this.addressZipInput = addressZipInput;
    }

    public By getAddressCountryDrpDown() {
        return addressCountryDrpDown;
    }

    public void setAddressCountryDrpDown(By addressCountryDrpDown) {
        this.addressCountryDrpDown = addressCountryDrpDown;
    }

    public By getRegNewAccoutCheckBox() {
        return regNewAccoutCheckBox;
    }

    public void setRegNewAccoutCheckBox(By regNewAccoutCheckBox) {
        this.regNewAccoutCheckBox = regNewAccoutCheckBox;
    }

    public By getRegNewAccoutPassword() {
        return regNewAccoutPassword;
    }

    public void setRegNewAccoutPassword(By regNewAccoutPassword) {
        this.regNewAccoutPassword = regNewAccoutPassword;
    }

    public By getRegNewAccoutPasswordConfirm() {
        return regNewAccoutPasswordConfirm;
    }

    public void setRegNewAccoutPasswordConfirm(By regNewAccoutPasswordConfirm) {
        this.regNewAccoutPasswordConfirm = regNewAccoutPasswordConfirm;
    }

    public By getAddressShippingCheckBox() {
        return addressShippingCheckBox;
    }

    public void setAddressShippingCheckBox(By addressShippingCheckBox) {
        this.addressShippingCheckBox = addressShippingCheckBox;
    }

    public By getShipByOmnivaRadioButton() {
        return shipByOmnivaRadioButton;
    }

    public void setShipByOmnivaRadioButton(By shipByOmnivaRadioButton) {
        this.shipByOmnivaRadioButton = shipByOmnivaRadioButton;
    }

    public By getShipByOmnivaDrpDown() {
        return shipByOmnivaDrpDown;
    }

    public void setShipByOmnivaDrpDown(By shipByOmnivaDrpDown) {
        this.shipByOmnivaDrpDown = shipByOmnivaDrpDown;
    }

    public By getShipByCourierRadioBtn() {
        return shipByCourierRadioBtn;
    }

    public void setShipByCourierRadioBtn(By shipByCourierRadioBtn) {
        this.shipByCourierRadioBtn = shipByCourierRadioBtn;
    }

    public By getShipByLatvianPostRadioBtn() {
        return shipByLatvianPostRadioBtn;
    }

    public void setShipByLatvianPostRadioBtn(By shipByLatvianPostRadioBtn) {
        this.shipByLatvianPostRadioBtn = shipByLatvianPostRadioBtn;
    }

    public By getShipByDirectRadioBtn() {
        return shipByDirectRadioBtn;
    }

    public void setShipByDirectRadioBtn(By shipByDirectRadioBtn) {
        this.shipByDirectRadioBtn = shipByDirectRadioBtn;
    }

    public By getShipByPickUpInShopRadioBtn() {
        return shipByPickUpInShopRadioBtn;
    }

    public void setShipByPickUpInShopRadioBtn(By shipByPickUpInShopRadioBtn) {
        this.shipByPickUpInShopRadioBtn = shipByPickUpInShopRadioBtn;
    }

    public By getShipByPickUpInShopDrpDown() {
        return shipByPickUpInShopDrpDown;
    }

    public void setShipByPickUpInShopDrpDown(By shipByPickUpInShopDrpDown) {
        this.shipByPickUpInShopDrpDown = shipByPickUpInShopDrpDown;
    }

    public By getPayByVisaRadioBtn() {
        return payByVisaRadioBtn;
    }

    public void setPayByVisaRadioBtn(By payByVisaRadioBtn) {
        this.payByVisaRadioBtn = payByVisaRadioBtn;
    }

    public By getCouponCodeInput() {
        return couponCodeInput;
    }

    public void setCouponCodeInput(By couponCodeInput) {
        this.couponCodeInput = couponCodeInput;
    }


    public By getPayByVoucherCheckBox() {
        return payByVoucherCheckBox;
    }

    public void setPayByVoucherCheckBox(By payByVoucherCheckBox) {
        this.payByVoucherCheckBox = payByVoucherCheckBox;
    }

    public By getPayByVoucherCodeInput() {
        return payByVoucherCodeInput;
    }

    public void setPayByVoucherCodeInput(By payByVoucherCodeInput) {
        this.payByVoucherCodeInput = payByVoucherCodeInput;
    }

    public By getPayByBankTransferRadioBtn() {
        return payByBankTransferRadioBtn;
    }

    public void setPayByBankTransferRadioBtn(By payByBankTransferRadioBtn) {
        this.payByBankTransferRadioBtn = payByBankTransferRadioBtn;
    }

    public By getPayByPaypalRadioBtn() {
        return payByPaypalRadioBtn;
    }

    public void setPayByPaypalRadioBtn(By payByPaypalRadioBtn) {
        this.payByPaypalRadioBtn = payByPaypalRadioBtn;
    }

    public By getPayBySwedbankRadioBtn() {
        return payBySwedbankRadioBtn;
    }

    public void setPayBySwedbankRadioBtn(By payBySwedbankRadioBtn) {
        this.payBySwedbankRadioBtn = payBySwedbankRadioBtn;
    }

    public By getPrice() {
        return price;
    }

    public void setPrice(By price) {
        this.price = price;
    }


    public By getProductName() {
        return productName;
    }

    public void setProductName(By productName) {
        this.productName = productName;
    }


    public By getCommentInput() {
        return commentInput;
    }

    public void setCommentInput(By commentInput) {
        this.commentInput = commentInput;
    }

    //Fill in the test data for Order page
    public void fillInOrder() {
        driver.findElement(getPersonaRadioBtn()).click();
        driver.findElement(getFirstNameInput()).sendKeys("John");
        driver.findElement(getLastNameInput()).sendKeys("Smith");
        driver.findElement(getEmailInput()).sendKeys("jonny@gmail.com");
        driver.findElement(getPhoneInput()).sendKeys("+37126001002");
        driver.findElement(getAddressCityInput()).clear();
        driver.findElement(getAddressCityInput()).sendKeys("Rēzekne");

        WebElement dropdownRegion = driver.findElement(addressRegionDrpDwn);
        Select region = new Select(dropdownRegion);
        region.selectByVisibleText("Rēzeknes novads");

        driver.findElement(getAddressStreetInput()).sendKeys("Spoku 26-1");
        driver.findElement(getAddressZipInput()).sendKeys("LV-1234");

        WebElement dropdownEngine = driver.findElement(addressCountryDrpDown);
        Select country = new Select(dropdownEngine);
        country.selectByVisibleText("Latvija");

        if (!driver.findElement(getRegNewAccoutCheckBox()).isSelected()) {
            driver.findElement(getRegNewAccoutCheckBox()).click();
            driver.findElement(getRegNewAccoutPassword()).sendKeys("32dwer4");
            driver.findElement(getRegNewAccoutPasswordConfirm()).sendKeys("32dwer4");
        }
        if (!driver.findElement(getAddressShippingCheckBox()).isSelected()) {
            driver.findElement(getRegNewAccoutCheckBox()).click();
        }

        waitUntilSectionIsRefreshed(getShipByCourierRadioBtn());
        driver.findElement(getShipByCourierRadioBtn()).click();

        waitUntilSectionIsRefreshed(getPayByBankTransferRadioBtn());
        driver.findElement(getPayByBankTransferRadioBtn()).click();

        driver.findElement(getCouponCodeInput()).sendKeys("WhyNot?");
        driver.findElement(getCommentInput()).sendKeys("bla-bla-bla");
    }

    //Get value of Product Price to check in test
    public String checkProductPrice(){
        String value= driver.findElement(getPrice()).getText();
        return value;
    }
    //Get value of Product Name to check in test
    public String checkProductName(){
        String value= driver.findElement(getProductName()).getText();
        return value;
    }

}
