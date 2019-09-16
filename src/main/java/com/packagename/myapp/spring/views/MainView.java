package com.packagename.myapp.spring.views;

import com.packagename.myapp.spring.MessageBean;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;



@Route
@PWA(name = "Project Base for Vaadin Flow with Spring", shortName = "Project Base")
//@Theme(value = Material.class, variant = Material.DARK)
@HtmlImport("frontend://styles/shared-styles.html")
@PageTitle("Title")
public class MainView extends VerticalLayout {
//TODO Router Exception handling https://vaadin.com/docs/v13/flow/routing/tutorial-routing-exception-handling.html
    FormLayout layoutWithFormItems = new FormLayout();
    public MainView(@Autowired MessageBean bean) {
       // Button button = new Button("Click me",
           //     e -> Notification.show(bean.getMessage()));
      //  add(button);
       // ComboBox<String> combobox = new ComboBox<>();
       // combobox.setItems("First", "Second", "Third");
      //  add(combobox);

        //DatePicker picker = new DatePicker();
       // add(picker);
        for(int i=0;i<5;i++){
            addComponents(i);
        }
        Button ab=new Button("Add additional field",e->{
            addComponents(6);
        });
        //add(layoutWithFormItems);
        add(ab);
    }

private void addComponents(int it){

    TextField firstName = new TextField();
    firstName.setPlaceholder("John " + it);
    layoutWithFormItems.addFormItem(firstName, "First name " + it).getElement().setAttribute("colspan", "");
    // firstName.getElement().setAttribute("colspan","1");

    TextField lastName = new TextField();
    lastName.setPlaceholder("Doe" + it);
   // lastName.getElement().setAttribute("colspan","2");
    layoutWithFormItems.addFormItem(lastName, "Last name " + it).getElement().setAttribute("colspan", "");
    Checkbox checkbox = new Checkbox();
  //  checkbox.getElement().setAttribute("colspan","3");
    layoutWithFormItems.addFormItem(checkbox,"it").getElement().setAttribute("colspan", "");
    layoutWithFormItems.setResponsiveSteps(
            new FormLayout.ResponsiveStep("0", 1),
            new FormLayout.ResponsiveStep("5em", 2),
            new FormLayout.ResponsiveStep("5em", 3));

}


     //   add(new TestTemplate());

}
