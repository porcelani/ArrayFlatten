package com.porcelani;

import org.junit.Test;

import static com.porcelani.Arrays.flatten;
import static org.junit.Assert.assertArrayEquals;

public class FlattenTest {


    private static final Integer[] EXPECT = {1, 2, 3, 4};

    @Test
    public void simpleArrayTest() {
        Object[] array = {1, 2, 3, 4};


        Integer[] flatten = flatten(array);


        assertArrayEquals(EXPECT, flatten);
    }

    @Test
    public void twoLevelArrayTest() {
        Integer[] int1 = {1};
        Integer[] int2 = {2};
        Integer[] int3 = {3};
        Integer[] int4 = {4};
        Object[] array = {int1, int2, int3, int4};


        Integer[] flatten = flatten(array);


        assertArrayEquals(EXPECT, flatten);
    }

    @Test
    public void threeLevelArrayTest() {
        Integer[] int3 = {3};
        Object[] level2 = {1, 2, int3};
        Object[] array = {level2, 4};


        Integer[] flatten = flatten(array);


        assertArrayEquals(EXPECT, flatten);
    }
}
