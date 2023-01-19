package ru.netology;

public class AfishaManager {

    private AfishaList[] films = new AfishaList[0];
    private int id;

    public AfishaManager(int id) {
        this.id = id;
    }

    private AfishaRepository repo;

    public AfishaManager(AfishaRepository repo) {
        this.repo = repo;
    }

    public void save(AfishaList filmName) {
        repo.save(filmName);
    }

    public AfishaList[] findAll() {
        AfishaList[] all = repo.findAll();
        return all;
    }


    public AfishaList[] removeAll() {
        repo.removeAll();
        return new AfishaList[0];
    }

    public void removeById(int id) {
        repo.removeById(id);
    }

    /*public AfishaList findById() {
        repo.findById(id);


        return null;
    }*/


}

