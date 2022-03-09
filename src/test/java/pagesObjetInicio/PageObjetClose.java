package pagesObjetInicio;

import java.io.File;
import java.util.Properties;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mapsObjetInicio.MapsObjetClose;
import utilitiesExe.ReadExcelFile;

public class PageObjetClose extends MapsObjetClose

{
	// CREAR CONSTRUCTOR DE LA CLASE
	public PageObjetClose(AppiumDriver<MobileElement> driver)

	{
		super(driver);
		this.driver = driver;
	}

	// METODO PRIMERA PRUEBA - INGRESAR A LA PAG WEB DE PRUEBA
	public void CerrarClaro(ReadExcelFile leer, Properties propiedades, String nomTest, File rutaCarpeta) throws Exception

	{
		// IR A INICIO
		click(btnInicio, rutaCarpeta);
		click(btnImgUsuario, rutaCarpeta);
		
		// SALIR
		click(btnCerrarSesion, rutaCarpeta);
		click(btnConfirmar, rutaCarpeta);
		tiempoEspera(1000);		
	}
	
	// METODO PRIMERA PRUEBA - INGRESAR A LA PAG WEB DE PRUEBA
	public void CerrarClaroFactura(ReadExcelFile leer, Properties propiedades, String nomTest, File rutaCarpeta) throws Exception

	{
		click(btnImgUsuario, rutaCarpeta);
		
		// SALIR
		click(btnCerrarSesion, rutaCarpeta);
		click(btnConfirmar, rutaCarpeta);
		tiempoEspera(1000);		
	}

}
