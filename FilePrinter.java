import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


    public class FilePrinter {
        public static void printFile(File theFile) {
            FileReader fr = null;
            BufferedReader br = null;
            try {
                fr = new FileReader(theFile);
                br = new BufferedReader(fr);
                String line = br.readLine();

                while (line != null) {
                    System.out.println(line);
                    line = br.readLine();
                }

            } catch (FileNotFoundException e) {
                System.out.println("File Not Found");
            } catch (IOException e) {
                System.out.println("File Could Not Be Read.");
            } finally {
                try {
                    fr.close();
                    br.close();
                } catch (IOException e) {
                    System.out.println("Flle could not be closed.");
                }
            }
        }
    }
