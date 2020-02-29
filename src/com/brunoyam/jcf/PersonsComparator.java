package com.brunoyam.jcf;

import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.toString().compareTo(o1.toString());
    }
}
