import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Event {
    String name;
    LocalDate date;

    Event(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }
}

public class EventProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Event> events = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            LocalDate date = LocalDate.parse(sc.next());
            events.add(new Event(name, date));
        }
        int month = sc.nextInt();
        List<Event> sortedEvents = events.stream()
                .sorted(Comparator.comparing(e -> e.date))
                .collect(Collectors.toList());
        sortedEvents.forEach(e -> System.out.print(e.name + " "));
        System.out.println();
        Event earliest = Collections.min(events, Comparator.comparing(e -> e.date));
        System.out.println(earliest.name);
        Event latest = Collections.max(events, Comparator.comparing(e -> e.date));
        System.out.println(latest.name);
       
        List<Event> monthEvents = sortedEvents.stream()
                .filter(e -> e.date.getMonthValue() == month)
                .collect(Collectors.toList());
        monthEvents.forEach(e -> System.out.print(e.name + " "));
    }
}
