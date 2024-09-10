package service;

import java.util.ArrayList;

import model.Student;
import studyingGroup.StudyingGroup;

public interface Sort {     //Dependency inversion principle, выделены отдельные классы для интерфейса
    ArrayList<Student> sort(StudyingGroup group);
}
