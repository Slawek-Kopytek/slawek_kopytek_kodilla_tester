package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    private static Stream<Arguments> providePersonToCalculateBMI(){
        return Stream.of(
                Arguments.of("Very severely underweight", new Person(1.77, 40)),
                Arguments.of("Severely underweight", new Person(1.77, 50)),
                Arguments.of("Underweight", new Person(1.77, 55)),
                Arguments.of("Normal (healthy weight)", new Person(1.77, 70)),
                Arguments.of("Overweight", new Person(1.77, 85)),
                Arguments.of("Obese Class I (Moderately obese)", new Person(1.77, 100)),
                Arguments.of("Obese Class II (Severely obese)", new Person(1.77, 120)),
                Arguments.of("Obese Class III (Very severely obese)", new Person(1.77, 135)),
                Arguments.of("Obese Class IV (Morbidly Obese)", new Person(1.77, 150)),
                Arguments.of("Obese Class V (Super Obese)", new Person(1.77, 180)),
                Arguments.of("Obese Class VI (Hyper Obese)", new Person(1.77, 240))
        );
    }
}
