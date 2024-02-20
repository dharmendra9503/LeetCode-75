package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Number_of_Recent_Calls {
    private Queue<Integer> request;
    public void RecentCounter() {
        this.request = new LinkedList<>();
    }

    public int ping(int t) {
        request.add(t);
        while(request.peek() < t - 3000) {
            request.poll();
        }
        return request.size();
    }
}
