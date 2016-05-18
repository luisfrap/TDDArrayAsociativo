import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class TDDArrayAsociativoTest {
	private TDDArrayAsociativo arrayAsociativo = new TDDArrayAsociativo();

	@Test
	public void crearListaVacia() {
		LinkedList lista = new LinkedList();
		assertTrue(lista.isEmpty());
	}

	@Test
	public void anadirElementoALaLista() {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add(1);
		assertFalse(lista.isEmpty());
		assertTrue(lista.contains(1));
	}

}
