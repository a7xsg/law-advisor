/* By Zhamiila*/
package law.advisor;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {
    static String baseURL = "http://localhost:8080/";

    //############Sprint1############
    /*Open site Test*/
    public static boolean open(WebDriver driver){
        driver.get(baseURL);
        if(!driver.getTitle().contentEquals("Online Law Consultant")){
            System.out.println("open failed");
            return false;
        }
        return true;
    }

    /*Open Login page Test*/
    public static boolean openLogin(WebDriver driver){
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id='userbox']/div/a[1]")).click();
        if(!driver.getTitle().contentEquals("Login")){
            System.out.println("title failed");
        }
        String expectedURL = "http://localhost:8080/login";
        String actualURL = "";
        actualURL = driver.getCurrentUrl();
        if (actualURL.contentEquals(expectedURL)){
            System.out.println(1);
            return true;
        } else {
            System.out.println("Failed open login :"+driver.getCurrentUrl());
            return false;
        }
    }

    /*Open Registration page Test*/
    public static boolean openReg(WebDriver driver){
        String expectedURL = "http://localhost:8080/user/0/save";
        String actualURL = "";
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id='userbox']/div/a[2]")).click();
        if(!driver.getTitle().contentEquals("Registration")){
            System.out.println("title failed");
        }
        actualURL = driver.getCurrentUrl();
        if (actualURL.contentEquals(expectedURL)){
            System.out.println(1);
            return true;
        } else {
            System.out.println("Failed open register:"+driver.getCurrentUrl());
            return false;
        }
    }

    /* Return to home page by clicking logo Test*/
    public static boolean homeLogo(WebDriver driver){
        String expectedURL = "http://localhost:8080/";
        String actualURL = "";
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id='userbox']/div/a[1]")).click();
        driver.findElement(By.xpath("/html/body/section/div/a/img")).click();
        actualURL = driver.getCurrentUrl();
        if(actualURL.contentEquals(expectedURL)){
            System.out.println(1);
            return true;
        } else {
            System.out.println("Failed home logo :"+driver.getCurrentUrl());
            return false;
        }
    }

    /* Registration Test*/
    public static boolean register(WebDriver driver){
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id='userbox']/div/a[2]")).click();
        driver.findElement(By.xpath("/html/body/section/div/section/div/div/section/div/form/div/div/div[1]/input")).sendKeys("selenium");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("password");
        driver.findElement(By.xpath("//*[@id=\"confirm\"]")).sendKeys("password");
        driver.findElement(By.xpath("/html/body/section/div/section/div/div/section/div/form/div/div/div[4]/input")).sendKeys("jama.98.kjk@gmail.com");
        driver.findElement(By.xpath("/html/body/section/div/section/div/div/section/div/form/div/div/div[5]/input")).sendKeys("Selenium");
        driver.findElement(By.xpath("/html/body/section/div/section/div/div/section/div/form/div/div/div[6]/input")).sendKeys("Test");
        driver.findElement(By.xpath("/html/body/section/div/section/div/div/section/div/form/div/div/div[7]/input")).sendKeys("0700123456");
        driver.findElement(By.xpath("//*[@id=\"optionsRadios2\"]")).click();
        driver.findElement(By.xpath("/html/body/section/div/section/div/div/section/div/form/div/div/button")).click();
        if(!driver.getCurrentUrl().contentEquals(baseURL)){
            System.out.println(1);
            return true;
        }else{
            return false;
        }
    }

    /* Registration for Lawyers Test*/
    public static boolean registerLaw(WebDriver driver){
        return false;
    }

    /*Open register page from login page Test*/
    public static boolean openReg2(WebDriver driver){
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id=\"userbox\"]/div/a[1]")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/p/a")).click();
        if(driver.getCurrentUrl().contentEquals("http://localhost:8080/user/0/save")) {
            System.out.println(1);
            return true;
        } else {
            System.out.println("Failed :"+driver.getCurrentUrl());
            return false;
        }
    }

    /*Login Test*/
    public static boolean login(WebDriver driver){
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id='userbox']/div/a[1]")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div/input")).sendKeys("zhamiila.kartanbaeva");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div[2]/input")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[2]/button[1]")).click();
        if(driver.getCurrentUrl().contentEquals(baseURL)){
            System.out.println(1);
            return true;
        }else {
            System.out.println( "failed login");
            return false;
        }
    }

    /*Login Lawyer Test*/
    public static boolean loginLaw(WebDriver driver){
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id='userbox']/div/a[1]")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div/input")).sendKeys("lawyer");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div[2]/input")).sendKeys("123");
        driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[2]/button[1]")).click();
        if(driver.getCurrentUrl().contentEquals(baseURL)){
            System.out.println(1);
            return true;
        }else {
            System.out.println( "failed login");
            return false;
        }
    }

    /*Login Admin Test*/
    public static boolean loginAdm(WebDriver driver){
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id='userbox']/div/a[1]")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div/input")).sendKeys("admin");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div[2]/input")).sendKeys("123");
        driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[2]/button[1]")).click();
        if(driver.getCurrentUrl().contentEquals(baseURL)){
            System.out.println(1);
            return true;
        }else {
            System.out.println( "failed login");
            return false;
        }
    }

    /*Login Test*/
    public static boolean login2(WebDriver driver){
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id='userbox']/div/a[1]")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div/input")).sendKeys("alina");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div[2]/input")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[2]/button[1]")).click();
        if(driver.getCurrentUrl().contentEquals(baseURL)){
            System.out.println(1);
            return true;
        }else {
            System.out.println(0);
            return false;
        }
    }

    /*Login with Facebook Test*/
    public static boolean loginFacebook(WebDriver driver){
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id='userbox']/div/a[1]")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/a[1]")).click();
        System.out.println(0);
        return false;
    }

    /*Login with Tweeter Test*/
    public static boolean loginTweeter(WebDriver driver){
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id='userbox']/div/a[1]")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/a[2]")).click();
        System.out.println(0);
        return false;
    }

    /*Open About Us page Test*/
    public static boolean aboutUs(WebDriver driver){
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[6]/a")).click();
        if(!driver.getTitle().contentEquals("About Us")){
            System.out.println("title failed");
        }
        if(driver.getCurrentUrl().contentEquals("http://localhost:8080/aboutus")){
            System.out.println(1);
            return true;
        }else {
            System.out.println("failed about us");
            return false;
        }
    }

    /*Open About Us page from News page Test*/
    public static boolean aboutUs3(WebDriver driver){
        driver.get("http://localhost:8080/news");
        driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[6]/a")).click();
        if(!driver.getTitle().contentEquals("About Us")){
            System.out.println("title failed");
        }
        if(driver.getCurrentUrl().contentEquals("http://localhost:8080/aboutus")){
            System.out.println(1);
            return true;
        }else {
            System.out.println("failed about us");
            return false;
        }
    }

    /*Open About Us page from Questions page Test*/
    public static boolean aboutUs4(WebDriver driver){
        driver.get("http://localhost:8080/question/list");
        driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[6]/a")).click();
        if(!driver.getTitle().contentEquals("About Us")){
            System.out.println("title failed");
        }
        if(driver.getCurrentUrl().contentEquals("http://localhost:8080/aboutus")){
            System.out.println(1);
            return true;
        }else {
            System.out.println("failed about us");
            return false;
        }
    }

    /*Open News page Test*/
    public static boolean news(WebDriver driver){
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
        if(!driver.getTitle().contentEquals("News")){
            System.out.println("title failed");
        }
        if(driver.getCurrentUrl().contentEquals("http://localhost:8080/news")){
            System.out.println(1);
            return true;
        }else {
            System.out.println("failed news");
            return false;
        }
    }

    /*Open News page Test*/
    public static boolean reviews(WebDriver driver){
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[7]/a")).click();
        if(!driver.getTitle().contentEquals("Reviews")){
            System.out.println("title failed");
        }
        if(driver.getCurrentUrl().contentEquals("http://localhost:8080/reviews")){
            System.out.println(1);
            return true;
        }else {
            System.out.println("failed review");
            return false;
        }
    }

    /*Copyright Test*/
    public static boolean copyright(WebDriver driver, String url){
        driver.get(url);
        String expectedCopy = ":copyright: Copyright 2019 - All Rights Reserved";
        String actualCopy = driver.findElement(By.xpath("/html/body/footer/div")).getText();
        if(actualCopy.contentEquals(expectedCopy)){
            System.out.println(1);
            return true;
        } else {
            System.out.println("failed copyright");
            return false;
        }
    }
    
    /*Delete Account Test*/
    public static boolean deleteAcc(WebDriver driver){
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id=\"userbox\"]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"userbox\"]/div/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/section/div/section/div[1]/div/div/div[2]/section/form/div/button")).click();
        if(driver.getCurrentUrl().contentEquals(baseURL)){
            System.out.println(1);
            return true;
        } else {
            System.out.println("failed delete");
            return false;
        }
    }
    
    /*Reset password Test*/
    public static boolean resetPassword(WebDriver driver){
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id=\"userbox\"]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"userbox\"]/div/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/section/div/section/div[1]/div/div/div[1]/section/form/div/button")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div/input")).sendKeys("12345");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div[2]/input")).sendKeys("password");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[2]/input")).sendKeys("password");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/button[1]")).click();
        if(driver.getCurrentUrl().contentEquals("http://localhost:8080/user/57/view")){
            System.out.println(1);
            return true;
        } else {
            System.out.println(0);
            return false;
        }
    }
    
    /*Logout Test*/
    public static boolean logout(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"userbox\"]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"userbox\"]/div/div/ul/li[3]/a")).click();
        if(driver.getCurrentUrl().contentEquals(baseURL)){
            System.out.println(1);
            return true;
        } else {
            System.out.println("failed logout");
            return false;
        }
    }
    //############End of Sprint1############

    //############Sprint2############
    /*Ask Question Test*/
    public static boolean ask(WebDriver driver){
        driver.findElement(By.xpath("/html/body/section/div/section/header/h2/a")).click();
        driver.findElement(By.xpath("/html/body/section/div/section/div/div/section/div/form/div/div/div[1]/input")).sendKeys("Hello world");
        driver.findElement(By.xpath("//*[@id=\"category.id\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"category.id\"]/option[2]")).click();
        driver.findElement(By.xpath("/html/body/section/div/section/div/div/section/div/form/div/div/div[3]/textarea")).sendKeys("It's my question");
        driver.findElement(By.xpath("/html/body/section/div/section/div/div/section/div/form/div/div/button")).click();
        if(driver.getTitle().contentEquals("Question View")){
            System.out.println(1);
            return true;
        } else{
            System.out.println("failed ask");
            return false;
        }
    }

    /*Open About Us page from Lowyers page Test*/
    public static boolean aboutUs2(WebDriver driver){
        driver.get("http://localhost:8080/lawyer/list");
        driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[6]/a")).click();
        if(!driver.getTitle().contentEquals("About Us")){
            System.out.println("title failed");
        }
        if(driver.getCurrentUrl().contentEquals("http://localhost:8080/aboutus")){
            System.out.println(1);
            return true;
        }else {
            System.out.println("failed about us");
            return false;
        }
    }

    /*Open Lawyers Test*/
    public static boolean openLawyers(WebDriver driver){
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
        if(!driver.getTitle().contentEquals("Lawyers")){
            System.out.println("title failed");
        }
        if(driver.getCurrentUrl().contentEquals("http://localhost:8080/lawyer/list")){
            System.out.println(1);
            return true;
        } else {
            System.out.println("failed lawyer");
            return false;
        }
    }

    /*Use search bar Test*/
    public static boolean search(WebDriver driver){
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("Hello");
        driver.findElement(By.xpath("/html/body/section/header/div[2]/form/div/span/button")).click();
        return driver.getCurrentUrl().contentEquals("http://localhost:8080/pages-search-results.html?q=Hello");
    }

    /*Search by category*/
    public static boolean category(WebDriver driver){
        return true;
    }

    /*See Top 10 Lawyers Test*/
    public static boolean top(WebDriver driver){
        return true;
    }

    /*Delete questions Test*/
    public static boolean delQuestion(WebDriver driver){
        return true;
    }

    /*Rating near answer Test*/
    public static boolean rating(WebDriver driver){
        return true;
    }

    /*Who answered Test*/
    public static boolean whoanswer(WebDriver driver){
        return true;
    }

    /*Date of answer Test*/
    public static boolean dateAns(WebDriver driver){
        return true;
    }

    /*Add category Test*/
    public static boolean addCat(WebDriver driver){
        return true;
    }

    /*Delete category Test*/
    public static boolean deleteCat(WebDriver driver){
        return true;
    }

    /*Edit category Test*/
    public static boolean editCat(WebDriver driver){
        return true;
    }

    /*Add lawyer Test*/
    public static boolean addLaw(WebDriver driver){
        return true;
    }

    /*Delete lawyer Test*/
    public static boolean deleteLaw(WebDriver driver){
        return true;
    }
    //############End of Sprint2############



    //############Sprint3############
    /*Answer Test*/
    public static boolean answer(WebDriver driver){
        loginLaw(driver);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        driver.findElement(By.cssSelector("#content > ul > li > div > div:nth-child(9) > section > header > a > h2")).click();
        driver.findElement(By.xpath("/html/body/section/div[2]/section/div[2]/div/section/header/a")).click();
        driver.findElement(By.xpath("/html/body/section/div/section/div/div/section/div/form/div/div/div/textarea")).sendKeys("It is answer");
        driver.findElement(By.xpath("/html/body/section/div/section/div/div/section/div/form/div/div/button")).click();
        if(driver.getCurrentUrl().contentEquals("http://localhost:8080/question/125/view") ){
            System.out.println(1);
            return true;
        }
        return false;
    }
    /*Leave review Test*/
    public static boolean review(WebDriver driver){
        return true;
    }

    /*Inform about mistake Test*/
    public static boolean mistake(WebDriver driver){
        return true;
    }

    /*See the rate of answer Test*/
    public static boolean rateAnswer(WebDriver driver){
        return true;
    }

    /*Status of questions Test*/
    public static boolean status(WebDriver driver){
        return true;
    }

    /*See date of question Test*/
    public static boolean dateQuestion(WebDriver driver){
        return true;
    }

    /*Similar questions Test*/
    public static boolean similar(WebDriver driver){
        return true;
    }

    /*Like Test*/
    public static boolean seeLike(WebDriver driver){
        return true;
    }

    /*View Test*/
    public static boolean view(WebDriver driver){
        return true;
    }

    /*Notification when get answer Test*/
    public static boolean isAnswered(WebDriver driver){
        return true;
    }

    /*Put like to question Test*/
    public static boolean putLike(WebDriver driver){
        return true;
    }
    //############End of Sprint3############
    public static void main(String[] args) {
        WebDriver dr = new ChromeDriver();
        dr.manage().window().maximize();
        answer(dr);

    }
}