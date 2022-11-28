package com.example.noteappversion1;

import androidx.cardview.widget.CardView;

import com.example.noteappversion1.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes note, CardView cardView);
}
