package gr.aueb.cf.challenges;

public class firstChallenge {

    public static void main(String[] args) {

        String num = Integer.toBinaryString(150);
        int n = num.length();
        int count = 0;
        int max = 0;

        System.out.println(num);

        for (int i = 0; i <= n -1; i++) {
            if (num.charAt(i) == '0') {
                    count++;
            }
            else {
            max = Math.max(max, count);
            count = 0;
            }
        }
        max = Math.max(max, count);
        System.out.println(max);
    }
}

