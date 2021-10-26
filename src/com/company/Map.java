package com.company;

import java.util.HashMap;
import java.util.TreeMap;

public class Map {

    HashMap<Integer, Person> hashMap = new HashMap<>();
    int i=0, j=0;

    public void addNewThingHash(Person person)//metoda dodająca do elementy kolekcji
    {
        hashMap.put(i, person);
        System.out.println("Dodaje person"+hashMap.size()+" (HashMap)");
        i++;
    }

    public void deletePersonHash(int a, Person person)//metoda usuwająca element o indeksie a
    {
        hashMap.remove(a, person);
        System.out.println("\n\nUsuwam osobe: ");
        System.out.println(person.getFirstname()+" "+person.getLastname()+" "+person.getJob()+" "+person.getAge()+"\n");
    }

    public void printHash()//metoda wyswietlajaca kolekcję
    {
        System.out.println("\n\nWyświetlam kolekcje HashMap:\n");
        System.out.println("-----------------------");
        for(Person k: hashMap.values())
        {
            System.out.println(k.getFirstname()+" "+k.getLastname()+" "+k.getJob()+" "+k.getAge());
        }
        System.out.println("-----------------------");
    }

    TreeMap<Integer, Person> treeMap = new TreeMap<>();


    public void addNewThingTree(Person person)//metoda dodająca do elementy kolekcji
    {
        treeMap.put(j, person);
        System.out.println("Dodaje person"+treeMap.size()+" (TreeMap)");
        j++;
    }

    public void deletePersonTree(int a, Person person)//metoda usuwająca element o indeksie a
    {
        treeMap.remove(a, person);
        System.out.println("\n\nUsuwam osobe: ");
        System.out.println(person.getFirstname()+" "+person.getLastname()+" "+person.getJob()+" "+person.getAge()+"\n");
    }

    public void printTree()//metoda wyswietlajaca kolekcję
    {
        System.out.println("\n\nWyświetlam kolekcje TreeMap:\n");
        System.out.println("-----------------------");
        for(Person k: treeMap.values())
        {
            System.out.println(k.getFirstname() + " " + k.getLastname() + " " + k.getJob() + " " + k.getAge());
        }
        System.out.println("-----------------------");
    }



}
