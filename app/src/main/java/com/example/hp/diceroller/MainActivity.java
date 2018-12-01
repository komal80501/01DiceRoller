package com.example.hp.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnRoller;
    private ImageView imageViewDicy,imageViewDiceTwo;
    private Random myRandomNumber=new Random();
    private Random myRandomNumberTwo=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDicy=(ImageView) findViewById(R.id.imageView);
        imageViewDiceTwo=(ImageView) findViewById(R.id.imageView2);
        btnRoller= findViewById(R.id.button);

        btnRoller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollOurDice();
                rollOurDiceTwo();
            }
        });
    }

    private void rollOurDiceTwo() {
        int myRanNumTwo= myRandomNumberTwo.nextInt(6)+1;

        switch (myRanNumTwo)
        {
            case 1:
                imageViewDiceTwo.setImageResource(R.drawable.dice_1);
                break;

            case 2:
                imageViewDiceTwo.setImageResource(R.drawable.dice_2);
                break;

            case 3:
                imageViewDiceTwo.setImageResource(R.drawable.dice_3);
                break;

            case 4:
                imageViewDiceTwo.setImageResource(R.drawable.dice_4);
                break;

            case 5:
                imageViewDiceTwo.setImageResource(R.drawable.dice_5);
                break;

            case 6:
                imageViewDiceTwo.setImageResource(R.drawable.dice_6);
                break;

            default:
                imageViewDiceTwo.setImageResource(R.drawable.dice_4);

        }
    }

    private void rollOurDice() {
        int myRanNumber= myRandomNumber.nextInt(6)+1;

        switch (myRanNumber)
        {
            case 1:
                imageViewDicy.setImageResource(R.drawable.dice_1);
                break;

            case 2:
                imageViewDicy.setImageResource(R.drawable.dice_2);
                break;

            case 3:
                imageViewDicy.setImageResource(R.drawable.dice_3);
                break;

            case 4:
                imageViewDicy.setImageResource(R.drawable.dice_4);
                break;

            case 5:
                imageViewDicy.setImageResource(R.drawable.dice_5);
                break;

            case 6:
                imageViewDicy.setImageResource(R.drawable.dice_6);
                break;

             default:
                 imageViewDicy.setImageResource(R.drawable.dice_1);

        }
    }


}
