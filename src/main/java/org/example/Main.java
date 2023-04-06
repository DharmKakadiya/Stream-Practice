package org.example;

import java.util.*;
import java.util.stream.Collectors;

class Info {
    int id;
    String name;

    public Info(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "info{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");

        List<Info> list=new ArrayList<>();
        list.add(new Info(105,"dharm"));
        list.add(new Info(103,"dharm"));
        list.add(new Info(102,"kevin"));
        list.add(new Info(101,"kevin"));
        list.add(new Info(104,"mirav"));
        list.add(new Info(104,"mirav"));


        //pring the data in sorted by id..
        //list.stream().sorted(Comparator.comparing(Info::getId)).forEach(System.out::println);


      //   print the repeated name that how many time one name is repeatating...
//        Map<String, Long> a=list.stream().collect(Collectors.groupingBy(Info::getName,Collectors.counting()));
//        System.out.println(a);


        //  details of max id
//         Optional<Info> a=list.stream().max(Comparator.comparing(Info::getId));
//        System.out.println(a);

        //split the string

//        String s = String.valueOf(list.stream().filter(i -> i.getName() == "dharm"));
//        System.out.println(s);


    }
}