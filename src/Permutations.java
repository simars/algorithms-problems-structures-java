import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Permutations and Subsets of a String
 * @author: Simar Paul Singh
 */
public class Permutations {


    public static void main (String... args) {
        String input = "ABC";
        List<String> permutations = permutations(input);
        System.out.println(permutations.size() + String.valueOf(permutations));

        List<String> subsets = subsets(input);

        System.out.println(subsets.size() + String.valueOf(subsets));
    }

    private static List<String> permute(char c, List<String> permutations) {
        if (permutations.isEmpty()) {
            return Arrays.asList(String.valueOf(c));
        }
        final List<String> newPermutations = new ArrayList<String>();
        for (final String permutation : permutations) {
            for (int index = 0; index <= permutation.length(); index++) {
                newPermutations.add(new StringBuilder(permutation).insert(index, c).toString());
            }
        }
        return newPermutations;
    }

    public static List<String> permutations(final String input) {

        List<String> permutations = new ArrayList<String>();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            {
                permutations = permute(chars[i], permutations);
            }
        }
       return permutations;
    }

    public  static List<String> subsets(final String input) {

        List<String> subsets = new ArrayList<String>();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            {
                subsets.addAll(permute(chars[i], subsets));
            }
        }
        return subsets;
    }


}
