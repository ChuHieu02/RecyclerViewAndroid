package com.chuhieu.recyclerview_android;

public class Products {
    String Id , Name ;

    public Products(String id, String name) {
        Id = id;
        Name = name;
    }

    public Products() {

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
