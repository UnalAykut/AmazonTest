package com.amazon.page;

import com.amazon.util.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super( driver );
    }

    @FindBy(css = "body.a-aui_72554-c.a-aui_a11y_2_750578-c.a-aui_a11y_6_837773-c.a-aui_a11y_sr_678508-t1.a-aui_amzn_img_959719-c.a-aui_amzn_img_gate_959718-c.a-aui_killswitch_csa_logger_372963-c.a-aui_pci_risk_banner_210084-c.a-aui_template_weblab_cache_333406-c.a-aui_tnr_v2_180836-c.a-meter-animate:nth-child(2) div.a-container.a-color-alternate-background:nth-child(25) div.a-row.a-spacing-medium-plus.celwidget.sw-fst.sw-fixed-max-width-horizontal-center:nth-child(1) div.a-column.a-span12.sw-card-container.sw-atc-single-container.sw-atc-details:nth-child(1) div.a-section.a-padding-medium.sw-atc-message-section:nth-child(2) div.a-fixed-left-grid div.a-fixed-left-grid-inner div.a-fixed-left-grid-col.a-col-right div.a-section.a-spacing-none.a-padding-none.celwidget > h1.a-size-medium-plus.a-color-base.sw-atc-text.a-text-bold")
    private WebElement addText;

    public String addTextControl(){
        return Utils.waitForElementToBeVisible( driver,addText ).getText();
    }


}
