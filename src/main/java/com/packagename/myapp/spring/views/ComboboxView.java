package com.packagename.myapp.spring.views;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("combobox")
public class ComboboxView extends VerticalLayout {
    public ComboboxView(){
        ComboBox<String> comboBox = new ComboBox<>("Browsers");
        comboBox.setItems("Google Chrome", "Mozilla Firefox", "Opera",
                "Apple Safari", "Microsoft Edge");


        comboBox.addValueChangeListener(event -> {
            add(new Label("valueChange"));
        });
        comboBox.getElement().addEventListener("click",e->{
           add(new Label("clicked"));
           comboBox.clear();
        });
        add(comboBox);
    }
}
