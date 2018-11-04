package com.telesens.academy.lesson08.enumdemo;

public class EnumDemo {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;

        System.out.println(season);
        System.out.println(season.next());

        Season nextSeason = season.next();
        assert nextSeason == Season.WINTER;
    }
}
