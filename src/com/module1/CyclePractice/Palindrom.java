package com.module1.CyclePractice;

import java.util.Locale;

public class Palindrom {
    public static String prepareString(String str){
        str = str.toLowerCase(Locale.ROOT).replaceAll("[^a-zа-я]","");
        return str;
    }

    public static boolean isPalindrome1(String str){
        str = prepareString(str);
        String reversed = "";
        for (int i = 0; i < str.length(); i++) {
            reversed += str.charAt(str.length() -1 - i);
        }
        return str.equals(reversed);
    }

    public static boolean isPalindrome2(String str){
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();
        return str.equals(reversed);
    }

    public static boolean isPalindrome3(String str){
        for (int i = 0; i < str.length() / 2 ; i++) {
            if( str.charAt(i) != str.charAt(str.length()-1 -i) ){
                return  false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String stringToTestPalindrome1 = "Лег на храм, и дивен и невидим архангел";
        String stringToTestPalindrome2 = "Искать такси";
        String stringToTestPalindrome3 = "Искать таксиБ"; //ошибка
        System.out.println(isPalindrome1(stringToTestPalindrome1));
        System.out.println(isPalindrome1(stringToTestPalindrome2));
        System.out.println(isPalindrome1(stringToTestPalindrome3));

    }
}
