/*
	Name - Anmol Singh
	Student Number - A00246505
    This program is written to read input from user and convert it into a different unit of measurement and print the value out.
*/

import java.util.Scanner;

public class Lab1{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		float Converted_Value = 0f;
		System.out.println("\t Welcome to Lab 1");
		System.out.println("\t Here we will convert Entered_Values between various units of measurement");
		System.out.println("\t Available units to convert are km, mi, cm, in, kg, lb, g, oz, C and F ");
		System.out.println("\t Enter Entered_Values as '10 kg' and not '30lb'");
		System.out.println("Hit 'Enter' to Begin");
		input.nextLine();
		
		while(true){
			System.out.print("Enter a Entered_Value with unit to convert: ");
			float Entered_Value = input.nextFloat(); //gets the next float value of buffer
			String unit = input.next(); //gets the next Entered_Value of buffer
			input.nextLine(); //reads the remaining Entered_Value in the buffer

			/*
				The Next block of code checks for the entered unit, converts the Entered_Value accordingly and prints it out.
				
				If the unit entered is C, both F and K values are calculated and printed 
				and IF the unit entered is F, both C and K values are calculated and printed
				
				If a unit is entered outside of the Available units then a message is thrown which says invalid unit entered
								
			*/
			if (unit.equals("km")){ //checking the unit for km
				Converted_Value = Entered_Value * 0.62f; //calculating value in mi
				System.out.println(Entered_Value + " " + unit + " equals " + Converted_Value + " mi");
			}else if (unit.equals("mi")){ //checking the unit for mi
				Converted_Value = Entered_Value * 1.61f; //calculating value km
				System.out.println(Entered_Value + " " + unit + " equals " + Converted_Value + " km");
			}
			else if (unit.equals("cm")){ //checking the unit for cm
				Converted_Value = Entered_Value * 0.39f; //calculating value in inches
				System.out.println(Entered_Value + " " + unit + " equals " + Converted_Value + " in");
			}else if (unit.equals("in")){ //checking the unit for in
				Converted_Value = Entered_Value * 2.54f; //calculating value in cm
				System.out.println(Entered_Value + " " + unit + " equals " + Converted_Value + " cm");
			}
			else if (unit.equals("kg")){ //checking the unit for kg
				Converted_Value = Entered_Value * 2.2f; //calculating value in lb
				System.out.println(Entered_Value + " " + unit + " equals " + Converted_Value + " lb");
			}else if (unit.equals("lb")){ //checking the unit for lb
				Converted_Value = Entered_Value * 0.45f; //calculating value in kg
				System.out.println(Entered_Value + " " + unit + " equals " + Converted_Value + " kg");
			}
			else if (unit.equals("g")){ //checking the unit for g
				Converted_Value = Entered_Value * 0.04f; //calculating value in oz
				System.out.println(Entered_Value + " " + unit + " equals " + Converted_Value + " oz");
			}else if (unit.equals("oz")){ //checking the unit for oz
				Converted_Value = Entered_Value * 28.35f; //calculating value in g
				System.out.println(Entered_Value + " " + unit + " equals " + Converted_Value + " g");
			}
			else if (unit.equals("C")){ //checking the unit for C
				
				Converted_Value = (Entered_Value * 9f/5f) + 32; //calculating value in F
				System.out.println(Entered_Value + " " + unit + " equals " + Converted_Value + " F");
					
				Converted_Value = Entered_Value + 273.15f; //calculating value in K
				System.out.println(Entered_Value + " " + unit + " equals " + Converted_Value + " K");
			}
			else if (unit.equals("F")){ //checking the unit for F
				
				Converted_Value = (Entered_Value - 32) * 5f/9f; //calculating value in C
				System.out.println(Entered_Value + " " + unit + " equals " + Converted_Value + " C");
				
				Converted_Value += 273.15; //calculating value in K
				System.out.println(Entered_Value + " " + unit + " equals " + Converted_Value + " K");
			}
			else {
				System.out.println("Invalid Unit Entered"); //Invalid Unit Entered
			}
		}
	}
}