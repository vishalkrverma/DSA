import java.util.*;

class ExamRoom {
    int N;
    PriorityQueue<Interval> pq;

    class Interval {
        int start, end, distance;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;

            if (start == -1) {
                this.distance = end;
            } else if (end == N) {
                this.distance = N - 1 - start;
            } else {
                this.distance = (end - start) / 2;
            }
        }
    }

    public ExamRoom(int n) {
        this.N = n;
        pq = new PriorityQueue<>((a, b) -> {
            if (a.distance == b.distance) {
                return a.start - b.start;
            }
            return b.distance - a.distance;
        });
        pq.offer(new Interval(-1, N));
    }

    public int seat() {
        Interval interval = pq.poll();
        int seat;

        if (interval.start == -1) {
            seat = 0;
        } else if (interval.end == N) {
            seat = N - 1;
        } else {
            seat = (interval.start + interval.end) / 2;
        }

        pq.offer(new Interval(interval.start, seat));
        pq.offer(new Interval(seat, interval.end));

        return seat;
    }

    public void leave(int p) {
        Interval left = null, right = null;
        Iterator<Interval> it = pq.iterator();

        while (it.hasNext()) {
            Interval interval = it.next();
            if (interval.end == p) {
                left = interval;
            } else if (interval.start == p) {
                right = interval;
            }
            if (left != null && right != null) {
                break;
            }
        }

        pq.remove(left);
        pq.remove(right);
        pq.offer(new Interval(left.start, right.end));
    }
}
