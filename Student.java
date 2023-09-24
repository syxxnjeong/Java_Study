public class Student {
    int id;
    String name;
    String major;
    int year;
    int labId;
    String labName;

    public Student(int id, String name, String major, int year, int labId, String labName) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.year = year;
        this.labId = labId;
        this.labName = labName;
    }

    public void displayInfo() {
        System.out.println(id + " " + name + " " + major + "   " + year + "      " + labId + "     " + labName);
    }


}