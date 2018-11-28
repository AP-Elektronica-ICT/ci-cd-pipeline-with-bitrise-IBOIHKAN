package com.example.ihkan.mytestapplication;

import org.junit.Test;

import project.testcompany.com.mytestapplication.Utils;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, Utils.addNumbers( 2 , 2));
    }

    @Test
    public void add_twodigits_isCorrect() {
        assertEquals(44, Utils.addNumbers( 22 , 22));
    }

    @Test
    public void add_big_isCorrect() {
        assertEquals(4444, Utils.addNumbers( 2222 , 2222));
    }

}