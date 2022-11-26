package com.example;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class LionParamTest {

    private final String gender;
    private final boolean expected;

    public LionParamTest(String gender, boolean expected){
        this.gender=gender;
        this.expected=expected;
    }


    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    Feline feline;

    @Parameterized.Parameters
    public static Object[][] getGender(){
        return new Object[][]{
                {"Самец", true},
               {"Самка", false}
        };
    }

 @Test
   public void getKittens() throws Exception {
   when(feline.getKittens()).thenReturn(1);
       Lion lion = new Lion(gender, feline);
      assertEquals(1, lion.getKittens());
   }

    @Test
    public void doesHaveMane() throws Exception {
        var lion = new Lion("Самец", feline);
        assertEquals(true, lion.doesHaveMane());
    }

    @Test
    public void getFood() throws Exception {

        when(feline.getFood("Хищник")).thenReturn(List.of("one", "two", "three"));
        var lion = new Lion(gender, feline);
        assertEquals(List.of("one", "two", "three"), lion.getFood());

    }
}
