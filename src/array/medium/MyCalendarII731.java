package array.medium;

import java.util.ArrayList;
import java.util.List;

public class MyCalendarII731 {
    private List<int[]> books = new ArrayList<>();
    private List<int[]> overlaps = new ArrayList<>();

    public boolean book(int start, int end) {
        MyCalendar overlaps = new MyCalendar();
        for(int[] b: books)
            if(Math.max(b[0],start) < Math.min(b[1],end)) // overlap
                if(!bookoverlap(Math.max(b[0],start), Math.min(b[1],end))) return false;
        books.add(new int[]{start, end});
        return true;

    }

    private static class MyCalendar {
        List<int[]> books = new ArrayList<>();
        public boolean book(int start, int end) {
            for (int[] b : books)
                if (Math.max(b[0], start) < Math.min(b[1], end)) return false;
            books.add(new int[]{ start, end });
            return true;
        }
    }

    private boolean bookoverlap(int start, int end){
        for (int[] b : overlaps)
            if (Math.max(b[0], start) < Math.min(b[1], end)) return false;
        overlaps.add(new int[]{ start, end });
        return true;
    }
}
