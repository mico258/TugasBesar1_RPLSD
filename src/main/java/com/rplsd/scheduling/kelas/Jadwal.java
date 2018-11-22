package com.rplsd.scheduling.kelas;
import com.rplsd.scheduling.*;
import com.rplsd.scheduling.ruangan.Ruangan;

public class Jadwal {
    public Integer day;
    public Integer start;
    public Integer end;

    public Jadwal(scheduleParser.JadwalContext jc) {
        day = Integer.parseInt(jc.NUMBER(0).toString());
        start = Integer.parseInt(jc.NUMBER(1).toString());
        end = Integer.parseInt(jc.NUMBER(2).toString());
    }

    public String toString() {
        return day.toString() + " " + start.toString() + " " + end.toString();
    }
}
