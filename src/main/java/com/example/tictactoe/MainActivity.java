package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity<textView> extends AppCompatActivity implements View.OnClickListener {

    // 1 == x; 2 == o
    int turn = 1;
    
    int turnNum = 0;

    int endGame = 0;

    // 1 == x; 2 == o
    int state1 = 0;
    int state2 = 0;
    int state3 = 0;
    int state4 = 0;
    int state5 = 0;
    int state6 = 0;
    int state7 = 0;
    int state8 = 0;
    int state9 = 0;

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;

    Button reset;

    TextView result;
    TextView playerTurn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);

        result = (TextView)findViewById(R.id.result);
        playerTurn = (TextView)findViewById(R.id.playerTurn);

        reset = (Button)findViewById(R.id.reset);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);

        reset.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button1:
                    if (endGame == 0 && state1 == 0)
                    if (turn == 1) {
                        state1 = 1;
                        button1.setText("X");
                        turn++;
                        turnNum++;
                    }
                    else {
                        state1 = 2;
                        button1.setText("O");
                        turn--;
                        turnNum++;
                    }
                    win();
                    break;
                case R.id.button2:
                    if(endGame == 0 && state2 == 0)
                    if (turn == 1) {
                        state2 = 1;
                        button2.setText("X");
                        turn++;
                        turnNum++;
                    }
                    else {
                        state2 = 2;
                        button2.setText("O");
                        turn--;
                        turnNum++;
                    }
                    win();
                    break;
                case R.id.button3:
                    if(endGame == 0 && state3 == 0)
                    if (turn == 1) {
                        state3 = 1;
                        button3.setText("X");
                        turn++;
                        turnNum++;
                    } else {
                        state3 = 2;
                        button3.setText("O");
                        turn--;
                        turnNum++;
                    }
                    win();
                    break;
                case R.id.button4:
                    if(endGame == 0 && state4 == 0)
                    if (turn == 1) {
                        state4 = 1;
                        button4.setText("X");
                        turn++;
                        turnNum++;
                    } else {
                        state4 = 2;
                        button4.setText("O");
                        turn--;
                        turnNum++;
                    }
                    win();
                    break;
                case R.id.button5:
                    if(endGame == 0 && state5 == 0)
                    if (turn == 1) {
                        state5 = 1;
                        button5.setText("X");
                        turn++;
                        turnNum++;
                    } else {
                        state5 = 2;
                        button5.setText("O");
                        turn--;
                        turnNum++;
                    }
                    win();
                    break;
                case R.id.button6:
                    if(endGame == 0 && state6 == 0)
                    if (turn == 1) {
                        state6 = 1;
                        button6.setText("X");
                        turn++;
                        turnNum++;
                    } else {
                        state6 = 2;
                        button6.setText("O");
                        turn--;
                        turnNum++;
                    }
                    win();
                    break;
                case R.id.button7:
                    if(endGame == 0 && state7 == 0)
                    if (turn == 1) {
                        state7 = 1;
                        button7.setText("X");
                        turn++;
                        turnNum++;
                    } else {
                        state7 = 2;
                        button7.setText("O");
                        turn--;
                        turnNum++;
                    }
                    win();
                    break;
                case R.id.button8:
                    if(endGame == 0 && state8 == 0)
                    if (turn == 1) {
                        state8 = 1;
                        button8.setText("X");
                        turn++;
                        turnNum++;
                    } else {
                        state8 = 2;
                        button8.setText("O");
                        turn--;
                        turnNum++;
                    }
                    win();
                    break;
                case R.id.button9:
                    if(endGame == 0 && state9 == 0)
                    if (turn == 1) {
                        state9 = 1;
                        button9.setText("X");
                        turn++;
                        turnNum++;
                    } else {
                        state9 = 2;
                        button9.setText("O");
                        turn--;
                        turnNum++;
                    }
                    win();
                    break;
                case R.id.reset:
                    if (endGame == 1) {
                        button1.setText("");
                        button2.setText("");
                        button3.setText("");
                        button4.setText("");
                        button5.setText("");
                        button6.setText("");
                        button7.setText("");
                        button8.setText("");
                        button9.setText("");

                        state1 = 0;
                        state2 = 0;
                        state3 = 0;
                        state4 = 0;
                        state5 = 0;
                        state6 = 0;
                        state7 = 0;
                        state8 = 0;
                        state9 = 0;

                        endGame = 0;
                        reset.setText("");
                        turnNum = 0;
                        turn = 1;
                        result.setText("");
                        playerTurn.setText("Player 1's Turn");
                    }
                    break;

        }
    }


    public void win(){
        if(endGame == 0) {
            if(turn == 1)
                playerTurn.setText("Player 1's Turn");
            else
                playerTurn.setText("Player 2's Turn");
            if ((state1 == state2 && state2 == state3 && state1 != 0) || (state4 == state5 && state5 == state6 && state4 != 0) || (state7 == state8 && state8 == state9 && state7 != 0) ||
                    (state1 == state4 && state4 == state7 && state1 != 0) || (state2 == state5 && state5 == state8 && state2 != 0) || (state3 == state6 && state6 == state9 && state3 != 0) ||
                    (state1 == state5 && state5 == state9 && state1 != 0) || (state3 == state5 && state5 == state7 && state3 != 0)) {
                if (turn == 2)
                    result.setText("Player1 WON!");
                if(turn == 1)
                    result.setText("Player2 WON!");
                endGame = 1;
                playerTurn.setText("");
                reset.setText("Reset?");
            }
            else if(turnNum == 9){
                result.setText("It is a tie.");
                endGame = 1;
                playerTurn.setText("");
                reset.setText("Reset?");
            }
        }
    }
}
