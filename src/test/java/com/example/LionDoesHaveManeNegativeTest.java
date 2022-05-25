package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class LionDoesHaveManeNegativeTest {
    private String sex = "что-то среднее";

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void whenExceptionThrownThenRuleIsApplied() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Используйте допустимые значения пола животного - самей или самка");
        new Lion(sex);
    }
}