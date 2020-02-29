package com.brunoyam.jcf;

public class Person implements Comparable {

    private String name;
    private String surname;
    private String secondName;

    public Person(String name,
                  String surname,
                  String secondName) {
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + secondName;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Person) {
            Person person2 = (Person) o;
            int result = name.length()
                    + surname.length()
                    + secondName.length()
                    - person2.name.length()
                    - person2.surname.length()
                    - person2.secondName.length();
            return result;
        } else {
            return 1;
        }
    }
}
