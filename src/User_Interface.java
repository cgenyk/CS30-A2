

// import java libraries here as needed

import javax.swing.*;
import java.io.*; 					// import file io libraries
import java.util.*;
import java.lang.String;
import com.sun.org.apache.xalan.internal.lib.ExsltStrings.*;
import java.lang.*;
import java.text.*;
public class User_Interface {  // begin class

    public static void main(String[] args) throws IOException, ParseException {  // begin main

        // ********* declaration of constants **********

        // ********** declaration of variables **********

        String strin;                // string data input from keyboard
        String strout;                // processed info string to be output
        String bannerOut;            // string to print banner to message dialogs

        String prompt;                // prompt for use in input dialogs

        String delim = "[ :]+";        // delimiter string for splitting input string
        String tabSpace = "      ";    // six spaces
        int counter = 1; // Counts the frequancy
        int curnum = 0; // Current numbber
        String token1 = ""; // Reading the file
        int prevnum = 0; // Last number
        // create instances of objects for i/o and formatting

        //ConsoleReader console = new ConsoleReader(System.in);
        //DecimalFormat df1 = new DecimalFormat("$##.00");

        //  BufferedReader fin = new BufferedReader(new FileReader("skaterData.txt"));
        // PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
        Scanner inf = new Scanner(new File("skaterData.txt"));
        // ********** Print output Banner **********



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
        // String[] tokens = strin.split(delim);


        // ************************ processing ***************************
        int n = 0;
        n=   Integer.parseInt(JOptionPane.showInputDialog(null, "How many racers?"));

        List<String> temps = new ArrayList<String>(); // Makes the array
        String list = String.join(",", temps);

        for (int i = 0; i < 10; i++) {
            System.out.print(list);
        }


        // while loop
        while (inf.hasNextLine()) {
            // find next line
            token1 = inf.nextLine();

            temps.add(token1);

        }
        inf.close(); // closes file in


        System.out.println(temps);


        int id = 0;
        int displayid = 1;

        while (id < n) {
            String addtime = JOptionPane.showInputDialog(null, "Enter Race Result for Racer: " + displayid, "Enter", JOptionPane.QUESTION_MESSAGE);

            id++;
            displayid++;
            System.out.println("Id Number: " + id + " |" + " Times: " + list + addtime + " |" + " Avg" + "|" + " Speed" + "km/h");

        }


       // DateFormat formatter = new SimpleDateFormat("HH:mm");
      //  java.sql.Time timeValue = new java.sql.Time(formatter.parse(list).getTime());
      //  System.out.println(timeValue);

            // ************************ print output ****************************


            // ******** closing message *********

            System.out.println("end of processing.");
            // fout.format("%n%nend of processing.");

            // ***** close streams *****

            //fin.close();			// close input buffer
            //  fout.close();			// close output buffer
        }  // end main
    }  // end class

