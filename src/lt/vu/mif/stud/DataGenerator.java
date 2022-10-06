package lt.vu.mif.stud;

import java.util.ArrayList;
import java.util.Iterator;

public class DataGenerator {

    public static void generateSimilarStringPairs() {
        String initialString = "aaaaa";
        int counter = 0;
        char[] chars = initialString.toCharArray();
        for (int i2 = 1; i2 < 27; i2++) {
            chars[2] = 'a';
            for (int i3 = 1; i3 < 27; i3++) {
                chars[3] = 'a';
                for (int i4 = 1; i4 < 27; i4++) {
                    chars[4] = 'a';
                    for (int i5 = 1; i5 < 27; i5++) {
                        System.out.print(chars);
                        System.out.print(" ");
                        chars[4]++;
                        counter++;
                    }
                    chars[3]++;
                }
                chars[2]++;
            }
            chars[1]++;
        }
        System.out.println(counter);
    }

    static String checkForDuplicates(ArrayList<String> strings) {
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String compareableString = iterator.next();
            int i = 0;
            for (String str : strings) {
                if (compareableString.equals(str)) {
                    i++;
                }
            }
            if (i > 1) {
                System.out.println("Duplicate is: " + compareableString);
            }
        }
        return "";
    }
}
