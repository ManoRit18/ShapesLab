public class Rectangle extends Quadrilateral {
   public Rectangle(double length, double width) {
      super(length, width);
   }
   public String toString(){
      return "Rectangle" + "    perimeter: " + super.getPerimeter() + "    area: " + super.getArea();
   } 
   public boolean equals(Object other){
      if(other instanceof Rectangle){
         Rectangle otherRect = (Rectangle) other;
         return this.getArea() == otherRect.getArea();
      }
      else {
         return false;
      }
   }
}
