import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {
  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    try {
      // Navigate to Url
      driver.get("https://google.com");

      // Store 'google search' button web element
      WebElement searchBtn = driver.findElement(By.linkText("Gmail"));
      Actions actionProvider = new Actions(driver);
      // Performs mouse move action onto the element
      actionProvider.moveToElement(searchBtn).build().perform();
    } finally {
      driver.quit();
    }
  }
}