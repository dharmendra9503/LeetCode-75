package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2_Senate {
    private static String predictPartyVictory(String senate) {
        Queue<Integer> radiantQ = new LinkedList<>();
        Queue<Integer> direQ = new LinkedList<>();
        for(int i=0;i<senate.length();i++) {
            if(senate.charAt(i) == 'R') {
                radiantQ.add(i);
            } else {
                direQ.add(i);
            }
        }

        while(!radiantQ.isEmpty() && !direQ.isEmpty()) {
            int r = radiantQ.poll();
            int d = direQ.poll();
            if(r < d) {
                radiantQ.add(r+senate.length());
            } else {
                direQ.add(d+senate.length());
            }
        }
        return (radiantQ.size() < direQ.size() ? "Dire" : "Radiant");
    }
    public static void main(String[] args) {
        System.out.println("Dota2 Senate");

        String senate = "RD";
        System.out.println(predictPartyVictory(senate));
    }
}
