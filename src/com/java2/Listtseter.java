package com.java2;

import java.util.ArrayList;
import java.util.List;
public class Listtseter {

	public static void main(String[] args) {
    List<Integer> cards = new ArrayList<>();
    cards.add(0);
    cards.add(1);
    cards.add(3);
    System.out.println("removing number"+cards.remove(0));
    System.out.println(cards.size());
    System.out.println(cards.get(1));
	}

}
