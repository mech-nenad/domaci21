import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nenad\\Documents\\Driver\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com/");

        WebElement singUp = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a"));
        singUp.click();

        Faker faker = new Faker();
        WebElement inputName = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[2]"));
        String userName = faker.name().username();
        inputName.sendKeys(userName);

        WebElement inputEmail = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]"));
        String userEmail = faker.internet().emailAddress();
        inputEmail.sendKeys(userEmail);

        WebElement singUpButton = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button"));
        singUpButton.click();

        WebElement titleGender = driver.findElement(By.id("id_gender1"));
        titleGender.click();

        WebElement inputPassword = driver.findElement(By.id("password"));
        String password = faker.internet().password();
        inputPassword.sendKeys(password);

        WebElement inputDay = driver.findElement(By.id("days"));
        Select category = new Select(inputDay);
        category.selectByIndex(5);

        WebElement inputMonth = driver.findElement(By.id("months"));
        Select category1 = new Select(inputMonth);
        category1.selectByVisibleText("May");

        WebElement inputYear = driver.findElement(By.id("years"));
        Select category2 = new Select(inputYear);
        category2.selectByIndex(20);

        WebElement receiveSpecialButton = driver.findElement(By.id("optin"));
        receiveSpecialButton.click();

        WebElement firstName = driver.findElement(By.id("first_name"));
        String name = faker.name().firstName();
        firstName.sendKeys(name);

        WebElement lastName = driver.findElement(By.id("last_name"));
        String lastNameinput = faker.name().lastName();
        lastName.sendKeys(lastNameinput);

        WebElement addressInput = driver.findElement(By.id("address1"));
        String address = faker.address().streetAddress();
        addressInput.sendKeys(address);


        WebElement countryInput = driver.findElement(By.id("country"));
        Select category3 = new Select(countryInput);
        category3.selectByVisibleText("Canada");

        WebElement stateInput = driver.findElement(By.id("state"));
        String state = faker.address().state();
        stateInput.sendKeys(state);

        WebElement cityInput = driver.findElement(By.id("city"));
        String city = faker.address().cityName();
        cityInput.sendKeys(city);

        WebElement zipcodeInput = driver.findElement(By.id("zipcode"));
        String zipcode = faker.address().zipCode();
        zipcodeInput.sendKeys(zipcode);

        WebElement mobileNumberInput = driver.findElement(By.id("mobile_number"));
        String mobileNumber = faker.phoneNumber().cellPhone();
        mobileNumberInput.sendKeys(mobileNumber);

        WebElement createAccount = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/button"));
        createAccount.click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement continueSeleced = driver.findElement(By.xpath("/html/body/section/div/div/div/div/a"));
        continueSeleced.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement deleteAccount = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[5]/a"));
        deleteAccount.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement continueSelecedToDeleteAccount = driver.findElement(By.xpath("/html/body/section/div/div/div/div/a"));
        continueSelecedToDeleteAccount.click();


        driver.quit();
    }
}
