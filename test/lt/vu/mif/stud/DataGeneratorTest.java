package lt.vu.mif.stud;

import org.junit.Test;

import java.util.ArrayList;

public class DataGeneratorTest {

    @Test
    public void generateSimilarStringPairs_test() {
        DataGenerator.generateSimilarStringPairs();
    }

    @Test
    public void checkForDuplicates_noDuplicates() {
        ArrayList<String> convertedHashes = new ArrayList<String>();
        convertedHashes.add("aaaaaa");
        convertedHashes.add("aaaaab");
        convertedHashes.add("aaaaac");
        convertedHashes.add("aaaaad");
        DataGenerator.checkForDuplicates(convertedHashes);
    }

    @Test
    public void checkForDuplicates_withDuplicates() {
        ArrayList<String> convertedHashes = new ArrayList<String>();
        convertedHashes.add("aaaaaa");
        convertedHashes.add("aaaaab");
        convertedHashes.add("aaaaac");
        convertedHashes.add("aaaaaa");
        DataGenerator.checkForDuplicates(convertedHashes);
    }
}