import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.ByteOrder;
import java.time.Duration;

public class Main {
    public static void main(String[] args) throws Throwable{

        System.setProperty("web-driver.chrome.driver","C:\\Users\\pooji\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();

        driver.get("https://american-technology.office-qa.auzmor.com/login");

        WebElement elementEmail = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement elementPassword = driver.findElement(By.xpath("//input[@type='password']"));

        elementEmail.sendKeys("monika.gedam@american-technology.net");
        elementPassword.sendKeys("Test@123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("//img[@loading='lazy']")).click();
        driver.findElement(By.xpath("//button[@data-testid='user-menu-profile']")).click();
//        driver.findElement(By.xpath("//div[@class='absolute bg-white rounded-full p-[5px] cursor-pointer top-1 right-1']")).click();

        WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
        fileInput.sendKeys("C:\\Users\\pooji\\Downloads\\mylaptop-wallpaper.jpg");
        driver.findElement(By.xpath("//button[@data-testid='profile-pic-apply']")).click();
        driver.findElement(By.xpath("//button[@data-testid='edit-profile-savechanges ']")).submit();
//        driver.findElement(By.xpath("//img[@src='https://office-qa-cdn.auzmor.com/646311ed765368daacc601f7/public/users/646311ed765368daacc601f9/profile/1702813681544-original.jpg']"));
//        Thread.sleep(1000);

//        String imageSrc = logo.getAttribute("src");
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get(imageSrc);
//        Thread.sleep(6000);
//        File image = new File("C:\\Users\\dell\\Downloads\\steve-gribble-v1Gkc6vH4BQ-unsplash.jpg");
//        BufferedImage expectedImage = ImageIO.read(image);
//        String OldImagePath = "C:\\Users\\dell\\Downloads\\";
//        try {
//            boolean isImagesame = Shutterbug.shootPage(driver, Capture.FULL, 500, true).withName("Actual").equalsWithDiff(expectedImage, OldImagePath, 0);
//        } catch (UnableToCompareImagesException e) {
//            System.out.println("Images dimensions mismatch: " + e.getMessage());
//
//        }
//        driver.quit();
    }
}