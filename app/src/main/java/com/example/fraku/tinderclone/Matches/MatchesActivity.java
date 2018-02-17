package com.example.fraku.tinderclone.Matches;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import com.example.fraku.tinderclone.R;

import java.util.ArrayList;
import java.util.List;

public class MatchesActivity extends AppCompatActivity {

    private RecyclerView mRecyclerview;
    private RecyclerView.Adapter mMatchesAdapter;
    private RecyclerView.LayoutManager mMatchesLayoutMenager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matches);

        mRecyclerview = (RecyclerView)findViewById(R.id.recyclerView);
        mRecyclerview.setScrollbarFadingEnabled(false);
        mRecyclerview.setHasFixedSize(true);

        //Przypisanie Layoutu
        mMatchesLayoutMenager = new LinearLayoutManager(MatchesActivity.this);
        mRecyclerview.setLayoutManager(mMatchesLayoutMenager);
        mMatchesAdapter = new MatchesAdapter(getDataSetMatches(),MatchesActivity.this);
        mRecyclerview.setAdapter(mMatchesAdapter);

        //Dodawanie objektow
        for (int i=0; i<100; i++) {
            MatchesObject obj = new MatchesObject(Integer.toString(i));
            resultsMatches.add(obj);
        }
        mMatchesAdapter.notifyDataSetChanged();
    }

    private ArrayList<MatchesObject> resultsMatches = new ArrayList<MatchesObject>();
    //metoda pobiera dane i dodaje do adaptera

    private List<MatchesObject> getDataSetMatches() {
        return resultsMatches;
    }


}
