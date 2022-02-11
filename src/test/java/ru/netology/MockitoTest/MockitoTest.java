    package ru.netology.MockitoTest;

    import org.junit.jupiter.api.BeforeAll;
    import org.junit.jupiter.api.Test;
    import org.mockito.Mockito;
    import ru.netology.Repository.Film;
    import ru.netology.Repository.ManagerFilm;
    import ru.netology.Repository.RepositoryFilm;

    import static org.junit.jupiter.api.Assertions.assertArrayEquals;
    import static org.junit.jupiter.api.Assertions.assertEquals;
    import static org.mockito.Mockito.doReturn;
    import static org.mockito.Mockito.verify;

    public class MockitoTest {
        private RepositoryFilm repository = Mockito.mock(RepositoryFilm.class);

        private ManagerFilm manager = new ManagerFilm(repository);
        private Film first = new Film(1, 1, "first", 100, 2);
        private Film second = new Film(2, 2, "second", 333, 1);
        private Film third = new Film(3, 3, "third", 600, 3);
        private Film fourth = new Film(4, 4, "fourth", 400, 4);
        private Film fifth = new Film(5, 5, "fifth", 335, 5);
        private Film six = new Film(6, 6, "six", 444, 6);
        private Film seven = new Film(7, 7, "seven", 222, 7);
        private Film eight = new Film(8, 8, "eight", 110, 8);
        private Film nine = new Film(9, 9, "nine", 220, 9);
        private Film ten = new Film(10, 10, "ten", 455, 10);
        private Film eleven = new Film(11, 11, "eleven", 880, 11);
        private Film twelve = new Film(12, 12, "twelve", 900, 12);





        @BeforeAll
        public static void start() {
            System.out.println("Hello");
        }

        @Test
        public void sum() {
            Film[] returned = {first,second,third};
            doReturn(returned).when(repository).findAll();

            int expected = 2333;
            int actual = manager.sum();

            assertEquals (expected,actual);

            verify(repository).findAll();

        }

        @Test
        public void remove() {
            Film[] returned = {};
            doReturn(returned).when(repository).removeAll();

            Film[] expected = {};
            Film[] actual = manager.removeAllFilms();

            assertArrayEquals (expected,actual);

            verify(repository).removeAll();

        }

    }

