import java.util.*;

public class ShapeClient {
   public static void main(String[] args){
      ArrayList<Shape> shapesList = new ArrayList<>();
      shapesList.add(new RightTriangle(3, 4));
      shapesList.add(new RightTriangle(6, 8));      
      shapesList.add(new ScaleneTriangle(13, 12, 14));
      shapesList.add(new ScaleneTriangle(16, 10, 8));
      shapesList.add(new IsoscelesTriangle(12, 12, 15));
      shapesList.add(new IsoscelesTriangle(13, 13, 14)); 
      shapesList.add(new EquilateralTriangle(6));
      shapesList.add(new EquilateralTriangle(3)); 
      shapesList.add(new Square(4));
      shapesList.add(new Square(1));                 
      shapesList.add(new Circle(10000));
      shapesList.add(new Circle(2));
      
      for(int i = 0; i < shapesList.size(); i++){
         System.out.println(shapesList.get(i));
      }
      
      System.out.println("Smallest Area:  " + smallestArea(shapesList));
      System.out.println("Largest Area:    " + largestArea(shapesList));
      
   }  
   public static Shape smallestArea(ArrayList<Shape> shapesList){
      int index = 0;
      double min = shapesList.get(0).getArea();
      
      for(int i = 0; i < shapesList.size(); i++){
         if(shapesList.get(i).getArea() < min){
            min = shapesList.get(i).getArea();
            index = i;
         }
      }
      return shapesList.get(index);      
   }
   
   public static Shape largestArea(ArrayList<Shape> shapesList){
      int index = 0;
      double max = shapesList.get(0).getArea();
      
      for(int i = 0; i < shapesList.size(); i++){
         if(shapesList.get(i).getArea() > max){
            max = shapesList.get(i).getArea();
            index = i;
         }
      }
      return shapesList.get(index);      
   }
}
