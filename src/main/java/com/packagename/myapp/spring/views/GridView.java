package com.packagename.myapp.spring.views;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.HeaderRow;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.gatanaso.MultiselectComboBox;

@Route("grid")
@HtmlImport("frontend://styles/shared-styles.html")
public class GridView extends VerticalLayout {

    //TODO implement H2 datasource using approach presented here https://mindbug.in/vaadin/vaadin-dataprovider-example/
    //https://www.baeldung.com/spring-boot-h2-database
    public GridView(){
        Grid<String> grid = new Grid<>();
       // grid.setHeightByRows(true);
        grid.setItems( "one","two","three");
        grid.setClassNameGenerator(e->e.contains("one")? "oneClass" : null);
        //grid.setHeight("170px");

        Grid.Column<String> number= grid.addColumn(String::toString).setHeader("Number");

        HeaderRow filterRow = grid.appendHeaderRow();
        ComboBox<String> comboBox = new ComboBox<>("Browsers");
        comboBox.setItems("Google Chrome", "Mozilla Firefox", "Opera",
                "Apple Safari", "Microsoft Edge");
        filterRow.getCell(number).setComponent(comboBox);
       /* MultiselectComboBox<String> multiselectComboBox = new MultiselectComboBox();
        multiselectComboBox.setLabel("Select items");
        multiselectComboBox.setItems("Item 1", "Item 2", "Item 3", "Item 4");
        filterRow.getCell(number).setComponent(multiselectComboBox);
        */
       add(grid);

    }
}
