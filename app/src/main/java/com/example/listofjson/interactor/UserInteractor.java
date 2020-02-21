package com.example.listofjson.interactor;


import androidx.recyclerview.widget.RecyclerView;

import com.example.listofjson.view.MainActivity;

import com.example.listofjson.repository.JsonPlaceholderParser;

import java.util.ArrayList;


public class UserInteractor implements UserResponse {

    JsonPlaceholderParser parser = new JsonPlaceholderParser();
    RecyclerView recyclerView;




    public UserInteractor(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }




    public void getUsers() {
        new UserTask(parser, this).execute();
    }


    @Override
    public void reponse(ArrayList userList) {

        MainActivity.updateData(userList);

    }
}



interface UserResponse {
    void reponse(ArrayList userList);
}