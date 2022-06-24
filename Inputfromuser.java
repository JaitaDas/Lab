import java.util.Scanner;
class Inputfromuser {
   public static void main(String[] args) { 
   Scanner myObj = new Scanner(System.in);     ////System.in is a standard input stream  
   String userName;
   System.out.println("Enter username"); 
   userName = myObj.nextLine(); 
   
    System.out.println("Username is: "+userName);
   }
  } 
