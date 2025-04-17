package com.bosque.algorithms;

import java.util.List;

public class GnomeSort {
    // 
    public List<Integer> sort(List<Integer> _list, int _size) {
        int index = 0;
        while (index < _size) {
            if (index == 0)
                index++;
            if (_list.get(index) >= _list.get(index - 1)) {
                index++;
            } else {
                int temp = _list.get(index);
                _list.set(index, _list.get(index - 1));
                _list.set(index - 1, temp);
                index--;
            }
        }
        return _list;
    }
}
