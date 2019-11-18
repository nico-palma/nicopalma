package estudo.selenium.pog;

import java.awt.AWTException;
//import java.awt.Robot;
import java.awt.event.KeyEvent;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.crypto.tls.Chacha20Poly1305;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.Cookie;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.ie.InternetExplorerOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;

//import org.openqa.selenium.support.ui.Select;

//import junit.framework.Assert;
import multiScreenShot.MultiScreenShot;
//import net.lightbody.bmp.BrowserMobProxy;
//import net.lightbody.bmp.BrowserMobProxyServer;
//import net.lightbody.bmp.client.ClientUtil;
//import net.lightbody.bmp.proxy.auth.AuthType;

public class AlterarTipoCampanha {

	@Test
	public void alterarTipoCampanha() throws InterruptedException {

		Teste1();
		
		
		
		
//		TesteIE1();

	}

	public AlterarTipoCampanha() throws AWTException {
		super();
		// TODO Auto-generated constructor stub
	}

	// Testando aplicação Internet Explorer

//	@Test
//	public void alterarTipoCampanha() throws InterruptedException{
//		System.setProperty("webdriver.ie.driver", "C:\\Users\\galmeida\\Documents\\Estudo\\estudo\\TesteSelenium\\IEDriverServer.exe");
////		System.setProperty("webdriver.chrome.driver", "C:\\Users\\galmeida\\Documents\\Estudo\\estudo\\TesteSelenium\\chromedriver.exe");
//		 BrowserMobProxy proxy = new BrowserMobProxyServer();
//	        proxy.start(0);
//	        Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
//	     // put our custom header to each request
//	        System.out.println("antes do request filter");
//	        proxy.addRequestFilter((request, contents, messageInfo)->{
//	            request.headers().add("x-amb-header", "{}");
//	            request.headers().add("Content-Type", "application/json");
//	            
//	            System.out.println(request.headers().entries().toString());
//	            return null;
//	        });
//	        proxy.autoAuthorization("10.1.255.35", "I918035", "ctmc1909", AuthType.BASIC);
//		DesiredCapabilities ieCaps = DesiredCapabilities.internetExplorer();
//		ieCaps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//		ieCaps.setCapability(InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP, true);
//		InternetExplorerOptions opt = new InternetExplorerOptions(ieCaps);
//		opt.setProxy(seleniumProxy);
//		
//		
//		WebDriver ieDriver = new InternetExplorerDriver(opt);
//		
//		
//		 String pageUrl = "http://10.1.255.35:8080/static/ctmc_agencia_web/";
//		 
//		 /* Browse the page url above. */
//		 ieDriver.get(pageUrl);
//		 ieDriver.navigate().to(pageUrl);
//		
//	
//	}

//	
	// Testando aplicação Chrome

	public void Teste1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jribeiro\\Desktop\\Selenium\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
	 
		WebDriver chromeDriver = new ChromeDriver(options);

		// maximizando a janela
		chromeDriver.manage().window().maximize();

		// entrando no backend com usuário e senha
	

