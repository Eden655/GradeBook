public class Grade {
    private String Name;
    private int Marks;
    private int Totalmarks;
    static  String average;
    static String finalmarks;
    static String allmarks;

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

    public static String getFinalMark(String finals){
        double finalvalue = Double.parseDouble(finals);
        double result;
        if(finalvalue == 0 && finalvalue < 15)
            result = 1;
        else if(finalvalue >= 15 && finalvalue < 30)
            result = 2;
        else if(finalvalue >= 30 && finalvalue < 40)
            result = 3;
        else if(finalvalue >= 40 && finalvalue < 50)
            result = 4;
        else if(finalvalue >= 50 && finalvalue < 60)
            result = 5;
        else if(finalvalue >= 60 && finalvalue < 70)
            result = 6;
        else
            result = 7;

        String answer = String.valueOf(result);
        return answer;

    }

    public String Percentage(){

    }



}
