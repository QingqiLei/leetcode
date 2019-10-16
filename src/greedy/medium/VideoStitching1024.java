package greedy.medium;

import java.util.Arrays;

public class VideoStitching1024 {
    public int videoStitching(int[][] clips, int T) {
        int res = 0;
        Arrays.sort(clips,(a,b) ->(a[0] - b[0]));
        for(int i = 0, start = 0, end = 0; start < T; start =end, res++){
            for(; i < clips.length && start >= clips[i][0] ; i++) end = Math.max(end, clips[i][1]);
            if(start == end ) return -1;
        }
        return res;
    }


}
