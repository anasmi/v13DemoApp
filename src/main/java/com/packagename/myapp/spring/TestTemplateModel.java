package com.packagename.myapp.spring;

import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * Model for the template.
 */
public interface TestTemplateModel extends TemplateModel {
    /**
     * Gets user input from corresponding template page.
     *
     * @return user input string
     */
    String getUserInput();

    /**
     * Sets greeting that is displayed in corresponding template page.
     *
     * @param greeting
     *            greeting string
     */
    void setGreeting(String greeting);
}