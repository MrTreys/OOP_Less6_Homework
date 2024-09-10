package studyingGroup;

import model.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class StudyingGroupWorker {  ////Single Responsibility Principle, отдельный класс для работы со списком студентов
    private final StudyingGroup group;

    public StudyingGroupWorker(StudyingGroup studyingGroup) {
        this.group = studyingGroup;
    }

    public void acceptStudent(ArrayList<Student> students) {
        for (Student student : students) {
            if (!student.getGroup().equals(group.getGroupNumber())) student.setGroup(group.getGroupNumber());
            group.add(student);
        }
    }

    public void acceptStudent(Student student) {
        acceptStudent(new ArrayList<Student>(Arrays.asList(student)));
    }

    public void removeStudent(Student student) {
        group.remove(student);
    }

    public void removeStudent(String name) {
        for (Student student : group) {
            if (student.getName().equals(name)) removeStudent(student);
        }
    }
}
