package org.josesg.ejemplos.set;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs);
    }
}
