import java.util.Scanner;

public class TDDArrayAsociativo {
	private TDDArrayAsociativo arrayAsociativo = new TDDArrayAsociativo();

	public void pedirClave(String clave) {
		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.println("\nIntroduzca la clave --> ");
		String key = reader.next(); // Scans the next token of the input as an
		clave = key;
	}

	public void pedirValor(String valor) {
		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.println("\nIntroduzca el valor --> ");
		String value = reader.next(); // Scans the next token of the input as an
		valor = value;
	}

	public void put(String clave, String valor) {
		if (clave.equals("") && valor.equals("")) {
			arrayAsociativo.put("", "");
		}else {
			arrayAsociativo.put(clave, valor);
		}
	}

	public String get(String clave) {
		return ("Para la clave "+clave+" el valor es "+ arrayAsociativo.get(clave));
	}

}
