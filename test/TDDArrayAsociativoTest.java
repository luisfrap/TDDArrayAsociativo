import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class TDDArrayAsociativoTest {
	private TDDArrayAsociativo tdd;
	
	@Before
	public void setUp(){
		tdd = new TDDArrayAsociativo();
	}
	
	@Test
	public void parClaveValor(){
		tdd.put("Nombre", "Luis");
		assertEquals("Luis"	, tdd.get("Nombre"));
		
	}

}
