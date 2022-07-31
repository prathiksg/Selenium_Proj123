package module1;

public class Amway {


		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		//import org.openqa.selenium.support.ui.Select;

		public class  Amway {
			

			WebDriver driver;

			public void browser() throws InterruptedException {
				
				
				System.setProperty("webdriver.chrome.driver", "C:\\selen-exes\\chromedriver_win32_103\\chromedriver.exe");
				 driver = new ChromeDriver();
				 
				
								
				//Open AUT
				driver.get("https://www.amway.com/");
				

				driver.findElement(By.xpath("//*[@id='preferredUserName']/span")).click(); 
				
				
				driver.findElement(By.xpath("/html/body/main/div[3]/div/div/ul/li[1]/a/span[2]")).click();
				
				Thread.sleep(3000);

				
				driver.findElement(By.id("username")).sendKeys("kalyanpenukula@gmail.com");
				
				
				driver.findElement(By.name("password")).sendKeys("kpsG1010");
				
				driver.findElement(By.xpath("//*[@id=\"amway-account-signin\"]/div/div/div/div/div/app-button/button")).click();
				
				Thread.sleep(5000);

				driver.navigate().refresh(); // Page refresh

				// driver.findElement(By.name("text")).click();   
				

				
			}
			      // TODO Auto-generated method stub
				public static void main(String[] args) throws InterruptedException {
					
					Amway myobj = new Amway();
					     myobj.browser();              

			}

		}

	}

}
