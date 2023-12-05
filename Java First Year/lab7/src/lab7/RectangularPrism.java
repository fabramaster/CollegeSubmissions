package lab7;


	class RectangularPrism {

		private double width;
		private double length;
		private double height;
		//constructor 
		public RectangularPrism(double width, double length, double height) {
			this.width = width;
			this.length = length;
			this.height = height;
			
			
		}
		public double volumePrism()
	    {
			
	       // given that volume of a rectangular prism = l(w)(h);
			double volume = length * width * height;
			return volume;
	    }
		public double surfacePrism()
	    {
			
			//surface area of a rectangular prism = 2(l)(w) + 2(l)(h) + 2(w)(h)
			double surface = (2 * length * width) + (2 * length * height) +( 2 * width * height);
			return surface;
	    }
		
}
