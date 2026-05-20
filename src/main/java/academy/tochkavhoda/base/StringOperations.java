package academy.tochkavhoda.base;

import java.util.StringJoiner;

public class StringOperations {
    public static int getSummaryLength(String[] strings) {
        int x = 0;
        for (int i = 0; i < strings.length; i++) {
            x += strings[i].length();
        }
        return x;
    }

    public static String getFirstAndLastLetterString(String string) {
        String str = "" + string.charAt(0) + string.charAt(string.length()-1);
        return str;
    }

    public static boolean isSameCharAtPosition(String string1, String string2, int index) {
        if (string1.charAt(index) == string2.charAt(index))
            return true;
        else
            return false;
    }

    public static boolean isSameFirstCharPosition(String string1, String string2, char character) {
        if (string1.indexOf(character) == string2.indexOf(character))
            return true;
        else
            return false;
    }

    public static boolean isSameLastCharPosition(String string1, String string2, char character) {
        if (string1.lastIndexOf(character) == string2.lastIndexOf(character))
            return true;
        else
            return false;
    }

    public static boolean isSameFirstStringPosition(String string1, String string2, String str) {
        if (string1.indexOf(str) == string2.indexOf(str))
            return true;
        else
            return false;
    }

    public static boolean isSameLastStringPosition(String string1, String string2, String str) {
        if (string1.lastIndexOf(str) == string2.lastIndexOf(str))
            return true;
        else
            return false;
    }

    public static boolean isEqual(String string1, String string2) {
        return string1.equals(string2);
    }

    public static boolean isEqualIgnoreCase(String string1, String string2) {
        return string1.equalsIgnoreCase(string2);
    }

    public static boolean isLess(String string1, String string2) {
        return string1.compareTo(string2) < 0;
    }

    public static boolean isLessIgnoreCase(String string1, String string2) {
        return string1.compareToIgnoreCase(string2) < 0;
    }

    public static String concat(String string1, String string2) {
        return string1 + string2;
    }

    public static boolean isSamePrefix(String string1, String string2, String prefix) {
        return string1.startsWith(prefix) && string2.startsWith(prefix);
    }

    public static boolean isSameSuffix(String string1, String string2, String suffix) {
        return string1.endsWith(suffix) && string2.endsWith(suffix);
    }

    public static String getCommonPrefix(String string1, String string2) {
        String str = "";
        for (int i = 0; i < Math.min(string1.length(), string2.length()); i++) {
            if (string1.charAt(i) == string2.charAt(i))
                str += string1.charAt(i);
            else break;
        }
        return str;
    }

    public static String reverse(String string) {
        String word = "";
        for (int i = string.length()-1; i>=0; i--) {
            word += string.charAt(i);
        }
        return word;
    }

    public static boolean isPalindrome(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != string.charAt(string.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeIgnoreCase(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.toLowerCase().charAt(i) != string.toLowerCase().charAt(string.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static <ini> String getLongestPalindromeIgnoreCase(String[] strings) {
        String palindrome = "";
        for (int i = 0; i < strings.length; i++) {
            boolean isPalindrome = true;
            for (int j = 0; j < strings[i].length(); j++) {
                if (strings[i].toLowerCase().charAt(j) != strings[i].toLowerCase().charAt(strings[i].length() - 1 - j)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome == true && strings[i].length() > palindrome.length()) {
                palindrome = strings[i];
            }
        }
        return palindrome;
    }

    public static boolean hasSameSubstring(String string1, String string2, int index, int length) {
        if (index + length > string1.length() || index + length > string2.length()) {
            return false;
        }

        String sub1 = string1.substring(index, index + length);
        String sub2 = string2.substring(index, index + length);
        return sub1.equals(sub2);
    }

    public static boolean isEqualAfterReplaceCharacters(String string1, char replaceInStr1, char replaceByInStr1,
                                                        String string2, char replaceInStr2, char replaceByInStr2) {
        String res1 = string1.replace(replaceInStr1, replaceByInStr1);
        String res2 = string2.replace(replaceInStr2, replaceByInStr2);
        return res1.equals(res2);
    }

    public static boolean isEqualAfterReplaceStrings(String string1, String replaceInStr1, String replaceByInStr1,
                                                     String string2, String replaceInStr2, String replaceByInStr2) {
        String res1 = string1.replace(replaceInStr1, replaceByInStr1);
        String res2 = string2.replace(replaceInStr2, replaceByInStr2);
        return res1.equals(res2);
    }

    public static boolean isPalindromeAfterRemovingSpacesIgnoreCase(String string) {
        String result = string.replace(" ", "").toLowerCase();
        String reverseResult = new StringBuilder(result).reverse().toString();
        return result.equals(reverseResult);
    }

    public static boolean isEqualAfterTrimming(String string1, String string2) {
        return string1.trim().equals(string2.trim());
    }

    public static String makeCsvStringFromInts(int[] array) {
        if (array == null || array.length == 0)
            return "";

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1)
                result.append(",");
        }

        return result.toString();
    }

    public static String makeCsvStringFromDoubles(double[] array) {
        StringJoiner joiner = new StringJoiner(",");
        for (double n : array) {
            joiner.add(String.format("%.2f", n));
        }
        return joiner.toString();
    }

    public static StringBuilder makeCsvStringBuilderFromInts(int[] array) {
        return new StringBuilder(makeCsvStringFromInts(array));
    }

    public static StringBuilder makeCsvStringBuilderFromDoubles(double[] array) {
        return new StringBuilder(makeCsvStringFromDoubles(array));
    }

    public static StringBuilder removeCharacters(String string, int[] positions) {
        StringBuilder answer = new StringBuilder(string);
        for (int i = positions.length - 1; i >= 0; i--) {
            answer.deleteCharAt(positions[i]);
        }
        return answer;
    }

    public static StringBuilder insertCharacters(String string, int[] positions, char[] characters) {
        StringBuilder answer = new StringBuilder(string);
        int offset = 0;
        for (int i = 0; i < positions.length; i++) {
            answer.insert(positions[i] + offset, characters[i]);
            offset++;
        }
        return answer;
    }
}
