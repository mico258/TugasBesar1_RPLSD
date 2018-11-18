package main.antlr4.com.rplsd.scheduling;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
//    scheduleLexer s = new scheduleLexer();
    public static void main(String[] args){
        ANTLRInputStream ais = new ANTLRInputStream("begin \n" +
                "end");
        scheduleLexer sl = new scheduleLexer(ais);
        CommonTokenStream cts = new CommonTokenStream(sl);
        scheduleParser sp = new scheduleParser(cts);

        scheduleParser.ScheduleContext sc = sp.schedule();


    }
}
