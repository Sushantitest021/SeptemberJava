package YTFrameworkNew.allAssignmentJava;

public class SwitchCase {
	
	
	public static void main(String[] args) {
		String weekname= "sunday";
		switch (weekname)
		{
		case "sunday" : System.out.println("  weekday is 1 ");break;
		case "monday" : System.out.println("  weekday is 2 ");
		case "tuesday" : System.out.println("  weekday is 3 ");
		case "wednesday" : System.out.println("  weekday is 4 ");
		case "thursday" : System.out.println("  weekday is 5 ");
		case "friday" : System.out.println("  weekday is 6 ");
		case "saturday" : System.out.println("  weekday is 7 ");
		default : System.out.println("Invalid weekday");
		}
	}

}
