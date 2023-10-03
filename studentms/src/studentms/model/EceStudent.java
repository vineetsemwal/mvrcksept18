package studentms.model;

public class EceStudent extends Student {
    private String device;

    public EceStudent(int id, String name, String course, String device) {
        super(id, name, course);
        this.device = device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getDevice() {
        return device;
    }

}
