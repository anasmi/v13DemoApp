package com.packagename.myapp.spring.views;

import com.packagename.myapp.spring.TestTemplate;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.router.PageTitle;

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
    public MainView() {
          add(new TestTemplate());
    }
}
