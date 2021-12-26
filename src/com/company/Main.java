package com.company;

public class Main {

    public static void main(String[] args) {
        MyQueueList myQueueList = new MyQueueList();
//        myQueueList.add("1");
//        myQueueList.add("2");
//        myQueueList.add("3");
        myQueueList.pool();
        System.out.println(myQueueList.element());
        System.out.println(myQueueList.toString());
    }
}
