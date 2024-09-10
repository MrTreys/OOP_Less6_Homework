import java.util.ArrayList;
import java.util.Random;

import model.Student;
import service.NameSort;
import studyingGroup.StudyingGroup;
import studyingGroup.StudyingGroupIterator;
import studyingGroup.StudyingGroupWorker;

import java.util.Collections;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        StudyingGroup group1 = new StudyingGroup(1);
        StudyingGroup group2 = new StudyingGroup(2);
        StudyingGroupWorker studyingGroupWorker1 = new StudyingGroupWorker(group1);
        StudyingGroupWorker studyingGroupWorker2 = new StudyingGroupWorker(group2);

        for (int i = 0; i < 10; i++) {
            list.add(new Student(String.format("Student %d", i), 1, new Random().nextInt(18, 27)));
        }

        for (Student student : list) {
            if (new Random().nextBoolean()) studyingGroupWorker1.acceptStudent(student);
            else studyingGroupWorker2.acceptStudent(student);
        }

        StudyingGroupIterator iterator = new StudyingGroupIterator(group1);
        // StudyingGroupIterator iterator2 = new StudyingGroupIterator(group2);

        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }
        // System.out.println();

        // while (iterator2.hasNext()) {
        //     System.out.println(iterator2.next());
        // }

        Collections.sort(group1.getGroup());

        // iterator = new StudyingGroupIterator(group1);

        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        iterator = new StudyingGroupIterator(group1);
        NameSort nameSort = new NameSort();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        group1 = new StudyingGroup(1, nameSort.sort(group1));

        iterator = new StudyingGroupIterator(group1);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
