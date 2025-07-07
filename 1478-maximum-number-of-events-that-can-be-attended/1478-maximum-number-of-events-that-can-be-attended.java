class Solution {
    public int maxEvents(int[][] events) { 
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = events.length;
        int day = 0, eventIndex = 0, result = 0; 
        while (!pq.isEmpty() || eventIndex < n) {
            if (pq.isEmpty()) {
                day = events[eventIndex][0];
            } 
            // Add all events that start on the current day
            while (eventIndex < n && events[eventIndex][0] <= day) {
                pq.offer(events[eventIndex][1]);
                eventIndex++;
            } 
            // Remove events that have already ended
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }  
            // Attend the event that ends the soonest
            if (!pq.isEmpty()) {
                pq.poll();
                result++;
                day++;
            }
        }
        return result;
    }
}