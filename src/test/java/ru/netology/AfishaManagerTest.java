package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.doReturn;

public class AfishaManagerTest {
    AfishaRepository repo = Mockito.mock(AfishaRepository.class);
    AfishaManager manager = new AfishaManager(repo);


    AfishaList filmName1 = new AfishaList("Бладшот", 1);
    AfishaList filmName2 = new AfishaList("Вперед", 2);
    AfishaList filmName3 = new AfishaList("Отель Белград", 3);
    AfishaList filmName4 = new AfishaList("Джентельмены", 4);

    @Test
    public void shouldFindAll() {
        AfishaList[] films = {filmName1, filmName2, filmName3};
        doReturn(films).when(repo).findAll();
        AfishaList[] expected = {filmName1, filmName2, filmName3};
        AfishaList[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldSave() {
        AfishaList[] films = {filmName1, filmName2, filmName3, filmName4};
        doReturn(films).when(repo).findAll();
        manager.save(filmName4);

        AfishaList[] expected = {filmName1, filmName2, filmName3, filmName4};
        AfishaList[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        AfishaList[] films = {filmName1, filmName3};
        doReturn(films).when(repo).findAll();
        manager.removeById(filmName2.getId());

        AfishaList[] expected = {filmName1, filmName3};
        AfishaList[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldRemoveAll() {
        AfishaList[] expected = {};
        AfishaList[] actual = manager.removeAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    /*@Test
    public void shouldFindById() {
        AfishaManager manager = new AfishaManager(3);

        AfishaList expected = filmName3;
        AfishaList actual = manager.findById();

        Assertions.assertEquals(expected, actual);
    }*/

    }



