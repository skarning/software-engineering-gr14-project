package repositories;

import models.Event;

import java.util.ArrayList;
import java.util.List;

public class EventRepository implements IRepository<Event> {

    @Override
    public Event getById(int id) {
        for (Event event : MockupDatabase.events){
            if (event.getEventID() == id)
                return event;
        }
        return null;
    }

    @Override
    public List<Event> getAll() {
        return MockupDatabase.events;
    }

    @Override
    public void add(Event event) {
        MockupDatabase.events.add(event);
    }

    @Override
    public void delete(Event event) {
        MockupDatabase.events.remove(event);
    }

    @Override
    public void removeAll() {
        MockupDatabase.events.clear();
    }

    @Override
    public void generateData() {
        MockupDatabase.getGeneratedEvents();
    }
}
