package com.bosque.algorithms;

import java.util.Collections;
import java.util.List;

public class HeapSort {
    public List<Integer> sort(List<Integer> list) {
        int n = list.size();

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            Collections.swap(list, 0, i);
            heapify(list, i, 0);
        }

        return list;
    }

    private void heapify(List<Integer> list, int n, int i) {
        int maior = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < n && list.get(esquerda) > list.get(maior))
            maior = esquerda;

        if (direita < n && list.get(direita) > list.get(maior))
            maior = direita;

        if (maior != i) {
            Collections.swap(list, i, maior);
            heapify(list, n, maior);
        }
    }
}
