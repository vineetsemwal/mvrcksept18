package studentms.model;

public class CseStudent extends Student {
    private String programmingLanguage;
    private String laptopAllotted;

    public CseStudent(int id, String name, String course,
                      String language, String laptop) {
        super(id, name, course);
        this.programmingLanguage = language;
        this.laptopAllotted = laptop;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getLaptopAllotted() {
        return laptopAllotted;
    }

    public void setLaptopAllotted(String laptopAllotted) {
        this.laptopAllotted = laptopAllotted;
    }
}
