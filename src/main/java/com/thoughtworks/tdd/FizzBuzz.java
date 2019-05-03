package com.thoughtworks.tdd;

public class FizzBuzz {

    public FizzBuzz(){

    }

    public String fizzBuzz(int number){
        String result = "";

        if(number%3 == 0 || number%5 == 0 || number%7 == 0){
            if(number%3 == 0){
                result += "Fizz";
            }
            if(number%5 == 0){
                result += "Buzz";
            }
            if(number%7 == 0){
                result += "Whizz";
            }
        }
        else {
            result += number;
        }
        return result;
    }

    public void getResult(){
        FizzBuzz object = new FizzBuzz();
        for(int i = 0;i < 120;i++){
            String result = object.fizzBuzz(i+1);
            System.out.println(result);
        }
    }

}
