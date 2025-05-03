import java.util.Scanner;
  public class DanielLawnCompany{
    public static void main(String[] args){
      Scanner k = new Scanner(System.in);
      System.out.println("Please enter height");
      int h = k.nextInt();
      System.out.println("Please enter Width");
      int w = k.nextInt();
      int area = h*w;
      int cost = area*25;
      System.out.println("The length of your lawn is " + h + "The width of your lawn is " + w + "The area of your lawn is " + area + "The cost of this job is " + cost);
    }
  }