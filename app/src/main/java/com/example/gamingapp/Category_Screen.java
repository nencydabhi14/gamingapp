package com.example.gamingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

public class Category_Screen extends AppCompatActivity {

    TextView heading_txt;
    RecyclerView Recycler_game;
    String[] name = {"Checkers","Reversi","solitaire","Daily Binario","Daily Bridges"
            ,"Word Search Game","Sudoku","Tic Tac Toe","Number Search","Logical Gate"};
    int[] image = {R.drawable.chess,R.drawable.reversi,R.drawable.solitaire,R.drawable.binaro,R.drawable.dailybridges
            ,R.drawable.wordserach,R.drawable.suduko,R.drawable.tictac,R.drawable.numbersearch,R.drawable.pgmnv};

    String[] race_name = {"E-Scooter","Traffic Tom","Moto X3M","Bus Parking 3D","High Hills"
            ,"Highway Rider Extreme","Thug Racer","Race Right","Don't Crash","Mini Race Rush"};
    int[] race_image ={R.drawable.escooter,R.drawable.traffic,R.drawable.moto,R.drawable.busparkingd,R.drawable.high
            ,R.drawable.highwayrider,R.drawable.thugrace,R.drawable.racright,R.drawable.dontcrash,R.drawable.miniracerush};

    String[] action_name = {"Boat Battles","Adventure Drivers","Truck Trials","Crowd Run 3D","Tiny Rifles"
            ,"Cannons And Soldiers","Pilot Heroes","Spect","Angry Necromancer","Knife Rain"};
    int[] action_image = {R.drawable.boatbattle,R.drawable.advancher,R.drawable.truck,R.drawable.crouwdrun,R.drawable.tinyrifiles
                ,R.drawable.cannous,R.drawable.pailote,R.drawable.spece,R.drawable.angry,R.drawable.lnife};

    String[] cooking_name = {"Pizza Maker","Banana Bread","Ice Cream Maker","Cooking Fever","Bake Time Hot Dogs"
            ,"Biryani Recipes","EG Beach Restaurant","Mad Burger","Pizza Challenge","Sweet Donut"};
    int[] cooking_image = {R.drawable.pizzamaker,R.drawable.bananabread,R.drawable.icecreammaker,R.drawable.cokkingfever,R.drawable.backtimehot
            ,R.drawable.biriani,R.drawable.beachhotel,R.drawable.madburger,R.drawable.pizzachallege,R.drawable.sweetdonat};

    String[] education_name = {"Learn French Basic Skills","Wordmeister","Word Hunter","Code Panda","Recycle Hero",
            "Animal Trivia","Learn Russian Speakers","Learn Arabic Speakers","Spanish Basic Skills","Learn German Basic Skills"};
    int[] education_image = {R.drawable.learnfrench,R.drawable.wordmeister,R.drawable.wordhunter,R.drawable.codepanda,R.drawable.recyclerhero,
            R.drawable.animaltiva,R.drawable.rusianlearn,R.drawable.arbiclearn,R.drawable.spanislearn,R.drawable.germanlearn};

    String[] sports_name = {"World Cup Penalty","Table Tennis","Classic Bowling","Baseball Pro","Football Tricks",
            "Goal Champion","StreetTrace Fury","Arcade Golf","Street Hoops 3D","3D Darts"};
    int[] sports_image = {R.drawable.wordcup,R.drawable.tabletennis,R.drawable.clasicbowler,R.drawable.baseballpro,R.drawable.football,
            R.drawable.goalchampion,R.drawable.streettrace,R.drawable.arcade,R.drawable.strrethoops,R.drawable.darts};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_screen);

        binding();
        heading_txt.setText(MainActivity.group);

        AllGameAdaptor allGameAdaptor = new AllGameAdaptor(Category_Screen.this,image,name,race_name,race_image
                ,action_name,action_image,cooking_name,cooking_image,education_name,education_image,sports_name,sports_image);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        Recycler_game.setLayoutManager(layoutManager);
        Recycler_game.setAdapter(allGameAdaptor);

    }
    private void binding(){
        heading_txt = (TextView) findViewById(R.id.heading_txt);
        Recycler_game = (RecyclerView) findViewById(R.id.Recycler_game);
    }

}