public class Circle implements Shape {
	private double radius;
   
   public Circle(double radius){
      this.radius = radius;
   }
   public double getArea() {
      return Math.PI * (this.radius*this.radius);
   }
   public double getPerimeter() {
      return Math.PI * 2 * this.radius;
   }
   public String toString(){
      return "Circle" + "    perimeter: " + getPerimeter() + "    area: " + getArea();
   }
   public boolean equals(Object other){
      if(other instanceof Circle){
         Circle otherCircle = (Circle) other;
         return this.getArea() == otherCircle.getArea();
      }
      else {
         return false;
      }
   }
}
