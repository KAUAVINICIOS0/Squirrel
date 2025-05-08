package com.bosque.algorithms;

import java.util.List;

public class RainbowSort{

    public List<Integer> sort(List<Integer> _list) {
        int low = 0;
        int mid = 0;
        int high = _list.size() - 1;

        while (mid <= high) {
            int value = _list.get(mid);
            if (value == 0) {
                swap(_list, low, mid);
                low++;
                mid++;
            } else if (value == 1) {
                 mid++;
            } else if (value == 2) {
                swap(_list, mid, high);
                high--;
            } else {
                throw new IllegalArgumentException("Apenas valores 0, 1 e 2 são permitidos.");
            }
        }
        return _list;
    }

    private void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}

