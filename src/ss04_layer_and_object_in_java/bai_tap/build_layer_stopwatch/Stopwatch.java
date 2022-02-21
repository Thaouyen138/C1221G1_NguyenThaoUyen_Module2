package ss04_layer_and_object_in_java.bai_tap.build_layer_stopwatch;

import java.util.Date;

public class Stopwatch {
    private long starTime;
    private long endTime;

    public long getStarTime() {
        return starTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public Stopwatch(){
        starTime=new Date().getTime();
    }
    public void start(){
        starTime=new Date().getTime();
    }
    public void end(){
        endTime=new Date().getTime();
    }
    public long getElapsedTime (){
        return endTime-starTime;
    }
}
