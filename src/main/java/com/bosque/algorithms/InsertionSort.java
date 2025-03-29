package com.bosque.algorithms;

import java.util.List;

public class InsertionSort {

    public List<Integer> sort(List<Integer> _list) {
        int n = _list.size();
        for (int i = 1; i < n; i++) {
            int k = _list.get(i);
            int j = i - 1;

            while (j >= 0 && _list.get(j) > k) {
                _list.set(j + 1, _list.get(j));
                j = j - 1;
            }
            _list.set(j + 1, k);
        }
        return _list;
    }
}
