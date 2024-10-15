import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class PuttingIntoPractice {
    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        List<Transaction> transactions2011 = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(Collectors.toList());

        System.out.println("Query 1: Transactions from 2011 sorted by value:");
        transactions2011.forEach(System.out::println);


        // Query 2: What are all the unique cities where the traders work?
        Set<String> uniqueCities = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .collect(Collectors.toSet());

        System.out.println("\nQuery 2: Unique cities where traders work:");
        uniqueCities.forEach(System.out::println);


        // Query 3: Find all traders from Cambridge and sort them by name.
        List<Trader> tradersFromCambridge = transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> t.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(Collectors.toList());

        System.out.println("\nQuery 3: Traders from Cambridge sorted by name:");
        tradersFromCambridge.forEach(System.out::println);


        // Query 4: Return a string of all traders' names sorted alphabetically.
        String traderNames = transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));

        System.out.println("\nQuery 4: All traders' names sorted alphabetically:");
        System.out.println(traderNames);


        // Query 5: Are there any trader based in Milan?
        boolean anyTraderInMilan = transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equals("Milan"));

        System.out.println("\nQuery 5: Is any trader based in Milan?");
        System.out.println(anyTraderInMilan);


        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Milan"))
                .forEach(t -> t.getTrader().setCity("Cambridge"));

        System.out.println("\nQuery 6: Updated traders from Milan to Cambridge:");
        transactions.forEach(System.out::println);


        // Query 7: What's the highest value in all the transactions?
        int highestValue = transactions.stream()
                .map(Transaction::getValue)
                .max(Integer::compare)
                .orElse(0);

        System.out.println("\nQuery 7: Highest value in all transactions:");
        System.out.println(highestValue);
    }
}