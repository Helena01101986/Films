package ru.netology;

public class AfishaRepository {
    AfishaList[] films = new AfishaList[0];


    public void save(AfishaList filmName) {
        AfishaList[] tmp = new AfishaList[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = filmName;
        films = tmp;
    }

    public void removeById(int id) {
        AfishaList[] tmp = new AfishaList[films.length - 1];
        int copyToIndex = 0;
        for (AfishaList filmName : films) {
            if (filmName.getId() != id) {
                tmp[copyToIndex] = filmName;
                copyToIndex++;
            }
        }
        films = tmp;

    }

    public AfishaList[] findAll() {
        return films;
    }


    public void removeAll() {
        AfishaList[] tmp = new AfishaList[0];

        films = tmp;
    }

    /*public AfishaList findById(int id) {
        for (AfishaList filmName : films) {
            if (filmName.getId() == id) {
                return filmName;
            }
        }
        return null;
    }*/
}


