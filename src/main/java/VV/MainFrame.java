package VV;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package venndiagram;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JSlider;

/**
 *
 * @author Ali
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();

                rect = textLabel.getLocation();

        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Edsitor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerSizeBtnGrp = new javax.swing.ButtonGroup();
        leftPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        addText = new javax.swing.JButton();
        deleteText = new javax.swing.JButton();
        TextColor = new javax.swing.JComboBox();
        colorLabel = new javax.swing.JLabel();
        fontLabel = new javax.swing.JLabel();
        TextFont = new javax.swing.JComboBox();
        tSize = new javax.swing.JLabel();
        TextSize = new javax.swing.JComboBox();
        silder = new javax.swing.JSlider();
        sliderVar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        leftContainer = new javax.swing.JButton();
        rightContainer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jeditTextField = new javax.swing.JTextArea();
        rightPanel = new javax.swing.JPanel();
        textLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1388, 720));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel2.setText("Choose containers Colors");

        saveBtn.setText("Save");
        saveBtn.setFocusable(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        addText.setText("Add Text");
        addText.setFocusable(false);
        addText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTextActionPerformed(evt);
            }
        });
        addText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addTextKeyPressed(evt);
            }
        });

        deleteText.setText("Delete Text");
        deleteText.setFocusable(false);
        deleteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTextActionPerformed(evt);
            }
        });
        deleteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deleteTextKeyPressed(evt);
            }
        });

        TextColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "black", "blue", "red", "green", "yellow", "orange" }));
        TextColor.setFocusable(false);
        TextColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextColorActionPerformed(evt);
            }
        });

        colorLabel.setText("Text  Color :");

        fontLabel.setText("Text  Font  :");

        TextFont.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select font", "arial", "courier", "calibri", "tahoma", "helvetica" }));
        TextFont.setFocusable(false);
        TextFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFontActionPerformed(evt);
            }
        });

        tSize.setText("Text Size :");

        TextSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select size", "8", "10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "42" }));
        TextSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSizeActionPerformed(evt);
            }
        });

        silder.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                silderStateChanged(evt);
            }
        });

        sliderVar.setText("50");

        jLabel5.setText("Max");

        jLabel6.setText("Min");

        jButton1.setText("Edit Text");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save As");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        leftContainer.setText("Left");
        leftContainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftContainerActionPerformed(evt);
            }
        });

        rightContainer.setText("Right");
        rightContainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightContainerActionPerformed(evt);
            }
        });

        jeditTextField.setColumns(20);
        jeditTextField.setRows(5);
        jScrollPane1.setViewportView(jeditTextField);

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(saveBtn)
                        .addGap(33, 33, 33)
                        .addComponent(jButton2))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(2, 2, 2)
                                .addComponent(silder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tSize)
                                    .addComponent(fontLabel)
                                    .addComponent(colorLabel)))
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(leftPanelLayout.createSequentialGroup()
                                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(addText, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(leftPanelLayout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(leftContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(72, 72, 72)))))
                        .addGap(18, 18, 18)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextFont, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextSize, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(deleteText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rightContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sliderVar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sliderVar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(silder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leftContainer)
                    .addComponent(rightContainer))
                .addGap(23, 23, 23)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addText)
                    .addComponent(deleteText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorLabel)
                    .addComponent(TextColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fontLabel)
                    .addComponent(TextFont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tSize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(jButton2)))
        );

        rightPanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        rightPanel.setName("container"); // NOI18N
        rightPanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rightPanelKeyPressed(evt);
            }
        });

        textLabel.setOpaque(true);
        textLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(textLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(556, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1224, Short.MAX_VALUE))
        );

        textLabel.setLocation(new Point(10000, 10000));

        jLabel1.setText("Container Size:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // 1 = blue = code
    // 2 = ....
    public void drawing() {
        //Draws the two circles
        repaint();
    }
protected void paintChildren(Graphics g) {
  super.paint(g);

//paint your lines here
}
    public void paint(Graphics g) {
        super.paint(g);
        
           textLabel.repaint();    
           
        //Sets the settings for the Venn Diagram
        g.setColor(c1);
        g.fillOval(c1x, c1y, cw, ch);
             
        g.setColor(c2);
        g.fillOval(c2x, c2y, cw, ch);
    }

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:

        BufferedImage image = null;
        try {

            Rectangle rect = new Rectangle(265, 50, Toolkit.getDefaultToolkit().getScreenSize().width - 265, Toolkit.getDefaultToolkit().getScreenSize().height - 80);
            image = new Robot().createScreenCapture(rect);
        } catch (AWTException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            ImageIO.write(image, "png", new File("new.png"));
            // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_saveBtnActionPerformed

 
    private void addTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTextActionPerformed

        textLabel.setLocation(rect);
        textLabel.setBackground(new Color(255,255,255));
        textLabel.setText("Empty Text");
        DragListener dl = new DragListener(textLabel);
        dl.addHandle(textLabel);
        
        
        
        /*
        JLabel label = new JLabel("Empty Text");
        //label.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
    label.setBounds(50, 20, 100, 100);
        label.setVisible(true);
        label.setOpaque(true);
        rightPanel.add(label);
        rightPanel.validate();
        rightPanel.repaint();
        DragListener dl = new DragListener(label);
        dl.addHandle(label);
        
        */ 
    }//GEN-LAST:event_addTextActionPerformed

    private void textLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textLabelMouseClicked

        if (evt.getClickCount() % 2 == 0) {

            editable = true;
            textLabel.setText("");
            text = "";
        } else {
            editable = false;
        }

    }//GEN-LAST:event_textLabelMouseClicked

    private void addTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addTextKeyPressed

        if (editable) {
            text += evt.getKeyChar();
            textLabel.setText(text);
        }

    }//GEN-LAST:event_addTextKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void rightPanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rightPanelKeyPressed
        System.out.print("key");
    }//GEN-LAST:event_rightPanelKeyPressed

    private void deleteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTextActionPerformed

        textLabel.setBackground(new Color(240,240,240));
        textLabel.setText("");
        textLabel.setBounds(100000, 100000, 0, 0);
