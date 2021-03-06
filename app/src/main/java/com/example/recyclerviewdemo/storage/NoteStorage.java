package com.example.recyclerviewdemo.storage;

import com.example.recyclerviewdemo.Model.Note;

import java.util.ArrayList;
import java.util.List;

public class NoteStorage {

    private static final String fileName = "data.dat";
    private static FileStorage fileStorage;
    private static List<Note> list;
    static { //static block, used to initialize static variables
        list = new ArrayList<>();
        list.add(new Note("THis is the headline", "This is the description"));
        list.add(new Note("Breaking news", "You just got clickbaited fam"));
        list.add(new Note("Headline", "description"));


    }
    public static Note getNote(int index){
        return list.get(index);
    }


    public static int getLength(){
        return list.size();
    }

    public static void setNote(String headLine, String description){
        list.add(new Note(headLine,description));
    }

    public static void setFileStorage(FileStorage fs) {
        fileStorage = fs;
    }

    public static void saveNotesToFile(){
        fileStorage.saveToFile(list,fileName);
    }
    public static void readNotesFromFile(){
        Object object = fileStorage.readObject(fileName);
        if (object!=null){
            list=(List<Note>)object;
        }
    }
}
