package lab7;

class Wind {

	private double speedKmH;
	//constructor 
	public Wind(double speedKmH) {
		this.speedKmH = speedKmH;
		
		
	}
	public double calculateKnots()
    {
		
       // given "A nautical mile is 1.852 kilometer."
		double knots = speedKmH / 1.852;
		return knots;
    }
    
    // Calculates the speed in the Beaufort Scale
    public int calculateB()
    {
      int B = 0;
	  double v = speedKmH * 3.6;
	  double pow = 2./3;
      B = (int)Math.round(Math.pow((v / 0.836 ),pow));
      if (B > 12) {
    	  return 12;
      }
     return B;
    }
    
    //Determines if a value is calm, a European windstorm, or neither.
    public String analyzeWind(double kmH)
    {
		
       //if the wind speed is less than 2 km/h, then return "Wind is calm"
		if (kmH < 2.) {
			return "Wind is calm";
		}
       //if the wind speed is greater than 120 km/h, then return "European windstorm"
		else if (kmH > 120.) {
			return "european windstorm";
		}else {// if the wind is neither calm, nor a european windstorm, then return "Wind is calm"
			
			return "Wind is calm";
		}
       
    }

}