		try {

			SmartRobot roboNico;

			roboNico = new SmartRobot();

			ReadGuru99ExcelFile read = new ReadGuru99ExcelFile();
			String filePath = System.getProperty("user.dir") + "\\src\\excelExportAndFileIO";
			String data = "";

			XSSFWorkbook srcBook = null;
			try {
				srcBook = new XSSFWorkbook("C:\\Users\\jribeiro\\Desktop\\test.xlsx");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			for (int rownum = 0; rownum < 5; rownum++) {	
				
				if (rownum > 0) {
				
					chromeDriver.quit();
					// instanciando novamente o driver do navegador para abrir com outro usuário e
					// senha para poder alterar
					chromeDriver = new ChromeDriver();
		
					// maximizando a janela
					chromeDriver.manage().window().maximize();
		
//					chromeDriver.get("http://I908135:ctmc1910@localhost:8080/ctmc_agencia_web/");
		
//					chromeDriver.get("http://localhost:4200/static/ctmc_agencia_web/#/consultarAtributos");
				
				
				}
				
				chromeDriver.get("http://I908135:ctmc1910@localhost:8080/ctmc_agencia_web/");

				Thread.sleep(1000);

				// entrando no frontend após logar no backend
				chromeDriver.get("http://localhost:4200/static/ctmc_agencia_web/");

				chromeDriver.findElement(By.xpath("//a[contains(.,'* Cadastrar')]")).click();
				chromeDriver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
				chromeDriver.findElement(By.cssSelector("amb-combobox-item:nth-child(2) > li")).click();
				chromeDriver.findElement(By.id("pesquisar")).click();

				
				XSSFSheet sourceSheet = srcBook.getSheetAt(0);
				
				XSSFRow sourceRow = sourceSheet.getRow(rownum);
				XSSFCell cell1 = sourceRow.getCell(0);
				XSSFCell cell2 = sourceRow.getCell(1);
				XSSFCell cell3 = sourceRow.getCell(2);
				System.out.println(cell1);
				System.out.println(cell2);
				System.out.println(cell3);
	
				Logger logger = Logger.getLogger("MyLogSelenium");
				FileHandler fh;
	

				String filePath2 = System.getProperty("user.dir") + "//" + cell1.toString();
				MultiScreenShot multiScreens1 = new MultiScreenShot(filePath2,
						"");
				
				
				try {
	
					// This block configure the logger with handler and formatter
					String filePath1 = System.getProperty("user.dir") + "\\Log.log";
					fh = new FileHandler(filePath1);
					logger.addHandler(fh);
					SimpleFormatter formatter = new SimpleFormatter();
					fh.setFormatter(formatter);
					// the following statement is used to log any messages
					logger.info("Teste Cadastrar Parâmetros - Motivo Manutenção\r\n");
					
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
	
				try {
					read.readExcel(filePath, "read_test.xlsx", "Test", data);		
					// incluir parâmetro
					
	//	
	//				System.out.println(data);
				} catch (IOException e) {				// TODO Auto-generated catch block
					e.printStackTrace();
				}
	//			
				WebElement descricao = chromeDriver.findElement(By.id("descricao"));
				descricao.sendKeys(cell1.toString());
				Thread.sleep(1000);
	
				WebElement dataInicio = chromeDriver.findElement(By.id("dataInicio"));
				dataInicio.findElement(By.tagName("input")).click();
	
				roboNico.type(cell2.toString());
	
				Thread.sleep(1000);
	
				WebElement dataFim = chromeDriver.findElement(By.id("dataFim"));
				dataFim.findElement(By.tagName("input")).click();
				roboNico.type(cell3.toString());
	
				Thread.sleep(1000);
				
				try {
					multiScreens1.multiScreenShot(chromeDriver);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				WebElement confirmar = chromeDriver.findElement(By.id("confirmar"));
				confirmar.click();
	
				WebElement confirmarCadastro = chromeDriver.findElement(By.id("btnConfirmar"));
				confirmarCadastro.findElement(By.tagName("button")).click();
	
				Thread.sleep(1000);
	
				WebElement numParametroModal = chromeDriver.findElement(By.id("numParametroModal"));
				String numParametro = numParametroModal.getText();
	
				try {
					multiScreens1.multiScreenShot(chromeDriver);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				logger.info("Inclusão realizada com sucesso! \r\n");
				
				WebElement confirmarInclusao = chromeDriver.findElement(By.id("btnOKSucesso"));
				confirmarInclusao.findElement(By.tagName("button")).click();
	
				Thread.sleep(1000);
	
				// fechando o navegador
				chromeDriver.quit();
				// instanciando novamente o driver do navegador para abrir com outro usuário e
				// senha para poder alterar
				chromeDriver = new ChromeDriver();
	
				// maximizando a janela
				chromeDriver.manage().window().maximize();
	
				chromeDriver.get("http://I907835:ctmc1910@localhost:8080/ctmc_agencia_web/");
	
				chromeDriver.get("http://localhost:4200/static/ctmc_agencia_web/#/consultarAtributos");
	
				// consultar parâmetro
				chromeDriver.findElement(By.xpath("//a[contains(.,'* Consultar')]")).click();
				chromeDriver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
				chromeDriver.findElement(By.cssSelector("amb-combobox-item:nth-child(2) > li")).click();
				
				try {
					multiScreens1.multiScreenShot(chromeDriver);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				chromeDriver.findElement(By.id("pesquisar")).click();
	
	//			WebElement dataInicioConsulta = chromeDriver.findElement(By.id("dataInicio"));
	//			dataInicioConsulta.findElement(By.tagName("input")).click();
	//			roboGabriel.type("01012");
	//
	//			WebElement dataFimConsulta = chromeDriver.findElement(By.id("dataFim"));
	//			dataFimConsulta.findElement(By.tagName("input")).click();
	//			roboGabriel.type("01012025");
	//			
				try {
					multiScreens1.multiScreenShot(chromeDriver);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				WebElement pesquisar = chromeDriver.findElement(By.id("pesquisar"));
				pesquisar.click();
	
				chromeDriver.findElement(By.xpath("//amb-cell[contains(.,'" + numParametro + "')]")).click();
				
				try {
					multiScreens1.multiScreenShot(chromeDriver);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				chromeDriver.findElement(By.id("detalhar")).click();
	
				try {
					multiScreens1.multiScreenShot(chromeDriver);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				chromeDriver.findElement(By.cssSelector("amb-modal-window-custom .modal-header .close")).click();
	
				// alterar parâmetro
				WebElement alterar = chromeDriver.findElement(By.id("alterar"));
				alterar.click();
	
				WebElement descricaoAlteracao = chromeDriver.findElement(By.id("descricao"));
				descricaoAlteracao.clear();
				descricaoAlteracao.sendKeys("ROBO ALTERADO EXCLUIR");
	
				Thread.sleep(1000);
	
				// selecionando tudo e apagando para substituir o valor exibido
				WebElement dataInicioAlterar = chromeDriver.findElement(By.id("dataInicio"));
				dataInicioAlterar.findElement(By.tagName("input")).click();
				roboNico.keyPress(KeyEvent.VK_CONTROL);
				roboNico.keyPress(KeyEvent.VK_A);
				roboNico.keyPress(KeyEvent.VK_SPACE);
				roboNico.type("16102024");
	
				// selecionando tudo e apagando para substituir o valor exibido
				WebElement dataFimAlterar = chromeDriver.findElement(By.id("dataFim"));
				dataFimAlterar.findElement(By.tagName("input")).click();
				roboNico.keyPress(KeyEvent.VK_CONTROL);
				roboNico.keyPress(KeyEvent.VK_A);
				roboNico.keyPress(KeyEvent.VK_SPACE);
				roboNico.type("16102024");
	
				try {
					multiScreens1.multiScreenShot(chromeDriver);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				Thread.sleep(1000);
	
				WebElement confirmarAlterar = chromeDriver.findElement(By.id("confirmarAlterar"));
				confirmarAlterar.click();
	
				Thread.sleep(1000);
	
				try {
					multiScreens1.multiScreenShot(chromeDriver);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				WebElement btnConfirmarParametro = chromeDriver.findElement(By.id("btnConfirmaParametro"));
				btnConfirmarParametro.click();
	
				logger.info("Alteração realizada com sucesso! \r\n");
	
				Thread.sleep(3000);
	
				try {
					multiScreens1.multiScreenShot(chromeDriver);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				Thread.sleep(5000);
	
				WebElement btnExcluir = chromeDriver.findElement(By.id("cancelar"));
				btnExcluir.click();
	
				Thread.sleep(1000);
	
				try {
					multiScreens1.multiScreenShot(chromeDriver);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				WebElement btConfirmarExclusao = chromeDriver.findElement(By.id("btnConfirmarCancelamento"));
				btConfirmarExclusao.click();
	
				logger.info("Cancelamento realizado com sucesso!\r\n");
	
				Thread.sleep(2000);
	
				try {
					multiScreens1.multiScreenShot(chromeDriver);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				Thread.sleep(1000);
				
				chromeDriver.findElement(By.xpath("//amb-cell[contains(.,'" + numParametro + "')]")).click();
				
				Thread.sleep(1000);
				
				chromeDriver.findElement(By.id("detalhar")).click();
				
				Thread.sleep(2000);
				
				chromeDriver.get("http://localhost:4200/static/ctmc_agencia_web/#/home");
				
				logger.info("Teste com o parâmetro " + cell1.toString() + " realizado com sucesso!\r\n");
			
			}
			

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
