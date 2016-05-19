import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class TDDArrayAsociativoTest {
	private TDDArrayAsociativo tdd;

	@Before
	public void setUp() {
		tdd = new TDDArrayAsociativo();
	}

	@Test
	public void parClaveValor() {
		tdd.put("Nombre", "Luis");
		assertEquals("Luis", tdd.get("Nombre"));

	}

	@Test(expected = TDDException.class)
	public void soloExisteValor() {
		tdd.get("Apellido");

	}

	@Test
	public void dosValoresConMismaClave() {
		tdd.put("Nombre", "Luis");
		assertEquals("Luis", tdd.get("Nombre"));
		tdd.put("Nombre", "Pedro");
		assertEquals("Pedro", tdd.get("Nombre"));
	}

	@Test
	public void dosValoresDistintosYDosClavesDistintas() {
		tdd.put("Nombre", "Frodo");
		assertEquals("Frodo", tdd.get("Nombre"));
		tdd.put("Apellido", "Bolson");
		assertEquals("Bolson", tdd.get("Apellido"));
	}

	@Test
	public void siNoExisteValorDefecto() {
		tdd.put("Nombre", "Harry");
		assertEquals("Harry", tdd.getOrElse("Nombre", "-_-"));
	}
	
	@Test
	public void hayClave(){
		tdd.put("Nombre", "Gandalf");
		assertEquals(true, tdd.containsKey("Nombre"));
	}
	
	public void noHayClave(){
		tdd.put("Apellido", "El Gris");
		assertEquals(false, tdd.containsKey("Nombre"));
	}
	@Test
	public void borrarClaveTrue(){
		tdd.put("Apellido", "King");
		assertEquals(true, tdd.remove("Apellido"));
	}
	
	public void borrarClaveFalse(){
		tdd.put("Apellido", "Parker");
		assertEquals(false, tdd.remove("Nombre"));
	}
	
	@Test
	public void unElemento(){
		tdd.put("Apellido", "Tolkien");
		assertEquals(1, tdd.size());
	}
	
	@Test
	public void tresElementos(){
		tdd.put("Nombre", "Frodo");
		tdd.put("Apellido", "Bolson");
		tdd.put("Pais", "Hobbiton");
		assertEquals(3, tdd.size());
		
	}

}
