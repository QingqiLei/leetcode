package greedy.hard;

import java.util.Arrays;
import java.util.PriorityQueue;

public class CourseScheduleIII630 {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a,b)->(a[1] - b[1]));
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->(b-a));
        int time = 0;
        for(int[] course: courses){
            time += course[0];
            pq.offer(course[0]);
            if(time > course[1]) time -= pq.poll();
        }
        return pq.size();
    }
}
