package mapsObjetInicio;

import org.openqa.selenium.By;

import docsBase.ClaseBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjetInicio extends ClaseBase {

	// CONSTRUCTOR DE LA CLASE
	public MapsObjetInicio(AppiumDriver<MobileElement> driver)

	{
		super(driver);
		this.driver = driver;
	}
	
	// INGRESO APP
	protected By btnIngreso = By.xpath("//android.widget.Button[@resource-id = 'com.clarocolombia.miclaro.debug:id/btnLoginEmail']");
	protected By btnIngCorreo = By.xpath("//android.widget.LinearLayout[@resource-id = 'com.clarocolombia.miclaro.debug:id/lyEmail']");
	
	// INGRESO DATOS
	protected By txtCorreo= By.xpath("//android.widget.EditText[@resource-id = 'com.clarocolombia.miclaro.debug:id/edUsuario']");
	protected By txtContrasena = By.xpath("//android.widget.EditText [@resource-id = 'com.clarocolombia.miclaro.debug:id/edPassword']");
	
	// VERIFICAR E INGRESAR
	protected By btnVerifyContra = By.xpath("//android.widget.ImageButton [@resource-id = 'com.clarocolombia.miclaro.debug:id/text_input_end_icon']");
	protected By btnIniSesion = By.xpath("//android.widget.Button[@resource-id = 'com.clarocolombia.miclaro.debug:id/btnLoginUsPass']");
	
	// SELECCIONAR EQUIPO A SACAR
	protected By btnSelecEquipo = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]");
	protected By btnAceptarSelEquip = By.xpath("//android.widget.Button[@text = 'Continuar']");
	protected By btnConfirmar= By.xpath("//android.widget.Button[@resource-id = 'com.clarocolombia.miclaro.debug:id/btn41']");
	protected By btnCancelar = By.xpath("//android.widget.Button[@text = 'Cancelar']");
	
	// VENTANA GUARDAR CONTRASEÑA
	protected By btnAhoraNo = By.xpath("//android.widget.Button [@text = 'AHORA NO']");
	
}



