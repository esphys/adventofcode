package com.esphys.adventofcode;

import java.io.IOException;
import org.apache.commons.io.IOUtils;

/**
 * Created by Evan_2 on 2018-02-11.
 */
public class DayOne {

    static String input = "";
    static int length;

    public DayOne(){
        readInput();
        length = input.length()-1;
    }

    public static void main(String[] args){
        DayOne dayOne = new DayOne();

        System.out.println("Day One: Part 1 Result: " + dayOne.checksum(1));
        System.out.println("Day One: Part 2 Result: " + dayOne.checksum(dayOne.input.length()/2));
    }

    private boolean compareNext(int index, int offset) {
        int nextPosition = index + offset;
        if (index + offset > length) nextPosition = nextPosition%input.length();
        return input.charAt(index) == input.charAt(nextPosition);
    }

    private int checksum(int offset){
        int result = 0;
        for (int i = 0; i <= length; i++) {
            if (compareNext(i, offset))
                result += Character.getNumericValue(input.charAt(i));
        }
        return result;
    }

    private void readInput() {
        InputReader ir = new InputReader();
        input = ir.getInput("dayone.txt");
    }
}
