package com.packagename.myapp.spring.views;

import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("checkbox")
@HtmlImport("frontend://styles/checkbox-styles.html")
public class CheckboxView extends VerticalLayout {

    public CheckboxView(){
        Checkbox checkbox = new Checkbox();
        checkbox.setLabel("Default Checkbox");
        add(checkbox);
    }
}
