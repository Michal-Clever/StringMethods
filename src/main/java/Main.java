import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        //Trim
        String strTrim = "Java";
        System.out.println(strTrim);
        String actualValueTrim = strTrim.trim();
        System.out.println(actualValueTrim);

        //ToUpperCase
        String strToUpperCase = "strToUpperCase";
        System.out.println(strToUpperCase);
        String actualValueToUpperCase = strToUpperCase.toUpperCase();
        System.out.println(actualValueToUpperCase);
        String actualValueToLowerCase = strToUpperCase.toLowerCase();
        System.out.println(actualValueToLowerCase);

        //Empty
        String strNotEmpty = "Java";
        String strEmpty = "";
        //System.out.println(strEmpty.isEmpty());

        //Lenght
        String strLenght = "Lenght";
        int actualValueLenght = strLenght.length();
        System.out.println(actualValueLenght);
        char actualValueCharAt = strLenght.charAt(1);
        System.out.println(actualValueCharAt);

        //ToCharArray
        char[] actualValueToCharAt = strLenght.toCharArray();

        //Substring
        String strSubstring = "Substring";
        String actualValueSubstrin = strSubstring.substring(1, 6);
        System.out.println(actualValueSubstrin);

        //Split
        String strSplit = "Jan Kowalski";
        System.out.println(strSplit.length());
        String[] actualValueStrSplit = strSplit.split("", 12);
        for (String s : actualValueStrSplit) {
            System.out.print("\"" + s + "\"" + " ");
        }
        System.out.println();
        System.out.println("Drugi przykład Split : ");
        String[] actualValueStrSplitSecond = strSplit.split(" "); //dzieli tam gdzie spacja
        for (String s : actualValueStrSplitSecond) {
            System.out.print(s.charAt(0));
        }
        System.out.println();

        //Replace
        System.out.println("Replace");
        String strReplace = "Replace 88";
        String strReplaceFirst = strReplace.replace("a", "A");
        System.out.println(strReplaceFirst);
        String strReplaceSecond = strReplace.replace("pl", "PL");
        System.out.println(strReplaceSecond);
        String strReplaceThird = strReplace.replaceFirst("e", "E");
        System.out.println(strReplaceThird);
        String strReplaceFourth = strReplace.replaceAll("ep", "EP");
        System.out.println(strReplaceFourth);
        String strReplaceFifth = strReplace.replaceAll("[0-9]", "X");
        System.out.println(strReplaceFifth);

        //Matches
        String strMatches = "Matches 9";
        System.out.println(strMatches.matches("Matches 9"));
        System.out.println(strMatches.matches("Matches [0-9]"));
        System.out.println(strMatches.matches("M(.*)"));
        System.out.println(strMatches.matches("M(.?)t[a-z]hes (.*)"));

        //Index Of
        String strIndexOf = "Java 8";
        int strIndexOfFirst = strIndexOf.indexOf("a");
        System.out.println(strIndexOfFirst);
        int strIndexOfSecond = strIndexOf.lastIndexOf("a");
        System.out.println(strIndexOfSecond);

        //Equals
        String strEquals = "Java 8";
        System.out.println(strEquals.equals("Java 8"));
        System.out.println(strEquals.equalsIgnoreCase("JAVA 8"));

        //Concat
        String strConcat = "Java";
        String strConcatFirst = strConcat.concat(" ").concat("8");
        System.out.println(strConcatFirst);

        //StartsWith
        String strStartsWith = "Java 8";
        System.out.println(strStartsWith.startsWith("Ja"));
        System.out.println(strStartsWith.startsWith("ava", 1));

        //EndsWith
        String strEndsWith = "Java 8";
        System.out.println(strEndsWith.endsWith("8"));

        //Contains
        String strContains = " Java 8";
        System.out.println(strContains.contains("a 8"));

        //CompareTo
        String strCompareToFirst = "aaa";
        String strCompareToSecond = "bbb";
        String strCompareToThird = "aaa";
        String strCompareToFourth = "AAA";
        System.out.println(strCompareToFirst.compareTo(strCompareToSecond));
        System.out.println(strCompareToSecond.compareTo(strCompareToFirst));
        System.out.println(strCompareToFirst.compareTo(strCompareToThird));
        System.out.println(strCompareToFirst.compareToIgnoreCase(strCompareToFourth));

        //GetBytes
        String strGetBytes = "Java";
        byte[] actualValueGetBytes = strGetBytes.getBytes();

    }
}



