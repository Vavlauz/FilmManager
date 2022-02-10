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
        int resultLength = items.length;
        if (resultLength > limit) {
            resultLength = limit;
        } else {
            resultLength = items.length;
        }

//        Film[] items = findAll();
        Film[] result = new Film[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = result.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public Film[] findAll() {
        return items;
    }

//    public Film findById(int id) {
//        for (Film item : items) {
//            if (item.getId() == id) {
//                return item;
//            }
//        }
//        return null;
//    }
//
//    public void removeAll() {
//        items = new Film[0];
//    }
//
//    public void removeById(int id) {
//        int length = items.length - 1;
//        Film[] tmp = new Film[length];
//        int index = 0;
//        for (Film item : items) {
//            if (item.getId() != id) {
//                tmp[index] = item;
//                index++;
//            }
//        }
//        items = tmp;
//    }
//
//    public void addById(int id) {
//        int length = items.length + 1;
//        Film[] tmp = new Film[length];
//        int index = 0;
//        for (Film item : items) {
//            if (item.getId() == id) {
//                tmp[index] = item;
//                index++;
//            }
//        }
//        items = tmp;
//    }
}