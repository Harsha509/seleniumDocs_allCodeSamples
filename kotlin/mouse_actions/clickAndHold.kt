import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.interactions.Actions

fun main() {
    val driver =  ChromeDriver()
    try {
        // Navigate to Url
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop")
        // Store 'box A' as source element
        val sourceEle = driver.findElement(By.id("draggable"))
        // Store 'box B' as source element
        val targetEle = driver.findElement(By.id("droppable"))
        val actionProvider = Actions(driver)
        actionProvider.clickAndHold(sourceEle).moveToElement(targetEle).build().perform()
        // Performs release event
        actionProvider.release().build().perform()
    } finally {
        driver.quit()
    }
}