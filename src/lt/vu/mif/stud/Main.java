package lt.vu.mif.stud;

import java.io.*;
import java.util.ArrayList;
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
            System.out.println("Time: " + (end - start) + " msec");
            System.out.println(hash);
        } else if (args[0].equals("-hs")) { //hash strings separately
            long start = new Date().getTime();
            ArrayList<String> convertedHashes = new ArrayList<>();
            int numberOfStrings = 0;
            for (int i = 1; i < args.length; i++) {
                String[] strings = readInputStreamSeparateWords(args[i]);
                for (String string : strings) {
                    String hash = Hashing.hash(string);
                    convertedHashes.add(hash);
                }
                numberOfStrings = strings.length;
            }
            long end = new Date().getTime();
            System.out.println("Number of strings in file: " + numberOfStrings);
            System.out.println("Time: " + (end - start) + " msec");
            System.out.println("Checking for duplicates");
            String s = DataGenerator.checkForDuplicates(convertedHashes);
            System.out.println("finished");
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
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultStringBuilder.toString();
    }

    private static String[] readInputStreamSeparateWords(String fileName) {
        return readFromInputStream(fileName).split(" ");
    }
}