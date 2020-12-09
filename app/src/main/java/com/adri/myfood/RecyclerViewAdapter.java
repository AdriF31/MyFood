package com.adri.myfood;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> MenuImage = new ArrayList<>();
    private  ArrayList<String> MenuText = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> menuImage, ArrayList<String> menuText, Context context) {
        MenuImage = menuImage;
        MenuText = menuText;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_list,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       Glide.with(context).asBitmap().load(MenuImage.get(position)).into(holder.MenuImage);
       holder.MenuText.setText(MenuText.get(position));
    }

    @Override
    public int getItemCount() {
        return MenuText.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView MenuImage;
        TextView MenuText;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            MenuImage = itemView.findViewById(R.id.MenuImage);
            MenuText = itemView.findViewById(R.id.MenuText);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);

        }
    }
}
