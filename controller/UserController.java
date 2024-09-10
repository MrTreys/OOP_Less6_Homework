package controller;

import model.User;
import studyingGroup.StudyingGroup;

public interface UserController<T extends User> {
    void create(StudyingGroup group, String name, String lastName, int age);
}
