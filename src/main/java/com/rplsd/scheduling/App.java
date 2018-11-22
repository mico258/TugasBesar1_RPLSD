package com.rplsd.scheduling;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.rplsd.scheduling.kelas.Kelas;
import com.rplsd.scheduling.ruangan.Ruangan;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class App
{
    public static void main( String[] args )
    {
        if (args.length == 0) {
            args = new String[]{"src/test/test.txt"};
        }

        System.out.println("parsing " + args[0]);

        try {
            scheduleLexer lexer = new scheduleLexer(new ANTLRFileStream(args[0]));
            scheduleParser parser = new scheduleParser(new CommonTokenStream(lexer));
            scheduleParser.ScheduleContext schedule = parser.schedule();

            // get kelas and ruangan context
            ArrayList<scheduleParser.KelasContext> kelas = new ArrayList<>(schedule.kelas());
            ArrayList<scheduleParser.RuangkelasContext> ruanganKelas = new ArrayList<>(schedule.ruangkelas());

            //parse kelas
            ArrayList<Kelas> kelass = new ArrayList<>();
            for (scheduleParser.KelasContext kc: kelas) {
                kelass.add(new Kelas(kc));
            }

            for (Kelas k : kelass) {
                System.out.println(k.toString());
            }

            // parse ruangan
            ArrayList<Ruangan> ruangans = new ArrayList<>();
            for (scheduleParser.RuangkelasContext rkc: ruanganKelas) {
                ruangans.add(new Ruangan(rkc.ruangan()));
            }

            for (Ruangan r: ruangans) {
                System.out.println(r.toString());
            }

            Scheduler scheduler = new Scheduler();
//            System.out.println(scheduler.getFreeRoom(100, 1, kelass.get(0).availability.get(0),
//                    ruangans));
            scheduler.Schedule(kelass, ruangans);
            scheduler.PrintSchedule();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
