package array.easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses929 {
    public int numUniqueEmails(String[] emails) {

        Set<String> set = new HashSet<String>();
        for(String n: emails){
            String[] parts = n.split("@");
            String[] local = parts[0].split("\\+");
            set.add(local[0].replaceAll(".","")+"@"+parts[1]);

        }
        return set.size();
    }
}