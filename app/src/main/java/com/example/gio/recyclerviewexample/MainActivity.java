package com.example.gio.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("aaaa", "aaaa"));
        persons.add(new Person("aaaa", "aaaa"));
        persons.add(new Person("aaaa", "aaaa"));
        persons.add(new Person("aaaa", "aaaa"));
        persons.add(new Person("aaaa", "aaaa"));
        persons.add(new Person("aaaa", "aaaa"));
        persons.add(new Person("aaaa", "aaaa"));
        persons.add(new Person("aaaa", "aaaa"));
        persons.add(new Person("aaaa", "aaaa"));
        persons.add(new Person("aaaa", "aaaa"));
        persons.add(new Person("aaaa", "aaaa"));
        persons.add(new Person("aaaa", "aaaa"));
        persons.add(new Person("aaaa", "aaaa"));
        persons.add(new Person("aaaa", "aaaa"));



        RecyclerView rv = (RecyclerView) findViewById(R.id.rvPersons);

        LinearLayoutManager llm = new LinearLayoutManager(this);  // context
        rv.setLayoutManager(llm);

        RVAdapter adapter = new RVAdapter(persons);
        rv.setAdapter(adapter);

    }
}
