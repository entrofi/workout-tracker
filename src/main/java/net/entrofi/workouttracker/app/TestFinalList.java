package net.entrofi.workouttracker.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by comakh on 16/10/2015.
 */
public class TestFinalList {

    static final String[] initial = {"a", "b", "c"};
    final List<String> abc = new ArrayList<>(Arrays.asList(initial));

    List<String> nonFinal = abc;

    public static String getStringValue1(){
        return "value 1";
    }

    public static String getStringValue2(){
        return "value 2";
    }

}


