//package fr.afpa.pompey.cda22045.controller;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class PersonControllerSeleniumTest {
//
//    private WebDriver driver;
//
//    @BeforeEach
//    public void setUp() {
//        // emplacement du pilote Chrome
////        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
//
//        // Instanciation du pilote Chrome
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--headless");
//        driver = new ChromeDriver(options);
//    }
//
//    @Test
//    public void testPageTitle() {
//        // Accédez à une URL
//        driver.get("http://localhost:9000");
//
//        // Récupérez le titre d la page
//        String title = driver.getTitle();
//
//        // Vérifiez si le titre est correct
//        assertEquals("Person Web Application", title);
//    }
//
//    @AfterEach
//    public void tearDown() {
//        // Fermez le navigateur
//        driver.quit();
//    }
//}