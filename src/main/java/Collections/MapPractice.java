package Collections;

import java.util.*;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        ArrayList<Object> objects = new ArrayList<Object>();
        for (Object entry : map.keySet()){
            if (map.get(entry).equals(value))
                objects.add(entry);
        }
        Object[] result = objects.toArray();
        return result;
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        return crazySpiral(1, 1, size);
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer, Integer> result = new HashMap<Integer, Integer>();
        if (size <= 0)
            return result;
        result.put(1, first);
        if (size == 1)
            return result;
        result.put(2,second);
        if (size == 2)
            return result;
        int i = first, j = second;
        for (int k = 3; k <= size; k++){
            result.put(k, i + j);
            j = i + j;
            i = j - i;
        }
        return result;
    }
}
