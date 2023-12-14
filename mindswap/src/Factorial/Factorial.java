package Factorial;

public class Factorial {
        public static int fact (int number){
            int result = 1;
            for (int i = 2; i <= number; i++) {
                result *= i;
            }
            return result;
        }

        public static int fact_rec(int number){
            if(number == 0){
                return 1;
            }
            return number* fact_rec(number-1);
        }
    }
