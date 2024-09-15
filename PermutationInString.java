import java.util.HashSet;
import java.util.Set;

public class PermutationInString {
    public static void main(String[] args) {
        String str = "ABC";
        Set<String> permu = getPermutations(str);
        System.out.println(permu);
    }


        public static Set<String> getPermutations (String str){
            Set<String> permutations = new HashSet();
            if (str == null) {
                return null;
            } else if (str.length() == 0) {
                permutations.add("");
                return permutations;
            }

            char first = str.charAt(0);
            String remaining = str.substring(1);

            Set<String> words = getPermutations(remaining);

            for (String perm : words) {
                for (int i = 0; i <= perm.length(); i++) {
                    permutations.add(perm.substring(0, i) + first + perm.substring(i));
                }
            }
            return permutations;
        }
    }

