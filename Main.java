import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
         Scanner userInput = new Scanner(System.in);
      Scanner intInput = new Scanner(System.in);
      System.out.println("You head to space: Would you like to go to Mars or Neptune?");
      String choiceOne = userInput.nextLine();
      if(choiceOne.equals("Mars"))
      {
     System.out.println("You head to Mars!");
     mars();
      }
      else if(choiceOne.equals("Neptune"))
      {
     System.out.println("Onto Neptune you go!");
neptune();
      }
      else
      {
    System.out.println("You can't go there. Please Retry.");
      }
    }
    
    public static void mars()
    {
        Scanner userInput = new Scanner(System.in);
      Scanner intInput = new Scanner(System.in);
    System.out.println("Once you get to Mars you see 2 ways to go. Do you head to the Alien City or the Alien Mine?");
     String marsChoice = userInput.nextLine();
     if(marsChoice.equals("Alien City"))
     {
         System.out.println("You chose the Alien City!");
     }
     else if(marsChoice.equals("Alien Mine"))
     {
         System.out.println("You chose the Alien Mine!");
     }
     else {
         
             System.out.println("You cannot choose that, Retry.");
             mars();
         }
     }
     public static void neptune()
    {
        Scanner userInput = new Scanner(System.in);
      Scanner intInput = new Scanner(System.in);
    System.out.println("Once you get to Neptune you see 2 ways to head. Do you head to the Lake or the Alien Tower?");
     String neptuneChoice = userInput.nextLine();
     if(neptuneChoice.equals("Lake"))
     {
         System.out.println("You chose the Lake!");
     }
     else if(neptuneChoice.equals("Alien Tower"))
     {
         System.out.println("You chose the Alien Tower!");
     }
     else {
         
             System.out.println("You cannot choose that, Retry.");
             neptune();
         }
     }
    }

