package com.packagename.myapp.spring.components;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the child-element template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("child-element")
@HtmlImport("child-element.html")
public class ChildElement extends PolymerTemplate<ChildElement.ChildElementModel> {

    /**
     * Creates a new ChildElement.
     */
    public ChildElement() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between ChildElement and child-element
     */
    public interface ChildElementModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
