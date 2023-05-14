package org.example.Streamwithemployee;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        List<Employee1> empList = new ArrayList<>();
        empList.add(new Employee1(101, "Jaydip", 101, "active", 2000));
        empList.add(new Employee1(102, "John", 101, "active", 5000));
        empList.add(new Employee1(103, "James", 102, "inactive", 6000));
        empList.add(new Employee1(104, "Harry", 102, "inactive", 4000));
        empList.add(new Employee1(105, "Hanz", 103, "active", 3500));
        empList.add(new Employee1(106, "Bond", 103, "inactive", 3500));
        empList.add(new Employee1(107, "Michal", 104, "active", 3500));

       // System.out.println(empList);
        //        Print employee details based on department

//        Map<Integer, List<Employee1>> collect = empList.stream().collect(Collectors.groupingBy(e -> e.getDeptId(), Collectors.toList()));
//        collect.entrySet().forEach(p-> System.out.println(p.getKey() +":->" + p.getValue()));

        //        Print employee count working in each department
//        Map<Integer, Long> collect = empList.stream().collect(Collectors.groupingBy(Employee1::getDeptId, Collectors.counting()));
//        collect.entrySet().forEach(p-> System.out.println(p.getKey() +" : "+ p.getValue()));

        //        Print active and inactive employees in given collection
//        Map<String, List<Employee1>> collect = empList.stream()
//                                            .collect(Collectors.groupingBy(Employee1::getStatus, Collectors.toList()));
//        collect.entrySet().forEach(p-> System.out.println(p.getKey() +" :" + p.getValue()));

        //        Print only count of active and inactive employees
//        Map<Object, Long> collect = empList.stream().collect(Collectors.groupingBy(e -> e.getStatus(), Collectors.counting()));
//        collect.entrySet().forEach(p-> System.out.println(p.getKey() +" :" + p.getValue()));

        //        Print Max/Min Employee salary from given collection
//        Optional<Employee1> max = empList.stream().max(Comparator.comparing(e -> e.getSalary()));
//        System.out.println(max.get().getSalary());
//        Optional<Employee1> min= empList.stream().min(Comparator.comparing(e -> e.getSalary()));
//          System.out.println(min.get().getSalary());

        //        Print Max salary of an employee from each department
//        Map<Integer, List<Employee1>> collect = empList.stream().collect(Collectors.groupingBy(Employee1::getDeptId, Collectors.toList()));
//        collect.entrySet().forEach(p-> System.out.println(p.getKey() +" = " + p.getValue().stream().max(Comparator.comparing(Employee1::getSalary)).get()));

        //        Using MaxBy Function

//        Map<Integer, Optional<Employee1>> collect = empList.stream().collect(Collectors.groupingBy(Employee1::getDeptId, Collectors.maxBy(Comparator.comparing(Employee1::getSalary))));
//        collect.entrySet().forEach(p-> System.out.println(p.getKey() +" :" + p.getValue().get()));

        //        Total salary given by organization to all the employees
//        Integer total = empList.stream().map(e -> e.getSalary())
//                .reduce(0, Integer::sum);
//        System.out.println(total);

//        Map<Integer, List<Employee1>> collect = empList.stream().collect(Collectors.groupingBy(Employee1::getDeptId, Collectors.toList()));
//        collect.entrySet().forEach(p-> System.out.println(p.getKey() +" "+ p.getValue().stream().map(e->e.getSalary()).reduce(0,Integer::sum) ));

        
    }

}
