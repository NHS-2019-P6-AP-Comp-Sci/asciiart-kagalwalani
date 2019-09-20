/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void line() {
		System.out.println("/=========================\\");
	}
	public static void thinline() {
		System.out.println("___________________________");
	}
	public static void apps() {
		System.out.println("|||   ___   ___   ___   |||");
		System.out.println("|||  [   ] [   ] [   ]  |||");
		System.out.println("|||  [___] [___] [___]  |||");
		
	}
	public static void homebutton() {
		System.out.println("|===========\"  \"==========|");	
	}
		
	
	public static void main (String [] args) {
		thinline();
		line();
		line();
		line();
		apps();
		apps();
		apps();
		apps();
		line();
		homebutton();
		homebutton();
		System.out.println("            \"  \"");
		System.out.println("This is my favorite building.");
		   

	}
}