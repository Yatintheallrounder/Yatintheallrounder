package Special;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound= 3;
        Scanner src = new Scanner(System.in);
        System.out.println("Welcome to the Rock Paper Scissor game!");
        System.out.println("Enter 0 for rock\nEnter 1 for paper\nEnter 2 for scissor");
        int a = src.nextInt();
        int b = rand.nextInt(3);
        System.out.print("The number chosen by computer is ");
        System.out.println(b);

        if(a==b){
            System.out.println("Its a Draw!\nYou and computer both chose same number");
        }
        if (a==0 && b==1){
            System.out.println("Oh! You have lost!");
        }
        else if (a==0 && b==2) {
            System.out.println("Congrats! You have won!");
        } else if (a==1 && b==0) {
            System.out.println("Congrats! You have won!");

        } else if (a==1 && b==2) {
            System.out.println("Oh! You have lost!");

        } else if (a==2 && b==0) {
            System.out.println("Oh! You have lost!");

        }
        else if (a==2 && b==1) {
            System.out.println("Congrats! You have won!");
        }

        }
    }

