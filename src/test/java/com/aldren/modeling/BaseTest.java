package com.aldren.modeling;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BaseTest {

    protected final ByteArrayOutputStream content = new ByteArrayOutputStream();
    protected final PrintStream out = System.out;

    @Before
    public void setup() { System.setOut(new PrintStream(content)); }

    @After
    public void cleanup() { System.setOut(out); }

}
