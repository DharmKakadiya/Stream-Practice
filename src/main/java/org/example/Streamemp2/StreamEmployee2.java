package org.example.Streamemp2;

import com.sun.source.tree.UsesTree;

import java.util.*;
import java.util.stream.Collectors;

public class StreamEmployee2 {
    public static void main(String[] args) {

        //        List<Employee2> list= Arrays.asList(new Employee2(101,"john","A",60000),
//                                            new Employee2(109,"peter","B",30000)
//                                                );
        List<Employee2> empList2 = new ArrayList<>();

        empList2.add(new Employee2(101,"john","A",60000));
        empList2.add(new Employee2(109,"peter","B",30000));
        empList2.add( new Employee2(102,"mak","A",80000));
        empList2.add(new Employee2(103,"kim","A",90000));
        empList2.add(new Employee2(104,"json","C",15000));

//        Map<Integer,Employee2> maplist=new HashMap<>();
//        maplist.put(10,new Employee2(101,"john","A",60000));
//        maplist.put(20,new Employee2(109,"peter","B",30000));
//         maplist.put(30, new Employee2(102, "mak", "A", 80000));
//
//        List<Map.Entry<Integer, Employee2>> collect = maplist.entrySet().stream()
//                .filter(s -> s.getValue().getSalary() > 40000)
//                .collect(Collectors.toList());
//        collect.stream().forEach(p-> System.out.println(p.getKey() +" : "+ p.getValue().getSalary()));

        //collect.stream().forEach(System.out::println);

        //System.out.println(list);

        //        Grade wise printing
//        Map<String, List<Employee2>> collect = empList2.stream().collect(Collectors.groupingBy(Employee2::getGread, Collectors.toList()));
//        collect.entrySet().forEach(p-> System.out.println(p.getKey() +":"+p.getValue()));

        //        Average salary of Grade A Employee
//        OptionalDouble average = empList2.stream().filter(e->e.getGread().equals("A")).map(e -> e.getSalary()).mapToDouble(i -> i).average();
//        System.out.println(average);

        //        Print the square of each element in list
//        List<Integer> list=Arrays.asList(1,2,3,4,5);
//        list.stream().map(e->e*e).forEach(p-> System.out.println(p));

        //        Print Even & Odd
//        List<Integer> list=Arrays.asList(1,2,3,4,5);
//        System.out.println("even");
//        list.stream().filter(e->e%2==0).forEach(p-> System.out.println(p));
//        System.out.println("Odd");
//        list.stream().filter(e->e%2!=0).forEach(p-> System.out.println(p));

        //        Print Numbers starting with Prefix 2 even if it's negative
//        List<Integer> integerList = Arrays.asList(2, -2, 22, 234, 567, 890, 432, 234, 211, 22);
//
//        integerList.stream().map(e->e.toString())
//                .filter(e->e.startsWith("2") || e.startsWith("-2"))
//                .distinct()
//                .forEach(System.out::println);

        //        Check the frequency of the given integer in the given list
//        List<Integer> integerList = Arrays.asList(1,2,3,4,5,2,3,4,5);
//        System.out.println(Collections.frequency(integerList, 3));

        //      Check the frequency of the given string in the given MIX-list
//        List mixOfIntAndStrings = new ArrayList();
//        mixOfIntAndStrings.add("Hello");
//        mixOfIntAndStrings.add(1);
//        mixOfIntAndStrings.add("World");
//        mixOfIntAndStrings.add(2);
//        mixOfIntAndStrings.add("Hello");
//        System.out.println(Collections.frequency(mixOfIntAndStrings, "Hello"));;

        //      print single copy of each element which are duplicates
//        List<Integer> integerList = Arrays.asList(1,2,3,4,5,2,3,4,5);
//        integerList.stream().filter(e->Collections.frequency(integerList,e)>1).distinct().forEach(System.out::println);

        //      Find Max & Min number in given list
//        List<Integer> integerList = Arrays.asList(-1,0,1,2,3,4,5,2,3,4,5);
//        Optional<Integer> max = integerList.stream().max(Comparator.comparing(e -> e.intValue()));
//        System.out.println(max.get());
//        Optional<Integer> min = integerList.stream().min(Comparator.comparing(e -> e.intValue()));
//        System.out.println(min.get());

        //        Find Max & Min using lambda function instead of method references
       // List<Integer> integerList = Arrays.asList(-1,0,1,2,3,4,5,2,3,4,5);
//        System.out.println(integerList.stream().max((e1,e2) -> e2-e1).get());
//        System.out.println(integerList.stream().min((e1,e2) -> e1+e2).get());

        //        Find Max & Min using Reduce method of stream
//        System.out.println( integerList.stream().reduce(1, (a, b) -> a > b ? a : b));
//        System.out.println( integerList.stream().reduce(1, (a, b) -> a < b ? a : b));

//        Set<Integer> collect = integerList.stream().collect(Collectors.toSet());
//        System.out.println(collect);

        //        Sort the given list using stream
        //List<Integer> integerList = Arrays.asList(50,40,30,20,-1,0,1,2,3,4,5,2,3,4,5);
        //ACSEOrder
//        integerList.stream().sorted().forEach(p-> System.out.print(p +" "));
//        System.out.println();
        //DESC order
        //integerList.stream().sorted(Collections.reverseOrder()).forEach(num -> System.out.print(num +" "));

        //        Get/ignore first 5 numbers using Limit & Skip in Streams
       // List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        Get first 5
        //integerList.stream().limit(5).forEach(System.out::println);
        //        Ignore first 5
//        integerList.stream().skip(5).forEach(System.out::println);

        //        Get Second Highest/Lowest Number using Streams
       // List<Integer> integerList = Arrays.asList(2,1,2,6,4,5,10,7,8,9,10);
//        Second Lowest
        //integerList.stream().distinct().sorted().skip(1).limit(1).forEach(System.out::println);
        //second highest num
       // integerList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
//        Map<Integer, List<Employee2>> collect = empList2.stream().collect(Collectors.groupingBy(Employee2::getId, Collectors.toList()));
//    collect.entrySet().forEach(p-> System.out.println(p.getKey() +" :"+ p.getValue().stream().map(e->e.getSalary()).toString()));

    }
}
