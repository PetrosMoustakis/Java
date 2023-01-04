package gr.aueb.cf.ch2;

public class ExpressionsApp {
    /**
     * Int expressions Demo
     */
        public static void main(String[] args) {

            //Δηλωση και αρχικοποιηση μεταβλητων
            int num1 = 12;
            int num2 = 5;
            int sum = 0, sub = 0;
            int div = 0, mul = 0;
            int mod = 0;

            int result1 = 0;
            int result2 = 0;
            int result3 = 0;
            int result4 = 0;

            //Εντολες
            sum = num1 + num2;
            sub = num1 - num2;
            div = num1 / num2;
            mul = num1 * num2;
            mod = num1 % num2;

            result1 = num1++;  //Πρωτα η εκχωρηση και μετα το ++
            result2 = ++num1; //Πρωτα το ++ και μετα η εκχωρηση

            //result3 = result3 + num1;
            result3 += num1;

            result4 = (num1 + num2) * ((num1 / 2) / (num1 % 5));

            System.out.printf("sum: %05d\t, sub: %02d\t, div: %d\t, nul: %d\t, mod:%d\n,",
                            sum, sub, div, mul, mod);

            System.out.printf("result1: %d, result2: %d, result3: %d, result4: %d",
                    result1, result2, result3, result4);



        }

    }

