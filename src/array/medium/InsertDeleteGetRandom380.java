package array.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class InsertDeleteGetRandom380 {
    ArrayList<Integer> list ;
    Map<Integer, Integer> map;

    /** Initialize your data structure here. */
    public InsertDeleteGetRandom380() {
        list = new ArrayList();
        map = new HashMap();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            list.add(val);
            map.put(val, list.size()-1);
            return true;
        }
        return false;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {

        if(map.containsKey(val)){
            int temp = map.get(val);
            list.set(temp,list.get(list.size() -1));
            list.get(list.size())
            list.remove(list.size() -1);
            map.remove(val);
list.forEach(s->System.out.print(s+" "));
            return true;
        }
        return false;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(new Random().nextInt(list.size()));
    }
}
