package lt.vu.mif.stud;

import java.io.*;
import java.security.Timestamp;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        if (args[0].equals("-h")) {
            StringBuffer inputString = new StringBuffer();
            for (int i = 1; i < args.length; i++) {
                inputString.append(args[i]);
            }
            System.out.println(inputString);
            long start = new Date().getTime();
            String hash = Hashing.hash(inputString.toString());
            long end = new Date().getTime();
            System.out.println("Time: " + (end-start) + " msec");
            System.out.println(hash);
        } else if (args[0].equals("-f")) {
            for (int i = 1; i < args.length; i++) {
                System.out.println("Hash from file " + args[i] + ":");
                String fileContents = readFromInputStream(args[i]);
                String hash = Hashing.hash(fileContents);
                System.out.println(hash);
            }
        } else {
            System.out.println("Please provide a flag. -h for hand input, or -f for file input");
        }
    }

    private static String readFromInputStream(String fileName) {
        StringBuilder resultStringBuilder = new StringBuilder();
        try {
            File file = new File(fileName);
            InputStream inputStream = new FileInputStream(file);
            BufferedReader br
                    = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultStringBuilder.toString();
    }
}

//-f files-for-testing/1-Only-one-char-difference/test.txt
//files-for-testing/1-Only-one-char-difference/test2.txt
//files-for-testing/2-1000-char-files/test.txt
//files-for-testing/2-1000-char-files/test2.txt
//files-for-testing/3-1000-char-files-1-char-difference/test.txt
//files-for-testing/3-1000-char-files-1-char-difference/test2.txt
//files-for-testing/4-Empty-file/test.txt