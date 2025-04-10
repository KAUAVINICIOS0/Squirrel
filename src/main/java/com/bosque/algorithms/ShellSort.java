package com.bosque.algorithms;

import java.util.List;

public class ShellSort{
  
  public List<Integer> sort(List<Integer> _list){
    int n = _list.size();
    int gap = n / 2;
    
    while (gap > 0) {
      for (int i = gap; i < n; i++) {
        int temp = _list.get(i);
        int j;
        for (j = i; j >= gap && _list.get(j - gap) > temp; j -= gap) {
          _list.set(j, _list.get(j - gap));
        }
        _list.set(j, temp);
      }
      gap /= 2;
    }
    
    return _list;
  }

}
