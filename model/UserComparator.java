package model;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        Integer comp = o1.getName().compareTo(o2.getName());
        if (comp == 0) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
        return comp;
    }
}
