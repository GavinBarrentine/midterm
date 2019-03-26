package pkgTestShape;

import static org.junit.Assert.assertEquals;

import pkgShape.Rectangle;

public class RectangleTest {
	@Test
	void testConstruction() {
		try {
			Rectangle r = new Rectangle(2,5);
		}
		catch(Exception e) {
			fail("did not construct a rectangle");
		}
	}
	@Test
	void testGetWidth() {
		Rectangle r = new Rectangle(2,5);
		assertTrue(r.getWidth() == 5);
	}
	@Test
	void testGetLength() {
		Rectangle r = new Rectangle(2,5);
		assertTrue(r.getLength() == 2);
	}
	@Test 
	void testSetWidth() {
		Rectangle r = new Rectangle(2,5);
		r.setWidth(2);
		assertTrue(r.getWidth() == 2);
	}
	@Test
	void testSetLength() {
		Rectangle r = new Rectangle(2,5);
		r.setLength(5);
		assertTrue(r.getLength() == 5);
	}
	@Test
	void testArea() {
		Rectangle r = new Rectangle(2,5);
		assertTrue(r.getArea() == 10);
	@Test
	void testPerimeter() {
		Rectangle r = new Rectangle(2,5);
		assertTrue(r.getPerimeter() == 14);
	}
	@Test
	void testCompareTo() {
		Rectangle R = new Rectangle(10, 15);
		Rectangle R = new Rectangle(3, 7);
		assertTrue(s.compareTo(r) == -1);
		assertTrue(r.compareTo(s) == 1);
		assertTrue(s.compareTo(s) == 0);
	}
}
