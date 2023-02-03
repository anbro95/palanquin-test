package org.example;

import java.time.LocalDate;
import java.util.List;

public class Main {
    private static final IDateSorter iDateSorter = new IDateSorterImpl();
    public static void main(String[] args) {

        System.out.println(iDateSorter.sortDates(List.of(
                LocalDate.of(2005, 7, 1),
                LocalDate.of(2005, 8, 1),
                LocalDate.of(2001, 8, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2005, 1, 6),
                LocalDate.of(2006, 1, 1),
                LocalDate.of(2005, 5, 3),
                LocalDate.of(2009, 10, 3),
                LocalDate.of(2005, 10, 3),
                LocalDate.of(2005, 11, 5)
        )));
    }
}