import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testgetPerimeter() {
		Triangle myTri = new Triangle(2, 3, 4);
		assertTrue(myTri.getPerimeter() == 9);
	}

	@Test
	public void testgetArea() {
		Triangle myTri = new Triangle(2, 3, 4);
		assertFalse(myTri.getArea() == 1);
	}
}
