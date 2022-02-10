package ru.netology.Repository;

public class ManagerFilm {
    private RepositoryFilm repository;

    public ManagerFilm() {
    }

    public ManagerFilm(RepositoryFilm repository) {
        this.repository = repository;
    }

    public void save(Film item) {
        repository.save(item);
    }

    public Film[] getAll() {
        Film[] items = repository.findAll();
        Film[] result = new Film[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public void findAll() {
        repository.findAll();
    }

    public void removeAll() {
        repository.removeAll();
    }

    public void findById(int id) {
        repository.findById(id);
    }

}
