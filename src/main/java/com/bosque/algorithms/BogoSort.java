package com.bosque.algorithms;

import java.util.List;
import java.util.Collections;

public class BogoSort{

  public List<Integer> sort(List<Integer> _list){
    //int count = 0;
    while(!isSorted(_list)){
      Collections.shuffle(_list);
      //System.out.println("try" + count + "Shuffle: " + _list);
      //count++;
    }
    return _list;
  }

  public boolean isSorted(List<Integer> _list){
    for (int i = 1; i < _list.size(); i++)
      if (_list.get(i) < _list.get(i - 1))
        return false;
    return true;
  }
}
