package colletion;

import jdk.internal.icu.text.UnicodeSet;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

import java.util.ArrayList;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> Country = new HashSet<>();
        Set<String> states = new HashSet<>();
        Country.add("India");
        Country.add("Italia");
        Country.add("Butan");
        Country.add("Kerala");
        Country.add("UK");
        Country.add(null);
        Country.remove("UK");
        System.out.println(Country);


        states.add("Maharashtra");
        states.add("AP");
        states.add("Kerala");
        states.add("India");
        Country.addAll(states); //union
        System.out.println(Country);

        Country.retainAll(states); //intersection
        System.out.println(Country);
        Country.containsAll(states);
        System.out.println(Country);

    }
}
