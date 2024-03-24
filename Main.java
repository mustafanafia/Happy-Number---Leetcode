import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Main o = new Main();


        System.out.println(o.isHappy(2));
    }


    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while(true) {

            int sum = 0;

            while (n != 0) {
                int next_digit = n % 10;
                sum = (int) Math.pow(next_digit, 2) + sum;
                n = n / 10;
            }

            if(sum == 1){
                return true;
            }

            n = sum;

            if(set.contains(n)){
                return false;
            }
            set.add(n);
        }


    }

}


/*
    public int squareDigits(int n) {

        String result = "";

        while (n != 0) {
            int digit = n % 10 ;
            result = digit*digit + result ;
            n /= 10 ;
        }

        return Integer.parseInt(result) ;
    }
 */