package com.example.gamingapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AllGameAdaptor extends RecyclerView.Adapter<AllGameAdaptor.ViewData> {

    Context context;
    int[] image,race_image,action_image,cooking_image,education_image,sports_image;
    String[] name,race_name,action_name,cooking_name,education_name,sports_name;
    String chkers = "https://toytheater.com/checkers/";
    String reversi = "https://www.mathsisfun.com/games/reversi.html";
    String solitaire = "https://solitaired.com/";
    String logic4 = "https://www.htmlgames.com/game/Daily+Binario";
    String logic5 = "https://www.htmlgames.com/game/Daily+Bridges";
    String logic6 = "https://www.ufreegames.com/play/word-search-game.html?ref=ref";
    String logic7 = "https://www.htmlgames.com/game/Daily+Sudoku";
    String logic8 = "https://www.htmlgames.com/game/Tic+Tac+Toe";
    String logic9 = "https://www.htmlgames.com/game/Number+Search";
    String logic10 = "https://bigaston.itch.io/logical-gate";

    String race1 = "https://html5games.com/Game/E-Scooter/c493535a-9c66-4d47-a3fa-6239aa0e0d52";
    String race2 = "https://html5games.com/Game/Traffic-Tom/8bf9689b-ca21-4291-af6a-f85c6bcf92f7";
    String race3 = "https://html5games.com/Game/Moto-X3M-Pool-Party/b2102250-eb51-4704-9cab-ff296491cc68";
    String race4 = "https://play.famobi.com/bus-parking-3d";
    String race5 = "https://play.famobi.com/high-hillshttps://play.famobi.com/high-hills";
    String race6 = "https://play.famobi.com/highway-rider-extreme";
    String race7= "https://play.famobi.com/thug-racer";
    String race8 = "https://play.famobi.com/race-right";
    String race9 = "https://play.famobi.com/dont-crash";
    String race10 = "https://play.famobi.com/mini-race-rush";

    String action1 = "https://games.famobi.com/action/boat-battles?technology=web";
    String action2 = "https://games.famobi.com/action/adventure-drivers?technology=web";
    String action3 = "https://games.famobi.com/action/truck-trials?technology=web";
    String action4 = "https://play.famobi.com/crowd-run-3d";
    String action5 = "https://play.famobi.com/tiny-rifles";
    String action6 = "https://play.famobi.com/cannons-and-soldiers";
    String action7 = "https://play.famobi.com/pilot-heroes";
    String action8 = "https://play.famobi.com/spect";
    String action9 = "https://play.famobi.com/angry-necromancer";
    String action10 = "https://play.famobi.com/knife-rain";

    String cooking1 = "https://ergameonline.ru/games/vseigrunet/pizza-maker-html5";
    String cooking2 = "https://ergameonline.ru/games/baby-hazel/banana-bread-html5";
    String cooking3 = "https://ergameonline.ru/games/vseigrunet/ice-cream-maker-html5";
    String cooking4 = "https://ergameonline.ru/games/ideagames/cooking-fever-html5";
    String cooking5 = "https://ergameonline.ru/games/dab3games/bake-time-hot-dogs-html5";
    String cooking6 = "https://ergameonline.ru/games/ozigames/biryani-recipes-and-super-chef-cooking-game-html5";
    String cooking7 = "https://ergameonline.ru/games/ecapsgamescom/eg-beach-restaurant-html5";
    String cooking8 = "https://ergameonline.ru/games/icestone/mad-burger-html5";
    String cooking9 = "https://ergameonline.ru/games/rhm-interactive/pizza-challenge-html5";
    String cooking10 = "https://ergameonline.ru/games/ozigames/sweet-donut-maker-bakery-html5";

    String education1 = "https://www.marketjs.com/item/learn-french-basic-skills";
    String education2 = "https://www.marketjs.com/item/wordmeister";
    String education3 = "https://www.marketjs.com/item/word-hunter";
    String education4 = "https://www.marketjs.com/item/code-panda";
    String education5 = "https://www.marketjs.com/item/recycle-hero";
    String education6 = "https://www.marketjs.com/item/animal-trivia";
    String education7 = "https://www.marketjs.com/item/learn-english-for-russian-native-speakers";
    String education8 = "https://www.marketjs.com/item/learn-english-for-arabic-native-speakers";
    String education9 = "https://www.marketjs.com/item/learn-spanish-basic-skills";
    String education10 = "https://www.marketjs.com/item/learn-german-basic-skills";

    String sports1 = "https://html5games.com/Game/World-Cup-Penalty-2018/812dd47f-13c0-4a03-8678-00cfab89b971";
    String sports2 = "https://html5games.com/Game/Table-Tennis-World-Tour/8c8e5fc6-7e38-47ab-96eb-150276e79ef8";
    String sports3 = "https://html5games.com/Game/Classic-Bowling/3cd08285-5678-405c-b888-634ebd483ed9";
    String sports4 = "https://html5games.com/Game/Baseball-Pro/43595cb7-398c-4ef5-ab02-cc052a1751f5";
    String sports5 = "https://html5games.com/Game/Football-Tricks-World-Cup-2014/76396b8a-7e5c-49c3-9f44-59d90f8d731b";
    String sports6 = "https://html5games.com/Game/Goal-Champion/9a78e414-7bb3-458f-8e82-1052f662bfde";
    String sports7 = "https://html5games.com/Game/StreetRace-Fury/c124e0c0-7312-4f81-bdf0-ab1dbcc47ed4";
    String sports8 = "https://html5games.com/Game/Arcade-Golf-NEON/ef5f6169-6928-48e0-944d-e119ad0413cb";
    String sports9 = "https://html5games.com/Game/Street-Hoops-3D/6467c2f4-1fc0-4b98-98c9-9eefcf45d6d1";
    String sports10 = "https://html5games.com/Game/3D-Darts/58bfd66f-ebc8-4b7e-be65-68ff573a11bf";

    public AllGameAdaptor(Category_Screen category_screen, int[] image, String[] name, String[] race_name, int[] race_image, String[] action_name, int[] action_image, String[] cooking_name, int[] cooking_image, String[] education_name, int[] education_image, String[] sports_name, int[] sports_image) {
        context = category_screen;
        this.image = image;
        this.name = name;
        this.race_name = race_name;
        this.race_image = race_image;
        this.action_name = action_name;
        this.action_image = action_image;
        this.cooking_image = cooking_image;
        this.cooking_name = cooking_name;
        this.education_image = education_image;
        this.education_name = education_name;
        this.sports_name = sports_name;
        this.sports_image = sports_image;
    }

    @NonNull
    @Override
    public ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.design_file, parent, false);
        return new ViewData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewData holder, int position) {


        if (MainActivity.group.equals("Logic")) {
            holder.img_game.setImageResource(image[position]);
            holder.txt_game.setText(name[position]);

            if (position == 0) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", chkers);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 1) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", reversi);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 2) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", solitaire);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 3) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", logic4);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 4) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", logic5);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 5) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", logic6);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 6) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", logic7);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 7) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", logic8);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 8) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", logic9);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 9) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", logic10);
                        context.startActivity(intent);
                    }
                });
            }

        }

        if (MainActivity.group.equals("Racing")) {
           holder.img_game.setImageResource(race_image[position]);
            holder.txt_game.setText(race_name[position]);

            if (position == 0) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", race1);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 1) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", race2);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 2) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", race3);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 3) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", race4);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 4) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", race5);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 5) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", race6);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 6) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", race7);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 7) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", race8);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 8) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", race9);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 9) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", race10);
                        context.startActivity(intent);
                    }
                });
            }

        }

        if (MainActivity.group.equals("Action")) {
           holder.img_game.setImageResource(action_image[position]);
            holder.txt_game.setText(action_name[position]);

            if (position == 0) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", action1);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 1) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", action2);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 2) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", action3);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 3) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", action4);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 4) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", action5);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 5) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", action6);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 6) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", action7);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 7) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", action8);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 8) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", action9);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 9) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", action10);
                        context.startActivity(intent);
                    }
                });
            }

        }

        if (MainActivity.group.equals("Cooking")) {
            holder.img_game.setImageResource(cooking_image[position]);
            holder.txt_game.setText(cooking_name[position]);

            if (position == 0) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", cooking1);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 1) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", cooking2);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 2) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", cooking3);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 3) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", cooking4);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 4) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", cooking5);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 5) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", cooking6);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 6) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", cooking7);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 7) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", cooking8);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 8) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", cooking9);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 9) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", cooking10);
                        context.startActivity(intent);
                    }
                });
            }
        }

        if (MainActivity.group.equals("Education")) {
            holder.img_game.setImageResource(education_image[position]);
            holder.txt_game.setText(education_name[position]);

            if (position == 0) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", education1);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 1) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", education2);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 2) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", education3);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 3) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", education4);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 4) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", education5);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 5) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", education6);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 6) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", education7);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 7) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", education8);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 8) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", education9);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 9) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", education10);
                        context.startActivity(intent);
                    }
                });
            }
        }

        if (MainActivity.group.equals("Sports")) {
            holder.img_game.setImageResource(sports_image[position]);
            holder.txt_game.setText(sports_name[position]);
            if (position == 0) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", sports1);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 1) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", sports2);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 2) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", sports3);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 3) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", sports4);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 4) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", sports5);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 5) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", sports6);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 6) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", sports7);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 7) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", sports8);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 8) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", sports9);
                        context.startActivity(intent);
                    }
                });
            }
            if (position == 9) {
                holder.img_game.setOnClickListener(new View.OnClickListener() {
                    Intent intent = new Intent(context, final_Webview.class);
                    @Override
                    public void onClick(View view) {
                        intent.putExtra("checkers", sports10);
                        context.startActivity(intent);
                    }
                });
            }
        }
    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public class ViewData extends RecyclerView.ViewHolder {

        ImageView img_game;
        TextView txt_game;

        public ViewData(@NonNull View itemView) {
            super(itemView);

            img_game = (ImageView) itemView.findViewById(R.id.img_game);
            txt_game = (TextView) itemView.findViewById(R.id.txt_game);

        }
    }
}
