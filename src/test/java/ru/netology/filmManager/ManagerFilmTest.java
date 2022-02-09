package ru.netology.filmManager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerFilmTest {

    @Test
    void getAllMaximum() {
        Film first = new Film(1, 1, "first", 100, 2);
        Film second = new Film(2, 2, "second", 333, 1);
        Film third = new Film(3, 3, "third", 600, 3);
        Film fourth = new Film(4, 4, "fourth", 400, 4);
        Film fifth = new Film(5, 5, "fifth", 335, 5);
        Film six = new Film(6, 6, "six", 444, 6);
        Film seven = new Film(7, 7, "seven", 222, 7);
        Film eight = new Film(8, 8, "eight", 110, 8);
        Film nine = new Film(9, 9, "nine", 220, 9);
        Film ten = new Film(10, 10, "ten", 455, 10);
        Film eleven = new Film(11, 11, "eleven", 880, 11);
        Film twelve = new Film(12, 12, "twelve", 900, 12);

        ManagerFilm manager = new ManagerFilm();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(six);
        manager.save(seven);
        manager.save(eight);
        manager.save(nine);
        manager.save(ten);
        manager.save(eleven);

        manager.getAll();

        Film[] expected = {ten, nine, eight, seven, six, fifth, fourth, third, second, first};
        Film[] actual = manager.getAll();

        assertArrayEquals(expected, actual);

    }

}