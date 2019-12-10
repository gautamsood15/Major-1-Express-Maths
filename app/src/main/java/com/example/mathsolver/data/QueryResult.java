package com.example.mathsolver.data;

import com.google.gson.annotations.SerializedName;


public class QueryResult {
    @SerializedName("success")
    private boolean success;

    @SerializedName("numpods")
    private int numPods;

    @SerializedName("pods")
    private Pod[] pods;

    public boolean getSuccess(){
        return success;
    }

    public int getNumPods(){
        return numPods;
    }

    public Pod[] getPods(){
        return pods;
    }
}
