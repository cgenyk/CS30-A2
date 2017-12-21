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
        public int id;
        private int[] times;

        // constructor
        public Skater(int id, int[] times) {
            this.id = id;
            this.times = times;
        }


        public String toString() {
            String times_str = "";
            DecimalFormat df1 = new DecimalFormat("00");
            for (int i = 0; i < times.length; i += 2) {
                times_str += df1.format(times[i]) + ":" + df1.format(times[i + 1]) + " ";
            }
            return Integer.toString(id) + ":" + " " + times_str;
        }


        public int getAvgInSeconds() {
            int sum = 0;
            int cussum = 0;
            for (int i = 0; i < times.length; i += 2) {
                int minutes = times[i];
                int seconds = times[i + 1];

                sum += minutes * 60 + seconds;

            }
            int avg = sum / (times.length / 2);
            return avg;
        }


        public int getcusAvgInSeconds() {

            int cussum = 0;
            for (int i = 0; i < times.length; i += 2) {
                int cusminutes = times[i];
                int cusseconds = times[i + 1];
                int cusavg = cussum += cusminutes * 60 + cusseconds;
                // cussum += cusminutes * 60 + cusseconds;
                return cusavg;

            }

            return 0;
        }

        public int getfinalAvgInSeconds() {

            int finalsum = 0;
            for (int i = 0; i < times.length; i += 2) {


            }
            int avg = getAvgInSeconds() + getcusAvgInSeconds() / (times.length / 1);
            return avg;
        }

        public int getCusNum() {
            for (int i = 0; i < times.length; i += 2) {
                String time = JOptionPane.showInputDialog("Enter time in MM:SS format");
                String[] units = time.split(":"); //will break the string up into an array
                int cusminutes = Integer.parseInt(units[0]); //first element
                int cusseconds = Integer.parseInt(units[1]); //second element
                int duration = 60 * cusminutes + cusseconds; //add up our values
                return duration;
            }
            return 0;
        }

        public double getkm(int sec) {

            int timeinhr = sec * 60 * 60;
            // System.out.println(get());
            //  for (int i = 0; i < times.length; i += 2) {
            double km = 5 / timeinhr;


            return km;
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
                int[] times = new int[times_str.length];
                for (int i = 0; i < times_str.length; i++) {
                    times[i] = Integer.parseInt(times_str[i]);
                }
                Skater skater = new Skater(id, times);

                skaters.add(skater);
                id++;
            }
            fin.close();
        }

        public static void main(String[] args) throws IOException, ParseException {
            loadFile();

            DecimalFormat df1 = new DecimalFormat("00");
            System.out.println("Times: ");

            for (int i = 0; i < skaters.size(); i++) {
                Skater skater = skaters.get(i);


                int total_seconds = skater.getCusNum();
                int minutes = total_seconds / 60;
                int seconds = total_seconds % 60;

                System.out.println(skater.toString() + df1.format(minutes) + ":" + df1.format(seconds));


                System.out.println("Averages: ");


                int av_seconds = skater.getfinalAvgInSeconds();
                int avminutes = av_seconds / 60;
                int avseconds = av_seconds % 60;
                System.out.println(skater.id + ": " + df1.format(avminutes) + ":" + df1.format(avseconds));


                System.out.println("Km: ");


                double total_km = skater.getkm(total_seconds);

                System.out.println(skater.id + ": " + total_km);

                System.out.println("---- NEW RACER ----");
            }


            //  System.out.println(skater.id + ": " + df1.format(cminutes)+":"+df1.format(cseconds));


        }


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
    }
// end main
}
// end class

