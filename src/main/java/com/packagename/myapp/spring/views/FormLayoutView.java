package com.packagename.myapp.spring.views;

import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class FormLayoutView extends VerticalLayout {

    private FormLayout layoutWithFormItems = new FormLayout();
    public FormLayoutView(){
        TextField firstName = new TextField();
        firstName.setPlaceholder("First name");
        layoutWithFormItems.addFormItem(firstName, "First name").getElement().setAttribute("colspan", "");
        // firstName.getElement().setAttribute("colspan","1");

        TextField lastName = new TextField();
        lastName.setPlaceholder("Last name");
        // lastName.getElement().setAttribute("colspan","2");
        layoutWithFormItems.addFormItem(lastName, "Last name").getElement().setAttribute("colspan", "");
        Checkbox checkbox = new Checkbox();
        //  checkbox.getElement().setAttribute("colspan","3");
        layoutWithFormItems.addFormItem(checkbox,"Select").getElement().setAttribute("colspan", "");
        layoutWithFormItems.setResponsiveSteps(
                new FormLayout.ResponsiveStep("0", 1),
                new FormLayout.ResponsiveStep("5em", 2),
                new FormLayout.ResponsiveStep("5em", 3));
        add(layoutWithFormItems);
    }

}
