package pagesObjetInicio;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mapsObjetInicio.MapsObjetFactura;
import utilitiesExe.ReadExcelFile;

public class PageObjetFactura extends MapsObjetFactura

{
	// CREAR CONSTRUCTOR DE LA CLASE
	public PageObjetFactura(AppiumDriver<MobileElement> driver)

	{
		super(driver);
		this.driver = driver;
	}

	// METODO SEGUNDA PRUEBA - PAGAR FACTURA
	public void PagoFactura(ReadExcelFile leer, Properties propiedades, String nomTest, File rutaCarpeta) throws Exception

	{
		
		// CLICK EN PAGOS
		click(btnPagos, rutaCarpeta);
		tiempoEspera(2000);
		
		// CLICK EN PAGAR FACTURA AQUÍ;
		click(btnPagaAqui, rutaCarpeta);
		
		//VENTANA DE CONFIMACIÓN DE MONTO
		click(btnTotal, rutaCarpeta);
		
		click(btnPagar, rutaCarpeta);
		tiempoEspera(3000);
		click(btnMPago, rutaCarpeta); 
		tocarPantalla(504, 1371);
		//click(btnTC, rutaCarpeta);
		
		//ACÁ O EN EL ANTERIOR DEBE SELECCIONAR EL MEDIO DE PAGO, TARJETA DE CREDITO
		click(btnContinuar, rutaCarpeta);
		tiempoEspera(8000);
		scrollVertical(rutaCarpeta, 504, 1692, 638, 2);
		
		//INGRESO DATOS DE TARJETA DE CRÉDITO
		//NUMERO DE TARJETA
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosPago", 1, 1), intNumTC, rutaCarpeta);
		
		// INGRESAR MES DE TARJETA
		click(selMonth, rutaCarpeta);
		String btnMes = leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosPago", 1, 2);
		String txtMes = mes + btnMes + "']";
		driver.findElement(By.xpath(txtMes)).click();
		
		// INGRESAR AÑO DE TARJETA
		click(selYear, rutaCarpeta);
		String btnAno = leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosPago", 1, 3);
		String txtAno = ano + btnAno + "']";
		driver.findElement(By.xpath(txtAno)).click();
		scrollVertical(rutaCarpeta, 504, 1292, 738, 1);
		
		// INGRESAR CVV
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosPago", 1, 4), intCVV, rutaCarpeta);
		
		// INGRESAR CUOTAS
		click(selCuotas,rutaCarpeta);
		String btnCuotas = leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosPago", 1, 5);
		String txtCuotas = cuotas + btnCuotas + "']";
		driver.findElement(By.xpath(txtCuotas)).click();
		
		// INGRESAR NOMBRE DE LA TARJETA
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosPago", 1, 6), txtNombreTC, rutaCarpeta);
		scrollVertical(rutaCarpeta, 504, 1292, 738, 1);
		
		// SELECCIONAR TIPO DE DOCUMENTO
		click(selTipoID, rutaCarpeta);
		String btnID = leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosPago", 1, 7);
		String txtID = tipoID + btnID + "']";
		driver.findElement(By.xpath(txtID)).click();
		
		// INGRESAR NUMERO DE DOCUMENTO
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosPago", 1, 8), intNumID, rutaCarpeta);
		
		// INGRESAR NUMERO DE TELEFONO
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosPago", 1, 9), intNumTel, rutaCarpeta);
		scrollVertical(rutaCarpeta, 504, 1592, 738, 1);
		
		// INGRESAR CORREO
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosPago", 1, 10), txtEmail, rutaCarpeta);
		driver.hideKeyboard();
		
		// PAGAR O CANCELAR
		click(btnCancePago, rutaCarpeta);
		tiempoEspera(2000);
		
		// DEVOLVERSE
		click(btnAtrás, rutaCarpeta);
		tiempoEspera(1000);
		
	}

}