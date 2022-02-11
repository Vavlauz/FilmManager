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

    public void removeByIdFilms(int id) {
        repository.removeById(id);
    }

    public Film[] findAllFilms() {
       return repository.findAll();
    }

    public Film[] removeAllFilms() {
        return repository.removeAll();
    }

    public void findByIdFilms(int id) {
        repository.findById(id);
    }

    public int sum() {
        int result = 0;
        for (Film item : repository.findAll()) {
            result = result + item.getProductPrice() * item.getCount();
        }
        return result;
    }

}
