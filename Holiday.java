import java.io.*;
import java.util.*;
  public class Holiday{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Any Day:");
      String str=sc.next();
      if(str.equalsIgnoreCase("Sunday") || str.equalsIgnoreCase("Saterday")){
        System.out.println("yes!,Holiday");
        }
        else if(str.equalsIgnoreCase("Monday") || str.equalsIgnoreCase("Tuesday")||str.equalsIgnoreCase("Wednesday") || str.equalsIgnoreCase("Thursday") || str.equalsIgnoreCase("Friday"))
        {
        System.out.println("No1,Working Day");
        }
        else
        {
        System.out.println("Invalid Input");
        }
      }
    }  
