package com.ofs.training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generics {

    public static void main(String[] args) {

        List<String> elements = new ArrayList<String>();
        elements.add("bharathy");
        elements.add("BHARATHYRAMESH");
//        elements.add(5); throws compile time error

        Iterator sort = elements.iterator();
        while (sort.hasNext()) {
            System.out.println(sort.next());
        }
    }
}
