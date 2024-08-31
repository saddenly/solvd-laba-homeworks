package com.example.solvd.august29;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(4);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}