package hashtable.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeImportance690 {
    int total = 0;

    public int getImportance(List<Employee> employees, int id) {
        Employee manager = employees.stream().filter(e -> e.id == id).collect(Collectors.toList()).get(0);

        total += manager.importance;
        manager.subordinates.forEach(subId -> getImportance(employees, subId));
        return total;
    }

    Map<Integer, Employee> map;
    public int getImportance1(List<Employee> employees, int id) {
        map = new HashMap<>();
        for(Employee e: employees)
            map.put(e.id, e);
        return dfs(id);
    }

    private int dfs(int id){
        Employee e = map.get(id);
        int sum = e.importance;
        for(int i: e.subordinates)
            sum += dfs(i);
        return sum;
    }


}


class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
