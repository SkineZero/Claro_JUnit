package mapsObjetInicio;

import org.openqa.selenium.By;

import docsBase.ClaseBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjetCamDir extends ClaseBase {

	// CONSTRUCTOR DE LA CLASE
	public MapsObjetCamDir(AppiumDriver<MobileElement> driver)

	{
		super(driver);
		this.driver = driver;
	}
	
	// INGRESO A CAMBIAR DIRECCIÓN
	protected By btnImgUsuario = By.xpath("//android.widget.ImageView[@resource-id='com.clarocolombia.miclaro.debug:id/imgPerfil']");
	protected By btnConfiCuenta = By.xpath("//android.widget.TextView[@resource-id = 'com.clarocolombia.miclaro.debug:id/tvConfiguracion']");
	protected By btnActuDatos = By.xpath("//android.widget.Button[@text = 'Actualizar datos']");
	protected By btnSelCuenta = By.xpath("//android.widget.Button[@resource-id = 'com.clarocolombia.miclaro.debug:id/btnimgActualizarDatos']");
	protected By btnEditarDir = By.xpath("//android.widget.ImageView [@resource-id = 'com.clarocolombia.miclaro.debug:id/imgEditarDir']");
	
	// SELECCIONAR DEPARTAMENTO
	protected By btnDpto = By.xpath("//android.widget.Spinner[@resource-id = 'com.clarocolombia.miclaro.debug:id/spDepartamento']");
	protected String departamento = ("//android.widget.CheckedTextView[@text='");
	
	// SELECCIONAR CIUDAD
	protected By btnCiudadBog = By.xpath("//android.widget.Spinner[@resource-id = 'com.clarocolombia.miclaro.debug:id/spCiudad']");
	protected String ciudad = ("//android.widget.CheckedTextView[@text='");
	
	// INGRESAR BARRIO
	protected By txtBarrio = By.xpath("//android.widget.EditText[@resource-id = 'com.clarocolombia.miclaro.debug:id/edtBarrio']"); 
	
	// TIPO DE CALLE - CARRERA
	protected By selTipo = By.xpath("//android.widget.Spinner[@resource-id = 'com.clarocolombia.miclaro.debug:id/spTipo']");
	protected String tipo = ("//android.widget.CheckedTextView[@text='");
	
	// INGRESAR NUMERO PRINCIPAL
	protected By intPrincipal = By.xpath("//android.widget.EditText[@resource-id = 'com.clarocolombia.miclaro.debug:id/txtNPricipal']");
	
	// INGRESAR SUFIJO 1
	protected By selSufijo = By.xpath("//android.widget.Spinner[@resource-id = 'com.clarocolombia.miclaro.debug:id/spSufijo1']");
	protected String sufijo1 = ("//android.widget.CheckedTextView[@text='");
	
	// INGRESAR NUMERO SECUNDARIO
	protected By intSecundario = By.xpath("//android.widget.EditText[@resource-id = 'com.clarocolombia.miclaro.debug:id/txtNSecuendario']");
	
	// INGRESAR SUFIJO 2
	protected By btnSufijo2 = By.xpath("//android.widget.Spinner[@resource-id = 'com.clarocolombia.miclaro.debug:id/spSufijo2']");
	protected String sufijo2 = ("//android.widget.CheckedTextView[@text='");
	
	// INGRESAR NUMERO COMPLEMENTARIO
	protected By intComplementaio = By.xpath("//android.widget.EditText[@resource-id='com.clarocolombia.miclaro.debug:id/txtNComponente']");
	
	// INGRESAR COMPLEMENTO
	protected By selComplemento = By.xpath("//android.widget.Spinner[@resource-id = 'com.clarocolombia.miclaro.debug:id/spComplemento1']");
	protected String complemento = ("//android.widget.CheckedTextView[@text='");
	
	// INGRESAR NUMERO DE COMPLEMENTO
	protected By intNum= By.xpath("//android.widget.EditText[@resource-id = 'com.clarocolombia.miclaro.debug:id/txtNumero1']");
	
	// ACCIONES VARIAS
	protected By btnValidar= By.xpath("//android.widget.Button[@resource-id = 'com.clarocolombia.miclaro.debug:id/btnAgregar']");
	protected By btnGuardar= By.xpath("//android.widget.Button[@text = 'Guardar']");
	protected By btnCancelar= By.xpath("//android.widget.Button[@text = 'Cancelar']");

}
