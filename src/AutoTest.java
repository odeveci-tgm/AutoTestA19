import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.After;
import org.junit.Test;
/**
 * Die JUnit Test-Klasse zur Klasse Auto
 * @author osman deveci
 * @version 20-03-2017
 */
public class AutoTest {
	
Auto a = new Auto("Lambo",Color.BLACK,120);
// Color.BLACK wird zu rot in toString
	@Test
	public void setLeistungTest() {
		//fail("Abc");
		//a.setLeistung(-1);
		a.setLeistung(200); //setleistung wird ignoriert
		a.setType("BMW");
		a.setFarbe(Color.WHITE);
}
	
	@Test
	public void test2() {
		//a.setType("");
		//a.setType("   "); // Leerzeichen Strings werden ignoriert und keine Exception vorhanden, eventuell Methode verfeinern
	}

	
	


	@After
	public void afterTest() {
		System.out.print(a+" ");
		
	}
	
}