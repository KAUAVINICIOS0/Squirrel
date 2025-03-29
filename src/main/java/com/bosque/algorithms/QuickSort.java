package com.bosque.algorithms;

import java.util.Collections;
import java.util.List;

public class QuickSort{

  public static List<Integer> sort(List<Integer> _list, int _begin, int _end){
    
    if (_begin < _end){
      int partitionIndex = partition(_list, _begin, _end);
      
      sort(_list, _begin, partitionIndex -1 );
      sort(_list, partitionIndex + 1, _end );
    }
    return _list;
  }
  
  private static int partition(List<Integer> _list, int _begin, int _end){
    int pivot = _list.get(_end);
    int i = _begin - 1;

    for(int j = _begin; j < _end; j++){
      if(_list.get(j) <= pivot){
        i++;

        Collections.swap(_list, i, j);
      }
    }
    Collections.swap(_list, i + 1, _end);
    return i + 1;
  }
}
