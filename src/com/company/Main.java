package com.company;

public class Main {

    public static void main(String[] args) {
        String firstName = "����", secondName = "������", middleName = "��������";
        String fullName = secondName + " " + firstName + " " + middleName;
        System.out.println("��� ����������: " + fullName);
        String fullNameInUpperCase = fullName.toUpperCase();
        System.out.println("������ ��� ���������� ��� ���������� ������: " + fullNameInUpperCase);
        System.out.println("������ ��� ���������� ��� ���������� ������: " + fullName.replace(" ", "; "));
        System.out.println("��� ����������: " + fullName.replace("�", "�"));
    }
}
