package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionDoesHaveManePositiveTest {
    private final String sex;
    private final boolean expectedHasMane;

    public LionDoesHaveManePositiveTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] getManeBySex() {
        return new Object[][]{
                //Sex       //Result
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void lionHasManeBySexIsCorrect() throws Exception {
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane();
        assertEquals("getManeBySex unit test failed!", expectedHasMane, actual);
    }
}
