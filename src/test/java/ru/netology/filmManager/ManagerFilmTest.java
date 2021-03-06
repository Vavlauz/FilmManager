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
        manager.save(twelve);


        Film[] expected = {twelve, eleven, ten, nine, eight, seven, six, fifth, fourth, third};
        Film[] actual = manager.getAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    void getAllMaximum2() {
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

        ManagerFilm manager = new ManagerFilm(5);
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
        manager.save(twelve);


        Film[] expected1 = {twelve, eleven, ten, nine, eight};
        Film[] actual1 = manager.getAll();

        assertArrayEquals(expected1, actual1);

    }

    @Test
    void save() {
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


        Film[] expected = {first, second, third, fourth, fifth, six, seven, eight, nine, ten};
        Film[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    void save2() {
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
        manager.save(twelve);


        Film[] expected = {first, second, third, fourth, fifth, six, seven, eight, nine, ten, eleven, twelve};
        Film[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    void findAll() {
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
//        manager.save(first);
//        manager.save(second);
//        manager.save(third);
//        manager.save(fourth);
//        manager.save(fifth);
//        manager.save(six);
//        manager.save(seven);
//        manager.save(eight);
//        manager.save(nine);
//        manager.save(ten);
//        manager.save(eleven);
//        manager.save(twelve);


        Film[] expected = {};
        Film[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    void findAll2() {
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
        manager.save(seven);


        Film[] expected = {first, second, third, seven};
        Film[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

//    @Test
//    void findById() {
//        Film first = new Film(5, 1, "first", 100, 2);
//        Film second = new Film(2, 2, "second", 333, 1);
//        Film third = new Film(3, 3, "third", 600, 3);
//        Film fourth = new Film(4, 4, "fourth", 400, 4);
//        Film fifth = new Film(5, 5, "fifth", 335, 5);
//        Film six = new Film(6, 6, "six", 444, 6);
//        Film seven = new Film(7, 7, "seven", 222, 7);
//        Film eight = new Film(8, 8, "eight", 110, 8);
//        Film nine = new Film(9, 9, "nine", 220, 9);
//        Film ten = new Film(10, 10, "ten", 455, 10);
//        Film eleven = new Film(11, 11, "eleven", 880, 11);
//        Film twelve = new Film(12, 12, "twelve", 900, 12);
//
//        ManagerFilm manager = new ManagerFilm();
////        manager.save(first);
////        manager.save(second);
////        manager.save(third);
////        manager.save(fourth);
////        manager.save(fifth);
//        manager.save(six);
//        manager.save(seven);
//        manager.save(eight);
////        manager.save(nine);
////        manager.save(ten);
////        manager.save(eleven);
////        manager.save(twelve);
//        manager.findAll();
//
//
//
//        Film expected = seven;
//        Film actual = manager.findById(7);
//
//        assertEquals(expected, actual);
//
//    }

}