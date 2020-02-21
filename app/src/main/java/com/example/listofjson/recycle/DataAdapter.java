package com.example.listofjson.recycle;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.listofjson.R;
import com.example.listofjson.domain.User;
import com.example.listofjson.interactor.UserInteractor;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<User> userList;

    public DataAdapter(Context context, ArrayList userList) {
        this.userList = userList;
        this.inflater = LayoutInflater.from(context);
    }



    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        final User user = userList.get(position);
        holder.imageView.setImageResource(R.drawable.who);
        holder.nameView.setText(user.getName());
        holder.idView.setText(user.getUserName());
//        holder.itemLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final Intent intent = new Intent(v.getContext(),  PhoneDetails.class);
//                intent.putExtra("image_resourse", phone.getImage());
//                intent.putExtra("phone_name", phone.getName());
//                v.getContext().startActivity(intent);
            }



    public void updateAdapter(RecyclerView.Adapter adapter){
        RecyclerView.Adapter adapter1 = adapter;
        adapter1.notifyDataSetChanged();
        System.out.println("все ништяк");
    }




    @Override
    public int getItemCount() {
        return userList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        final View itemLayout;
        final ImageView imageView;
        final TextView nameView, idView;
        ViewHolder(View view){
            super(view);
            itemLayout = view.findViewById(R.id.item_layout);
            imageView = (ImageView)view.findViewById(R.id.image);
            nameView = (TextView) view.findViewById(R.id.name);
            idView = (TextView) view.findViewById(R.id.id);
        }
    }
}
