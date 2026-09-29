package genrics;

import java.util.ArrayList;
import java.util.List;

class Person {
    int id;
    String name;
    String department;
    int age;

    public Person (int id, String name, String department, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }


    public int getId() {
        return id;
    }
}

interface Repo<T> {
    void save(T obj);
    T findById(int id);
}

abstract class BaseRepository<T> implements Repo<T> {
    protected List<T> persons = new ArrayList<>();

    @Override
    public void save(T obj) {
        persons.add(obj);
    }
}

class EmployeeRepo<T> extends BaseRepository<T> {
    public T findById(int id) {
        for (T p : persons) {
//            if (id == )
        }
        return null;
    }
}

public class GenericsTask9 {
}
