import static org.junit.Assert.*;

import org.junit.Test;


public class squareTest {

	Square sq=new Square(4);
	@Test
	public void constructorTest(){
		assertTrue(sq!=null);
	}
	@Test
	public void areaTest() {
		assertEquals(16, sq.area());
	}
	
	@Test
	public void badWeather(){
		Square s=new Square(-1);
		assertNull(s);
	}

}
