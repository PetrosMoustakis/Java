package gr.aueb.cf.ch7;

public class StringBuilderApp {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String concatResult = "";
        long timeStart = 0L;
        long timeEnd = 0L;

        double stringElapsedTime = 0.0;
        double sbElapsedTime = 0.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 15000; i++) {
            concatResult = concatResult + i;
        }
        timeEnd = System.currentTimeMillis();
        stringElapsedTime = (double) (timeEnd - timeStart) / 1000;

        timeStart = System.nanoTime();
        for (int i = 1; i <= 15000; i++) {
            sb.append(i);
        }
        timeEnd = System.nanoTime();
        stringElapsedTime =  (timeEnd - timeStart) / 1000000000.0;

        System.out.println("String concat time: " + stringElapsedTime + "seconds");
        System.out.println("String Builder concat time: " + sbElapsedTime + "seconds");
    }
}
