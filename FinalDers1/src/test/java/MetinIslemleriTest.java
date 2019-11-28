import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public void testBuyukHarf() {
		String sonuc=MetinIslemleri.buyukHarf("ali");
		org.junit.Assert.assertEquals("ALİ", sonuc);
		
	}

}