repaint();
    }//GEN-LAST:event_deleteTextActionPerformed

    private void deleteTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deleteTextKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteTextKeyPressed

    private void TextColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextColorActionPerformed
        // TODO add your handling code here:

        if (evt.getSource() == TextColor) {
            JComboBox cb = (JComboBox) evt.getSource();
            String color = (String) cb.getSelectedItem();

            switch (color) {
                case "black":
                    textLabel.setForeground(Color.BLACK);
                    break;
                case "blue":
                    textLabel.setForeground(Color.BLUE);
                    break;
                case "red":
                    textLabel.setForeground(Color.RED);
                    break;
                case "green":
                    textLabel.setForeground(Color.GREEN);
                    break;
                case "yellow":
                    textLabel.setForeground(Color.YELLOW);
                    break;
                case "orange":
                    textLabel.setForeground(Color.ORANGE);
                    break;
            }

        }
        repaint();
    }//GEN-LAST:event_TextColorActionPerformed

    private void TextSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSizeActionPerformed
        // TODO add your handling code here:

        if (evt.getSource() == TextSize) {
            JComboBox cb = (JComboBox) evt.getSource();
            String size = (String) cb.getSelectedItem();
            fSize = Integer.parseInt(size);
            setFont();
        }

    }//GEN-LAST:event_TextSizeActionPerformed

    private void TextFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFontActionPerformed
        // TODO add your handling code here:
