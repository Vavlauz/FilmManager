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

    public Film[] getAllFilms() {
        Film[] items = repository.findAll();
        Film[] result = new Film[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public Film[] removeByIdFilms(int id) {
        return repository.removeById(id);
    }

    public Film[] findAllFilms() {
       return repository.findAll();
    }

    public int removeAllFilms() {
        repository.removeAll();
        return 0;
    }

    public Film findByIdFilms(int id) {
        return repository.findById(id);
    }

    public int sum() {
        int result = 0;
        for (Film item : repository.findAll()) {
            result = result + item.getProductPrice() * item.getCount();
        }
        return result;
    }

}
