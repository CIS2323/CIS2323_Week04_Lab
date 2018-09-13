import People.*;
import java.util.Scanner;

public class MakeAPerson{
	public static void main(String[] args){
		
		final int COUNT = 5;
		
		Person[] people = new Person[COUNT];
		
		int i = 0;
		while( i < COUNT ) {
			people[i] = new Person();
			people[i].makeUser("Tim", "Smith", i, 'M');
			i++;
		}
	
		for( int j = 0; j < COUNT; j++ ){
			System.out.println(people[j].getPersonInfo());
		}
		
	}
}