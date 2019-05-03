package com.thoughtworks.tdd;

import com.thoughtworks.tdd.Dependency;
import com.thoughtworks.tdd.HelloWorld;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FizzBuzzTest {

    private FizzBuzz testFizzBuzz;

    @BeforeEach
    public void initFizzBuzz(){
        testFizzBuzz = new FizzBuzz();
    }

    @Test
    public void get_number_when_the_number_cannot_div_by_3or5or7(){

        assertThat(testFizzBuzz.fizzBuzz(1),is("1"));
        assertThat(testFizzBuzz.fizzBuzz(2),is("2"));

    }

    @Test
    public void get_Fizz_when_the_number_can_div_by_3(){

        assertThat(testFizzBuzz.fizzBuzz(3),is("Fizz"));

    }

    @Test
    public void get_Buzz_when_the_number_can_div_by_5(){

        assertThat(testFizzBuzz.fizzBuzz(5),is("Buzz"));

    }

    @Test
    public void get_Whizz_when_the_number_can_div_by_7(){

        assertThat(testFizzBuzz.fizzBuzz(7),is("Whizz"));

    }

    @Test
    public void get_FizzBuzz_when_the_number_can_div_by_3and5(){

        assertThat(testFizzBuzz.fizzBuzz(15),is("FizzBuzz"));

    }

    @Test
    public void get_FizzWhizz_when_then_number_can_div_by_3and_7(){

        assertThat(testFizzBuzz.fizzBuzz(21),is("FizzWhizz"));

    }

    @Test
    public void get_BuzzWhizz_when_the_number_can_div_by_5and7(){

        assertThat(testFizzBuzz.fizzBuzz(35),is("BuzzWhizz"));

    }

    @Test
    public void get_FizzBuzzWhizz_when_the_number_can_div_by_3and5and7(){

        assertThat(testFizzBuzz.fizzBuzz(105),is("FizzBuzzWhizz"));

    }
}
