package com.mrTequila.Creational.Prototype;

import java.util.List;

public class PrototypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        Employees employeesNew = (Employees) employees.clone();
        Employees employeesNew1 = (Employees) employees.clone();

        List<String> list = employeesNew.getEmpList();
        list.add("Jaś");
        List<String> list1 = employeesNew1.getEmpList();
        list1.remove("Rysiek");

        System.out.println("employees List: " + employees.getEmpList());
        System.out.println("employeesNew List: " + list);
        System.out.println("employeesNew1 List: " + list1);
    }
}
