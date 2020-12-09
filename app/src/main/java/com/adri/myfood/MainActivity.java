package com.adri.myfood;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> MenuImage = new ArrayList<>();
    private ArrayList<String> MenuText = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getMenuData();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.MenuList);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(MenuImage, MenuText, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getMenuData(){
        MenuText.add("Makanan Indonesia");
        MenuImage.add("https://asset.kompas.com/crops/B_DV5V6k-8yyl8Z9daS3hb6E3_M=/0x0:739x493/750x500/data/photo/2020/07/28/5f1fdcdacafc4.jpg");

        MenuText.add("Makanan Korea");
        MenuImage.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/kimchi.jpg");

        MenuText.add("Makanan Jepang");
        MenuImage.add("https://cdn.idntimes.com/content-images/post/20170728/sushi-for-kids-81300-1-abf4af27df9d905fbdfa5fb34c688d30.jpeg");

        prosesRecyclerViewAdapter();
    }

}
