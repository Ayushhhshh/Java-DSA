import java.util.Scanner;

public class functions {
 public static void printName(String name) {
    System.out.println(name);
    return;
 }   

 public static void main(String[]args){
   System.out.println("Enter your name:");
   Scanner sc = new Scanner(System.in);
   String name = sc.next();

   printName(name);
}
}
