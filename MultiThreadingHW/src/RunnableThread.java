import java.io.File;

    public class RunnableThread implements Runnable {
        private File myFile;

        public RunnableThread(File theFile) {
            myFile = theFile;
        }

        @Override
        public void run() {
            FilePrinter.printFile(myFile);
        }



        }

