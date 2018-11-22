package com.rplsd.scheduling.ruangan;
import com.rplsd.scheduling.*;

import java.util.ArrayList;

public class Ruangan {
    public String name;
    public Integer capacity;
    public Integer facility;

    public Ruangan(scheduleParser.RuanganContext rc) {
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < rc.NUMBER().size(); i++) {
            temp.add(rc.NUMBER(i).toString());
        }
        this.name = temp.get(0);
        this.capacity = Integer.parseInt(temp.get(1));
        this.facility = Integer.parseInt(temp.get(2));
    }

    public String toString() {
        return name + " " + capacity.toString() + " " +facility.toString();
    }
}
