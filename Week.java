
public class Week {
	
	public static void main(String [] args ) {
		Day today = new Day("Wednesday");
		
		System.out.println(today);
		System.out.println(today.getDay());
		System.out.println(today.nextDay());
		System.out.println(today.previousDay());
		System.out.println(today.calculateDay(12));
		System.out.println(today.calculateDay(-12));
	}
}
