package baekjoon;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q1157 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next().toUpperCase();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if ( !map.containsKey(str.charAt(i)) ) {
                map.put(str.charAt(i), 1);
            } else {
                map.replace(str.charAt(i), map.get(str.charAt(i))+1);
            }
        }

        Stream<Map.Entry<Character, Integer>> sorted = map.entrySet().stream()
                .sorted(new Comparator<Map.Entry<Character, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                        return o2.getValue().compareTo(o1.getValue());
                    }
                });

        List<Map.Entry<Character, Integer>> collect = sorted.collect(Collectors.toList());

        if ( collect.size() == 1 ) {
            System.out.println(collect.get(0).getKey());
        } else if (collect.get(0).getValue().equals(collect.get(1).getValue())) {
            System.out.println('?');
        } else {
            System.out.println(collect.get(0).getKey());
        }
    }
}
