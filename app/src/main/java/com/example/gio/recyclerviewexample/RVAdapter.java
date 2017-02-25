package com.example.gio.recyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Gio on 2/24/2017.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {

    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        TextView personName;
        TextView personAge;

        PersonViewHolder(View itemView) {
            super(itemView);
            personName = (TextView)itemView.findViewById(R.id.tvName);
            personAge = (TextView)itemView.findViewById(R.id.tvsurName);

        }
    }


    List<Person> persons;

    public RVAdapter(List<Person> persons){
        this.persons = persons;
    }



    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_persons, viewGroup, false);
        PersonViewHolder pViewH = new PersonViewHolder(v);
        return pViewH;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.personName.setText(persons.get(i).name);
        personViewHolder.personAge.setText(persons.get(i).surName);
    }



    @Override
    public int getItemCount() {
        return persons.size();
    }



}
