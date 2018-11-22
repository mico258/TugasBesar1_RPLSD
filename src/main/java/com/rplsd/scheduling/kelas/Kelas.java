package com.rplsd.scheduling.kelas;

import com.rplsd.scheduling.*;
import java.util.ArrayList;
import java.util.Arrays;

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

        availability = new ArrayList<>();
        for(scheduleParser.JadwalContext jc : kc.availability(0).jadwal()) {
            availability.add(new Jadwal(jc));
        }
    }

    public String toString() {
        return name + " " + requirement.toString() + " " + capacity.toString() + " " + availability.toString();
    }
}
