import java.util.*;
import java.io.*;
import java.util.Random;

public class AdventureTest{
    
    public static void main(String [] args) {
        System.out.println("Where would you like to start?");
        System.out.println("Town, Island, Forest, Desert");
        String ScannerE = Scanner();
            
            if (ScannerE.compareToIgnoreCase("town")==0){
                System.out.println("You chose to start in the town.");
                
                    System.out.println("You can go visit many places around town,");
                    Where();
                    System.out.println("Blacksmith, Market, Castle, Docks, Home");
                    Scanner();
                        
                        if (ScannerE.compareToIgnoreCase("blacksmith")==0){
                            System.out.println("You chose to visit the blacksmith.");
                            
                                Talk(); System.out.println("the blacksmith");
                                Scanner();
                        }
                        else if (ScannerE.compareToIgnoreCase("market")==0){
                            System.out.println("You chose to visit the market.");
                                
                                Who(); 
                                System.out.println("the armor merchant, the food merchant, the weapon merchant,");
                                System.out.println("the potion merchant, the horse merchant?");
                                Scanner();
                        }
            }
            else if (ScannerE.compareToIgnoreCase("island")==0){
                System.out.println("You chose to start on the island.");
                
                    System.out.println("There are a few locations on the island you can visit");
                    System.out.println("yet not many, where would you like to go?");
                    System.out.println("Cave, Forest, Beach, Village, Springs, Camp");
                    Scanner();
            }
            else if (ScannerE.compareToIgnoreCase("forest")==0){
                System.out.println("You chose to start in the forest");
            }
            else if (ScannerE.compareToIgnoreCase("desert")==0){
                System.out.println("You chose to start in the desert.");
            }
        }   
    public static void Where() {
        System.out.println("where would you like to go?");
    }
    public static void Talk() {
        System.out.print("Do you want to talk to ");
    }
    public static void Who() {
        System.out.println("Who do you want to talk to?");
    }
    public static String Scanner(){
        Scanner main = new Scanner (System.in);
        return main.next();
    }
}