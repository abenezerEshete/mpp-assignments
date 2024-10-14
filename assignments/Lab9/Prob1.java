package HomeWork9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Prob1 {


    public static void main(String[] args) {

        List<String> words = Arrays.asList("San","cat","dog","Baby","Walk","candle");


        System.out.println(countWords(words,'c','d',3));

    }

    public static int countWords(List<String> words, char c, char d, int len){
        return (int) words.stream()
                .filter(x->x.length()==len)
                .filter(x->x.indexOf(c)>=0)
                .filter(x->x.indexOf(d)<0)
                .count();

    }

}
