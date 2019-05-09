import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Main {
    @Test
    @DisplayName("test login to toastweb")
    public static void main(String[] args) {
        String preprod = "https://preprod.eng.toasttab.com";
        String prod = "https://www.toasttab.com/";
        // TODO Auto-generated method stub
        // Create Driver Object

        System.setProperty("webdriver.chrome.driver", "/Users/rafi/toast/git-repos/Jager/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://preprod.eng.toasttab.com/login");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rdiaz@toasttab.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(""); //NO SEAS TONTO
        driver.findElement(By.xpath("//*[@id=\"log-in\"]")).click();
        ////*[@id=\"log-in\"]System.out.println(driver.getTitle());
/*        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div/div[2]/div[4]/ul/li[1]/a")).click();
        //WebElement RestaurantSelector = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-overview/aml-report-view/div/div/div[2]/aml-filter-selector/div[1]/div[2]/tk-dropdown-tree/tk-dropdown/div/div[1]/tk-dropdown-toggle/div/tk-input/div/input")));
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-overview/aml-report-view/div/div/div[2]/aml-filter-selector/div[1]/div[2]/tk-dropdown-tree/tk-dropdown/div/div[1]/tk-dropdown-toggle/div/tk-input/div/input", 10, driver);
        driver.findElement(By.xpath("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-overview/aml-report-view/div/div/div[2]/aml-filter-selector/div[1]/div[2]/tk-dropdown-tree/tk-dropdown/div/div[1]/tk-dropdown-toggle/div/tk-input/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-overview/aml-report-view/div/div/div[2]/aml-filter-selector/div[1]/div[2]/tk-dropdown-tree/tk-dropdown/div/div[2]/tk-dropdown-nav/tk-dropdown-tree-item/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-overview/aml-report-view/div/div/div[2]/aml-submit-button/button")).click();
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-overview/aml-report-view/div/div/div[2]/div/div/div/div/div[2]/tk-icon/i", 10, driver); //WebElement downloadButton = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath()));
        driver.findElement(By.xpath("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-overview/aml-report-view/div/div/div[2]/div/div/div/div/div[2]/tk-icon/i")).click();
        // Navigate by URL */
        driver.get(preprod + "/restaurants/admin/analytics/home/locations/summary");
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-overview/aml-report-view/div/div/div[2]/aml-submit-button", 10, driver);
        driver.get(preprod + "/restaurants/admin/analytics/home/locations/overview");
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-location-overview/aml-report-view/div/div/div[2]/aml-submit-button", 10, driver);
        driver.get(preprod + "/restaurants/admin/analytics/home/locations/breakdown");
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-location-breakdown/aml-report-view/div/div/div[2]/aml-submit-button", 10, driver);
        driver.get(preprod + "/restaurants/admin/analytics/home/sales/summary");
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-sales-summary/aml-report-view/div/div/div[2]/aml-submit-button", 10, driver);
        driver.get(preprod + "/restaurants/admin/analytics/home/sales/breakdown");
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-sales-Breakdown/aml-report-view/div/div/div[2]/aml-submit-button", 10, driver);
        driver.get(preprod + "/restaurants/admin/analytics/home/menu/breakdown");
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-product-mix/aml-report-view/div/div/div[2]/aml-submit-button", 10, driver);
        driver.get(preprod + "/restaurants/admin/analytics/home/accounting/overview");
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-finance-overview/aml-report-view/div/div/div[2]/aml-submit-button", 10, driver);

        // Navigate from front page

        // Navigate by Top Nav

        // Navigate from sidebar
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().refresh();
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-overview/aml-report-view/div/div/div[2]/aml-filter-selector/div[1]/div[2]/tk-dropdown-tree/tk-dropdown/div/div[1]/tk-dropdown-toggle/div/tk-input/div/input",10 ,driver);
        //new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-overview/aml-report-view/div/div/div[2]/aml-filter-selector/div[1]/div[2]/tk-dropdown-tree/tk-dropdown/div/div[1]/tk-dropdown-toggle/div/tk-input/div/input")));*/
        driver.close();
        /* It don't matter form here bruh

        ->
        */
    }

    public static void waiter(String path, Integer time, WebDriver redcar)
    {
        WebElement waitress = (new WebDriverWait(redcar, time)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
    }

}