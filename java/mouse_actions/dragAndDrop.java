import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class clickAndHold {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    try {
      // Navigate to Url
      driver.get("https://the-internet.herokuapp.com/drag_and_drop");

      // Store 'box A' as source element
      WebElement sourceEle = driver.findElement(By.id("column-a"));

      // Store 'box B' as source element
      WebElement targetEle = driver.findElement(By.id("column-b"));

      Actions actionProvider = new Actions(driver);
      // Performs mouse move action onto the offset position
      actionProvider.dragAndDrop(sourceEle, targetEle).build().perform();
      Thread.sleep(2000);
    } finally {
      driver.quit();
    }
  }
}
