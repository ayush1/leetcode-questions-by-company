public class HappyNumber{
    public boolean isHappy(int n){
        Set<Integer> s=new HashSet<Integer>();

        while(s.add(n) && n!=1){
            int sum = 0;
            while(n > 0){
                int digit = n%10;
                n/=10;
                sum +=digit*digit;
            }
            n = sum;
        }
        return n == 1;
    }
}
