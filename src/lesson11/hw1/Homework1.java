package lesson11.hw1;

import java.util.ArrayList;
import java.util.List;

public class Homework1 {
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Slava", "01", 8f));
        students.add(new Student("Roman", "01", 7f));
        students.add(new Student("Angelina", "02", 5f));
        students.add(new Student("Dmitry", "02", 7f));
        students.add(new Student("Ivan", "02", 4f));
        students.add(new Student("Sasha", "03", 9f));

        System.out.println(getByMark(students, 8f));

        List<Group> groupList = new ArrayList<>();

        for (int i = 0; i < students.size(); i++)
        {
            Group group = getByGroup(groupList, students.get(i).getGroup());

            if (group == null)
            {
                Group newGroup = new Group(students.get(i).getGroup(), 1);
                groupList.add(newGroup);
            }
            else
            {
                int currentAmount = group.getStudentsAmount();
                group.setStudentsAmount(currentAmount + 1);
            }
        }

        System.out.println(groupList);
    }

    private static Group getByGroup(List<Group> groupList, String group)
    {
        for (Group gr: groupList)
        {
            if (gr.getGroup().equals(group))
            {
                return gr;
            }
        }
        return null;
    }

    private static List<Student> getByMark(List<Student> students, float mark) {

        List<Student> result = new ArrayList<>();

        for (Student student: students) {
            if (student.getMark() > mark) {
                result.add(student);
            }
        }

        return result;
    }
}
