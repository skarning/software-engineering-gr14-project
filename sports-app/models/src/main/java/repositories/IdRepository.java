package repositories;

import java.util.List;

public class IdRepository implements IRepository<Integer> {

    /*Methode has no usage for this repository*/
    @Override
    public Integer getById(int id) {
        return null;
    }

    @Override
    public List<Integer> getAll() {
        return MockupDatabase.eventsID;
    }

    @Override
    public void add(Integer integer) {
        MockupDatabase.eventsID.add(integer);
    }

    @Override
    public void delete(Integer integer) {
        MockupDatabase.eventsID.remove(integer);
    }

    @Override
    public void removeAll() {
        MockupDatabase.eventsID.clear();
    }
}
