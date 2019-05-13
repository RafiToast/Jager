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
        logIn(driver);

        // Navigate by URL

        navigateToRestaurant("SusieCakes", driver);
        navigateByUrl(driver, preprod);
        navigateToRestaurant("Futago", driver);
        navigateByUrl(driver, preprod);

        // Navigate from front page*/
        navigateToRestaurant("BareBurger", driver);
        navigateFromFrontPage(driver, preprod);

        // Navigate by Top Nav


        // Navigate from sidebar


        driver.close();
        /* It don't matter form here bruh

        ->
        */
    }

    public static void logIn(WebDriver driver)
    {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rdiaz@toasttab.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(System.getenv("MY_PASSWORD")); //NO SEAS TONTO
        driver.findElement(By.xpath("//*[@id=\"log-in\"]")).click();
    }

    public static void waiter(String path, Integer time, WebDriver redcar)
    {
        WebElement waitress = (new WebDriverWait(redcar, time)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
    }

    public static void navigateByUrl(WebDriver urlDrive, String Env)
    {
        urlDrive.get(Env + "/restaurants/admin/analytics/home/locations/summary");
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-overview/aml-report-view/div/div/div[2]/aml-submit-button", 10, urlDrive);
        urlDrive.get(Env + "/restaurants/admin/analytics/home/locations/overview");
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-location-overview/aml-report-view/div/div/div[2]/aml-submit-button", 10, urlDrive);
        urlDrive.get(Env + "/restaurants/admin/analytics/home/locations/breakdown");
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-location-breakdown/aml-report-view/div/div/div[2]/aml-submit-button", 10, urlDrive);
        urlDrive.get(Env + "/restaurants/admin/analytics/home/sales/summary");
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-sales-summary/aml-report-view/div/div/div[2]/aml-submit-button", 10, urlDrive);
        urlDrive.get(Env + "/restaurants/admin/analytics/home/sales/breakdown");
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-sales-Breakdown/aml-report-view/div/div/div[2]/aml-submit-button", 10, urlDrive);
        urlDrive.get(Env + "/restaurants/admin/analytics/home/menu/breakdown");
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-product-mix/aml-report-view/div/div/div[2]/aml-submit-button", 10, urlDrive);
        urlDrive.get(Env + "/restaurants/admin/analytics/home/accounting/overview");
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-finance-overview/aml-report-view/div/div/div[2]/aml-submit-button", 10, urlDrive);
    }

    public static void navigateFromFrontPage(WebDriver urlDrive, String Env)
    {
        urlDrive.get(Env);
        waiter("/html/body/div[2]/div[1]/div/div[3]/div/div[2]/div[4]/ul/li[1]", 10, urlDrive);
        urlDrive.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div/div[2]/div[4]/ul/li[1]")).click();
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-overview/aml-report-view/div/div/div[2]/aml-submit-button", 20, urlDrive);
        urlDrive.navigate().back();
        waiter("/html/body/div[2]/div[1]/div/div[3]/div/div[2]/div[4]/ul/li[2]", 10, urlDrive);
        urlDrive.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div/div[2]/div[4]/ul/li[2]")).click();
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-overview/aml-report-view/div/div/div[2]/aml-submit-button", 10, urlDrive);
        urlDrive.navigate().back();
        waiter("/html/body/div[2]/div[1]/div/div[3]/div/div[2]/div[4]/ul/li[3]", 10, urlDrive);
        urlDrive.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div/div[2]/div[4]/ul/li[3]")).click();
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-sales-summary/aml-report-view/div/div/div[2]/aml-submit-button", 10, urlDrive);
        urlDrive.navigate().back();
        waiter("/html/body/div[2]/div[1]/div/div[3]/div/div[2]/div[4]/ul/li[4]", 10, urlDrive);
        urlDrive.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div/div[2]/div[4]/ul/li[4]")).click();
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-product-mix/aml-report-view/div/div/div[2]/aml-submit-button", 10, urlDrive);
        urlDrive.navigate().back();
        waiter("/html/body/div[2]/div[1]/div/div[3]/div/div[2]/div[4]/ul/li[5]", 10, urlDrive);
        urlDrive.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div/div[2]/div[4]/ul/li[5]")).click();
        waiter("//*[@id=\"toast-material\"]/aml-dashboard/div/aml-finance-overview/aml-report-view/div/div/div[2]/aml-submit-button", 10, urlDrive);
        urlDrive.navigate().back();
    }

    public static void navigateToRestaurant(String retaurantName, WebDriver blueCar)
    {
        blueCar.findElement(By.xpath("//*[@id=\"switch-toggle\"]")).click();
        waiter("//*[@id=\"restaurant-switch-menu-search\"]/input",10,blueCar);
        blueCar.findElement(By.xpath("//*[@id=\"restaurant-switch-menu-search\"]/input")).sendKeys(retaurantName);
        waiter("//*[@id=\"restaurant-switch-menu\"]/li[3]",10,blueCar);
        blueCar.findElement(By.xpath("//*[@id=\"restaurant-switch-menu\"]/li[3]/a")).click();
        waiter("//*[@id=\"notifications\"]", 20, blueCar);
    }

}