package com.example.alumnos.hndalvarogomez.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public static boolean isEmail(String email) {
        // Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$;");
        String regex = "^[_a-z0-9-]+(_a-z0-9-)*@[_a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches(); //true- es email   false- no es email
    }

}
