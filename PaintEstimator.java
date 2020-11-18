package paintingAWall;

import java.util.Scanner;

public class PaintEstimator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double wallHeight;
      double wallWidth;
      double wallArea;
      
      System.out.println("Enter wall height (feet):");
      wallHeight = scnr.nextDouble();
      
      System.out.println("Enter wall width (feet):");
      wallWidth = scnr.nextDouble();                      
      
   // Calculate and output wall area
      wallArea = wallWidth*wallHeight;                       
      System.out.println("Wall area: "+wallArea+" square feet");     
      
   // Calculate and output the amount of paint in gallons needed to paint the wall
      double paintNeeded = wallArea/350;
      System.out.println("Paint needed: "+paintNeeded+" gallons");
      
   // Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
      double cansD = paintNeeded+1;
      int cansNeeded=(int)cansD;  
      System.out.println("Cans needed: "+cansNeeded+" can(s)");
   }
}