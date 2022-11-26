package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock Feline feline;

    @Test
    public void getSound() {
        var cat = new Cat(new Feline());
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFood() throws Exception {
        when(feline.eatMeat()).thenReturn(List.of("one", "two"));
        var cat = new Cat(feline);
        assertEquals(List.of("one", "two"), cat.getFood());
    }
}