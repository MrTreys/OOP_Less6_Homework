package controller;

import java.util.ArrayList;
import model.Student;
import service.IDSort;
import service.NameSort;
import studyingGroup.StudyingGroup;

public class StudentSortController {    //Single responsibility principle, выделен отдельный класс для сорировки
    private final IDSort idSort = new IDSort();
    private final NameSort nameSort = new NameSort();

    public ArrayList<Student> sortById(StudyingGroup group) {
        return idSort.sort(group);
    }

    public ArrayList<Student> sortByName(StudyingGroup group) {
        return nameSort.sort(group);
    }
}
