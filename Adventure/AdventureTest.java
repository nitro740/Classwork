import java.util.*;
import java.io.*;
import java.util.Random;

public class AdventureTest {
	
	public static void main(String [] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Where would you like to start?");
		System.out.println("Town, Island, Forest, Desert");
		
		String startloc=scn.nextLine();
		
		if (startloc.compareToIgnoreCase("town")==0){
			System.out.println("You chose to start in the town.");
			
			System.out.println("You can go visit many places around town,");
			Where();
			System.out.println("Blacksmith, Market, Castle, Docks, Home, or");
			System.out.println("leave the town.");
			
			String t1cmd=scn.nextLine();
			
			if (t1cmd.compareToIgnoreCase("blacksmith")==0){
				System.out.println("You chose to visit the blacksmith.");
				
				Talk(); System.out.println("the blacksmith?");
				System.out.println("Yes or No");
				
				String t1blksyn=scn.nextLine();
				if (t1blksyn.compareToIgnoreCase("yes")==0){
					System.out.println("The blacksmith has many things for sale,");
					System.out.println("including armor upgrades, weapon upgrades, new armor,");
					System.out.println("and new weapons. What would you like to buy?");
				}
				else if (t1blskyn.compareToIgnoreCase("no")==0){
					
				}
			}
			else if (startloc.compareToIgnoreCase("market")==0){
				System.out.println("You chose to visit the market.");
				MarketIn();
				
				Who(); 
				System.out.println("the weapon merchant, the food merchant, the armor merchant,");
				System.out.println("the potion merchant, the horse merchant, or just leave?");
				
				String t1mktcmd=scn.nextLine();
				if (t1mktcmd.compareToIgnoreCase("the weapon merchant")==0){
					Talk(); System.out.println("the weapon merchant, yes or no?");
					
					String t1wmcmd=scn.nextLine();
					if (t1wmcmd.compareToIgnoreCase("yes")==0){
						WeaponMerchantWares();
					}
				}
			}
		} else if (startloc.compareToIgnoreCase("island")==0){
			System.out.println("You chose to start on the island.");
			
			System.out.println("There are a few locations on the island you can visit");
			System.out.println("yet not many, where would you like to go?");
			System.out.println("Cave, Forest, Beach, Village, Springs, Camp");
		} else if (startloc.compareToIgnoreCase("forest")==0){
			System.out.println("You chose to start in the forest");
		} else if (startloc.compareToIgnoreCase("desert")==0){
			System.out.println("You chose to start in the desert.");
			
			System.out.println("There are few places to visit here,");
			Where();
			System.out.println("Oasis, Camp, River, Rocks, Dunes");
			String d1cmd=scn.nextLine();
			
			if (d1cmd.compareToIgnoreCase("oasis")==0){
				Scanner ScannerD1O = new Scanner (System.in);
				System.out.println("You chose to visit the oasis.");
				
				
			}
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
	public static void MarketIn() {
		System.out.println("There are many merchants here.");
	}
	public static void Buy(){
		System.out.println("What would you like to buy?");
	}
	public static void WeaponMerchantWares(){
		System.out.println("The armor merchant has many things for sale,");
		System.out.println("including longswords, shortswords, broadswords, daggers, knives,");
		System.out.println("handaxes, battleaxes, poleaxes, spears, halberds,");
		System.out.println("maces, warhammers, polehammers, shortbows, longbows,");
		System.out.println("recurve bows, crossbows, and javelins.");
		System.out.println(" ");
		Buy();
	}
}
