package com.bosque.algorithms;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CountingSort {

    public List<Integer> sort(List<Integer> _list) {
        if (_list == null || _list.isEmpty()) return new ArrayList<>();

        // 1. Encontrar o maior valor
        int max = Collections.max(_list);

        // 2. Criar o array de contagem
        List<Integer> count = new ArrayList<>(Collections.nCopies(max + 1, 0));

        // 3. Contar as ocorrências
        for (int num : _list) {
            count.set(num, count.get(num) + 1);
        }

        // 4. Construir a lista ordenada
        List<Integer> sortedList = new ArrayList<>();
        for (int i = 0; i < count.size(); i++) {
            for (int j = 0; j < count.get(i); j++) {
                sortedList.add(i);
            }
        }

        return sortedList;
    }
}
