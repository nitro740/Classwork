import java.util.*;
import java.io.*;

public class Constants{
    public static final int SIZE = 5;
    public static void main(String[] args) {
        for (int line = 1; line <= SIZE; line++) {
            for (int slash = 1; slash <= (-4 * line + 4 * SIZE); slash++) {
                System.out.print("/");
            }
            //constants of each line
            for (int star = 1; star <= (8 * line - 8); star++) {
                System.out.print("*");
            }
            // / 
            // *
            for (int slash = 1; slash <= (-4 * line +20); slash++) {
                System.out.print("\\");
            }
            // \
            System.out.println(); //end of line
        }
    }
}