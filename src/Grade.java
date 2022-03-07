public class Grade {
    private String Name;
    private int Marks;
    private int Totalmarks;

    public Grade(String name, int marks, int totalmarks) {
        Name = name;
        Marks = marks;
        Totalmarks = totalmarks;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    public int getTotalmarks() {
        return Totalmarks;
    }

    public void setTotalmarks(int totalmarks) {
        Totalmarks = totalmarks;
    }
}
