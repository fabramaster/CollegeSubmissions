package lab7;

public class LinearEquations {
		private double a;
		private double b;
		private double c;
		private double d;
		private double e;
		private double f;
		//constructor 
		public LinearEquations(double a, double b, double c, double d, double e, double f) {
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
			this.e = e;
			this.f = f;
			
			
		}
		
				
		public double getX()
	    {
			
	      //calculating X
			double x =  ((e * d)-(b*f)) / ((a * d)-(b * c));
			return x;
	    }
		public double getY()
	    {
			
	       // given calculating Y
			double y = ((a*f)-(e*c)) / ((a * d) - (b * c));
			return y;
	    }
		public boolean isSolvable()
	    {
			
	       if (a * d - b * c != 0) {
	    	   return true;
	       }else {
			return false;
	    }
	    

}
}
