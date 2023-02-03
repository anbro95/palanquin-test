package org.example;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IDateSorterImpl implements IDateSorter{

    @Override
    public Collection<LocalDate> sortDates(final List<LocalDate> unsortedDates) {
        final List<LocalDate> result = datesWithRMonths(unsortedDates);
        result.addAll(datesWithoutRMonths(unsortedDates));

        return result;
    }

    private List<LocalDate> datesWithRMonths(final List<LocalDate> dates) {
        return dates.stream()
                .filter(date -> date.getMonth().name().toLowerCase().contains("r"))
                .sorted()
                .collect(Collectors.toList());
    }

    private Collection<LocalDate> datesWithoutRMonths(final List<LocalDate> dates) {
        return dates.stream()
                .filter(date -> !date.getMonth().name().toLowerCase().contains("r"))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
