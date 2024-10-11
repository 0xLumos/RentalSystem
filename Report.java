import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Report {
        /* Class used to print details of a reportable object 
         by allowing any class that implements Reportable interface
          to be passed in as an argument. */


        // Print to console using the System class
        public static void printToConsole(Reportable reportable) {
                System.out.println(reportable.generateReport());
        }
        
        // Print to CSV file using BufferedWriter, 
        public static void persistToCSV(Reportable reportable, String fileName) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {    // Write to given file
                        writer.write(reportable.generateReport());
                } catch (IOException e) {
                        e.printStackTrace();    //Display error
                }
        }
}
