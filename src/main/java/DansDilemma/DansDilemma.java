package DansDilemma;

import java.util.HashSet;
import java.util.Set;


public class DansDilemma {
	
	private Set<Double> dilemmaOfTwoHelper(Double input1, Double input2) {
        Set<Double> tracker = new HashSet<Double>();
        tracker.add(input1 + input2);
        tracker.add(input1 - input2);
        tracker.add(input1 * input2);
        if (input2 != 0) {
            tracker.add(input1 / input2);
        }
        tracker.add(input2 + input1);
        tracker.add(input2 - input1);
        tracker.add(input2 * input1);
        if (input1 != 0) {
            tracker.add(input2 / input1);
        }
        return tracker;
    }

	private Set<Double> merge(Set<Double> set1, Set<Double> set2) {
        Set<Double> result = set1;
        for(Double d : set2){
            result.add(d);
        }
        return result;
    }
	
    public Integer dilemmaOfTwo(Double input1, Double input2) {
    		Set<Double> result = new HashSet<Double>();
    		result.add(input1 + input2);
    		result.add(input1 - input2);
    		result.add(input1 * input2);
    		if(input2 != 0) {
    			result.add(input1 / input2);
    		}
    		result.add(input2 + input1);
    		result.add(input2 - input1);
    		result.add(input2 * input1);
    		if (input1 != 0) {
                result.add(input2 / input1);
            }
        return result.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
    		
        return dilemmaOfN(input1, input2, input3);
    }

    public Integer dilemmaOfN(Double... args){
    		Set<	Double> result = new HashSet<Double>();
    		for(int i = 1; i < args.length; i++) {
    			for(int j = 0; j < i; j++) {
    				Set<Double> temp = dilemmaOfTwoHelper(args[i], args[j]);
    				result = merge(result, temp);
    			}
    		}
        return result.size();
    }
}
