package com.example.sqllitetest;

public class Contact {
    private int _id;
    private String _name;

    public Contact(int id, String name){
        this._id = id;
        this._name = name;
    }

    public int get_id() {
        return _id;
    }

    public String get_name() {
        return _name;
    }
}
