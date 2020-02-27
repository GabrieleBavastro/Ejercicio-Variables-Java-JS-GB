public class Fase2 {
   public static void main(String[] args) {
	String name = "Gabriele";
	String surname1 = "Bavastro";
	String surname2 = "Navone";
	int leapYearReference = 1948;
	int leapYearloop = 4;
	int yearOfBirth = 1984;
	int fromLyeToYob = (yearOfBirth) - (leapYearReference);
	int leapYearsfromLyeToYob = (fromLyeToYob) / (leapYearloop);
		String fullName = surname1 + " " + surname2 + " " + name;
		System.out.println("The Year of Birth of "+ fullName + " is the " + yearOfBirth + ".");
		System.out.println("The Year "+ leapYearReference + " is a leap year.");
		System.out.println("The difference between the two years is "+ fromLyeToYob + " years.");
		System.out.println("The number of Leap Years between your birthday and " + leapYearReference + " is " + leapYearsfromLyeToYob + ".");
   }
}