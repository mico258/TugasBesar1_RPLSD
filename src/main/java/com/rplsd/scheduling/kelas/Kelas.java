package com.rplsd.scheduling.kelas;

import com.rplsd.scheduling.*;
import java.util.ArrayList;

public class Kelas {
    public String name;
    public Integer requirement;
    public Integer capacity;
    public ArrayList<Jadwal> availability;

    public Kelas(scheduleParser.KelasContext kc) {
        name = kc.matkul().SENTENCE().toString();

        String r = kc.requirement(0).REQUIREMENT().toString();
        requirement = Integer.parseInt(r.trim().split("\\s+")[1]);

        String c = kc.capacity(0).CAPACITY().toString();
        capacity = Integer.parseInt(c.trim().split("\\s+")[1]);
    }

    public String toString() {
        return name + " " + requirement.toString() + " " + capacity.toString();
    }
}
