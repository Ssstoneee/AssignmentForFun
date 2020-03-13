package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
    	//* `findValueOf` given a `Map` and an `Object` representing a key in the map, 
    	//will retrieve the value assigned to that key.

        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
    //* `findKeysOf` given a `Map` and an `Object` representing a value in the map, 
    	//will return an `Object[]` of all keys assigned to that value.
    		List<Object> keyList = new ArrayList<Object>();

    		for(Object key : map.keySet()) {
    			if(map.get(key).equals(value)) {
    				keyList.add(key);
    			}
    		}
    		Object[] result = keyList.toArray();
    		//? why
//    		Object[] result = new Object[] {keyList};
    		
        return result;
     }

    public Map<Integer, Integer> fibonacciTree(int size) {
    	//* `fibonacciTree` should return a `Map` of the first `size` numbers in the [Fibonacci sequence]
    	//(https://www.mathsisfun.com/numbers/fibonacci-sequence.html). 
    	//The keys should represent the position in the sequence that 
    	//the value is in in the sequence. Please refer to tests/Google for clarification.
    		
    	//recursion f(n) = f(n-1) + f(n-2)
    		TreeMap<Integer, Integer> fTree = new TreeMap<Integer, Integer>();
    		for(int i = 1; i <= size; i++) {
    			if (i == 1) {
    				fTree.put(i, 1);
    			}
    			else if (i == 2) {
				fTree.put(i, 1);
			}
    			else {
				int	sumToPut = fTree.get(i-1) + fTree.get(i-2);
				fTree.put(i, sumToPut);
			}
    		}
        return fTree;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
    	//* `crazySpiral` should return a `Map` of the first `size` numbers in a sequence starting with `first` and `second`. 
    	//The third number should be the sum of the first two, the fourth the sum of 2 and 3, etc. 
    	//The keys should represent the position in the sequence that the value is in in the sequence. 
    	//Please refer to tests/Google for clarification.
    	TreeMap<Integer, Integer> crazy = new TreeMap<Integer, Integer>();
		for(int i = 1; i <= size; i++) {
			if (i == 1) {
				crazy.put(i, first);
			}
			else if (i == 2) {
				crazy.put(i, second);
		}
			else {
			int	sumToPut = crazy.get(i-1) + crazy.get(i-2);
			crazy.put(i, sumToPut);
		}
		}
        return crazy;
    }
}
