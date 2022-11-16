package task9.jtable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayConvertor {
    public static <T> List<List<T>> array1DtoList2D(T[] array){
        return new ArrayList<>(Collections.singleton(List.of(array)));
    }
}
