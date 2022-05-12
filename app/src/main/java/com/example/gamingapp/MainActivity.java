package com.example.gamingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout category_linear;
    public static String group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding();


        category_linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textdialog();
            }
        });
    }

    private void binding() {
        category_linear = (LinearLayout) findViewById(R.id.category_linear);
    }

    private void textdialog() {
        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.item_dialog);


        RadioGroup game_group = dialog.findViewById(R.id.game_group);

        RadioButton logic_txt = dialog.findViewById(R.id.logic_txt);
        RadioButton racing_txt = dialog.findViewById(R.id.racing_txt);
        RadioButton action_txt = dialog.findViewById(R.id.action_txt);
        RadioButton cooking_txt = dialog.findViewById(R.id.cooking_txt);
        RadioButton car_txt = dialog.findViewById(R.id.car_txt);
        RadioButton puzzle_txt = dialog.findViewById(R.id.puzzle_txt);
        Button ok_btn = dialog.findViewById(R.id.ok_btn);

        ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (game_group.getCheckedRadioButtonId() == R.id.logic_txt) {
                    group = "Logic";
                } else if (game_group.getCheckedRadioButtonId() == R.id.racing_txt) {
                    group = "Racing";
                } else if (game_group.getCheckedRadioButtonId() == R.id.action_txt) {
                    group = "Action";
                } else if (game_group.getCheckedRadioButtonId() == R.id.cooking_txt) {
                    group = "Cooking";
                } else if (game_group.getCheckedRadioButtonId() == R.id.car_txt) {
                    group = "Education";
                } else if (game_group.getCheckedRadioButtonId() == R.id.puzzle_txt) {
                    group = "Sports";
                }
                Toast.makeText(MainActivity.this, "" + group, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, Category_Screen.class);
                startActivity(intent);

                dialog.dismiss();
            }

        });
        dialog.show();

    }

}