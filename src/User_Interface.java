// RUN ON 174
// RUN ON 174
// RUN ON 174
// RUN ON 174
// RUN ON 174
// RUN ON 174
// RUN ON 174
// RUN ON 174
// RUN ON 174
// RUN ON 174
// RUN ON 174
// RUN ON 174
// RUN ON 174
// RUN ON 174

// import java libraries here as needed

import javax.swing.*;
import java.io.*; 					// import file io libraries
import java.math.RoundingMode;
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
                String time = JOptionPane.showInputDialog("Enter time in MM:SS format for racer " + id);
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

            //  for (int i = 0; i < times.length; i += 2) {
            double km =  (5.0 / timeinhr);


            return km;
        }

        public double getcuskm() {


            int racerID = Integer.parseInt(JOptionPane.showInputDialog(null, "Cus Speed | Racer ID Number"));
            int racenum = Integer.parseInt(JOptionPane.showInputDialog(null, "Cus Speed | Race Number"));
            String id = String.valueOf((skaters.get(racerID)));
            String[] yolo = id.split(" ");
            String dora = yolo[racenum];


            String[] unit = dora.split(":"); //will break the string up into an array

            int cusminutes2 = Integer.parseInt(unit[0]); //first element
            int cusseconds2 = Integer.parseInt(unit[1]); //second element
            int duration = 60 * cusminutes2 + cusseconds2; //add up our values

            int custimeinhr = duration * 60;

            //  for (int i = 0; i < times.length; i += 2) {
            double cuskm = 5.0 / custimeinhr;


            return cuskm;
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



        /// RUN THIS //

        public static void main(String[] args) throws IOException, ParseException {
            loadFile();

            DecimalFormat df1 = new DecimalFormat("00");





            Skater skater = null;
            for (int i = 0; i < skaters.size(); i++) {
                skater = skaters.get(i);

                System.out.println("Time: ");

                int total_seconds = skater.getCusNum();

                int minutes = total_seconds / 60;
                int seconds = total_seconds % 60;

                System.out.println(skater.toString() + df1.format(minutes) + ":" + df1.format(seconds));


                System.out.println("Averages: ");


                int av_seconds = skater.getfinalAvgInSeconds();
                int avminutes = av_seconds / 60;
                int avseconds = av_seconds % 60;
                System.out.println(skater.id + ": " + df1.format(avminutes) + ":" + df1.format(avseconds));


                System.out.println("Speed: ");

                double total_km = skater.getkm(total_seconds);


                System.out.println(skater.id + ": " + total_km+ " km/h");

                System.out.println("---- NEW RACER ----");

            }

            System.out.println("*** END OF RACER DATA | CUSTOM QUERY RESPONSES ***");
            System.out.println("---- QUERY RESPONSE: CUSTOM SPEED ----");
            double total_seconds2 = skater.getcuskm();
            System.out.println("!! RESULT!! Speed is  " + (total_seconds2) + " km/h ");
            System.out.println("*** END  QUERY RESPONSE: CUSTOM SPEED ***");



            System.out.println("---- QUERY RESPONSE: CUSTOM RACE RESULT ----");

            int racerID = Integer.parseInt(JOptionPane.showInputDialog(null, "Cus Time | Racer ID Number "));
            int racenum = Integer.parseInt(JOptionPane.showInputDialog(null, "Cus Time | Race Number"));
            String id = String.valueOf((skaters.get(racerID)));

            String[] yolo = id.split(" ");

            System.out.println("** ID# " + racerID + " RACE # " +racenum+ " SELECTED **");
            System.out.println(yolo[racenum]);
            System.out.println("*** END  QUERY RESPONSE: Custom Individual Time Request ***");
            System.out.println("*** END OF CUSTOM QUERY RESPONSES *** | Program Stopped");

        }




    } // end main
} // end class

// IS GITHUB WORKING?