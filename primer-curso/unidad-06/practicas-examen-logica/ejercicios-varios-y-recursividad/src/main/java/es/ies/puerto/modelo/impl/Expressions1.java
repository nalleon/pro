package es.ies.puerto.modelo.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expressions1 {

    public static void main(String[] args) {
        String exp = "{ [ a * ( c + d ) ] - 5 }";
        String exp2 = "{ a * ( c + d ) ] - 5 }";
        System.out.println(balancedExpression(exp));
        System.out.println(balancedExpression(exp2));
    }
    public static boolean balancedExpression(String str){
        Pattern pattern1 =
                Pattern.compile(".*\\(.*\\).*|.*\\[.*\\].*|.*\\{.*\\}" );
        Matcher matcher = pattern1.matcher(str);
        return matcher.matches();

        //Map<Character, Character> regexMap = new HashMap<>();
        //regexMap.put('(', ')');
        //regexMap.put('[', ']');
        //regexMap.put('{', '}');

    }
}
