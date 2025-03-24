package com.bosque.algorithms;

import java.util.List;
import java.util.Collections;

public class BubbleSort{

  public List<Integer> sort(List<Integer> list){
    int n = list.size();
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n - i - 1; j++){
        if(list.get(j) > list.get(j + 1)){
          Collections.swap(list, j, j + 1);
        }
      }
    }
    return list;
  }

}
