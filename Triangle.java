public abstract class Triangle implements Shape {
	private double sideOne;
	private double sideTwo;
	private double sideThree;
   
	public Triangle(double sideOne, double sideTwo, double sideThree) {
      if(((sideOne + sideTwo > sideThree) && (sideOne + sideThree > sideTwo)) && (sideTwo + sideThree > sideOne)){
   		this.sideOne = sideOne; 
   		this.sideTwo = sideTwo;
   		this.sideThree = sideThree;
      }
      else {
         throw new IllegalArgumentException();
      }
   }
   public double getSideOne(){
      return sideOne;
   }
   public double getSideTwo(){
      return sideTwo;
   }
	public double getArea() {
		double s = (this.sideOne + this.sideTwo + this.sideThree) / 2;
		double insideRoot = (this.sideOne) * ((s - this.sideOne)*(s - this.sideTwo)*(s - this.sideThree));
		double area  = Math.sqrt(insideRoot);
		return area;
	}
	public double getPerimeter() {
		return this.sideOne + this.sideTwo + this.sideThree;
   }
}

