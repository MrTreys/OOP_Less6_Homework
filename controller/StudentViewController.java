package controller;

import model.Student;
import view.StudentView;

import java.util.List;

public class StudentViewController {    //Single responsibility principle, выделен отдельный класс для работы с StudentView
    private final StudentView stView = new StudentView();

        public void sendOnConsole(List<Student> list) {
        stView.sendOnConsole(list);
    }
}
