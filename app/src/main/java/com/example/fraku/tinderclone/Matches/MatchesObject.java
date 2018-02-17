package com.example.fraku.tinderclone.Matches;

/**
 * Created by Z710 on 2018-02-17.
 */

public class MatchesObject {

    private String userId;

    public MatchesObject (String userId){
        this.userId = userId;

    }

    public String getUserId(){
        return userId;
    }
    public void setUserID(String userID){
        this.userId = userId;
    }
}
