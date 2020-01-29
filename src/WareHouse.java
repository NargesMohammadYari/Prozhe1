import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Sat Nov 30 23:10:40 IRST 2019
 */



/**
 * @author unknown
 */
public class WareHouse extends JFrame {
    public java.util.List<Mobile> mobileList = new ArrayList<>();
    public java.util.List<Charger> chargerList = new ArrayList<>();
    public java.util.List<Cover> coverList = new ArrayList<>();
    public java.util.List<Glass> glassList = new ArrayList<>();
    public WareHouse() {
        initComponents();
        shipment();
        print();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private void print(){
        label1.setText("mobiles : " + Mobile.mojudi);
        label2.setText("covers : " + Cover.mojudi);
        label3.setText("chargers : " + Charger.mojudi);
        label4.setText("glasses : " + Glass.mojudi);
    }

    private void button1MouseClicked(MouseEvent e) {
        Entrance entrance = new Entrance();
        entrance.setVisible(true);
        this.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        button1 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
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

        //---- label1 ----
        label1.setText("text");

        //---- label2 ----
        label2.setText("text");

        //---- label3 ----
        label3.setText("text");

        //---- label4 ----
        label4.setText("text");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGap(0, 308, Short.MAX_VALUE)
                            .addComponent(button1))
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                        .addComponent(label3, GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                        .addComponent(label4, GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(label1)
                    .addGap(18, 18, 18)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(label3)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(label4)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
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
    private JButton button1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
