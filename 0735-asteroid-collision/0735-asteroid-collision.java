import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int asteroid : asteroids) {
            boolean destroyed = false;
            
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) { // Collision case
                if (Math.abs(asteroid) > stack.peek()) { // Incoming asteroid destroys stack top
                    stack.pop();
                    continue;
                } else if (Math.abs(asteroid) == stack.peek()) { // Both destroy each other
                    stack.pop();
                }
                destroyed = true; // Incoming asteroid is destroyed
                break;
            }
            
            if (!destroyed) {
                stack.push(asteroid);
            }
        }
        
        // Convert stack to array
        int[] ans = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        
        return ans;
    }
}
