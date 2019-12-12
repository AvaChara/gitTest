import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        while (true) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            Solution solution = new Solution();
            System.out.println(solution.NumberOf1(num));
        }
    }
    public int NumberOf1(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            if((n >>> i & 1) == 1)
                ++count;
        }
        return count;
    }
}
