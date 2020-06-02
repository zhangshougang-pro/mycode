package com.example.listviewapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RecycleViewActivity extends AppCompatActivity {


    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        initFruits();
        RecyclerView recyclerView = findViewById(R.id.recycle_view);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        RFruitAdapter adapter = new RFruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);

    }

    private void initFruits(){
        for (int i=0;i<3;i++){
            Fruit apple = new Fruit(getRandomLengthName("apple"), R.drawable.apple);
            fruitList.add(apple);
            Fruit banana = new Fruit(getRandomLengthName("banana"), R.drawable.banana);
            fruitList.add(banana);
            Fruit cherry = new Fruit(getRandomLengthName("cherry"), R.drawable.cherry);
            fruitList.add(cherry);
            Fruit grape = new Fruit(getRandomLengthName("grape"), R.drawable.grape);
            fruitList.add(grape);
            Fruit mango = new Fruit(getRandomLengthName("mango"), R.drawable.mango);
            fruitList.add(mango);
            Fruit pear = new Fruit(getRandomLengthName("pear"), R.drawable.pear);
            fruitList.add(pear);
            Fruit pineapple = new Fruit(getRandomLengthName("pineapple"), R.drawable.pineapple);
            fruitList.add(pineapple);
            Fruit orange = new Fruit(getRandomLengthName("orange"), R.drawable.orange);
            fruitList.add(orange);
            Fruit strawberry = new Fruit(getRandomLengthName("strawberry"), R.drawable.strawberry);
            fruitList.add(strawberry);
        }
    }

    private String getRandomLengthName(String name){
        Random random = new Random();
        int length = random.nextInt(20)+1;
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<length;i++){
            builder.append(name);
        }
        return builder.toString();
    }
}
