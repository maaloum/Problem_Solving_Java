package Challenges;

import java.util.HashMap;


public class LengthOfLongestSubstring {

    public static void main(String[] args) {
       System.out.println(lengthOfLongestSubstring("pwwkew"));

        // create a hashmap
//        HashMap<String, Integer> languages = new HashMap<>();
//
//        // add elements to hashmap
//        languages.put("Java", 8);
//        languages.put("Php", 8);
//        languages.put("JavaScript", 1);
//        languages.put("Python", 3);
//        System.out.println("HashMap: " + languages);
    }


//    Brute Force
//    public static int lengthOfLongestSubstring(String s) {
//        int lengthOfLongestSubstring = 0;
////        check if all the element are distinct
//        for (int i = 0; i < s.length(); i++) {
//            StringBuilder currentSubString = new StringBuilder();
//            for (int j = i; j < s.length(); j++) {
//                if (currentSubString.indexOf(String.valueOf(s.charAt(j))) != -1) {
//                    break;
//                }
//                currentSubString.append(s.charAt(j));
//                lengthOfLongestSubstring = Math.max(lengthOfLongestSubstring, currentSubString.length());
//            }
//        }
//
//
//        return lengthOfLongestSubstring;
//    }


//    Using HashMap

    public static int lengthOfLongestSubstring(String s) {
//        int lengthOfLongestSubstring =0;
//        HashMap<Character, Integer> subString = new HashMap<>();
//
//        for (int i = 0, j =0; i < s.length(); i++) {
//            if(subString.containsKey(s.charAt(i))  && subString.get(s.charAt(i)) >= j){
//                j= subString.get(s.charAt(i)) + 1;
//            }
//            lengthOfLongestSubstring = Math.max(lengthOfLongestSubstring, i - j +1);
//            subString.put(s.charAt(i), i);
//        }
//        System.out.println(subString);
//        return lengthOfLongestSubstring;

        int maxLength = 0;
        String currentSubstring = "";

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (currentSubstring.contains(String.valueOf(c)))
            {
                maxLength = Math.max(maxLength , currentSubstring.length());
                int index = currentSubstring.indexOf(c);
                System.out.println("index " + index);
                currentSubstring = currentSubstring.substring(index+1);
                System.out.println("sub " + currentSubstring);
            }

            currentSubstring += c;

        }

        maxLength = Math.max(maxLength , currentSubstring.length());


        return maxLength;


    }


}
