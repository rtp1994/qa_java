package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class FelineTest {

    List<String> food = List.of("Животные", "Птицы", "Рыба");
    @Test
    public void eatMeat() throws Exception {
        var feline = new Feline();
        Assert.assertTrue(Objects.equals(feline.eatMeat(), food));
    }

    @Test
    public void getFamily() {
        var feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

   int kittensCount = 1;
   @Test
  public void getKittens() {
      var feline = new Feline();
        Assert.assertTrue(Objects.equals(feline.getKittens(), kittensCount));

  }


}