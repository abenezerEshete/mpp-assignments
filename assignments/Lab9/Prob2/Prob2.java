package HomeWork9;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prob2 {

    public static void main(String[] args) {

        printSquares(4);

    }


    public static void printSquares(int num){
        IntStream.iterate(1, x->x+1)
                .limit(num)
                .map(x->x*x)
               .forEach(x-> System.out.print(x +","));
    }
}
