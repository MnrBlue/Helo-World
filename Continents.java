//A program that will print out a continent and largest city in that continent, based on the value of an integer. 
public class Continents{
	public static void main(String[] args){
		int continent = 4;
		switch(continent){
			case 1:
			System.out.println("North Amertica: Mexico City, Mexico");
			case 2:
			System.out.println("South America: Sao Paulo, Brazil");
			case 3:
			System.out.println("Europe: Moscow, Russia");
			case 4:
			System.out.println("Africa: Lagos, Nigeria");
			case 5:
			Sytem.out.println("Asia: Shanghai, China");
			case 6:
			System.out.println("Australia: Sydney, Australia");
			case 7:
			System.out.println("Antarctica: McMurdo Station, US");
			//IF none of the above statements are true, then Default's message is printed.
			Default:
			System.out.println("Undefined continent");
		}
	}
}