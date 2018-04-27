package QaJava;
public class map extends compass{
	public void startPoint() {
		System.out.println("Doze"); 
		System.out.println("------------------------------------");
		System.out.println("Grey foggy clouds float oppressively close to you, reflected in the murky grey water which reaches up your shins");
		System.out.println("You are free to go where ever you want but the dark grey clouds behind you is approaching fast");
		System.out.println("options: north,east,west,south");
	}
	public void north(String a) {
		if(a.equals("1")) {
			System.out.println("you decided to go north");
			System.out.println("as you were heading north, you stumbled upon a house.");
			System.out.println("the windows are all barred up, and it is impossible to see whats inside");
			System.out.println("options: knock, back");
		}
		if(a.equals("knock")) {
			System.out.println("you knocked on the door but nobody answered");
			System.out.println("you decided to look around and see if anyone is home");
			System.out.println("as you look around, you found out that the door was unlocked");
			System.out.println("options: enter, back");
		}
		if(a.equals("enter")) {
			System.out.println("as you enter the house, four doors have greeted you in the hallway");
			System.out.println("you decided to open one of the doors");
			System.out.println("options: door 1, door 2, door 3");
		}
		
	}

	public void east(String a) {
		if(a.equals("1")) {
			System.out.println("you decided to go east");
			System.out.println("as you head east, you see a city in the distance");
			System.out.println("as you get to the gates of the city, a guard stops you from entering the city");
			System.out.println("the guard said 'halt, explain what is your intentions'");
			System.out.println("options: explain, back");}
		if(a.equals("explain")) {
			System.out.println("as you explain your situation to the guard, a mysterious person appeared behind you");
			System.out.println("a very faint female voice started speaking 'let him enter, he is with me'");
			System.out.println("she looked at you and said 'come and follow me, i might be able to help you");
			System.out.println("option: follow, ignore");
		}
		if(a.equals("follow")) {
			System.out.println("you followed the mysterious lady inside the city");
			System.out.println("the city looks like i");
			System.out.println("she looked at you and said 'come and follow me, i might be able to help you");
			System.out.println("option: drink, ignore");
		}
		if(a.equals("1")) {}
	}
	public void west() {
		System.out.println("you decided to go west");
		System.out.println("this is where there are a lot of choices such as help people and gives you the option to actually fight the god damn stupid cloud with the beast");
		System.out.println("but since I didnt have enough time, you get this message instead");
		System.out.println("so i guess ill turn this into an insta-win");
		System.out.println("just type win if you want to win, or you can always kill yourself if you type 'just'");
	}
	public void south() {
		System.out.println("you decided to go south");
		System.out.println("you decided to try and re-trace your steps and headed south");
	}
}

