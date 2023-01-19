package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {
    AfishaManager manager = new AfishaManager();

    AfishaList filmName1 = new AfishaList("Бладшот");
    AfishaList filmName2 = new AfishaList("Вперед");
    AfishaList filmName3 = new AfishaList("Отель Белград");
    AfishaList filmName4 = new AfishaList("Джентельмены");
    AfishaList filmName5 = new AfishaList("Человек-Невидимка");
    AfishaList filmName6 = new AfishaList("Тролли. Мировой тур");
    AfishaList filmName7 = new AfishaList("Номер один");
    AfishaList filmName8 = new AfishaList("Три мушкетера");
    AfishaList filmName9 = new AfishaList("Добро пожаловать");
    AfishaList filmName10 = new AfishaList("ХХХ");


    @Test
    public void shouldFindFilms() {
        manager.add(filmName1);
        manager.add(filmName2);
        manager.add(filmName3);
        manager.add(filmName4);
        manager.add(filmName5);


        AfishaList[] expected = {filmName1, filmName2, filmName3, filmName4, filmName5};
        AfishaList[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastFilmsMax() {
        AfishaManager manager = new AfishaManager();
        manager.add(filmName1);
        manager.add(filmName2);
        manager.add(filmName3);
        manager.add(filmName4);
        manager.add(filmName5);
        manager.add(filmName6);
        manager.add(filmName7);
        manager.add(filmName8);
        manager.add(filmName9);
        manager.add(filmName10);


        AfishaList[] expected = {filmName10, filmName9, filmName8, filmName7, filmName6, filmName5, filmName4, filmName3, filmName2, filmName1};
        AfishaList[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void shouldFindLastFilmsOverLimit() {
        AfishaManager manager = new AfishaManager(5);

        manager.add(filmName1);
        manager.add(filmName2);
        manager.add(filmName3);
        manager.add(filmName4);
        manager.add(filmName5);
        manager.add(filmName6);
        manager.add(filmName7);


        AfishaList[] expected = {filmName7, filmName6, filmName5, filmName4, filmName3};
        AfishaList[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilmsBelowLimit() {
        AfishaManager manager = new AfishaManager(5);

        manager.add(filmName1);
        manager.add(filmName2);
        manager.add(filmName3);


        AfishaList[] expected = {filmName3, filmName2, filmName1};
        AfishaList[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilmsFromLimit() {
        AfishaManager manager = new AfishaManager(5);

        manager.add(filmName1);
        manager.add(filmName2);
        manager.add(filmName3);
        manager.add(filmName4);
        manager.add(filmName5);


        AfishaList[] expected = {filmName5, filmName4, filmName3, filmName2, filmName1};
        AfishaList[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}

