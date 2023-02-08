package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum = 0;
        int start = Math.min(leftBorder, rightBorder);
        int end = Math.max(rightBorder, leftBorder);
        while (start < end + 1) {
            if (start % 2 == 0) {
                sum = sum + start;
            }
            start++;
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum = 0;
        int start = Math.min(leftBorder, rightBorder);
        int end = Math.max(rightBorder, leftBorder);
        while (start < end + 1) {
            if (start % 2 == 1) {
                sum = sum + start;
            }
            start++;
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        for (Integer n : arrayList) {
            sum = sum + n * 3 + 2;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 1) {
                arrayList.set(i, arrayList.get(i) * 3 + 2);
            }
        }
        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;
        for (Integer n : arrayList) {
            if (n % 2 == 1) {
                sum = sum + n * 3 + 5;
            }
        }
        return sum;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer n : arrayList) {
            if (n % 2 == 0) {
                newList.add(n);
            }
        }
        double median;
        int size = newList.size();
        if (size % 2 == 0) {
            median = (newList.get(size / 2) + newList.get(size / 2 - 1)) / 2.0;
        } else {
            median = newList.get(size - 1);
        }
        return median;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        double sum = 0;
        int count = 0;
        for (Integer n : arrayList) {
            if (n % 2 == 0) {
                sum = sum + n;
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElement) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer n : arrayList) {
            if (n % 2 == 0) {
                newList.add(n);
            }
        }
        return newList.contains(specialElement);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer n : arrayList) {
            if (n % 2 == 0) {
                newList.add(n);
            }
        }
        return newList;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        ArrayList<Integer> newList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        for (Integer n : arrayList) {
            if (n % 2 == 0) {
                newList.add(n);
            } else {
                oddList.add(n);
            }
        }
        oddList.sort(Comparator.reverseOrder());
        newList.addAll(oddList);
        return newList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            int num = (arrayList.get(i) + arrayList.get(i + 1)) * 3;
            newList.add(num);
        }
        return newList;
    }
}
