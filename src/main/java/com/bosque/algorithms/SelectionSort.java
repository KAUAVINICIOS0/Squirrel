package com.bosque.algorithms;

import java.util.List;

public class SelectionSort{

  public static List<Integer> sort(List<Integer> _list){
    int n = _list.size();

    for(int i = 0; i < n - 1; i++){
      int minIndex = i;
      
      for(int j = i + 1; j < n; j++){
        if(_list.get(j) < _list.get(minIndex)){
          minIndex = j;
        }
      }

      if(minIndex != i){
        Integer temp = _list.get(minIndex);
        _list.set(minIndex, _list.get(i));
        _list.set(i, temp);
      }
    }
    return _list;
  }
}
