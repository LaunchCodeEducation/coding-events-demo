package org.launchcode.codingevents.data;


import org.launchcode.codingevents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Naming convention for all data layer classes
//use the name of the class we want to store "Event" and "Repository" -- Should be an interface
@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {


}
//Extending the CrudRepository interface gives us access to methods to
// perform all of the CRUD operations that we made happen in SQL
//CrudRepository methods to get info in and out of the tables of our relational database