public class Main {

    public static void main(String[] args) {

        int maxValue = Integer.MAX_VALUE;

        Thread oneSec = new Thread(() -> {
            for (int i = 1; i < maxValue; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(" Sec. from start " + i);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        });
        oneSec.start();


        Thread fiveSec = new Thread(() -> {
            for (int i = 5; i < maxValue; i = i + 5) {
                try {
                    Thread.sleep(5000);
                    System.out.println("Минуло 5 секунд.");
              }catch (InterruptedException e){
                    throw new RuntimeException(e);
               }
            }
        });
        fiveSec.start();


    }
}