package com.isrxge.minotes.listeners;

import com.isrxge.minotes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
