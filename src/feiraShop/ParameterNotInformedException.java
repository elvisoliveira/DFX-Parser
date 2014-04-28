package feiraShop;

public class ParameterNotInformedException extends RuntimeException{


	private static final long serialVersionUID = 2661653857340835101L;
	
	ParameterNotInformedException(String parametro){
		super("O par�metro "+parametro+" n�o foi informado");
	}
	ParameterNotInformedException(String parametro, String metodo){		
		super("O par�metro "+parametro+" n�o foi informado. Utilize o m�todo "+metodo);
	}
	
}
