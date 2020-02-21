package com.example.listofjson.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listofjson.R;
import com.example.listofjson.domain.Address;
import com.example.listofjson.domain.Company;
import com.example.listofjson.domain.Geo;
import com.example.listofjson.domain.User;
import com.example.listofjson.interactor.UserInteractor;
import com.example.listofjson.recycle.DataAdapter;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static ArrayList<User> userList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);

        DataAdapter adapter = new DataAdapter(this, userList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);
        new UserInteractor(recyclerView).getUsers();
        SystemClock.sleep(500);
        System.out.println("hello");

    }

    public static void updateData(ArrayList<User> userList1) {
        userList.clear();
        userList.addAll(userList1);
    }


}
