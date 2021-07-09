import java.io.*;

public class Main {
    public static void main(String[] args) {
        runBackgroundCheck();
    }

        public static void runBackgroundCheck() {

            File file = new File("C:\\Users\\alymp\\OneDrive\\Documents\\File1.txt");
            File file1 = new File("C:\\Users\\alymp\\OneDrive\\Documents\\File2.txt");

            Thread t1 = new Thread(new RunnableThread(file));
            Thread t2 = new Thread(new RunnableThread(file1));

            t1.start();
            t2.start();

        }
    }





