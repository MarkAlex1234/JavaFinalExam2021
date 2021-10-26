
/**
*
* QUESTION 4
*
* Mark Alexander
*
* 20112145
*
* COMP503
*
* */

import java.util.ArrayList;
import java.util.Collections;


public class Person implements Comparable<Person> {
	
	private String personName;
	private Code personCode;

	public Person(String name, Code code)
	 {
		 this.personName = name;
		 this.personCode = code;
	 }
	 
	
	public String getPersonName() {
		return this.personName;
		}

	public void setPersonName(String personName) {
		this.personName = personName;
		}

	public Code getPersonCode() {
		return this.personCode;
		}

	public void setPersonCode(Code personCode) {
		this.personCode = personCode;
		}

	@Override
	public String toString() {
		String output="";
		output = "" + this.personName + " (" + this.personCode + ") "; 
		return output;
		}

	 @Override
	public int compareTo(Person object) {    	
		 
		 if(this.getPersonCode().ordinal() == object.getPersonCode().ordinal()){
				return 0;
			}
			else if(this.getPersonCode().ordinal() > object.getPersonCode().ordinal()){
				return 1;
			}
			else {
				return -1;
			}
	    }
	 
	public static void main(String[] args)
	{
		Person person1 = new Person("Bob", Code.Green);
		Person person2 = new Person("Alice", Code.Yellow);
		Person person3 = new Person("Greg", Code.Green);
		Person person4 = new Person("Jim", Code.Red);
		Person person5 = new Person("Hugh", Code.Yellow);
		
		ArrayList peopleList = new ArrayList<>();
		peopleList.add(person1);
		peopleList.add(person2);
		peopleList.add(person3);
		peopleList.add(person4);
		peopleList.add(person5);
		
		//Pre-sorted ArrayList
		System.out.println("Pre-Sorted ArrayList: ");
		System.out.println(peopleList);
		
		//Post-sorted ArrayList
		System.out.println("\nPost-Sorted ArrayList: ");
		Collections.sort(peopleList);
		System.out.println(peopleList);
		
	}
	
}
