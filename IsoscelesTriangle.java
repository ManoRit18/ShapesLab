public class IsoscelesTriangle extends Triangle {
   public IsoscelesTriangle(double sideOne, double sideTwo, double sideThree) {
      super(sideOne, sideTwo, sideThree);
   }
   public String toString(){
      return "Isosceles Triangle" + "    perimeter: " + super.getPerimeter() + "    area: " + super.getArea();
   }   
   public boolean equals(Object other){
      if(other instanceof IsoscelesTriangle){
         IsoscelesTriangle otherIsocTri = (IsoscelesTriangle) other;
         return this.getArea() == otherIsocTri.getArea();
      }
      else {
         return false;
      }
   }
}
