//**********************************************************************
//	ITC 115 - Assignment 11 - ch9 Ex2&3 - Janitor and HarvardLawyer
//
//  Add Janitor and HarvardLawyer classes to law firm employees, that 
//    interact with the superclass. Recreated from previous exercises to
//    have Employee class be abstract, and to include more superclass
//    interaction.
//
//	By: Mike Gilson
//	Date: 3/16/2020
//**********************************************************************

public class EmployeeMain {
	
public static void main(String[] args) {
	
//  Creates an array of new Employee objects - HarvardLawyer and Janitor added
    Employee[] e = { new Secretary(), new LegalSecretary(), new Marketer(),
        			new Lawyer(), new HarvardLawyer(), new Janitor() }; 


//  For loop goes through each item in the length of the array and runs the respective
//    toString method for each employee object.
    for (int i = 0; i < e.length; i++) {
        System.out.println(e[i]);   // prints toString info
        System.out.println();		// new line before each array object
    	}  // end for loop

    } //  end main

}  // end EmployeeMain class
