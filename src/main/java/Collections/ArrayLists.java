package Collections;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().mapToInt(i -> i).sum() + list2.stream().mapToInt(i -> i).sum();
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        List<Integer> result = original.stream().filter(i -> i != toRemove).collect(Collectors.toList());
        return new ArrayList<>(result);
    }

    public boolean happyList(ArrayList<String> original) {
        if(original.size() < 2)
            return true;

        boolean result = false;
        HashSet<Character> chars = null;
        String str;


        for(int i = 0; i < original.size(); i++){

            // Adding characters to an hash set
            char [] wordToChar = original.get(i).toCharArray();
            chars = new HashSet<Character>();
            for (char c : wordToChar){
                chars.add(c);
            }

            //initializing values
            str = "";
            result = false;

            //Get the appropriate string whose value we need to check
            if (i == 0)
                str = original.get(i + 1);
            else if (i == (original.size() - 1))
                str = original.get(i - 1);
            else
                str += original.get(i - 1) + original.get(i + 1);

            char [] toCheck = str.toCharArray();
            //if it is happy
            for (char c : toCheck){
                if(chars.contains(c)){
                    result = true;
                    break;
                }
            }
            if (result == false)
                return result;
        }

        return result;
    }
}
