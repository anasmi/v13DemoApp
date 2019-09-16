package com.packagename.myapp.spring.views;

import com.packagename.myapp.spring.model.Person;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;

@Route("binderTextfield")
public class BinderTextField extends VerticalLayout {


    public BinderTextField(){

        Person person = new Person();
        person.setFirstName("firstName");
        Binder<Person> binder = new Binder<>(Person.class);

        TextField titleField = new TextField();

// Start by defining the Field instance to use
        binder.forField(titleField)
                // Finalize by doing the actual binding
                // to the Person class
                .withValidator(p->{
                    if (p.equals("setRead")){
                        titleField.setReadOnly(true);
                    }
                    return p.equals("Ne");
                },"Error message")
                .bind(
                        // Callback that loads the title
                        // from a person instance
                        Person::getTitle,
                        // Callback that saves the title
                        // in a person instance
                        Person::setTitle);

        TextField nameField = new TextField();

// Shorthand for cases without extra configuration
        binder.bind(nameField, Person::getFirstName,
                Person::setFirstName);
        add(nameField);
        add(titleField);
    }
}
