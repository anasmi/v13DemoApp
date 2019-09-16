package com.packagename.myapp.spring.views;

import com.vaadin.componentfactory.Popup;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("popupbutton")
public class PopupButtonView extends VerticalLayout {

    public PopupButtonView(){

        Button btnNewOrder = new Button();
        btnNewOrder.setText(("OrderBook.Button.NewOrder"));
        btnNewOrder.setId("btnNewOrder");

        Popup popup = new Popup();
        //id should match the one set for a button
        popup.setFor("btnNewOrder");
        popup.add(new Div(new Label("test")));

        add(popup);
        add(btnNewOrder);
    }
}
