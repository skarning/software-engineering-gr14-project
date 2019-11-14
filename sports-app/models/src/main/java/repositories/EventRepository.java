package repositories;

import models.Event;

import java.util.ArrayList;
import java.util.List;

public class EventRepository implements IRepository<Event> {

    ArrayList<Event> events;

    public EventRepository(){
        this.events = new ArrayList<>();
    }

    @Override
    public Event getById(int id) {
        for (Event event : events){
            if (event.getEventID() == id)
                return event;
        }
        return null;
    }

    @Override
    public List<Event> getAll() {
        return events;
    }

    @Override
    public void add(Event event) {
        events.add(event);
    }

    @Override
    public void delete(Event event) {
        events.remove(event);
    }
}
