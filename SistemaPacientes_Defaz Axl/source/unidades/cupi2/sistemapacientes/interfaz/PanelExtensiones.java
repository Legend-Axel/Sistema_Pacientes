/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidades.cupi2.sistemapacientes.interfaz;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author DELL
 */
public class PanelExtensiones extends JPanel implements ActionListener{
    
   private static final String Avanzar="AVANZAR";
    private static final String RETROCEDER="RETROCEDER";
    
    private final String OPCION_1="opcion1";
    private final String OPCION_2="opcion2";
    
    private InterfazSistemaPacientes principal;
    
    private JButton butAvanzar;
    private JButton butRetroceder;
    private JButton butOpcion1;
    private JButton butOpcion2;
    
    public PanelExtensiones(InterfazSistemaPacientes v){
        
        principal=v;
        
        setLayout(new GridLayout(1, 4));
        setLayout(new FlowLayout());
        TitledBorder border = BorderFactory.createTitledBorder("Puntos de Extensión");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        
        butRetroceder=new JButton("<");
        butRetroceder.setActionCommand(RETROCEDER);
        butAvanzar=new JButton(">");
        butAvanzar.setActionCommand(Avanzar);
        butOpcion1=new JButton("Opción 1");
        butOpcion1.setActionCommand(OPCION_1);
        butOpcion2=new JButton("Opción 2");
        butOpcion2.setActionCommand(OPCION_2);
        
        add(butRetroceder);
        add(butOpcion1);
        add(butOpcion2);
        add(butAvanzar);
        
        butAvanzar.addActionListener(this);
        butRetroceder.addActionListener(this);
        butOpcion1.addActionListener(this);
        butOpcion2.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando=e.getActionCommand();
        
        if (comando.equals(Avanzar)) {
            principal.avanzar();
        }else if (comando.equals(RETROCEDER)) {
            principal.retroceder();
        }else if (comando.equals(OPCION_1)) {
            principal.reqFuncOpcion1();
        }else if (comando.equals(OPCION_2)) {
            principal.reqFuncOpcion2();
        }
    }
    
    
    
    
    
}
