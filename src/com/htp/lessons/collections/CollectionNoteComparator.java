package com.htp.lessons.collections;

import java.util.Comparator;

public class CollectionNoteComparator implements Comparator</*here necessary to write the class
that we want to compare*/
        CollectionEntry> {
    @Override
    public int compare(CollectionEntry o1, CollectionEntry o2) {
        return o1.getInfold().compareTo(o2.getInfold());
    }
}
