package gr.aueb.cf.ch18.dao;

import java.util.List;

public interface DAO<T> {

    T get(String iban);

    List<T> getAll();

    T insert(T t);

    T update (T t);

    void delete (String iban);

}
