package com.lab;

import java.util.Set;
import java.util.Map;

public class Library {
    private Set<String> bookTitles;
    private Map<String, String> authorBookMap;

    public void setBookTitles(Set<String> bookTitles) { this.bookTitles = bookTitles; }
    public void setAuthorBookMap(Map<String, String> authorBookMap) { this.authorBookMap = authorBookMap; }

    public void display() {
        System.out.println("===== Library Catalog =====");
        System.out.println("Unique Book Titles (Set):");
        bookTitles.forEach(b -> System.out.println(" -> " + b));
        System.out.println();
        System.out.println("Author-to-Book Mappings (Map):");
        authorBookMap.forEach((author, title) -> System.out.println(" -> " + author + " : " + title));
    }
}
