package com.bosque.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

  public List<Float> sort(List<Float> _list) {
    int n = _list.size();
    if (n <= 0)
      return _list;

    float max = Collections.max(_list);

    // 1. Criar n buckets vazios
    List<List<Float>> buckets = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
        buckets.add(new ArrayList<>());
    }

    // 2. Colocar os elementos nos buckets apropriados
    for (float value : _list) {
        int bucketIndex = (int) ((value / max) * (n - 1)); // Normalizado
        buckets.get(bucketIndex).add(value);
    }

    // 3. Ordenar os buckets individualmente
    for (List<Float> bucket : buckets) {
        Collections.sort(bucket);
    }

    // 4. Concatenar todos os buckets na lista final
    List<Float> sortedList = new ArrayList<>();
    for (List<Float> bucket : buckets) {
        sortedList.addAll(bucket);
    }

    return sortedList;
  }
}
