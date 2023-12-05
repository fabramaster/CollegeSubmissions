package lab7;

class Sphere {

	private double raduis;
	//constructor 
	public Sphere(double raduis) {
		this.raduis = raduis;
		
		
	}
	public double volumeSphere()
    {
		
       // given that volume of a sphere = 4/3(PI)(r3);
		double volume = (4.0 / 3.0 * Math.PI) * Math.pow(raduis, 3) ;
		return volume;
    }
	public double surfaceSphere()
    {
		
		//given that surface area of a sphere = 4(PI)(r2);
		double sArea = 4 * Math.PI * Math.pow(raduis, 2) ;
		return sArea;
    }
}
