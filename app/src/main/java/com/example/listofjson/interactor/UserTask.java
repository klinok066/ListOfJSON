package com.example.listofjson.interactor;

import android.os.AsyncTask;
import com.example.listofjson.repository.JsonPlaceholderParser;

import org.json.JSONException;
import java.io.IOException;
import java.util.ArrayList;

public class UserTask extends AsyncTask<ArrayList, ArrayList, ArrayList> {

    JsonPlaceholderParser parser;
    UserResponse userResponse;

    public UserTask(JsonPlaceholderParser parser, UserResponse userResponse) {
        this.parser = parser;
        this.userResponse = userResponse;
    }


    @Override
    protected ArrayList doInBackground(ArrayList[] objects) {
        try {
            ArrayList userArray = parser.getUserArray();
            return userArray;
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(ArrayList userArray) {
        super.onPostExecute(userArray);
        userResponse.reponse(userArray);
    }

}