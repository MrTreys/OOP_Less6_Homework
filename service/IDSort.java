package service;

import java.util.ArrayList;

import model.Student;
import studyingGroup.StudyingGroup;

public class IDSort implements Sort {   ////Single Responsibility Principle, отдельный класс для сортировки по ID

    @Override
    public ArrayList<Student> sort(StudyingGroup group) {
        ArrayList<Student> newGroup = group.getGroup();
        newGroup.sort((s1, s2) -> Integer.compare((int) s1.getId(), (int) s2.getId()));
        return newGroup;
    }
    
}
