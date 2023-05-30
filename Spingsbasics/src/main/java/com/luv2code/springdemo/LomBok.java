package com.luv2code.springdemo;


public class LomBok {
    //Example of Lombok Auto Constructor
    public static void main(String[] args) {
        Cricket cricket = new Cricket("India", 01);
//        cricket.setTeam("India");
//        cricket.setRank(02);

        System.out.println(cricket.getTeam());
        System.out.println(cricket.getRank());
        System.out.println(cricket.toString());
    }
}