# Squirrel - Biblioteca de Algoritmos de Ordenação

Squirrel é uma biblioteca Java que implementa diversos algoritmos de ordenação, fornecendo uma interface simples e eficiente para ordenação de dados.

## Algoritmos Implementados

### Algoritmos Básicos
- **Bubble Sort**: Algoritmo simples de ordenação com complexidade O(n²)
- **Selection Sort**: Ordenação por seleção com complexidade O(n²)
- **Insertion Sort**: Ordenação por inserção com complexidade O(n²)

### Algoritmos Avançados
- **Quick Sort**: Algoritmo de ordenação rápida com complexidade média O(n log n)
- **Merge Sort**: Algoritmo de ordenação por mesclagem com complexidade O(n log n)
- **Heap Sort**: Ordenação usando estrutura de dados heap com complexidade O(n log n)

### Algoritmos Especializados
- **Counting Sort**: Algoritmo de ordenação por contagem com complexidade O(n + k)
- **Radix Sort**: Ordenação por dígitos com complexidade O(d(n + k))
- **Bucket Sort**: Ordenação por baldes com complexidade média O(n + n²/k)
- **Shell Sort**: Melhoria do Insertion Sort com complexidade variável
- **Tim Sort**: Algoritmo híbrido baseado em Merge Sort e Insertion Sort

### Algoritmos Experimentais
- **Bogo Sort**: Algoritmo de ordenação aleatória (não recomendado para uso prático)
- **Gnome Sort**: Algoritmo similar ao Insertion Sort
- **Rainbow Sort**: Algoritmo especializado para ordenação de cores

## Como Usar

Para utilizar a biblioteca, basta importar as classes necessárias e chamar o método de ordenação desejado:

```java
import com.bosque.algorithms.*;

// Exemplo de uso do QuickSort
int[] array = {5, 2, 9, 1, 5, 6};
QuickSort.sort(array);
```

## Requisitos

- Java 8 ou superior
- Maven para gerenciamento de dependências

## Instalação

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/squirrel.git
```

2. Compile o projeto:
```bash
mvn clean install
```

3. Adicione a dependência ao seu projeto:
```xml
<dependency>
    <groupId>com.bosque</groupId>
    <artifactId>squirrel</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Contribuindo

Contribuições são bem-vindas! Por favor, siga estas etapas:

1. Fork o projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

## Autor

Kauã Vinícios Cruz Bezerra - kaua.vinicios_2005@hotmail.com
