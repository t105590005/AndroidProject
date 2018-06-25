package com.example.user.project;

/**
 * Created by user on 2018/6/18.
 */

import android.widget.Button;

public class Card {
    public int x;
    public int y;
    public Button button;

    public Card(Button button, int x, int y) {
        this.x = x;
        this.y = y;
        this.button = button;
    }
}
