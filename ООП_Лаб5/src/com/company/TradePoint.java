package com.company;

import java.io.Serializable;
import java.util.regex.Pattern;

public class TradePoint implements Serializable {
    Patterns match = new Patterns();
    WorkTime time = new WorkTime();

    public String specialization;
    public String name;
    public String adress;
    public String[] numbers;
    public WorkTime WorkTime;

    public String[] getNumbers() { return numbers; }
    public void setNumbers(String[] numbers) { this.numbers = numbers; }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        Pattern pattern = Pattern.compile("[A-Z]+\\.+[A-Z]+[a-z]{1,}\\ +[0-9]{1,}+(\n)");
        if (match.matchData(adress, pattern))
            this.adress = adress;
    }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) {
        Pattern pattern = Pattern.compile("[a-z]{1,}+(\n)");
        if(match.matchData(specialization,pattern))
            this.specialization = specialization;
    }


    public WorkTime getWorkTime() { return WorkTime; }
    public void setWorkTime(WorkTime workTime) { WorkTime = workTime; }
}
