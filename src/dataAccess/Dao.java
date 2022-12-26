package dataAccess;

import java.util.ArrayList;

public abstract class Dao<T> {
    protected ArrayList<T> dbData = new ArrayList<>();

    public ArrayList<T> getAllDbData() {
        return dbData;
    }

    public T getOneDbData(int id) {
        return dbData.get(id);
    }

    public abstract void add(T t);
}
