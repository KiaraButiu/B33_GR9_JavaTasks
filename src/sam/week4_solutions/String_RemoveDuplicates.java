package sam.week4_solutions;

import java.util.Set;
import java.util.TreeSet;

public class String_RemoveDuplicates {
     /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static void main(String[] args) {
        String removeDup = "AAABBBCCC";

        Set<String> removeDupSet = new TreeSet<>();

        for (String eachSymbol : removeDup.split("")) {
            removeDupSet.add(eachSymbol);
        }
        StringBuilder newSequence = new StringBuilder();

        for (String eachSymbol : removeDupSet) {
            newSequence.append(eachSymbol);
        }

        System.out.println(newSequence);
    }
}
