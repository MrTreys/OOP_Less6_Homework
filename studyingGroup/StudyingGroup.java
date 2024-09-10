package studyingGroup;

import java.util.ArrayList;
import java.util.Iterator;

import model.Student;

public class StudyingGroup implements Iterable<Student>{
    private final Integer groupNumber;
    private ArrayList<Student> group;

    public StudyingGroup(Integer groupNumber, ArrayList<Student> group) {
        this.groupNumber = groupNumber;
        this.group = group;
    }

    public StudyingGroup(Integer groupNumber) {
        this(groupNumber, new ArrayList<>());
    }

    public Integer getGroupNumber() {
        return groupNumber;
    }

    public ArrayList<Student> getGroup() {
        return group;
    }

    public void add(Student student) {
        group.add(student);
    }

    public void remove(Student student) {
        group.remove(student);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Student student : group) sb.append(student + " ");
        return String.valueOf(sb);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudyingGroupIterator(this);
    }
}
