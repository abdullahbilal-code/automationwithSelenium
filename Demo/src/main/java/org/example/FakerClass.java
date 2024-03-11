package org.example;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FakerClass {
    public static void main (String [] args){

        Faker javaFaker = new Faker();
        System.out.println(javaFaker.animal().name()); //printing random animal name
        System.out.println(javaFaker.address().city()); //printing random city name

        Faker fakerTR = Faker.instance(new Locale("tr-TR"));
        Faker fakerEN = Faker.instance(new Locale("US-en"));

        System.out.println(fakerTR.name().firstName());
        System.out.println(fakerEN.name().firstName());

        System.out.println("actual street address\t\t\t\t"+ javaFaker.address().streetAddress());
        System.out.println("street address with secondary\t\t"+ javaFaker.address().streetAddress(true));
        System.out.println("street address without secondary\t"+ javaFaker.address().streetAddress(false));
        System.out.println("Country address\t\t\t\t"+ javaFaker.address().country());

        //Number String
        System.out.println("Digits : "+javaFaker.numerify("###"));
        System.out.println("Digits with alphabets : "+javaFaker.numerify("#a#b#"));
        System.out.println("Long String of Digits : "+javaFaker.numerify("#### #### ####"));



        //Regexify method to print random input on base of given data
        System.out.println("Random : "+javaFaker.regexify("[abcdefghijklmnopqrstuvwxyz]"));
        System.out.println("Random : "+javaFaker.regexify("[a-fA-F0-9]"));
        System.out.println("Random : "+javaFaker.regexify("[^a-zA-Z]"));

        //Random Outputs
        System.out.println("Long Random Digit value:\t"+javaFaker.random().nextLong());
        System.out.println("Long Random Decimal value:\t"+javaFaker.random().nextDouble());
        System.out.println("Random Hexa value: "+javaFaker.random().hex());
        System.out.println("Random boolean value: "+javaFaker.random().nextBoolean());
        System.out.println("Random Integer Value upto 10:"+javaFaker.random().nextInt(10));
        System.out.println("Random Integer value between 45 to 90"+javaFaker.random().nextInt(45,90));



        // System.out.println("Random email"+javaFaker.regexify("[a-zA-Z]{.}[a-zA-Z]@nxb.com.pk"));
        //System.out.println("Random email: "+javaFaker.bothify("????##@nxb.com.pk"));
        checkEmail();


    }
    public static void checkEmail() {
        FakeValuesService fakeValuesService= new FakeValuesService (new Locale ("en-US"), new RandomService());
        String email= fakeValuesService.bothify("????##@nxb.com.pk");
        Matcher emailMatcher = Pattern.compile("\\w{4}\\d{2}@gmail.com").matcher(email);

    }
}
