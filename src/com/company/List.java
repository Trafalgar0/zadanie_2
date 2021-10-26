package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class List {

    ArrayList<Person> arrayList = new ArrayList<Person>();

    public void addNewThingArray(Person person)//metoda dodająca do elementy kolekcji
    {
        arrayList.add(person);
        System.out.println("Dodaje person"+arrayList.size()+" (ArrayList)");
    }

    public void deletePersonArray(int a)//metoda usuwająca element o indeksie a
    {
        arrayList.remove(a);
        System.out.println("\n\nUsuwam osobe o indeksie: "+a+"\n");
    }

    public void printArray()//metoda wyswietlajaca kolekcję
    {
        System.out.println("\n\nWyświetlam kolekcje ArrayList:\n");
        System.out.println("-----------------------");
        for(Person k: arrayList)
        {
            System.out.println(k.getFirstname()+" "+k.getLastname()+" "+k.getJob()+" "+k.getAge());
        }
        System.out.println("-----------------------");
    }


    LinkedList<Person> linkedList = new LinkedList<Person>();

    public void addNewThingLinked(Person person)//metoda dodająca do elementy kolekcji
    {
        linkedList.add(person);
        System.out.println("Dodaje person"+linkedList.size()+" (LinkedList)");
    }
    public void deletePersonLinked(int a)//metoda usuwająca element o indeksie a
    {
        linkedList.remove(a);
        System.out.println("\n\nUsuwam osobę o indeksie: "+a+"\n");
    }

    public void printLinked()//metoda wyswietlajaca kolekcję
    {
        System.out.println("\n\nWyświetlam kolekcje LinkedList:\n");
        System.out.println("-----------------------");
        for(Person k: linkedList)
        {
            System.out.println(k.getFirstname()+" "+k.getLastname()+" "+k.getJob()+" "+k.getAge());
        }
        System.out.println("-----------------------");

    }





}
