package service;

import model.Student;
import studyingGroup.StudyingGroup;
import studyingGroup.StudyingGroupWorker;

public class StudyingGroupService {
    public void removeStudent(StudyingGroup group, String name) {
        StudyingGroupWorker studyingGroupWorker = new StudyingGroupWorker(group);
        for (Student student : group) {
            if (student.getName().equals(name)) {
                studyingGroupWorker.removeStudent(student);
            }
        }
    }
}
