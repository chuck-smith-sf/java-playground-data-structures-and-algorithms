package com.chucksmith;

import java.util.ArrayList;
import java.util.HashMap;

public class XMLElement {

    HashMap<String, String> attributes = new HashMap<>();
    ArrayList<XMLElement> children = new ArrayList<>();

    void addAttribute(String name, String value){
        attributes.put(name, value);
    }

    void addChild(XMLElement child){
        children.add(child);
    }

    @Override
    public String toString() {
        return "XMLElement{" +
                "attributes=" + attributes +
                ", children=" + children +
                '}';
    }
}

