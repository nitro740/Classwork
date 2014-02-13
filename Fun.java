import java.util.*;
import java.io.*;

public class Fun{
    public static final int SIZE = 5;
    public static void main(String[] args) {
        for (int line = 1; line <= SIZE; line++) {
            for (int dash = 1; dash <= (-4 * line + 4 * SIZE); dash++) {
                System.out.print("-");
            }
            //constants of each line
            for (int star = 1; star <= (9 * line - 8); star++) {
                System.out.print("*");
            }
            // / 
            // *
            for (int vert = 4; vert <= (-1 * line + 5); vert++) {
                System.out.print("|");
            }
            for (int dash = 1; dash <= (-4 * line + 20); dash++) {
                System.out.print("-");
            }
            // \
            System.out.println(); //end of line
        }
    }
}