//rect = textLabel.getLocation();
        if (evt.getSource() == TextFont) {
            JComboBox cb = (JComboBox) evt.getSource();
            String font = (String) cb.getSelectedItem();
            switch (font) {
                case "arial":
                    name = "Arial Black";
                    setFont();
                    break;

                case "courier":
                    name = "Courier New";
                    setFont();
                    break;

                case "calibri":
                    name = "Calibri";
                    setFont();
                    break;

                case "helvetica":
                    name = "Helvetica";
                    setFont();
                    break;

                case "tahoma":
                    name = "Tahoma";
                    setFont();
                    break;
            }
        }

    }//GEN-LAST:event_TextFontActionPerformed

    private void silderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_silderStateChanged

        JSlider source = (JSlider) evt.getSource();
        System.out.println(""+source.getBackground());
        textLabel.setBackground(source.getBackground());
        if (!source.getValueIsAdjusting()) {
            size = (int) source.getValue();
            textLabel.setBackground(c1);
            c1x = 350 + size;
            c2x = 650 + (size / 2);
            c1y = c2y = 150;
            cw = ch = 600 - size;
            sliderVar.setText(100 - size + "");

            repaint();
        }
    }//GEN-LAST:event_silderStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String new_val = jeditTextField.getText().toString();
        String val[] = new_val.split("\n");
        new_val = String.join("<br>", val);
        System.out.println("<html>"+new_val+"<html>");
        if(new_val.isEmpty()){
            textLabel.setText("New Value");
        }
        else{
            textLabel.setText("<html>"+new_val+"<html>");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Specify a file to save");

		int userSelection = fileChooser.showSaveDialog(this);
		if (userSelection == JFileChooser.APPROVE_OPTION) {
			File fileToSave = fileChooser.getSelectedFile();
			System.out.println("Save as file: " + fileToSave.getAbsolutePath());
		}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void leftContainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftContainerActionPerformed
        // TODO add your handling code here:
        
        Color newColor = JColorChooser.showDialog(
                     rightPanel,
                     "Choose Left Container Color",
                     red);
                if(newColor != null){
                    c1 = newColor;
                    if(textLabel.getText().isEmpty()){
                        textLabel.setBackground(new Color(240,240,240));
                    }
                    else{
                        textLabel.setBackground(c1);
                    }
                    validate();
                    repaint();
                }
    }//GEN-LAST:event_leftContainerActionPerformed

    private void rightContainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightContainerActionPerformed
        // TODO add your handling code here:
        Color newColor = JColorChooser.showDialog(
                     rightPanel,
                     "Choose Right Container Color",
                     red);
                if(newColor != null){
                    c2 = newColor;
                    if(textLabel.getText().isEmpty()){
                        textLabel.setBackground(new Color(240,240,240));
                    }
                    else{
                        textLabel.setBackground(c2);
                    }
                    validate();
                    repaint();
                }
    }//GEN-LAST:event_rightContainerActionPerformed

    private void setFont() {
        Font font = new Font(name, Font.PLAIN, fSize);
        
           textLabel.setLocation(rect);
            textLabel.setFont(font);
             repaint();
    }

    private int fSize = 12;
    private String name = "Courier New";


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    /*
     public void paint(Graphics g) {
     super.paint(g);
     g.setColor(Color.RED);
     g.fillOval(cX, cY, r * 2, r * 2);

     }
    
     private class MouseHandler extends MouseAdapter implements
     MouseMotionListener {
     public void mousePressed(MouseEvent me) {
     isCircleClicked = 
     (cX - me.getX()) * (cX - me.getX()) +
     (cY - me.getY()) * (cY - me.getY()) < r * r ;
     }

     public void mouseDragged(MouseEvent me) {
     if (isCircleClicked) {

     x = me.getX() - dX;
     y = me.getY() - dY;
     cX = x + r;
     cY = y + r;
     repaint();
     }
     }

     public void mouseReleased(MouseEvent e) {
     isCircleClicked = false;
     }

     }
     */
    String text;
    boolean editable;
    private Random random = new Random();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox TextColor;
    private javax.swing.JComboBox TextFont;
    private javax.swing.JComboBox TextSize;
    private javax.swing.JButton addText;
    private javax.swing.JLabel colorLabel;
    private javax.swing.ButtonGroup containerSizeBtnGrp;
    private javax.swing.JButton deleteText;
    private javax.swing.JLabel fontLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jeditTextField;
    private javax.swing.JButton leftContainer;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton rightContainer;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JSlider silder;
    private javax.swing.JLabel sliderVar;
    private javax.swing.JLabel tSize;
    private javax.swing.JLabel textLabel;
    // End of variables declaration//GEN-END:variables

    private int c1x, c1y, c2x, c2y, cw, ch;
    private Point rect;
    private Color blue = new Color(0, 150, 255, 150);
    private Color red = new Color(255, 0, 0, 150);
    private Color green = new Color(0, 255, 0, 150);
    private Color yellow = new Color(255, 255, 0, 150);
    private Color orange = new Color(255, 128, 0, 150);

    private Color c1 = red;
    private Color c2 = blue;

    public static int size = 400;

    public class DragListener extends MouseAdapter {

        private final Component COMPONENT_TO_DRAG;
        private final int MOUSE_BUTTON;
        private Point mousePosition;
        private Point sourceLocation;
        private Point locationOnScreen;
        private int buttonPressed;

        public DragListener(final Component componentToDrag) {
            this(componentToDrag, MouseEvent.BUTTON1);
        }

        public DragListener(final Component componentToDrag, final int mouseButton) {
            this.COMPONENT_TO_DRAG = componentToDrag;
            this.MOUSE_BUTTON = mouseButton;
        }

        @Override
        public void mousePressed(final MouseEvent e) {
            this.buttonPressed = e.getButton();
            this.mousePosition = MouseInfo.getPointerInfo().getLocation();
            this.sourceLocation = new Point();
        }

        @Override
        public void mouseReleased(final MouseEvent e) {
            rect = textLabel.getLocation();
            repaint();
        }

        @Override
        public void mouseDragged(final MouseEvent e) {
            if (this.buttonPressed == MOUSE_BUTTON) {
                this.locationOnScreen = e.getLocationOnScreen();
                this.sourceLocation = this.COMPONENT_TO_DRAG.getLocation(this.sourceLocation);
                this.sourceLocation.translate((int) (this.locationOnScreen.getX() - this.mousePosition.getX()), (int) (this.locationOnScreen.getY() - this.mousePosition.getY()));
                this.COMPONENT_TO_DRAG.setLocation(this.sourceLocation);
                this.mousePosition = MouseInfo.getPointerInfo().getLocation();
            }
        }

        public void addHandle(Component handle) {
            handle.addMouseListener(this);
            handle.addMouseMotionListener(this);
        }
    }

}

