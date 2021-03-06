abstract class Quadrilateral implements Shape {
	private double length;
	private double width;

   public Quadrilateral(double length, double width){
   	this.length = length;
   	this.width = width;
   }
   public double getArea(){
      return this.length * this.width;
   }
   public double getPerimeter(){
      return 2*this.length + 2*this.width;
   }
}
