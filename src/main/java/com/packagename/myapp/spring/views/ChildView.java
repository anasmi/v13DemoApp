package com.packagename.myapp.spring.views;

import com.packagename.myapp.spring.components.ChildElement;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("childView")
public class ChildView extends VerticalLayout {

    public ChildView(){
        add(new ChildElement());
    }
}
