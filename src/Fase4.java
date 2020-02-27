
public class Fase4 {
  public static void main(String[] args) {
	final int yearOfBirth = (1984);
	String name = "Gabriele";
	String surname1 = "Bavastro";
	String surname2 = "Navone";
    int dayOfBirth = (9);
    int monthOfBirth = (7);
    String birthDateLeap = "Your birthday it's in a leap year!";
    String birthDateNotLeap = "Your birthday it's not in a leap year!";
    String fullName = surname1 + " " + surname2 + " " + name;
    String dateOfBirth = (dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth); 
    
    System.out.println("Your name is: "+ fullName + ".");  
    System.out.println("Your birthdate is: "+ dateOfBirth + "."); 
    
    for (int j = (yearOfBirth); j <= yearOfBirth; j++) {
        	if (j%4 == 0){
            	System.out.println(birthDateLeap);
        	}else {
        		System.out.println(birthDateNotLeap);}
    }
  }
}