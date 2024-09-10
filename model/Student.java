package model;

public class Student extends User implements Comparable<Student> {
    private final long id;
    private Integer group;
    private static int defaultName = 1;
    private static long defaultId = 128; 

    public Student(String name, String lastName, Integer age, long id, Integer group) {
        super(name, lastName, age);
        this.id = id;
        this.group = group;
    }

    public Student(String name, String lastName, Integer age, Integer group) {
        this(name, lastName, age, defaultId++, group);
    }

    public Student(String name, Integer group, Integer age) {
        this(name, "Unknown", age, group);
    }

    public Student(String name) {
        this (name, 1, 18);
    }

    public Student() {
        this(String.format("Student %d", defaultName++));
    }

    public long getId() {
        return this.id;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return String.format("%s, %d years old, group %d\n", this.name, this.age, this.group);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare((int) this.getId(), (int) o.getId());
    }
}
