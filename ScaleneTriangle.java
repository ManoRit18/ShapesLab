public class ScaleneTriangle extends Triangle {
   public ScaleneTriangle(double sideOne, double sideTwo, double sideThree) {
      super(sideOne, sideTwo, sideThree);
   }
   public String toString(){
      return "Scalene Triangle" + "    perimeter: " + super.getPerimeter() + "    area: " + super.getArea();
   }  
   public boolean equals(Object other){
      if(other instanceof ScaleneTriangle){
         ScaleneTriangle otherScalTri = (ScaleneTriangle) other;
         return this.getArea() == otherScalTri.getArea();
      }
      else {
         return false;
      }
   }
}
