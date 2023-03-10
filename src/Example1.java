import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {




        List<String> studentList = new ArrayList<>();
        studentList.add("Julian");
        studentList.add("Taavi");
        studentList.add("Nina");
        studentList.add("Allan");
        studentList.add("Samaneh");

        studentList.remove("Samaneh");

        studentList.add(0,"Samaneh");


        for (String s :studentList) {
            System.out.println(s);


        }


    }
}
