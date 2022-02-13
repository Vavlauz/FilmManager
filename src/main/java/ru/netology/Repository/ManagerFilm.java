package ru.netology.Repository;

public class ManagerFilm {
    private RepositoryFilm repository;
    private int limit = 10;

    public ManagerFilm(RepositoryFilm repository) {
        this.repository = repository;
    }

    public void save(Film item) {
        repository.save(item);
    }

    public Film[] getAllFilms() {
        Film[] items = repository.findAll();
        int resultLength = Math.min(items.length,limit);                   //Math.min(items.length,limit)
        Film[] result = new Film[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = items[items.length - i - 1];
        }
        return result;
    }

        public Film[] removeByIdFilms(int id ){
            return repository.removeById(id);
        }

        public Film[] findAllFilms() {
            return repository.findAll();
        }

        public int removeAllFilms() {
            repository.removeAll();
            return 0;
        }

        public Film findByIdFilms(int id){
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

