package QaJava;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		map mp=new map();
		compass cps=new compass();
		player plr=new player();
		status sts=new status();
		mp.startPoint();
		Scanner sc=new Scanner(System.in);
		String i=sc.nextLine();
			if (i.equals("north")) {
				mp.north("1");
				i = sc.nextLine();
					switch(i) {
						case "knock": mp.north("knock"); break;
						case "back": plr.lose("2"); break;
						case "location": plr.lose("2"); break;
						} i = sc.nextLine();
						mp.north(i);
						i = sc.nextLine();
							switch(i) {
								case "knock": mp.north("enter"); break;
								case "back": plr.lose("2"); break;
								} i = sc.nextLine();
								mp.north(i);
								i = sc.nextLine();
									switch(i) {
										case "door 1": plr.win1("1"); break;
										case "door 2": plr.lose("3"); break;
										case "door 3": plr.lose("3"); break;
										}
			} else if (i.equals("east")) {
				mp.east("1");
				i = sc.nextLine();
					switch(i) {
					case "explain": mp.east("explain"); break;
					case "back": plr.lose("4"); break;
					} i = sc.nextLine();
					mp.east(i);
						switch(i) {
							case "follow": mp.east("follow"); break;
							case "back": plr.lose("4"); break;
							} i = sc.nextLine();
							mp.east(i);
			} else if (i.equals("west")) {
				mp.west();
				i = sc.nextLine();
				switch(i) {
					case "win": plr.win1("5"); break;
					case "just": plr.lose("5"); break;
				}
				
			} else if (i.equals("south")) {
				mp.south();
				plr.lose("1");
			}  
}
}
