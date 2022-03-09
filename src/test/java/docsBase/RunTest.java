package docsBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pagesObjetInicio.PageObjetCamDir;
import pagesObjetInicio.PageObjetClose;
import pagesObjetInicio.PageObjetFactura;
import pagesObjetInicio.PageObjetInicio;
import utilitiesExe.ReadExcelFile;
import utilitiesExe.WriteExcelFile;

public class RunTest {

	private AppiumDriver<MobileElement> driver;
	PageObjetInicio ingreso;
	PageObjetCamDir direccion;
	Properties propiedades;
	PageObjetFactura pagar;
	PageObjetClose cerrar;
	ReadExcelFile leer;
	WriteExcelFile escribir;
	String url = null;

	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws IOException {
		
		// ASIGNAMOS LAS OPCIONES Y LA CONFIGURACION DEL NAVEGADOR A LA VARIABLE DRIVER
		driver = ClaseBase.appiumDriverConection();
		// INSTANCIAR LA CLASE DE PROPIEDADES DE JAVA UTIL
		propiedades = new Properties();
		leer = new ReadExcelFile();
		escribir = new WriteExcelFile();
		// CREAR VARIABLES TIPO INPUTSTRING
		InputStream entrada = null; 
		// VALIDAR SI GENERA ERROR AL NO ENCONTRAR EL ARCHIVO
		try {
			entrada = new FileInputStream("./Properties/datos.properties");
			propiedades.load(entrada);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
		} finally {

		}

	}

	@Test // PRUEBA 1 INGRESAR A CAMBIAR DIRECCIÓN
	public void Dirección_Claro() throws Exception {
		if (leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosResidencia", 1, 0).equals("SI")) {
		// INSTANCIAR CLASE BASE
		ClaseBase clasebase = new ClaseBase(driver);
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		// CREAR CARPETA
		File rutaCarpeta = clasebase.crearCarpeta(propiedades, nomTest);
		// INSTANCIAR LAS CLASES QUE SE COLOCAN EN PAGEOBJECT
		ingreso = new PageObjetInicio(driver);
		direccion = new PageObjetCamDir(driver);
		cerrar = new PageObjetClose(driver);
		// ACCEDER AL METODO DE PRUEBA INICIO
		ingreso.IngresoClaro(leer, propiedades, nomTest, rutaCarpeta);
		direccion.CamDireccion(leer, propiedades, nomTest, rutaCarpeta);
		cerrar.CerrarClaro(leer, propiedades, nomTest, rutaCarpeta);
		}
}

	@Test // PRUEBA 2 PAGAR FACTURA DE CLARO
	public void Pago_Factura() throws Exception {
		if (leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosPago", 1, 0).equals("SI")) {
		// INSTANCIAR CLASE BASE
		ClaseBase clasebase = new ClaseBase(driver);
		// OBTENER EL NOMBRE DEL METODO A EJECUTAR
		String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
		// CREAR CARPETA
		File rutaCarpeta = clasebase.crearCarpeta(propiedades, nomTest);
		// INSTANCIAR LAS CLASES QUE SE COLOCAN EN PAGEOBJECT
		ingreso = new PageObjetInicio(driver);
		pagar = new PageObjetFactura(driver);
		cerrar = new PageObjetClose(driver);
		// ACCEDER AL METODO DE PRUEBA INICIO
		ingreso.IngresoClaro(leer, propiedades, nomTest, rutaCarpeta);
		pagar.PagoFactura(leer, propiedades, nomTest, rutaCarpeta);
		cerrar.CerrarClaroFactura(leer, propiedades, nomTest, rutaCarpeta);
		}
}

	@After
	public void cerrar() {
		// CERRAR PROCESO
		driver.quit();

	}

}
