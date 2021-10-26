package com.company;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {

    HashSet<Person> hashSet = new HashSet<>();

    public void addNewThingHash(Person person)//metoda dodająca do elementy kolekcji
    {
        hashSet.add(person);
        System.out.println("Dodaje person"+hashSet.size()+" (HashSet)");
    }

    public void deletePersonHash(Person person)//metoda usuwająca element o indeksie a
    {
        hashSet.remove(person);
        System.out.println("\n\nUsuwam osobe: ");
        System.out.println(person.getFirstname()+" "+person.getLastname()+" "+person.getJob()+" "+person.getAge()+"\n");
    }

    public void printHash()//metoda wyswietlajaca kolekcję
    {
        System.out.println("\n\nWyświetlam kolekcje HashSet:\n");
        System.out.println("-----------------------");
        for(Person k: hashSet)
        {
            System.out.println(k.getFirstname()+" "+k.getLastname()+" "+k.getJob()+" "+k.getAge()+"");
        }
        System.out.println("-----------------------");
    }

    TreeSet<Person> treeSet = new TreeSet<>();

    public void addNewThingTree(Person person)//metoda dodająca do elementy kolekcji
    {
        treeSet.add(person);
        System.out.println("Dodaje person"+treeSet.size()+" (TreeSet)");
    }

    public void deletePersonTree(Person person)//metoda usuwająca element o indeksie a
    {
        treeSet.remove(person);
        System.out.println("\n\nUsuwam osobe: ");
        System.out.println(person.getFirstname()+" "+person.getLastname()+" "+person.getJob()+" "+person.getAge()+"\n");
    }

    public void printTree()//metoda wyswietlajaca kolekcję
    {
        System.out.println("\n\nWyświetlam kolekcje TreeSet:\n");
        System.out.println("-----------------------");
        for(Person k: treeSet)
        {
            System.out.println(k.getFirstname()+" "+k.getLastname()+" "+k.getJob()+" "+k.getAge());
        }
        System.out.println("-----------------------");
    }


}
