package pagesObjetInicio;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mapsObjetInicio.MapsObjetCamDir;
import utilitiesExe.ReadExcelFile;

public class PageObjetCamDir extends MapsObjetCamDir

{
	// CREAR CONSTRUCTOR DE LA CLASE
	public PageObjetCamDir(AppiumDriver<MobileElement> driver)

	{
		super(driver);
		this.driver = driver;
	}

	// METODO PRIMERA PRUEBA - INGRESAR A LA PAG WEB DE PRUEBA
	public void CamDireccion(ReadExcelFile leer, Properties propiedades, String nomTest, File rutaCarpeta) throws Exception

	{		
		// ACTUALIZACIÓN DE DATOS
		click(btnImgUsuario,rutaCarpeta);
		click(btnConfiCuenta, rutaCarpeta);
		click(btnActuDatos, rutaCarpeta);
		click(btnSelCuenta, rutaCarpeta);
		tiempoEspera(1000);
		
		// MODIFICAR DATOS
		scrollVertical(rutaCarpeta, 504, 1192, 938, 2);
		click(btnEditarDir, rutaCarpeta);
		tiempoEspera(2000);  
	
		// SELECCIONAR DEPARTAMENTO
		click(btnDpto, rutaCarpeta);
		String btnDepartamento = leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosResidencia", 3, 1);
		String txtDepartamento = departamento + btnDepartamento + "']";
		driver.findElement(By.xpath(txtDepartamento)).click();
		
		tiempoEspera(3000);
		
		// SELECCIONAR CIUDAD
		click(btnCiudadBog, rutaCarpeta);
		String btnCiudad = leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosResidencia", 3, 2);
		String txtCity = ciudad + btnCiudad + "']";
		driver.findElement(By.xpath(txtCity)).click();

		// INGRESAR BARRIO
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosResidencia", 1, 1), txtBarrio, rutaCarpeta);
		
		// INGRESAR TIPO - CALLE O CARRERA
		click(selTipo, rutaCarpeta);
		scrollVertical(rutaCarpeta, 504, 1792, 438, 1);
		String btnTipo = leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosResidencia", 3, 3);
		String txtTipo = tipo + btnTipo + "']";
		driver.findElement(By.xpath(txtTipo)).click();
		scrollVertical(rutaCarpeta, 504, 1192, 938, 3);
		
		// INGRESA NUMERO PRINCIPAL
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosResidencia", 1, 2), intPrincipal, rutaCarpeta);
		
		// INGRESAR SUFIJO 1
		click(selSufijo, rutaCarpeta);
		scrollVertical(rutaCarpeta, 504, 1192, 938, 2);
		String btnSufijo = leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosResidencia", 3, 4);
		String txtSufijo = sufijo1 + btnSufijo + "']";
		driver.findElement(By.xpath(txtSufijo)).click();
		scrollVertical(rutaCarpeta, 504, 1192, 938, 2);
		
		// INGRESAR NUMERO SECUNDARIO
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosResidencia", 1, 3), intSecundario, rutaCarpeta);
		
		// INGRESAR SUFIJO 2
		click(btnSufijo2,rutaCarpeta);
		scrollVertical(rutaCarpeta, 504, 1792, 438, 8);
		String btnSufijo2 = leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosResidencia", 3, 5);
		String txtSufijo2 = sufijo2 + btnSufijo2 + "']";
		driver.findElement(By.xpath(txtSufijo2)).click();
		
		// INGRESAR NUMERO COMPLEMENTARIO
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosResidencia", 1, 4), intComplementaio, rutaCarpeta);
	
		// SELECCIONAR COMPLEMENTO
		click(selComplemento, rutaCarpeta);
		String btnComplemento = leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosResidencia", 3, 6);
		String txtComplemento = complemento + btnComplemento + "']";
		driver.findElement(By.xpath(txtComplemento)).click();

		// INGRESAR NUMERO COMPLEMENTO
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosResidencia", 1, 5), intNum, rutaCarpeta);
		
		// ACCIONES VARIAS
		scrollVertical(rutaCarpeta, 504, 1192, 938, 2);
		click(btnValidar, rutaCarpeta);
		click(btnCancelar, rutaCarpeta);
		tiempoEspera(1000);
	}

}
