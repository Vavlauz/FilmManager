package ru.netology.Repository;

public class RepositoryFilm {
    private int limit = 10;
    private Film[] items = new Film[0];

    public void save(Film item) {
        int length = items.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;

    }

    public Film[] getAll() {
        int resultLength = Math.min(items.length,limit);                   //Math.min(items.length,limit)
        Film[] result = new Film[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = items[items.length - i - 1];
        }
        return result;
    }


    public Film[] findAll() {
        return items;
    }

    public Film findById(int id) {
        for (Film item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public Film[] removeAll() {
        return new Film[0];
    }

    public Film[] removeById(int id) {
        int length = items.length - 1;
        Film[] tmp = new Film[length];
        int index = 0;
        for (Film item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
        return tmp;
    }

    public void addById(int id) {
        int length = items.length + 1;
        Film[] tmp = new Film[length];
        int index = 0;
        for (Film item : items) {
            if (item.getId() == id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }
}

