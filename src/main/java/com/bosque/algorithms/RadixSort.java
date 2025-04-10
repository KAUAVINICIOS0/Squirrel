package com.bosque.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RadixSort {

  public List<Integer> sort(List<Integer> _list) {
    // Encontra o maior número para saber o número de dígitos
    int max = Collections.max(_list);

    // Para cada casa decimal (1, 10, 100, ...)
    for (int exp = 1; max / exp > 0; exp *= 10) {
      _list = countSort(_list, exp);
    }

    return _list;
  }

  // Counting Sort para um valor de casa decimal específico (exp)
  public List<Integer> countSort(List<Integer> _list, int _exp) {
    int n = _list.size();
    List<Integer> output = new ArrayList<>(Collections.nCopies(n, 0));
    int[] frequencyArray = new int[10];

    // Conta ocorrências dos dígitos na casa decimal atual
    for (int i = 0; i < n; i++) {
      int digit = (_list.get(i) / _exp) % 10;
      frequencyArray[digit]++;
    }

    // Transforma a contagem em posições reais
    for (int i = 1; i < 10; i++) {
      frequencyArray[i] += frequencyArray[i - 1];
    }

    // Constroi a lista ordenada
    for (int i = n - 1; i >= 0; i--) {
      int val = _list.get(i);
      int digit = (val / _exp) % 10;
      output.set(frequencyArray[digit] - 1, val);
      frequencyArray[digit]--;
    }

    return output;
  }
}
