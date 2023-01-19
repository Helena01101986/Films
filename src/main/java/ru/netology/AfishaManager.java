package ru.netology;

public class AfishaManager {

    private AfishaList[] films = new AfishaList[0];
    private int limit;

    public AfishaManager(int limit) {
        this.limit = limit;
    }

    public AfishaManager() {
        this.limit = 10;
    }

    public void add(AfishaList filmName) {
        AfishaList[] tmp = new AfishaList[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = filmName;
        films = tmp;
    }

    public AfishaList[] findAll() {
        return films;
    }

    public AfishaList[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }

        AfishaList[] reversed = new AfishaList[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;
    }


}

