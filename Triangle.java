import java.util.*;
class Triangle
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter l:");
     int l = sc.nextInt();
     System.out.println("Enter b:");
     int b = sc.nextInt();
     double Area = 0.5*l*b;
     System.out.println("Area of triangle :" + Area);
     int a = sc.nextInt();
     int d = sc.nextInt();
     int c = sc.nextInt();
     int perimeter = a+d+c;
     System.out.println("Perimeter of triangle :" + perimeter);
     sc.close();
   }
}
