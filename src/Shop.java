import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Sat Nov 30 21:05:03 IRST 2019
 */



/**
 * @author unknown
 */
public class Shop extends JFrame {
    public java.util.List<Mobile> mobileList = new ArrayList<>();
    public java.util.List<Charger> chargerList = new ArrayList<>();
    public java.util.List<Cover> coverList = new ArrayList<>();
    public java.util.List<Glass> glassList = new ArrayList<>();
    public Shop() {
        initComponents();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void button1MouseClicked(MouseEvent e) {
        Entrance entrance = new Entrance();
        entrance.setVisible(true);
        this.setVisible(false);
    }

    private void button2MouseClicked(MouseEvent e){
        shipment();
        int st = 0;
        if (radioButton1.isSelected()){
            try {
                check(3);
            } catch (EntityEception entityEception) {
                JOptionPane.showMessageDialog(null, entityEception.getMessage());
                st++;
            }
            if (st == 0){
                System.out.println(comboBox1.getSelectedItem());
                for (int i = 0; i < mobileList.size(); i++){
                    if (mobileList.get(i).getBrand().equalsIgnoreCase((String) comboBox1.getSelectedItem())){
                        label4.setText("prise for each mobile from this brand: " + mobileList.get(i).getprise() + " T");
                        Mobile.mojudi  = Mobile.mojudi - (int) spinner1.getValue();
                        continue;
                    }
                }
            }
        }
        else if (radioButton2.isSelected()){
            try {
                check(3);
            } catch (EntityEception entityEception) {
                JOptionPane.showMessageDialog(null, entityEception.getMessage());
                st++;
            }
            if (st == 0){
                System.out.println(comboBox1.getSelectedItem());
                for (int i = 0; i < coverList.size(); i++){
                    if (coverList.get(i).getBrand().equalsIgnoreCase((String) comboBox1.getSelectedItem())){
                        label4.setText("prise for each cover from this brand : " + coverList.get(i).getPrise() + " T");
                        Cover.mojudi  = Cover.mojudi - (int) spinner1.getValue();
                    }
                }
            }
        }
        else if (radioButton3.isSelected()){
            try {
                check(3);
            } catch (EntityEception entityEception) {
                JOptionPane.showMessageDialog(null, entityEception.getMessage());
                st++;
            }
            if (st == 0){
                System.out.println(comboBox1.getSelectedItem());
                for (int i = 0; i < glassList.size(); i++){
                    if (glassList.get(i).getBrand().equalsIgnoreCase((String) comboBox1.getSelectedItem())){
                        label4.setText("prise for each cover from this brand : " + glassList.get(i).getPrise() + " T");
                        Glass.mojudi  = Glass.mojudi - (int) spinner1.getValue();
                        continue;
                    }
                }
            }
        }
        else if (radioButton4.isSelected()){
           try {
                check(3);
            } catch (EntityEception entityEception) {
                JOptionPane.showMessageDialog(null, entityEception.getMessage());
                st++;
            }
            if (st == 0){
                //System.out.println(comboBox1.getSelectedItem());
                for (int i = 0; i < chargerList.size(); i++){
                    if (chargerList.get(i).getBrand().equalsIgnoreCase((String) comboBox1.getSelectedItem())){
                        System.out.println(comboBox1.getSelectedItem());
                        System.out.println(chargerList.get(i).getBrand());
                        label4.setText("prise for each cover from this brand : " + chargerList.get(i).getPrise() + " T");
                        Charger.mojudi  = Charger.mojudi - (int) spinner1.getValue();
                        continue;
                    }
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "lotfan yek mored enthekhab konid");
        }
    }

    private void check(int choice) throws EntityEception{
        int entity;
        switch (choice){
            case 1:
                entity = (int) spinner1.getValue();
                if (entity > Mobile.mojudi){
                    throw new EntityEception("out of entity request");
                }
                break;
            case 2:
                entity = (Integer) spinner1.getValue();
                if (entity > Cover.mojudi){
                    throw new EntityEception("out of entity request");
                }
                break;
            case 3:
                entity = (Integer) spinner1.getValue();
                if (entity > Glass.mojudi){
                    throw new EntityEception("out of entity request");
                }
                break;
            case 4:
                entity = (Integer) spinner1.getValue();
                if (entity > Charger.mojudi){
                    throw new EntityEception("out of entity request");
                }
                break;
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        radioButton3 = new JRadioButton();
        radioButton4 = new JRadioButton();
        comboBox1 = new JComboBox<>();
        label2 = new JLabel();
        spinner1 = new JSpinner();
        label3 = new JLabel();
        label4 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- button1 ----
        button1.setText("back");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });

        //---- button2 ----
        button2.setText("buy");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });

        //---- radioButton1 ----
        radioButton1.setText("mobile");

        //---- radioButton2 ----
        radioButton2.setText("cover");

        //---- radioButton3 ----
        radioButton3.setText("glass");

        //---- radioButton4 ----
        radioButton4.setText("charger");

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "samsung",
            "nokia",
            "lg",
            "hoawei",
            "apple"
        }));

        //---- label2 ----
        label2.setText("BRAND");

        //---- spinner1 ----
        spinner1.setModel(new SpinnerNumberModel(0, 0, null, 1));

        //---- label3 ----
        label3.setText("ENTITY");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGap(0, 274, Short.MAX_VALUE)
                            .addComponent(button2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(radioButton1)
                                    .addGap(44, 44, 44)
                                    .addComponent(label2))
                                .addComponent(radioButton2))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(label3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spinner1, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label1)
                            .addGap(0, 436, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(radioButton4)
                                .addComponent(radioButton3))
                            .addGap(18, 18, 18)
                            .addComponent(label4, GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(radioButton1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButton2))
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2)
                            .addComponent(label3)
                            .addComponent(spinner1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(radioButton3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radioButton4))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
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
        buttonGroup1.add(radioButton3);
        buttonGroup1.add(radioButton4);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public void shipment(){
        Mobile.mojudi = 250;
        mobileList.add(new Mobile("samsung", 3500000));
        mobileList.add(new Mobile("nokia", 4970000));
        mobileList.add(new Mobile("apple", 20000000));
        mobileList.add(new Mobile("hoawei", 2648000));
        mobileList.add(new Mobile("lg", 3990000));

        Glass.mojudi = 300;
        glassList.add(new Glass("samsung", 25000));
        glassList.add(new Glass("hoawei", 15000));
        glassList.add(new Glass("nokia", 67500));
        glassList.add(new Glass("lg", 41000));
        glassList.add(new Glass("apple", 36400));

        Charger.mojudi = 125;
        chargerList.add(new Charger("samsung", 100000));
        chargerList.add(new Charger("lg", 65000));
        chargerList.add(new Charger("nokia", 99000));
        chargerList.add(new Charger("hoawei", 34600));
        chargerList.add(new Charger("apple", 150000));

        Cover.mojudi = 54;
        coverList.add(new Cover("samsung", 70000));
        coverList.add(new Cover("nokia", 45000));
        coverList.add(new Cover("lg", 13500));
        coverList.add(new Cover("apple", 84000));
        coverList.add(new Cover("hoawei", 50000));
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JComboBox<String> comboBox1;
    private JLabel label2;
    private JSpinner spinner1;
    private JLabel label3;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
