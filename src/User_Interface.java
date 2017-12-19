/********************************************************************
 * Programmer:	sveinson
 * Class:  CS20S
 *
 * Assignment: Ax Qy
 * Program Name:  name of public class
 *
 * Description: brief description of program
 *
 * Input: data to be input
 *
 * Output: results to be output
 ***********************************************************************/

// import java libraries here as needed

import javax.swing.*;
import java.io.*; 					// import file io libraries


public class User_Interface {  // begin class

    public static void main(String[] args) throws IOException{  // begin main

        // ********* declaration of constants **********

        // ********** declaration of variables **********

        String strin;				// string data input from keyboard
        String strout;				// processed info string to be output
        String bannerOut;			// string to print banner to message dialogs

        String prompt;				// prompt for use in input dialogs

        String delim = "[ :]+";		// delimiter string for splitting input string
        String tabSpace = "      ";	// six spaces

        // create instances of objects for i/o and formatting

        //ConsoleReader console = new ConsoleReader(System.in);
        //DecimalFormat df1 = new DecimalFormat("$##.00");

        //BufferedReader fin = new BufferedReader(new FileReader("name of file"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("skaterData.txt")));

        // ********** Print output Banner **********

        System.out.println("*******************************************");
        System.out.println("Name:		Connor Genyk");
        System.out.println("Class:		CS30S");
        System.out.println("Assignment:	Assignment 2");
        System.out.println("*******************************************");

        bannerOut = "*******************************************\n";
        bannerOut += "Name:		Connor Genyk\n";
        bannerOut += "Class:		CS30S\n";
        bannerOut += "Assignment:	Assignment 2\n";
        bannerOut += "*******************************************\n\n";

        fout.println("*******************************************");
        fout.println("Name:		Connor Genyk");
        fout.println("Class:		CS30S");
        fout.println("Assignment:	Assignment 2");
        fout.println("*******************************************");

        // ************************ get input **********************

    /*	prompt = "Enter your prompt text here. \n";
    	prompt += "you may need to add additional lines\n";
    	prompt += "or delete some of these prompt lines.\n\n";


    	strin = JOptionPane.showInputDialog(bannerOut + prompt);
    */
    	/* **********************************
    	 * split the input string into tokens
    	 * use the value in delim as the delimieter
    	 * uncomment the line to use it.
    	 ************************************/
        //String[] tokens = strin.split(delim);


        // ************************ processing ***************************

        // ************************ print output ****************************

        int addtime1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter time for racer 1"));
        int addtime2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter time for racer 2"));
        int addtime3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter time for racer 3"));
        int addtime4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter time for racer 4"));
        int addtime5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter time for racer 5"));

        System.out.println(addtime1);
        System.out.println(addtime2);
        System.out.println(addtime3);
        System.out.println(addtime4);
        System.out.println(addtime5);

        // ******** closing message *********

        System.out.println("end of processing.");
        fout.format("%n%nend of processing.");

        // ***** close streams *****

        //fin.close();			// close input buffer
        fout.close();			// close output buffer
    }  // end main
}  // end class
