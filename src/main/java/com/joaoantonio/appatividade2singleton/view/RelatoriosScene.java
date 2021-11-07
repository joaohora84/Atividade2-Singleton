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
import javafx.scene.layout.VBox;


public class RelatoriosScene extends AbstractScene {
    
    private final Config config = Config.getInstance();

    public RelatoriosScene(App app) {
        super(app);
        
        var label1 = new Label("Formato de Relatórios: " + config.getFormatRelatorios());
        var label2 = new Label("Tipo de Gráficos: " + config.getTipoGraficos());
        var btnVoltar = new Button("Voltar");
        
        setRoot(new VBox(label1, label2, btnVoltar));
        
        btnVoltar.setOnAction(event -> app.setScene(new MainScene(app)));
    }
    
}
