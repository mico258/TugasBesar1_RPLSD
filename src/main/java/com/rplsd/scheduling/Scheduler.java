package com.rplsd.scheduling;

import com.rplsd.scheduling.kelas.Jadwal;
import com.rplsd.scheduling.kelas.Kelas;
import com.rplsd.scheduling.ruangan.Ruangan;

import java.util.ArrayList;

public class Scheduler {
    public String[][] schedule;
    public boolean scheduled;

    public Scheduler() {
        scheduled = false;
        schedule = new String[6][12];
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 11; j++) {
                schedule[i][j] = "";
            }
        }
    }

    public boolean checkAvail(Ruangan r, int day, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (r.used[day][i]) {
                return false;
            }
        }
        return true;
    }

    public Ruangan getFreeRoom(Integer capacity, Integer requirement, Jadwal j, ArrayList<Ruangan> ruangans) {

        Ruangan result = null;

        for (int req = requirement; req <= 1; req++) {
            int capacity_min = -1;
            for(Ruangan r: ruangans) {
                if (r.facility == req) {
                    if ((capacity_min == -1 || r.capacity < capacity_min) && r.capacity >= capacity
                            && checkAvail(r, j.day, j.start, j.end)) {
                            capacity_min = r.capacity;
                            result = r;
                    }
                }
            }
            if (result != null) {
                for (int i = j.start; i <= j.end; i++) {
                    result.used[j.day][i] = true;
                }
                return result;
            }
        }

        return null;
    }

    public void Schedule(ArrayList<Kelas> kelass, ArrayList<Ruangan> ruangans) {
        for (Kelas k: kelass) {
            for(Jadwal j: k.availability) {
                Ruangan r = getFreeRoom(k.capacity, k.requirement, j, ruangans);
                for(int i = j.start; i <= j.end; i++) {
                    if (r != null) {
                        schedule[j.day][i] += r.name + " : " + k.name + ", ";
                    } else {
                        schedule[j.day][i] += "Unknown : " + k.name + ", ";
                    }
                }
            }
        }
        scheduled = true;
    }

    public void PrintSchedule() {
        if (scheduled) {
            String[] day_names = new String[]{"dummy", "Senin", "Selasa",
                    "Rabu", "Kamis", "Jumat"};
            for(int day = 1; day <= 5; day++) {
                for(int hour = 1; hour <= 11; hour++) {
                    System.out.println("Hari: " + day_names[day] + " | jam: " + hour + " -> " + schedule[day][hour]);
                }
                System.out.println(" ");
            }
        }
    }
}
