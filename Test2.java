import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
public class Test2 {
    @Test
    public void TestChrome() throws InterruptedException {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.wikipedia.org/";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver");
        Configuration.startMaximized = true;

        Selenide.open("https://www.wikipedia.org/");
        Thread.sleep(2000);
        $("#searchInput").setValue("საქართველო").sendKeys(Keys.ENTER);
        Thread.sleep(7000);


    }
}

