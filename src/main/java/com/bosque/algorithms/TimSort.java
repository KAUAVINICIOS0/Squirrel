package com.bosque.algorithms;

import java.util.List;
import com.bosque.algorithms.InsertionSort;
import com.bosque.algorithms.MergeSort;


public class TimSort{
  public List<Integer> sort(List<Integer> arr) {
    int n = arr.size();
    int minRun = 32;
    InsertionSort insertionSort = new InsertionSort();
    MergeSort mergeSort = new MergeSort();
    for (int i = 0; i < n; i += minRun) {
      insertionSort.sort(arr);
    }
    for (int size = minRun; size < n; size *= 2) {
      for (int left = 0; left < n; left += 2 * size) {
        int mid = Math.min(left + size - 1, n - 1);
        int right = Math.min((left + 2 * size - 1), (n - 1));
        if (mid < right) {
          mergeSort.sort(arr, arr.size());
        }
      }
    }
    return arr;
  }

}
