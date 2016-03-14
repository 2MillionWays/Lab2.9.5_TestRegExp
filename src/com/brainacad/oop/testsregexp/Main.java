package com.brainacad.oop.testsregexp;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"VOVA","Ivan","R2d2","ZX","Anna","12345","ToAd","TomCat"," "};

        for(String arrayElement : arr){
            if(checkPersonWithRegExp(arrayElement) == true){
                System.out.println(arrayElement);
            }
        }
    }
    public static boolean checkPersonWithRegExp(String userNameString){

        String upperCase = "[A-Z]+\\D[a-z]+";   //you can just use [A-Z][a-z]+

        Pattern pattern = Pattern.compile(upperCase);
        Matcher matcher = pattern.matcher(userNameString);
        boolean matches = matcher.matches();

        return matches;
    }
}
