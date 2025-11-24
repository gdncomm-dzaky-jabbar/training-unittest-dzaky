package com.gdn.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringHelperTest {

    @Test
    public void successConvert() {
        List<String> strings = new ArrayList<String>();
        strings.add("aa");
        strings.add("bb");
        strings.add("cc");
        strings.add(null);

        List<String> result = StringHelper.toUpperCase(strings);
        Assertions.assertEquals(3, result.size());

        for(int i = 0; i < result.size(); i++) {
            assertEquals(strings.get(i).toUpperCase(), result.get(i));
        }
    }
}