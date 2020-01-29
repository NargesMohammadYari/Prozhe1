import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Sat Nov 30 20:56:04 IRST 2019
 */



/**
 * @author unknown
 */
public class Entrance extends JFrame {
    public Entrance() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void button2MouseClicked(MouseEvent e) {
        if (radioButton1.isSelected()){
            Shop shop = new Shop();
            shop.setVisible(true);
            this.setVisible(false);
        }
        else if (radioButton2.isSelected()){
            WareHouse wareHouse = new WareHouse();
            wareHouse.setVisible(true);
            this.setVisible(false);
        }
        else {
            JOptionPane.showMessageDialog(null, "lotfan yek mored enthekhab konid");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        button1 = new JButton();
        label1 = new JLabel();
        button2 = new JButton();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- button1 ----
        button1.setText("exit");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });

        //---- label1 ----
        label1.setText("WELCOME TO NARGES TECH SHOP");

        //---- button2 ----
        button2.setText("next");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });

        //---- radioButton1 ----
        radioButton1.setText("shopping");

        //---- radioButton2 ----
        radioButton2.setText("show products");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(radioButton2)
                                    .addGap(0, 50, Short.MAX_VALUE))
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(button2)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(button1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label1)
                            .addGap(0, 51, Short.MAX_VALUE)))
                    .addContainerGap())
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(radioButton1)
                    .addContainerGap(174, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1)
                    .addGap(26, 26, 26)
                    .addComponent(radioButton1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(radioButton2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1)
                        .addComponent(button2))
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JButton button1;
    private JLabel label1;
    private JButton button2;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
