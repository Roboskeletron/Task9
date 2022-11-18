# Task9
Number 11
>У вас есть несколько гирь (<= 10) разного веса (по одной каждого веса). Вам необходимо
найти все возможные способы, которым можно составить вес sumWeight. Решение задачи
необходимо реализовать в виде функции. Функция возвращает все подходящие варианты в виде списка вариантов, где
подходящий вариант, в свою очередь, представлен списком чисел – весов гирь из
которых составлен необходимый общий вес.

Образец функции:
```java
public static List<List<Integer>> selectionCount(List<Integer> weights, int sumWeight)
 ```
 ## Console arguments
Console app arguments format: 
``` bash
java task9.console.Main <input file> <output file> <weight sum>
```
Where `<input file>` must exist and `<output file>` will be created if not exist. `<weight sum>` - integer number
## Input file
Input file must contain 10 or less numbers, which are separated by spaces or new line symbols. Numbers must be unique integers.

Input file example:
```text
1 2 3 4 5 6 7 8 9 10
```
