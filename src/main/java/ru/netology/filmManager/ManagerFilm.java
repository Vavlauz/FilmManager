package ru.netology.filmManager;

public class ManagerFilm {
    private int limit = 10;
    private Film[] items = new Film[0];

    public ManagerFilm() {
    }

    public ManagerFilm(int limit) {
        this.limit = limit;
    }

    public void save(Film item) {
        int length = items.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;

    }

    public Film[] getAll() {
        int resultLength = Math.min(items.length,limit);
        Film[] result = new Film[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = items[items.length - i - 1];
        }
        return result;
    }

    public Film[] findAll() {
        return items;
    }

}