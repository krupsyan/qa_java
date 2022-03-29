package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getSoundReturnsCorrectValue() {
        //Arrange
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";

        //Act
        String actualSound = cat.getSound();

        //Assert
        assertEquals("getSound unit test failed!", expectedSound, actualSound);
    }

    @Test
    public void getFoodReturnsCorrectValue() throws Exception {
        //Arrange
        Cat cat = new Cat(feline);
        List<String> expectedFood = List.of("Животные, Птицы, Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные, Птицы, Рыба"));

        //Act
        List<String> actualFood = cat.getFood();

        //Assert
        assertEquals("getFood unit test failed!", expectedFood, actualFood);
    }
}
