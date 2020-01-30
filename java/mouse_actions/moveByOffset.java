import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveByOffset {
  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    try {
      // Navigate to Url
      driver.get("https://google.com");

      // Store 'google search' button web element
      WebElement searchBtn = driver.findElement(By.linkText("Gmail"));
      // Capture x and y offset positions of element
      int xOffset = searchBtn.getRect().getX();
      int yOffset = searchBtn.getRect().getY();
      Actions actionProvider = new Actions(driver);
      // Performs mouse move action onto the offset position
      actionProvider.moveByOffset(xOffset, yOffset).build().perform();
    } finally {
      driver.quit();
    }
  }
}