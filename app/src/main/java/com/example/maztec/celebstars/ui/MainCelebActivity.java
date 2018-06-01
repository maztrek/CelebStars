package com.example.maztec.celebstars.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.maztec.celebstars.Pojodata.HeaderData;
import com.example.maztec.celebstars.Pojodata.ItemResponse1;
import com.example.maztec.celebstars.R;
import com.example.maztec.celebstars.adapter.ImageRecyclerAdapter;
import com.example.maztec.celebstars.rest.ApiClient;
import com.example.maztec.celebstars.rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainCelebActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ProgressDialog pDialog;
    List<HeaderData> data;
    ImageRecyclerAdapter imageRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_celeb);

        data=new ArrayList<>();
        recyclerView=(RecyclerView)findViewById(R.id.Headerrecycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        imageRecyclerAdapter=new ImageRecyclerAdapter(MainCelebActivity.this,data);
        recyclerView.setAdapter(imageRecyclerAdapter);
        showProg();
        Getdata();


    }

    private void showProg() {
        pDialog = new ProgressDialog(MainCelebActivity.this);
        pDialog.setMessage("Please wait...");
        pDialog.setCancelable(false);
        pDialog.show();
    }

    private void Getdata() {

        ApiInterface apiInterface= ApiClient.getClient().create(ApiInterface.class);
        Call<ItemResponse1> call=apiInterface.getHeader();
        call.enqueue(new Callback<ItemResponse1>() {
            @Override
            public void onResponse(Call<ItemResponse1> call, Response<ItemResponse1> response) {
                pDialog.dismiss();
                data=response.body().getHdata();
                imageRecyclerAdapter=new ImageRecyclerAdapter(MainCelebActivity.this,data);
                recyclerView.setAdapter(imageRecyclerAdapter);
            }

            @Override
            public void onFailure(Call<ItemResponse1> call, Throwable t) {

            }
        });
    }
//    public void Getactor(View view) {
//        Intent intent= new Intent(MainCelebActivity.this,ActorGridDesign.class);
//        startActivity(intent);
//    }
//
//
//    public void getactress(View view) {
//        Intent intent= new Intent(MainCelebActivity.this,ActorGridDesign.class);
//        startActivity(intent);
//    }
}
