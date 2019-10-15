package DefinicionDePasos;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class TestEbayBuscarPilas {
	static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	driver.close();
	}

	@Test
	public void testEbay() {
		WebElement buscador = driver.findElement(By.id("gh-ac"));
		buscador.sendKeys("pilas");
		
		WebElement lupa = driver.findElement(By.id("gh-btn"));
		lupa.click();
		
		List<WebElement> productosEncontrados = driver.findElements(By.className("s-item"));
		
		int ElementosEncontrados = productosEncontrados.size() ;
		
		System.out.println("El buscador de pilas en Ebay Contiene "+ (ElementosEncontrados) + " elementos");
	}

}
