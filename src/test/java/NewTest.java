
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class NewTest {
    public static void main(String[] args) {
        video_search();
    }
    public static void video_search(){
        //登录
        ChromeOptions options = new ChromeOptions();
        //添加配置文件
        options.addArguments("--user-data-dir=C:\\Users\\lenovo\\AppData\\Local\\Google\\Chrome\\User Data");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        //1.打开Chrome浏览器
        ChromeDriver chromeDriver = new ChromeDriver(options);
        // 与浏览器同步非常重要，必须等待浏览器加载完毕
        //chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2.访问bilibili
        chromeDriver.get("https://www.bilibili.com");
        //3.搜索框输入
        chromeDriver.findElement(By.className("nav-search-input")).sendKeys("软件测试");
        //4.点击搜索
        chromeDriver.findElement(By.className("nav-search-btn")).click();
        //5.等几秒 查看结果
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chromeDriver.quit();
    }
}
