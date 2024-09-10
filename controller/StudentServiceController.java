package controller;

import model.Student;
import studyingGroup.StudyingGroup;
import studyingGroup.StudyingGroupWorker;

import java.util.Random;

public class StudentServiceController implements UserController<Student> { //Single responsibility principle, выделен отдельный класс для StudentService
    @Override
    public void create(StudyingGroup group, String name, String lastName, int age) {
        StudyingGroupWorker studyingGroupWorker = new StudyingGroupWorker(group);
        studyingGroupWorker.acceptStudent(new Student(name, lastName, new Random().nextInt(18, 27), 1));
    }
    
    public static void removeStudent(StudyingGroup group, String name) {
        StudyingGroupWorker studyingGroupWorker = new StudyingGroupWorker(group);
        studyingGroupWorker.removeStudent(name);
    }
}
