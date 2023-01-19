package ru.netology;

public class AfishaList {

    private String filmName;
    private int id;



    public AfishaList(String filmName, int id) {
        this.filmName = filmName;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
