/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joaoantonio.appatividade2singleton.view;

import com.joaoantonio.appatividade2singleton.App;
import com.joaoantonio.appatividade2singleton.model.Config;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


public class ConfigScene extends AbstractScene {
    
    private final Config config = Config.getInstance();

    public ConfigScene(App app) {
        super(app);
        
        var label1 = new Label("Formato de Relatórios");
        var fieldFormatoRelatorios = new TextField(config.getFormatRelatorios());
        var label2 = new Label("Tipo de Gráficos");
        var fieldFormatoGraficos = new TextField(config.getTipoGraficos());
        var btnOK = new Button("OK");
        
        setRoot(new VBox(label1, fieldFormatoRelatorios, label2, fieldFormatoGraficos, btnOK));
        
        btnOK.setOnAction(event -> {
        
            config.setFormatRelatorios(fieldFormatoRelatorios.getText());
            config.setTipoGraficos(fieldFormatoGraficos.getText());
            app.setScene(new MainScene(app));
            
        
        });
    }
    
}
