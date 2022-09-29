package lt.vu.mif.stud;

import java.math.BigInteger;

public class Hashing {
    private static int OUTPUT_LENGTH = 64;
    public static String INPUT_PADDING = "Utmileo,porta3in5quam6sed7hendrerit24ultrices1neque.Nam4vestib.A";

    public static String hash(String inputString) {
        String fixedString = Hashing.fixLengthOfInput(inputString);
        String conversionIteration1 = Hashing.convertToHex(fixedString); //convert once
        String conversionIteration2 = Hashing.convertToHex(conversionIteration1); //convert second time
        String conversionIteration3 = Hashing.convertToHex(conversionIteration2); //convert third time
        BigInteger result = new BigInteger(conversionIteration3).mod(new BigInteger(conversionIteration2)); //do modulo arithmetics for avalanche effect
        String resultString = result.toString();
        return resultString.substring(resultString.length() - 64); //return last 64 digits
    }

    static String fixLengthOfInput(String inputString) {
        int inputLength = inputString.length();
        if (inputLength < OUTPUT_LENGTH) {
            return (inputString + INPUT_PADDING).substring(0, 64); //adds padding if the string is very short
        }
        return inputString;
    }

    static String convertToHex(String inputString) {
        char[] charArray = inputString.toCharArray();
        String resultString = "";
        for (int i = 0; i < charArray.length; i++) {
            resultString = resultString + Integer.toHexString(charArray[i]); //converts characters to ASCII hex
        }
        return resultString;
    }
}
