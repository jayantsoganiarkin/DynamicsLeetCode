public class ClimbingStairsOfWater {
    static int climbStairs(int n) {
        if (n < 2) {
            return 1;
    } else if (n == 0){
        return 0;
    } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }
    static int countWays(int s){
        return climbStairs(s + 1);
    }
    public static void main(String args[]) {
        int s = 4;
        System.out.println("Number of ways = " + countWays(s));
    }
}