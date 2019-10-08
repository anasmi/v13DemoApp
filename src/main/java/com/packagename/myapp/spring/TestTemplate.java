package com.packagename.myapp.spring;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.EventHandler;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

import java.util.Optional;

@Tag("test-template")
@HtmlImport("frontend://TestTemplate.html")
public class TestTemplate extends PolymerTemplate<TestTemplateModel> {
    private static final String EMPTY_NAME_GREETING = "Please enter your name";

    /**
     * Creates the hello world template.
     */
    public TestTemplate() {
        setId("template");
        getModel().setGreeting(EMPTY_NAME_GREETING);
    }

    @EventHandler
    private void sayHello() {
        // Called from the template click handler
        getModel().setGreeting(Optional.ofNullable(getModel().getUserInput())
                .filter(userInput -> !userInput.isEmpty())
                .map(greeting -> String.format("Hello %s!", greeting))
                .orElse(EMPTY_NAME_GREETING));
    }
}