package com.company;

import java.util.Objects;

public class Dialog {

    List list = new List();
    Map map = new Map();
    Set set = new Set();

    Person person1 = new Person("Janusz", "Kowalski", "piekarz", 43);
    Person person2 = new Person("Janusz", "Kowalski", "piekarz", 43);
    Person person3 = new Person("Janusz", "Kowalski", "piekarz", 43);
    Person person4 = new Person("Adam", "Nowak", "kucharz", 26);
    Person person5 = new Person("Paulina", "Wójcik", "programista", 28);

    public void funkcja()
    {
        System.out.println("\n\nDziałania na kolekcji ArrayList\n");
        list.addNewThingArray(person1);
        list.addNewThingArray(person2);
        list.addNewThingArray(person3);
        list.addNewThingArray(person4);
        list.addNewThingArray(person5);
        list.printArray();
        list.deletePersonArray(0);
        list.printArray();
        System.out.println("\nNaciśnij enter, aby kontynuować");
        try{System.in.read();}
        catch(Exception e){}

        System.out.println("\n\nDziałania na kolekcji LinkedList\n");
        list.addNewThingLinked(person1);
        list.addNewThingLinked(person2);
        list.addNewThingLinked(person3);
        list.addNewThingLinked(person4);
        list.addNewThingLinked(person5);
        list.printLinked();
        list.deletePersonLinked(0);
        list.printLinked();
        System.out.println("\nNaciśnij enter, aby kontynuować");
        try{System.in.read();}
        catch(Exception e){}

        System.out.println("\n\nDziałania na kolekcji HashMap\n");
        map.addNewThingHash(person1);
        map.addNewThingHash(person2);
        map.addNewThingHash(person3);
        map.addNewThingHash(person4);
        map.addNewThingHash(person5);
        map.printHash();
        map.deletePersonHash(0);
        map.printHash();
        System.out.println("\nNaciśnij enter, aby kontynuować");
        try{System.in.read();}
        catch(Exception e){}

        System.out.println("\n\nDziałania na kolekcji TreeMap\n");
        map.addNewThingTree(person1);
        map.addNewThingTree(person2);
        map.addNewThingTree(person3);
        map.addNewThingTree(person4);
        map.addNewThingTree(person5);
        map.printTree();
        map.deletePersonTree(0);
        map.printTree();
        System.out.println("\nNaciśnij enter, aby kontynuować");
        try{System.in.read();}
        catch(Exception e){}

       System.out.println("\n\nDziałania na kolekcji TreeSet\n");
        set.addNewThingTree(person1);
        set.addNewThingTree(person2);
        set.addNewThingTree(person3);
        set.addNewThingTree(person4);
        set.addNewThingTree(person5);
        set.printTree();
        set.deletePersonTree(person1);
        set.printTree();
        System.out.println("\nNaciśnij enter, aby kontynuować");
        try{System.in.read();}
        catch(Exception e){}

        System.out.println("\n\nDziałania na kolekcji HashSet\n");
        set.addNewThingHash(person1);
        set.addNewThingHash(person2);
        set.addNewThingHash(person3);
        set.addNewThingHash(person4);
        set.addNewThingHash(person5);
        set.printHash();
        set.deletePersonHash(person1);
        set.printHash();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dialog dialog = (Dialog) o;
        return person1.equals(dialog.person1) && person2.equals(dialog.person2) && person3.equals(dialog.person3) && person4.equals(dialog.person4) && person5.equals(dialog.person5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person1, person2, person3, person4, person5);
    }
}
