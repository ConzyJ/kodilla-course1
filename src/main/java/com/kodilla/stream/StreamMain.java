package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Hello World", text -> "ABC " + text + " ABC");
        poemBeautifier.beautify("Hello World", text -> text.toUpperCase());
        poemBeautifier.beautify("Hello World", text -> text.replace("o", "0"));
        poemBeautifier.beautify("Hello World", text -> new StringBuilder(text).reverse().toString());
    }
}
