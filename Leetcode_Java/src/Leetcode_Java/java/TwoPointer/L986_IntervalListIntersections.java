package TwoPointer;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/interval-list-intersections/

https://leetcode.com/problems/interval-list-intersections/discuss/231122/Java-two-pointers-O(m-%2B-n)
 */
public class L986_IntervalListIntersections {
    private class Interval{
        int start;
        int end;
        Interval(){
            start = 0;
            end = 0;
        }
        Interval(int s, int e){
            start = s;
            end = e;
        }
    }

    public Interval[] intervalIntersection_TLE(Interval[] A, Interval[] B){
        List<Interval> intervalsList = new ArrayList<>();
        int a = A.length;
        int b = B.length;
        int i = 0, j = 0;
        while (i < a && j < b){
            while (A[i].end < B[j].start) i++;
            while (B[j].end < A[i].start) j++;
            Interval tmp = new Interval(Math.max(A[i].start, B[j].start), Math.min(A[i].end, B[j].end));
            intervalsList.add(tmp);
            if (A[i].end < B[j].end) {
                i++;
                continue;
            }
            if (A[i].end > B[j].end){
                j++;
                continue;
            }
        }
        Interval[] result = new Interval[intervalsList.size()];
        for (int k = 0; k < intervalsList.size(); k++){
            result[k] = intervalsList.get(k);
        }
        return result;
    }

    public Interval[] intervalIntersection(Interval[] A, Interval[] B){
        List<Interval> intervalsList = new ArrayList<>();
        int a = A.length;
        int b = B.length;
        int i = 0, j = 0;
        while (i < a && j < b){
            Interval tmpA = A[i];
            Interval tmpB = B[j];
            int startMax = Math.max(tmpA.start, tmpB.start);
            int endMin = Math.min(tmpA.end, tmpB.end);
            if (startMax <= endMin){
                intervalsList.add(new Interval(startMax, endMin));
            }
            if (tmpA.end == endMin){
                i++;
            }
            if (tmpB.end == endMin){
                j++;
            }
        }
        return intervalsList.toArray(new Interval[0]);
    }

}
