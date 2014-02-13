import java.util.*;
import java.io.*;
import java.util.Random;

public class GuessingGame{
    
    public static void main(String [] args) {
        while (true) {
        Scanner questions = new Scanner (System.in);
        int numToGuess = Numbers();
        System.out.print("What is the number (0-10)? : ");
        String scannerInt = questions.next();
        int usrnum=0;
        
        int usrnumt=0;
        try {
            usrnumt=Integer.parseInt(scannerInt,10);
        } catch (NumberFormatException e) {
            System.out.println("Not a number");
            continue;
        } finally {
            usrnum=usrnumt;
        }
        
        if (usrnum == numToGuess) {
            System.out.println("Correct, congratulations!");
            break;
        }
        else if (usrnum != numToGuess) {
            System.out.println("Incorrect, try again.");
            
            }
        }
    }
        
        public static int Numbers() {
        Random numbers = new Random();
        int num = numbers.nextInt(16);
        if (num > 10) {
            num = numbers.nextInt(10);
        }
        return num;
    }
}