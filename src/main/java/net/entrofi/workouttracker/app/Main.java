package net.entrofi.workouttracker.app;

import java.util.ArrayList;

/**
 * Created by comakh on 16/10/2015.
 */
public class Main {

    public static void main(String args[]){
        TestFinalList testFinalList = new TestFinalList();
        System.out.println("Test final list initial size: " + testFinalList.abc.size());
        ((ArrayList)testFinalList.nonFinal).add("d");
        System.out.println("Test final list size after modification: " + testFinalList.abc.size());

        boolean x = true;

        final String abc;
        if(x){
            abc = TestFinalList.getStringValue1();
        }else if (x && true) {
            abc = TestFinalList.getStringValue2();
        }

    }

}
