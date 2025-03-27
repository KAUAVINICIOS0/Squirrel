package com.bosque.algorithms;

import java.util.List;
import java.util.ArrayList;

public class MergeSort{

  public static List<Integer> sort(List<Integer> _list, int _n){
    if(_n < 2){
      return _list;
    }
    int mid = _n / 2;
    List<Integer> Left = new ArrayList<>(mid);
    List<Integer> Right = new ArrayList<>(_n - mid);
    
    for(int i = 0; i < mid; i++){
      Left.add(_list.get(i));
    }
    for(int i = mid; i < _n; i++){
      Right.add(_list.get(i));
    }

    sort(Left, mid);
    sort(Right, _n - mid);

    // Chamada correta do método merge
    merge(_list, Left, Right, mid, _n - mid);
    
    return _list;
  }

  public static void merge(List<Integer> _list, List<Integer> _L, List<Integer> _R, int _left, int _right){
    int i = 0, j = 0, k = 0;

    while (i < _left && j < _right){
      if (_L.get(i) <= _R.get(j)){
        _list.set(k++, _L.get(i++));
      } else {
        _list.set(k++, _R.get(j++));
      }
    }
    while (i < _left){
      _list.set(k++, _L.get(i++));
    }
    while (j < _right){
      _list.set(k++, _R.get(j++));
    }
  }
}
