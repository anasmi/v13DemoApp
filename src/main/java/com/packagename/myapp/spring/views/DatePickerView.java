package com.packagename.myapp.spring.views;

import com.vaadin.componentfactory.EnhancedDatePicker;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@HtmlImport("frontend://styles/datepicker-styles.html")
@Route("datepicker")
public class DatePickerView extends VerticalLayout {
    public DatePickerView(){
        //Enhanced date-picker
        EnhancedDatePicker datePicker2=new EnhancedDatePicker();
        datePicker2.getElement().setAttribute("theme","your-theme");
        datePicker2.setPattern("dd-MMM-yyyy");
        add(datePicker2);
    }
}
