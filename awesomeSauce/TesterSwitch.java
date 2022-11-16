package awesomeSauce;

public class TesterSwitch {
	public static void main(String[] args) {
		int monthOfYear = 2;
		switch(monthOfYear) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		default:
			System.out.println("none of the month specified correspond to the value");
			break;
		}
	}
}
