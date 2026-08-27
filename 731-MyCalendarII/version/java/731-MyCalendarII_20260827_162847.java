// Last updated: 27/08/2026, 16:28:47
1import java.util.*;
2
3class MyCalendarTwo {
4
5    List<int[]> events;
6    List<int[]> overlaps;
7
8    public MyCalendarTwo() {
9        events = new ArrayList<>();
10        overlaps = new ArrayList<>();
11    }
12
13    public boolean book(int startTime, int endTime) {
14
15        // Check if this booking creates a triple booking
16        for (int[] interval : overlaps) {
17            int start = Math.max(startTime, interval[0]);
18            int end = Math.min(endTime, interval[1]);
19
20            if (start < end) {
21                return false;
22            }
23        }
24
25        // Find new double-booked regions
26        for (int[] interval : events) {
27            int start = Math.max(startTime, interval[0]);
28            int end = Math.min(endTime, interval[1]);
29
30            if (start < end) {
31                overlaps.add(new int[]{start, end});
32            }
33        }
34
35        // Add the new event
36        events.add(new int[]{startTime, endTime});
37
38        return true;
39    }
40}
41
42/**
43 * Your MyCalendarTwo object will be instantiated and called as such:
44 * MyCalendarTwo obj = new MyCalendarTwo();
45 * boolean param_1 = obj.book(startTime,endTime);
46 */