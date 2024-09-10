package service;

import model.Student;
import studyingGroup.StudyingGroup;

import java.util.ArrayList;

public class NameSort implements Sort {
    
    @Override
    public ArrayList<Student> sort(StudyingGroup group) {   //Single Responsibility Principle, отдельный класс для сортировки по имени
        ArrayList<Student> newGroup = group.getGroup();
        newGroup.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        return newGroup;
    }

}
