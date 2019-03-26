package pkgShape;

class SortByArea implements Comparator<Cuboid> {
	 public double compare(Cuboid a, Cuboid b) {
		 return a.area() - b.area(); 
	}
}
