package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> newList = new ArrayList<>();
        if (left < right) {
            for (int i = left; i < right + 1; i++) {
                newList.add(i);
            }
        } else {
            for (int i = left; i > right - 1; i--) {
                newList.add(i);
            }
        }
        return newList;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> newList = new ArrayList<>();
        if (left < right) {
            for (int i = left; i < right + 1; i++) {
                if (i % 2 == 0) {
                    newList.add(i);
                }
            }
        } else {
            for (int i = left; i > right - 1; i--) {
                if (i % 2 == 0) {
                    newList.add(i);
                }
            }
        }
        return newList;
    }

    public List<Integer> popEvenElements(int[] array) {
        List<Integer> newList = new ArrayList<>();
        for (int i : array) {
            if (i % 2 == 0) {
                newList.add(i);
            }
        }
        return newList;
    }

    public int popLastElement(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> newList = new ArrayList<>();
        for (int first : firstArray) {
            for (int second : secondArray) {
                if (first == second) {
                    newList.add(first);
                }
            }
        }
        return newList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> newList = new ArrayList<>();
        newList.addAll(Arrays.asList(firstArray));
        newList.addAll(Arrays.asList(secondArray));
        return newList.stream().distinct().collect(Collectors.toList());
    }
}
