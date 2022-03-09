package pagesObjetInicio;

import java.io.File;
import java.util.Properties;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mapsObjetInicio.MapsObjetInicio;
import utilitiesExe.ReadExcelFile;

public class PageObjetInicio extends MapsObjetInicio

{
	// CREAR CONSTRUCTOR DE LA CLASE
	public PageObjetInicio(AppiumDriver<MobileElement> driver)

	{
		super(driver);
		this.driver = driver;
	}

	// METODO PRIMERA PRUEBA - INGRESAR A LA PAG WEB DE PRUEBA
	public void IngresoClaro(ReadExcelFile leer, Properties propiedades, String nomTest, File rutaCarpeta) throws Exception

	{
		// INGRESA A LA PÁGINA WEB
		tiempoEspera(6000);
		click(btnIngreso, rutaCarpeta);
		tiempoEspera(1000);
		
		// INGRESO DATOS
		click(btnIngCorreo, rutaCarpeta);
		tiempoEspera(1000);
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosIngreso", 1, 0), txtCorreo, rutaCarpeta);
		sendkey(leer.getCellValue(propiedades.getProperty("filePathExcel"), "DatosIngreso", 1, 1), txtContrasena, rutaCarpeta);
		click(btnVerifyContra, rutaCarpeta);
		
		// INICIO SESIÓN 
		click(btnIniSesion, rutaCarpeta);
		tiempoEspera(1000);
		
		// CANCELAR INICIO CON HUELLA
		click(btnCancelar, rutaCarpeta);
		tiempoEspera(8000);
		
	}

}
