import org.junit.*;
public class HesaplamaTest {
	@org.junit.Test
	public void testCarp() {
		int sonuc=Hesaplama.carp(2, 4);
		org.junit.Assert.assertEquals(8, sonuc);
		
	}
	

}
