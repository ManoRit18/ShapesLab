public class EquilateralTriangle extends Triangle {
   public EquilateralTriangle(double side) {
      super(side, side, side);
   }
   public String toString(){
      return "Equilateral Triangle" + "    perimeter: " + super.getPerimeter() + "    area: " + super.getArea();
   }  
   public boolean equals(Object other){
      if(other instanceof EquilateralTriangle){
         EquilateralTriangle otherEquTri = (EquilateralTriangle) other;
         return this.getArea() == otherEquTri.getArea();
      }
      else {
         return false;
      }
   }         
}
