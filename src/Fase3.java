
public class Fase3 {
  public static void main(String[] args) {
	final int yearOfBirth = (1984);
	final int beginYear = (1948);
    String leapYear = " - It's a leap year!";
    String notLeapYear = " - It's not a leap year!";
    String birthDateLeap = " - It's your birthday and it's a leap year!";
    String birthDateNotLeap = " - It's your birthday and it's not a leap year!";
    for (int i = beginYear; i < yearOfBirth; i++) {
    	if (i%4 == 0){
        	System.out.println(i + leapYear);
    	}else {
    		System.out.println(i + notLeapYear);}
    }
    	
    for (int j = (yearOfBirth); j <= yearOfBirth; j++) {
        	if (j%4 == 0){
            	System.out.println(j + birthDateLeap);
        	}else {
        		System.out.println(j + birthDateNotLeap);}
    }
  }
}