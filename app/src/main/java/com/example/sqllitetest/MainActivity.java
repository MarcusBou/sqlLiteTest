package com.example.sqllitetest;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SqlLiteHelper sqlHelp = new SqlLiteHelper(this);
        sqlHelp.onUpgrade(sqlHelp.getWritableDatabase(), 1, 2);

        sqlHelp.addContact("Karsten");
        sqlHelp.addContact("Lissi");
        sqlHelp.addContact("Ove");

        Contact getById = sqlHelp.getContact(1);
        Log.i("Contacts" , getById.get_name());

        List<Contact> contactList = sqlHelp.getAllContacts();
        for (Contact contact : contactList){
            Toast.makeText(this, contact.get_name(),Toast.LENGTH_SHORT).show();
        }
    }

}