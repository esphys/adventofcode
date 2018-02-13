package com.esphys.adventofcode;

import org.apache.commons.io.IOUtils;

import java.io.IOException;

/**
 * Created by Evan_2 on 2018-02-12.
 */
public class InputReader {

    public String getInput(String filename){
        String result = "";
        ClassLoader classloader = getClass().getClassLoader();
        try {
            result = IOUtils.toString(classloader.getResourceAsStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
