  import java.util.Scanner;
  public class j1{
    public static void main(String[] args){
      System.out.println("Getting input from the user and adding both of them");
      Scanner s= new Scanner(System.in);
      System.out.print("Enter first number: ");
      int n1=s.nextInt();
      System.out.print("Enter second number: ");
      int n2=s.nextInt();
      int n=n1+n2;
      System.out.print("Sum of two numbers: "+n);
    }
  }
