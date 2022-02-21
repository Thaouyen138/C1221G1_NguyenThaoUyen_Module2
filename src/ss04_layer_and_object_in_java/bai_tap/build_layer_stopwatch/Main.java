package ss04_layer_and_object_in_java.bai_tap.build_layer_stopwatch;


public class Main {
    public static void main(String[] args) {
        Stopwatch stopwatch= new Stopwatch();
        for (int i=0;i<=1000;i++){
            System.out.println(i);
        }
        stopwatch.end();
        System.out.println(stopwatch.getElapsedTime());

    }
}
