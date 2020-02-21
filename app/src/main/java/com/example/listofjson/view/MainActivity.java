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
//        Company company = new Company("1", "1", "1");
//        Geo geo = new Geo(1.11, 1.22);
//        Address adress = new Address("1", "1", "1", "1", geo);
//        User user = new User(1,"gg", "aa", "ss", adress, "11", "11", company);
//        userList.add(0, user);

//      сначала надо запустить Json
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
//      TextView userNameTextView = findViewById(R.id.userNameTextView);


        DataAdapter adapter = new DataAdapter(this, userList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
        recyclerView.setAdapter(adapter);
        new UserInteractor(recyclerView).getUsers();
        SystemClock.sleep(500);
        System.out.println("hello");
//        adapter.updateAdapter(adapter);
//        adapter.notifyDataSetChanged();

    }

    public static void updateData(ArrayList<User> userList1) {
        userList.clear();
        userList.addAll(userList1);
//        System.out.println("Все норм");
        System.out.println(userList);
    }


}
