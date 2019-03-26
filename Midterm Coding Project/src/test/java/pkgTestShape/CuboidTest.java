package pkgTestShape;

import pkgShape.Rectangle;

public class CuboidTest {
	@Test
	void testConstruction() {
		try {
			Cuboid c = new Cuboid(2,5,10);
		}
		catch(Exception e) {
			fail("did not construct a Cuboid");
		}
	}
	@Test
	void testGetWidth() {
		Cuboid c = new Cuboid(2,5,10);
		assertTrue(c.getWidth() == 5);
	}
	@Test
	void testGetLength() {
		Cuboid c = new Cuboid(2,5,10);
		assertTrue(c.getLength() == 2);
	}
	@Test
	void testGetDepth() {
		Cuboid c = new Cuboid(2,5,10);
		assertTrue(c.getLength() == 10);
	}
	@Test 
	void testSetWidth() {
		Cuboid c = new Cuboid(2,5,10);
		c.setWidth(2);
		assertTrue(c.getWidth() == 2);
	}
	@Test
	void testSetLength() {
		Cuboid c = new Cuboid(2,5,10);
		c.setLength(5);
		assertTrue(c.getLength() == 5);
	}
	@Test
	void testSetDepth() {
		Cuboid c = new Cuboid(2,5,10);
		c.setDepth(9);
		assertTrue(c.getDepth() == 9);
	}
	@Test
	void testArea() {
		Cuboid c = new Cuboid(2,5,10);
		assertTrue(c.area() == 60);
	}
	@Test testVolume(){
		Cuboid c = new Cuboid(2,5,10);
		assertTrue(c.volume()==100);
	}
	@Test
	void testPerimeter() {
		boolean thrown = false;
		Cuboid c = new Cuboid(2,5,10);
		try {
			c.perimeter();
		} catch [UnsupportedOperationException e] {
			thrown = true;
		}
		assertTrue(thrown);
	}
	@Test
	void testSortByArea() {
		Cuboid a = new Cuboid(2,5,10);
		Cuboid b = new Cuboid(4,8,12);
		Cuboid c = new Cuboid(6,11,15);
		Cuboid.SortByArea s = c.new SortByArea();
		assertTrue(s.compareTo(a, b) == -1);
		assertTrue(s.compareTo(c, b) == -1);
		assertTrue(s.compareTo(c, c) == 0);
	}
	@Test
	void testSortByVolume() {
		Cuboid a = new Cuboid(2,5,10);
		Cuboid b = new Cuboid(4,8,12);
		Cuboid c = new Cuboid(6,11,15);
		Cuboid.SortByVolume s = c.new SortByVolume();
		assertTrue(s.compareTo(a, b) == -1);
		assertTrue(s.compareTo(c, b) == -1);
		assertTrue(s.compareTo(c, c) == 0);
	}
}
