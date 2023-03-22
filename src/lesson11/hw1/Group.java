package lesson11.hw1;

public class Group
{
    private String group;
    private int studentsAmount;

    public Group()
    {
    }

    public Group(String group, int studentsAmount)
    {
        this.group = group;
        this.studentsAmount = studentsAmount;
    }

    public String getGroup()
    {
        return group;
    }

    public void setGroup(String group)
    {
        this.group = group;
    }

    public int getStudentsAmount()
    {
        return studentsAmount;
    }

    public void setStudentsAmount(int studentsAmount)
    {
        this.studentsAmount = studentsAmount;
    }

    @Override
    public String toString()
    {
        return "GroupMark{" +
                "group='" + group + '\'' +
                ", studentsAmount=" + studentsAmount +
                '}';
    }
}