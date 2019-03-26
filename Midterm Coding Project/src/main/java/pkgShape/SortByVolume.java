package pkgShape;

class SortByVolume implements Comparator<Cuboid> {
	 public double compare(Cuboid a, Cuboid b) {
		 return a.volume() - b.volume(); 
	}
	
}
