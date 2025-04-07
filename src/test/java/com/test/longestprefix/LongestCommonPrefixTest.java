package com.test.longestprefix;

import com.test.popular.PopularDetector;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    @DisplayName("should return valid prefix")
    void shouldprovideprefixfl(){
        List<String> input = Arrays.asList("flower","flow","flight");
        assertEquals("fl", longestCommonPrefix.findPrefix(input));
    }

    @Test
    @DisplayName("should return valid prefix")
    void shouldprovideprefix(){
        List<String> input = Arrays.asList("dog","racecar","car");
        assertEquals("", longestCommonPrefix.findPrefix(input));
    }

    @Test
    @DisplayName("should return valid prefix")
    void shouldprovideprefixte(){
        List<String> input = Arrays.asList("0","1",null,"temp", "tera", "tertiary");
        assertEquals("te", longestCommonPrefix.findPrefix(input));
    }
}
