package com.esphys.adventofcode;

import junit.framework.TestCase;

/**
 * Created by Evan_2 on 2018-02-12.
 */
public class testInputReader extends TestCase{
    public void testGetInput(){
        InputReader ir = new InputReader();
        String result = ir.getInput("testinput.txt");
        assertTrue(result.equals("Lorem ipsum dolar sit amet."));
    }
}
