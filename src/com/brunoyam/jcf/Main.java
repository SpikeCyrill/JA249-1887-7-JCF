package com.brunoyam.jcf;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Person ivan = new Person("Ivan", "Ivanov", "Ivanovich");
        Person petr = new Person("Petr", "Petrov", "Petrovich");
        Person anna = new Person("Anna", "Anina", "Petrovna");

        LinkedList<Person> persons = new LinkedList<>();
        persons.add(ivan);
        persons.add(petr);
        persons.add(anna);

        printCollection(persons);

        Collections.sort(persons);

        printCollection(persons);

        Collections.sort(persons, new PersonsComparator());


        Comparator<Person> personsComparator2 = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.toString().compareTo(o1.toString());
            }
        };

        Collections.sort(persons, personsComparator2);

        Collections.sort(persons, (o1, o2) -> {
            return o2.toString().compareTo(o1.toString());
        });

        printCollection(persons);

        Iterator<Person> personsIterator = persons.iterator();

        while (personsIterator.hasNext()) {
            //do smth
            personsIterator.next();
        }

        persons.forEach(person -> {
            System.out.println("from lambda : " + person.toString());
        });

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Moscow");
        hashSet.add("New-York");
        hashSet.add("London");
        hashSet.add("Paris");
        hashSet.add("Moscow");

        System.out.println("min = " + Collections.min(hashSet));

        printCollection(hashSet);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Moscow");
        arrayList.add("New-York");
        arrayList.add("London");
        arrayList.add("Paris");
        arrayList.add("Moscow");

        System.out.println("second is = " + arrayList.get(2));

        printCollection(arrayList);

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Moscow");
        linkedList.add("New-York");
        linkedList.add("London");
        linkedList.add("Paris");
        linkedList.add("Moscow");

        System.out.println("second is = " + linkedList.get(2));

        printCollection(linkedList);

        Collections.shuffle(linkedList);

        printCollection(linkedList);

        Collections.sort(linkedList);

        printCollection(linkedList);

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(0, "Moscow");
        hashMap.put(2, "New-York");
        hashMap.put(1, "London");
        hashMap.put(5, "Paris");
        hashMap.put(0, "Moscow");

        printCollection(hashMap.values());

    }

    public static <T> void printCollection(Collection<T> collection) {

        for(T str : collection) {
            System.out.println(str);
        }

        collection.forEach(System.out::println);

        System.out.println("=======");

    }

}
