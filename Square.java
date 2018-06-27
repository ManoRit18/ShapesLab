public class Square extends Quadrilateral {
   public Square(double side) {
      super(side, side);
   }
   public String toString(){
      return "Square" + "    perimeter: " + super.getPerimeter() + "    area: " + super.getArea();
   }
   public boolean equals(Object other){
      if(other instanceof Square){
         Square otherSquare = (Square) other;
         return this.getArea() == otherSquare.getArea();
      }
      else {
         return false;
      }
   }
}
