package com.company;

public class Main {

    public static void main(String[] args) {
        String firstName = "Семён", secondName = "Иванов", middleName = "Семёнович";
        String fullName = secondName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника: " + fullName);
        String fullNameInUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета: " + fullNameInUpperCase);
        System.out.println("Данные ФИО сотрудника для заполнения отчета: " + fullName.replace(" ", "; "));
        System.out.println("ФИО сотрудника: " + fullName.replace("ё", "е"));
    }
}
