import java.util.*;

class Solution {

    public int countDays(int days, int[][] meetings) {
        if (meetings.length == 0) return days;

        // Sort meetings by start day
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int occupiedDays = 0;
        int prevEnd = 0;

        for (int[] meeting : meetings) {
            int start = Math.max(meeting[0], prevEnd + 1);
            int end = meeting[1];

            if (start <= end) {
                occupiedDays += (end - start + 1);
                prevEnd = end;
            }
        }

        return days - occupiedDays;
    }
}
