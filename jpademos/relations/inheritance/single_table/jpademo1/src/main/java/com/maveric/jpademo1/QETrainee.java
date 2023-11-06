package com.maveric.jpademo1;

import javax.persistence.Entity;

@Entity
public class QETrainee extends Trainee{
    private String tool;

    public  QETrainee(String name, String department,Address address,String tool) {
        super(name, department, address);
        this.tool=tool;
    }
    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }
}
