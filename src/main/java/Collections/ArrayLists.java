package Collections;

import java.awt.Robot;
import java.util.ArrayList;
import java.util.Objects;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
//        ArrayList<Integer> newList = new ArrayList<>(list1);
//        newList.addAll(list2);
    		list1.addAll(list2);
    		return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
    	//* `addShitTogether` should sum up all of the values in `list1` and `list2` 
    	//and return that value.
    		int value = 0;
    		ArrayList<Integer> newList = new ArrayList<>(list1);
        newList.addAll(list2);
    		for(Integer integer : newList) {
    			value += integer.intValue();
    		}
    	
        return value;
    }

//    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
    	//* `removeAll` should remove all instances of `toRemove` from `original` 
    	//   and return an `ArrayList`.
    	
    	//1. use remove but have to careful about the index
//    		for(int i = 0; i < original.size(); i++) {
//    			if (original.get(i).equals(toRemove)) {
//					original.remove(i);
//					i--; 
////					System.out.println(i);
//					//because every time delete the element, the arraylist 
//					//will move the index forward, so the next one visited should be the same index
//					}
//    			System.out.println(original.get(i));
//    			}
//        return original;
	   
//    }
    
    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        ArrayList<Integer> clone = new ArrayList<Integer>(original);
        while (clone.remove(toRemove));
        return clone;
    }

    //still have some problem to understand
    public boolean happyList(ArrayList<String> original) {
        for(int i = 1; i < original.size(); i++){
            ArrayList<Character> lastChars = characterArrayListMaker(original.get(i-1));
            ArrayList<Character> currentChars = characterArrayListMaker(original.get(i));
            boolean compareFlag = false;
            for(Character last : lastChars){
                for(Character current : currentChars){
                    if (last.equals(current)){
                        compareFlag = true;
                    }
                }
            }
            if(!compareFlag){
                return false;
            }
        }
        return true;
    }

    private ArrayList<Character> characterArrayListMaker(String s) {
        ArrayList<Character> result = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++){
            result.add(s.charAt(i));
        }
        return result;
    }
}
