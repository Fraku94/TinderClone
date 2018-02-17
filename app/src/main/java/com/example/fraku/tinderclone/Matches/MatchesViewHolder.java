package com.example.fraku.tinderclone.Matches;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.fraku.tinderclone.R;

/**
 * Created by Z710 on 2018-02-17.
 */
//Wyglad tu wszysto z Matches activity buttony textView itp.
public class MatchesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView mMatchesId;


    public MatchesViewHolder(View itemView){
        super(itemView);
        itemView.setOnClickListener(this);

        mMatchesId = (TextView)itemView.findViewById(R.id.Matchid);


    }

    @Override
    public void onClick(View v) {

    }
}
