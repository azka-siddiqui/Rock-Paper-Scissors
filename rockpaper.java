import java.util.Scanner;

public class rockpaper {
    public static void main(String [] args){
        
        //variable declaration and initialization

        Scanner uI = new Scanner(System.in);
        int userChoice = 0;
        int compChoice = (int)(Math.random()*3+1);

        System.out.println("Let's play rock paper scissors! Choose a move: \n1. Rock\n2. Paper\n3. Scissors");
        userChoice = uI.nextInt();

        if (userChoice == 1){
            Rock();
            
        } else if (userChoice == 2){
            Paper();
            
        } else {
            Scissors();
        }

        System.out.println("\nNice move! Let's see what the computer chose!");

        if (compChoice == 1){
            Rock();
            
        } else if (compChoice == 2){
            Paper();
            
        } else {
            Scissors();
        }

        if (compChoice == userChoice){
            System.out.println("\nYou and the computer both chose the same move! That's a tie!");
        } else if (userChoice == 1 && compChoice == 2){
            System.out.println("\nYou chose rock but the computer chose paper. Better luck next time!");
        } else if (userChoice == 1 && compChoice == 3){
            System.out.println("\nYou chose rock and the computer chose scissors. You won!");
        } else if (userChoice == 2 && compChoice == 1){
            System.out.println("\nYou chose paper and the computer chose rock. You won!");
        } else if (userChoice == 2 && compChoice == 3){
            System.out.println("\nYou chose paper but the computer chose scissors. Better luck next time!");
        } else if (userChoice == 3 && compChoice == 1){
            System.out.println("\nYou chose scissors but the computer chose rock. Better luck next time!");
        } else if (userChoice == 3 && compChoice == 2){
            System.out.println("\nYou chose scissors and the computer chose paper. You won!");
        } 

    } 
    public static void Rock(){
        System.out.println("     ______\n---'   ____)\n      (_____)\n      (_____)\n      (____)\n---.__(___)");
    }
    public static void Scissors(){
        System.out.println("    _______\n---'   ____)____\n          ______)\n       __________)\n      (____)\n---.__(___)");       
    }
    public static void Paper(){
        System.out.println("     _______\n---'    ____)____\n           ______)\n          _______)\n         _______)\n---.__________)");
    
    }

}
    
