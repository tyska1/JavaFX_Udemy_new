package tableview;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Employee {
    private final SimpleIntegerProperty id;
    private final SimpleStringProperty firstname;
    private final SimpleStringProperty lastname;
    private final SimpleIntegerProperty age;

    public Employee(Integer id, String firstname, String lastname, Integer age) {
        super();
        this.id = new SimpleIntegerProperty(id);
        this.firstname = new SimpleStringProperty(firstname);
        this.lastname = new SimpleStringProperty(lastname);
        this.age = new SimpleIntegerProperty(age);
    }

    public String getFirstname() {
        return firstname.get();
    }

    public String getLastname() {
        return lastname.get();
    }

    public Integer getAge() {
        return age.get();
    }

    public Integer getId() {
        return id.get();
    }
}
