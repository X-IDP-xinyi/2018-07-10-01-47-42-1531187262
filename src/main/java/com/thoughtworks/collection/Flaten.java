package com.thoughtworks.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flaten {

    Integer[][] array;

    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        return Stream.of(array).flatMap(Stream::of).collect(Collectors.toList());

    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> result = Arrays.stream(array).flatMap(Stream::of).collect(Collectors.toList());
        return result.stream().distinct().collect(Collectors.toList());

    }
}
