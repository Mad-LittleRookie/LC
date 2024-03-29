//
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class Solution17
    class Solution {
        private  List<String> combinations = new ArrayList<>();
        private Map<Character, String> letters = Map.of(
                '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
                '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz"
        );
        private String phoneDigits;

        public List<String> letterCombinations(String digits) {
            //if the input is empty,and they can return an empty answer array
            if (digits.length() == 0) {
                return combinations;
            }
            //Initiate backtracking with an empty path and starting index of 0
            phoneDigits = digits;
            backtrack(0, new StringBuilder());
            return combinations;

            private void backtrack(int index, StringBuilder path){
                //If the path is the same length as digites ,we have a complete combination
                if(path.length() == phoneDigits.length()){
                    combinations.add(path.toString());
                    return;
                }

                //Get the letters that the current digit maps to
                String possibleLetters = letters.get(phoneDigits.charAt(index));
                for (char letter: possibleLetters.toCharArray()){
                    //Add the letter to out current path
                    path.append(letter);
                    backtrack(index + 1, path);
                    path.deleteCharAt(path.length() - 1);
                }
            }
        }
    }

    private void backtrack(int i, StringBuilder stringBuilder) {
    }
}
//            public String[] combine (String digits){
//
//            }

//        public List<String> letterCombinations(String digits) {
//            char[] input = digits.toCharArray();
//            int n= input.length-1;
//            String[] answer;
//            for(char i: input){
//
//            }
//        }
//    @Test
//    public void test1(){
//        Solution test1 = new Solution();
//
//    }

