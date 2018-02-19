package com.example.fraku.tinderclone.Matches;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fraku.tinderclone.R;

/**
 * Created by Z710 on 2018-02-17.
 */
//Wyglad tu wszysto z Matches activity buttony textView itp.
public class MatchesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView mMatchId,mMatchName;
    public ImageView mMatchImage;


    public MatchesViewHolder(View itemView){
        super(itemView);
        itemView.setOnClickListener(this);

        mMatchId = (TextView)itemView.findViewById(R.id.Matchid);
        mMatchName = (TextView)itemView.findViewById(R.id.MatchName);

        mMatchImage = (ImageView)itemView.findViewById(R.id.MatchImage);


    }

    @Override
    public void onClick(View v) {

    }
}
