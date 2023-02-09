package com.thoughtworks.collection;

import java.util.Collections;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return Collections.max(arrayList);
    }

    public double getMinimum() {
        return Collections.min(arrayList);
    }

    public double getAverage() {
        double sum = 0;
        for (Integer n : arrayList) {
            sum = sum + n;
        }
        return sum / arrayList.size();
    }

    public double getMedian() {
        return median();
    }

    private double median() {
        double median;
        int size = arrayList.size();
        if (size % 2 == 0) {
            median = (arrayList.get(size / 2) + arrayList.get(size / 2 - 1)) / 2.0;
        } else {
            median = arrayList.get((size - 1) / 2);
        }
        return median;
    }

    public double getOrderedMedian() {
        return median();
    }

    public int getFirstEven() {
        int even = 0;
        for (Integer n : arrayList) {
            if (n % 2 == 0) {
                even = n;
                break;
            }
        }
        return even;
    }

    public int getIndexOfFirstEven() {
        int index = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean isEqual(List<Integer> arrayList) {
        return this.arrayList.equals(arrayList);
    }


    public int getLastOdd() {
        int odd = 0;
        for (Integer n : arrayList) {
            if (n % 2 == 1) {
                odd = n;
            }
        }
        return odd;
    }

    public int getIndexOfLastOdd() {
        int index = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 1) {
                index = i;
            }
        }
        return index;
    }
}
