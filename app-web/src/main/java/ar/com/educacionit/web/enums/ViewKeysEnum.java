package ar.com.educacionit.web.enums;

public enum ViewKeysEnum implements Enumerable {

	USERNAME("username"),
	PASSWORD("password"),
	ERROR_GENERAL("error"),
	USUARIO_PASSWORD_INVALIDO("usuario/password incorrectos"),
	USER("user"),
	UPLOAD_FILE("uploadFile"), 
	UPLOAD_PREVIEW_KEY("upload_preview_key"),
	ARTICULOS_FAILS("articulos_fails"),
	ARTICULOS_OKS("articulos_oks"), 
	FORMATO("formato")
	;
	
	private String param;
	
	private ViewKeysEnum(String param) {
		this.param = param;
	}
	
	public String getParam() {
		return this.param;
	}
}
