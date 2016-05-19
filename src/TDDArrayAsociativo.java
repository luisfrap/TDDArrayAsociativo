import java.util.Hashtable;
import java.util.Scanner;

public class TDDArrayAsociativo {

	private Hashtable<String, String> tabla = new Hashtable<String, String>();

	public void put(String clave, String valor) {
		if (tabla.contains(clave)) {
			tabla.replace(clave, valor);
		} else {
			tabla.put(clave, valor);
		}

	}

	public String get(String clave) {
		String get = "";
		if (tabla.containsKey(clave)) {
			get = tabla.get(clave);
		} else {
			throw new TDDException(tabla.toString());
		}
		return get;

	}

	public String getOrElse(String clave, String valorDefecto) {
		// TODO Auto-generated method stub
		String get="";
		if(tabla.containsKey(clave)){
			get = tabla.get(clave);
		}else{
			get = tabla.get(valorDefecto);
		}
		return get;
		
	}
}
