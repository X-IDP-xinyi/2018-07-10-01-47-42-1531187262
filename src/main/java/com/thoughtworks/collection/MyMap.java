package com.thoughtworks.collection;

import java.util.*;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private final String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private final List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(value -> value * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            newList.add(letterList.get(i));
        }
        return newList;
    }

    public List<String> mapLetters() {
        ArrayList<String> lettersList = new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();
        lettersList.addAll(Arrays.asList(letters));
        lettersList.addAll(Arrays.asList(letters));
        lettersList.addAll(Arrays.asList(letters));
        for (Integer n : array) {
            String temp;
            if (n<26){
                temp = lettersList.get(n-1);
                newList.add(temp);
            }else if(n%26 ==0){
                temp = lettersList.get((int) Math.ceil(n/26.0)-2) + lettersList.get(n-27);
                newList.add(temp);
            }else{
                temp = lettersList.get((int) Math.ceil(n/26.0)-1) + lettersList.get(n-27);
                newList.add(temp);
            }
        }
        return newList;
    }

    public List<Integer> sortFromBig() {
        array.sort(Comparator.reverseOrder());
        return array;
    }

    public List<Integer> sortFromSmall() {
        array.sort(Comparator.naturalOrder());
        return array;
    }
}
