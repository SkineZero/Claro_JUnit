package mapsObjetInicio;

import org.openqa.selenium.By;
import docsBase.ClaseBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjetFactura extends ClaseBase {

	// CONSTRUCTOR DE LA CLASE
	public MapsObjetFactura(AppiumDriver<MobileElement> driver)

	{
		super(driver);
		this.driver = driver;
	}
		
	// PAGAR FACTURA
	
	// INGRESAR DESDE MENÚ A PAGOS
	protected By btnPagos = By.xpath("//android.widget.FrameLayout[@resource-id = 'com.clarocolombia.miclaro.debug:id/navigationPaysPosMenu']");
	
	// PAGA TU FACTURA AQUÍ
	protected By btnPagaAqui = By.xpath("//android.widget.Button[@text='Paga tu factura aquí']");
	
	// DESEO PAGAR TODA LA FACTURA
	protected By btnTotal = By.xpath("//android.widget.RadioButton[@resource-id = 'com.clarocolombia.miclaro.debug:id/rbtn1']");
	
	// DESEO UN PAGO PARCIAL
	protected By btnPagar = By.xpath("//android.widget.Button[@resource-id = 'com.clarocolombia.miclaro.debug:id/btnAceptar']");
	
	// SELECCIONE MEDIO DE PAGO
	protected By btnMPago = By.xpath("//android.view.View[@resource-id = 'select']");
	
	// TARJETA DE CRÉDITO - DEBITO
	protected By btnTC= By.xpath("//android.widget.TextView[@text = 'Tarjeta de Crédito - Débito']");
	
	// CONTINUAR CON TARJETA DE CRÉDITO
	protected By btnContinuar = By.xpath("//android.widget.Button[@text = 'Continuar']");
	
	// CASILLA NUMERO DE TARJETA
	protected By intNumTC = By.xpath("//android.widget.EditText[@resource-id = 'NUMERO_TARJETA']");
	
	// INGRESAR MES
	protected By selMonth = By.xpath("//android.view.View[@resource-id = 'FECHA_VENC_MES']");
	protected String mes = ("//android.widget.CheckedTextView[@text='");
	
	// INGRESAR AÑO
	protected By selYear = By.xpath("//android.view.View[@resource-id = 'FECHA_VENC_ANNO']");
	protected String ano = ("//android.widget.CheckedTextView[@text='");
	// INGRESAR CVV
	protected By intCVV = By.xpath("//android.widget.EditText [@resource-id = 'CODIGO_SEGURIDAD']");
	
	// INGRESAR NUMERO DE CUOTAS
	protected By selCuotas = By.xpath("//android.view.View [@resource-id = 'CUOTAS']");
	protected String cuotas = ("//android.widget.CheckedTextView[@text='");
	
	// INGRESAR NOMBRE DE LA TARJETA DE CRÉDITO
	protected By txtNombreTC = By.xpath("//android.widget.EditText[@resource-id = 'NOMBRE_TARJETA']");
	
	// INGRESAR SELECCIÓN TIPO DE INDENTIFICACIÓN
	protected By selTipoID = By.xpath("//android.view.View[@resource-id = 'TIPO_DOCUMENTO']");
	protected String tipoID = ("//android.widget.CheckedTextView[@text='");
	
	// INGRESAR NUMERO DE IDENTIFICACIÓN
	protected By intNumID = By.xpath("//android.widget.EditText[@resource-id = 'NUMERO_DOCUMENTO']");
	
	// INGRESAR TELEFONO
	protected By intNumTel = By.xpath("//android.widget.EditText[@resource-id = 'TELEFONO']");
	
	// INGRESAR CORREO ELECTRONICO
	protected By txtEmail = By.xpath("//android.widget.EditText[@resource-id = 'EMAIL']");
	
	// BOTON ACEPTAR
	protected By btnCnfPago = By.xpath("//android.widget.Button [@resource-id = 'mySubmit_']");
	
	// BOTON CANCELAR
	protected By btnCancePago = By.xpath("//android.widget.Button [@resource-id = 'btnCancelar']");
	
	// BOTON DEVOLVERSE
	protected By btnAtrás = By.xpath("//android.widget.ImageButton[@content-desc = 'Desplazarse hacia arriba']");
	
}
