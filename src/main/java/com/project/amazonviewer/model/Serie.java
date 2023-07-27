package com.project.amazonviewer.model;

import java.util.ArrayList;

public class Serie extends Film{

    private int id;
    private int sessionQuanty;
    private ArrayList<Chapter> chapters;


    public Serie(String title, String genre, String creator, int duration, int sessionQuanty) {
        super(title, genre, creator, duration);
        // TODO Auto-generated constructor stub
        this.sessionQuanty = sessionQuanty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSessionQuanty() {
        return sessionQuanty;
    }

    public void setSessionQuanty(int sessionQuanty) {
        this.sessionQuanty = sessionQuanty;
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  "\n :: SERIE ::" +
                "\n Title: " + getTitle() +
                "\n Genero: " + getGenre() +
                "\n Year: " + getYear() +
                "\n Creator: " + getCreator() +
                "\n Duration: " + getDuration();
    }

    public static ArrayList<Serie> makeSeriesList(){
        ArrayList<Serie> series = new ArrayList<>();

        for (int i = 1; i <= 5 ; i++) {
            Serie serie = new Serie("Serie "+i, "genero "+i, "creador "+i, 1200, 5);
            serie.setChapters(Chapter.makeChapterList(serie));
            series.add(serie);
        }

        return series;
    }

    @Override
    public void view() {

    }
}
