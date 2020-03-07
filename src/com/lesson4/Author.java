package com.lesson4;

public class Author {
    String authorName;
    String authorSurname;

    public Author(String authorNam, String authorSurname){
        this.authorName = authorNam;
        this.authorSurname = authorSurname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                '}';
    }
}
