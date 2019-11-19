package repositories;

import java.util.List;

public interface IRepository<T> {
    T getById(int id);

    List<T> getAll();

    void add(T item);

    void delete(T item);

    void removeAll();

    void generateData();
}
