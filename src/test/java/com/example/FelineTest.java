package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Animal animal;

    @Test
    public void eatMeatReturnsCorrectValue() throws Exception {
        //Arrange
        String animalKind = "Хищник";
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(animal.getFood(animalKind)).thenReturn(expectedFood);

        //Act
        List<String> actualFood = feline.eatMeat();

        //Assert
        assertEquals("eatMeat unit test failed!", expectedFood, actualFood);
    }

    @Test
    public void getFamilyReturnsCorrectValue() {
        //Arrange
        String expectedFamily = "Кошачьи";
        Feline feline = new Feline();

        //Act
        String actualFamily = feline.getFamily();

        //Assert
        assertEquals("getFamily unit test failed!", expectedFamily, actualFamily);
    }

    @Test
    public void getKittensStaticReturnsCorrectValue() {
        //Arrange
        int expectedKittens = 1;
        Feline feline = new Feline();

        //Act
        int actualKittens = feline.getKittens();

        //Assert
        assertEquals("getKittens() unit test failed!", expectedKittens, actualKittens);
    }

    @Test
    public void getKittensDynamicReturnsCorrectValue() {
        //Arrange
        int expectedKittens = 5;
        Feline feline = new Feline();

        //Act
        int actualKittens = feline.getKittens(5);

        //Assert
        assertEquals("getKittens(5) unit test failed!", expectedKittens, actualKittens);
    }
}
