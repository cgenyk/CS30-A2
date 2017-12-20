// import java libraries here as needed

import javax.swing.*;
import java.io.*; 					// import file io libraries
import java.util.*;
import java.lang.String;
import java.lang.*;
import java.text.*;

// JOptionPane.showInputDialog(null, "How many racers?")

class SkatingRaces {  // begin class

    static class Skater {
        private int id;
        private int[] times;
        // constructor
        public Skater(int id, int[] times) {
            this.id = id;
            this.times = times;
        }

        public String toString() {
            String times_str = "";
            DecimalFormat df1 = new DecimalFormat("00");
            for(int i = 0; i < 20; i+= 2){
                times_str += df1.format(Integer.toString(times[i])) + ":" + df1.format(Integer.toString(times[i+1])) + " ";
            }
            return Integer.toString(id) + " " + times_str;
        }
    }

    private static List<Skater> skaters = new ArrayList<Skater>(); // Makes the array

    public static void loadFile() throws FileNotFoundException {
        String token1 = ""; // Reading the file
        String delim = "[ :]+";        // delimiter string for splitting input string

        Scanner fin = new Scanner(new FileReader("skaterData.txt"));

        int id = 0;
        // while loop
        while (fin.hasNextLine()) {
            // find next line
            token1 = fin.nextLine();

            String times_str[] = token1.split(delim);
            int[] times = new int[20];
            for(int i = 0; i < times_str.length; i++){
                times[i] = Integer.parseInt(times_str[i]);
            }
            Skater skater = new Skater(id, times);

            skaters.add(skater);
            System.out.println(skater.toString());
            id++;
        }
        fin.close(); // closes file in
    }



    public static void main(String[] args) throws IOException, ParseException {  // begin main
        loadFile();

        // ********* declaration of constants **********

        // ********** declaration of variables **********

        //String strin;                // string data input from keyboard
        //String strout;                // processed info string to be output
        //String bannerOut;            // string to print banner to message dialogs

        //String prompt;                // prompt for use in input dialogs

        //String delim = "[ :]+";        // delimiter string for splitting input string
        //String tabSpace = "      ";    // six spaces
        //int counter = 1; // Counts the frequancy
        //int curnum = 0; // Current numbber
        //String token1 = ""; // Reading the file
        //int prevnum = 0; // Last number
        // create instances of objects for i/o and formatting

        //ConsoleReader console = new ConsoleReader(System.in);
        //DecimalFormat df1 = new DecimalFormat("$##.00");

        //BufferedReader fin = new BufferedReader(new FileReader("skaterData.txt"));
        // PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
        //Scanner inf = new Scanner(new File("skaterData.txt"));

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



        //Scanner in = new Scanner(System.in);
        // ************************ processing ***************************
        //int n = 0;
        //n = Integer.parseInt(in.nextLine());

        //List<String> temps = new ArrayList<String>(); // Makes the array
        //String list = String.join(",", temps);

        //for (int i = 0; i < 10; i++) {
        //    System.out.print(list);
        //}


        // while loop
        //while (inf.hasNextLine()) {
        // find next line
        //    token1 = inf.nextLine();

        //    temps.add(token1);

        //}
        //inf.close(); // closes file in


        // System.out.println(temps);


        //int id = 0;
        //int displayid = 1;

        //while (id < n) {
        //    System.out.println("Enter Race Result for Racer: " + displayid);
        //    String addtime = in.nextLine(); //JOptionPane.showInputDialog(null, "Enter Race Result for Racer: " + displayid, "Enter", JOptionPane.QUESTION_MESSAGE);

        //    id++;
        //    displayid++;
        //    System.out.println("Id Number: " + id + " |" + " Times: " + list + addtime + " |" + " Avg" + "|" + " Speed" + "km/h");

        //}


        // DateFormat formatter = new SimpleDateFormat("HH:mm");
        //  java.sql.Time timeValue = new java.sql.Time(formatter.parse(list).getTime());
        //  System.out.println(timeValue);

        // ************************ print output ****************************


        // ******** closing message *********

        //System.out.println("end of processing.");
        // fout.format("%n%nend of processing.");

        // ***** close streams *****

        //fin.close();			// close input buffer
        //  fout.close();			// close output buffer
    }  // end main
}  // end class

