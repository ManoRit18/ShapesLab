public class RightTriangle extends Triangle{
   private double hypotenuse;
   
   public RightTriangle(double base, double height) {
      super(base, height, Math.sqrt((base*base) + (height*height)));
      this.hypotenuse = Math.sqrt((base*base) + (height*height));
   }
   public double getArea(){
      return 0.5 * super.getSideOne() * super.getSideTwo();
   }
   public String toString(){
      return "Right Triangle" + "    perimeter: " + getPerimeter() + "    area: " + getArea();
   } 
   public boolean equals(Object other){
      if(other instanceof RightTriangle){
         RightTriangle otherRightTri = (RightTriangle) other;
         return this.getArea() == otherRightTri.getArea();
      }
      else {
         return false;
      }
   } 
}
