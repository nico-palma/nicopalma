package estudo.selenium.pog;

//Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;

public class JorgeematheusTestP {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void jorgeematheus() {
		driver.get("http://192.168.224.93/static/ctmc_agencia_web/#/home");
		driver.manage().window().setSize(new Dimension(1382, 744));
		driver.findElement(By.linkText("* Cadastrar")).click();
		{
			WebElement element = driver.findElement(By.linkText("* Cadastrar"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element, 0, 0).perform();
		}
		driver.findElement(By.cssSelector(".fa-angle-down")).click();
		driver.findElement(By.cssSelector("amb-combobox-item:nth-child(2) > li")).click();
		driver.findElement(By.cssSelector(".fa-sm")).click();
		driver.findElement(By.id("descricao")).click();
		driver.findElement(By.id("descricao")).sendKeys("Jorge e matheus");
		driver.findElement(By.cssSelector("#dataInicio .fa")).click();
		driver.findElement(By.cssSelector("tr:nth-child(5) > .day:nth-child(4)")).click();
		driver.findElement(By.cssSelector("#dataFim .fa")).click();
		driver.findElement(By.cssSelector("tr:nth-child(5) > .day:nth-child(6)")).click();
		driver.findElement(By.cssSelector(".fa-thumbs-o-up")).click();
		driver.findElement(By.cssSelector("#btnConfirmar .btn > span:nth-child(2)")).click();
		driver.findElement(By.cssSelector("#btnOKSucesso .btn > span:nth-child(2)")).click();
		driver.findElement(By.linkText("* Consultar")).click();
		driver.findElement(By.cssSelector(".fa-angle-down")).click();
		driver.findElement(By.cssSelector("amb-combobox-item:nth-child(2) > li")).click();
		driver.findElement(By.cssSelector(".fa-sm")).click();
		driver.findElement(By.id("numeroParametro")).click();
		driver.findElement(By.cssSelector("#dataInicio .fa")).click();
		driver.findElement(By.cssSelector("tr:nth-child(5) > .day:nth-child(4)")).click();
		driver.findElement(By.cssSelector("#dataFim .fa")).click();
		driver.findElement(By.cssSelector("tr:nth-child(5) > .day:nth-child(6)")).click();
		driver.findElement(By.cssSelector(".fa-sm")).click();
		driver.findElement(By.cssSelector(".amb-row:nth-child(2) > .cdk-column-parametro")).click();
		driver.findElement(By.cssSelector(".amb-row:nth-child(3) > .cdk-column-parametro")).click();
		driver.findElement(By.cssSelector(".col-sm-1:nth-child(3)")).click();
		driver.findElement(By.cssSelector(".col-sm-1:nth-child(3)")).click();
		driver.findElement(By.cssSelector(".fa-newspaper-o")).click();
		driver.findElement(By.cssSelector(".modal-dialog-manual span")).click();
		driver.findElement(By.cssSelector(".hicon-118")).click();
		{
			WebElement element = driver.findElement(By.cssSelector(".hicon-122"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element, 0, 0).perform();
		}
		driver.findElement(By.linkText("* Manutenção de Contas")).click();
		driver.findElement(By.id("agencia")).sendKeys("6505");
		driver.findElement(By.id("conta")).sendKeys("123");
		driver.findElement(By.cssSelector(".col-sm-1:nth-child(2) > #avancar .fa")).click();
		driver.findElement(By.cssSelector(".fa-wrench")).click();
		driver.findElement(By.cssSelector("#amb_156942737355319207535 .btn")).click();
		driver.findElement(By.cssSelector(".hicon-118")).click();
		driver.findElement(By.linkText("* Manutenção de Contas")).click();
		driver.findElement(By.id("agencia")).click();
		driver.findElement(By.id("agencia")).sendKeys("6505");
		driver.findElement(By.id("conta")).sendKeys("155");
		driver.findElement(By.cssSelector(".col-sm-1:nth-child(2) > #avancar .fa")).click();
		driver.findElement(By.cssSelector(".hicon-118")).click();
		{
			WebElement element = driver.findElement(By.cssSelector(".hicon-122"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element, 0, 0).perform();
		}
		driver.findElement(By.linkText("* Manutenção de Contas")).click();
		driver.findElement(By.id("agencia")).sendKeys("6505");
		driver.findElement(By.id("conta")).sendKeys("4549");
		driver.findElement(By.cssSelector(".col-sm-1:nth-child(2) > #avancar .fa")).click();
		driver.findElement(By.cssSelector(".fa-wrench")).click();
		driver.findElement(By.cssSelector("#amb_156942765632811460105 .btn")).click();
		driver.findElement(By.cssSelector("#amb_156942765632025695796 .panel-collapse")).click();
		driver.findElement(By.cssSelector("#amb_156942765631754039233 .panel-title .fa")).click();
		driver.findElement(By.cssSelector("#amb_156942765630740209915 .panel-collapse")).click();
		driver.findElement(By.cssSelector("#amb_156942765631383140657 .panel-title .fa")).click();
		driver.findElement(By.cssSelector("#amb_156942765631344633425 .panel-title .fa")).click();
		driver.findElement(By.cssSelector("#amb1986 .amb-row:nth-child(2) > .cdk-column-participacaoParticipantes"))
				.click();
		driver.findElement(By.cssSelector("#amb_156942765631344633425 .col-sm-12")).click();
		driver.findElement(By.cssSelector("#detalharContas > .fa")).click();
		driver.findElement(By.cssSelector("#amb_156942765632376978899 span")).click();
	}
}