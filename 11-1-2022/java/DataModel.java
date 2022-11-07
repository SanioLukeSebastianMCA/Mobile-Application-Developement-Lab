package com.example.labcycleadapter;

public class DataModel {
    String person_name, person_profession;

    public DataModel(String person_name, String person_profession) {
        this.person_name = person_name;
        this.person_profession = person_profession;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public String getPerson_profession() {
        return person_profession;
    }

    public void setPerson_profession(String person_profession) {
        this.person_profession = person_profession;
    }
}
