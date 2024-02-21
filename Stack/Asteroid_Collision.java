package Stack;

import java.util.Stack;

public class Asteroid_Collision {
    private static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int ele : asteroids) {
            if(ele > 0) {
                stack.push(ele);
            } else {
                while(stack.size() > 0 && stack.peek() > 0 && stack.peek() < -ele) {
                    stack.pop();
                }
                if(stack.size() > 0 && stack.peek() == -ele) {
                    stack.pop();
                } else {
                    if(stack.isEmpty() || stack.peek() < 0) {
                        stack.push(ele);
                    }
                }
            }
        }
        int[] ans = new int[stack.size()];
        int i=stack.size()-1;
        while(!stack.isEmpty()) {
            ans[i--] = stack.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Asteroid Collision");

        int[] asteroids = {5,10,-5};
        System.out.println(asteroidCollision(asteroids));
    }
}
