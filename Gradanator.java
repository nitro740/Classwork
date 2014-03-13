import java.util.*;
import java.io.*;
import java.util.Random;

public class Gradanator{
	
	public static void main(String[] args) {
		System.out.println("This program reads exam/homework scores");
		System.out.println("and reports your overall course grade.");
		System.out.println(" ");
		System.out.println("Midterm:");
		WSWTW();
	}
	public static void WSWTW(){
		System.out.print("Weight (0-100)? "); scanner();
		System.out.print("Score earned? "); scanner();
		System.out.print("Were scores shifted (1-yes, 2-no)? "); scanner();
	}
	public static String scanner(){
		Scanner main = new Scanner (System.in);
		return main.next();
	}
}