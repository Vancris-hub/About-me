/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacTes;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author CRISTI
 */
public class TicTacToe_s extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0 ;
    private int oCount = 0 ;
   
    /**
     * Creates new form TicTacToe_s
     */
    public TicTacToe_s() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
    }

    private void gameScore()
    {
        jlblPlayerX.setText(String.valueOf(xCount));
        jlblPlayerO.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player ()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O" ;
        }
        else
        {
            startGame = "X" ;
        }
    }
    
    private void winningGame ()
    {
         int xTest = 0 ;
         int oTest = 0 ;
        
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        
        String b4 = jButton10.getText();
        String b5 = jButton9.getText();
        String b6 = jButton8.getText();
        
        String b7 = jButton11.getText();
        String b8 = jButton12.getText();
        String b9 = jButton13.getText();
        
        oTest = oCount ;
        xTest = xCount ;
          if (b1==("O") && b2 == ("O") && b3 == ("O"))
        {
            oTest = oCount ;
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
         jButton1.setBackground(Color.PINK);
         jButton2.setBackground(Color.PINK);
         jButton3.setBackground(Color.PINK);
         
         jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        jButton10.setText("");
        jButton9.setText("");
        jButton8.setText("");
        
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
        }
        
        if (b4==("O") && b5 == ("O") && b6 == ("O"))
        {
            oTest = oCount ;
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton10.setBackground(Color.YELLOW);
         jButton9.setBackground(Color.YELLOW);
         jButton8.setBackground(Color.YELLOW);
         
         jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        jButton10.setText("");
        jButton9.setText("");
        jButton8.setText("");
        
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
        }
        
        if (b7==("O") && b8 == ("O") && b9 == ("O"))
        {
            oTest = oCount ;
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
         jButton11.setBackground(Color.MAGENTA);
         jButton12.setBackground(Color.MAGENTA);
         jButton13.setBackground(Color.MAGENTA);
         
         jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        jButton10.setText("");
        jButton9.setText("");
        jButton8.setText("");
        
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
        }
        
        if (b1==("O") && b4 == ("O") && b7 == ("O"))
        {
            oTest = oCount ;
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
         jButton1.setBackground(Color.MAGENTA);
         jButton10.setBackground(Color.MAGENTA);
         jButton11.setBackground(Color.MAGENTA);
         
         jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        jButton10.setText("");
        jButton9.setText("");
        jButton8.setText("");
        
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
        }
        
        if (b2==("O") && b5 == ("O") && b8 == ("O"))
        {
            oTest = oCount ;
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
         jButton2.setBackground(Color.MAGENTA);
         jButton9.setBackground(Color.MAGENTA);
         jButton12.setBackground(Color.MAGENTA);
         
         jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        jButton10.setText("");
        jButton9.setText("");
        jButton8.setText("");
        
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
        }
        
        if (b3==("O") && b6 == ("O") && b9 == ("O"))
        {
            oTest = oCount ;
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
         jButton3.setBackground(Color.PINK);
         jButton8.setBackground(Color.PINK);
         jButton13.setBackground(Color.PINK);
         
         jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        jButton10.setText("");
        jButton9.setText("");
        jButton8.setText("");
        
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
        }
        
        if (b1==("O") && b5 == ("O") && b9 == ("O"))
        {
            oTest = oCount ;
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
         jButton1.setBackground(Color.PINK);
         jButton9.setBackground(Color.PINK);
         jButton13.setBackground(Color.PINK);
         
         jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        jButton10.setText("");
        jButton9.setText("");
        jButton8.setText("");
        
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
        }
        
        if (b3==("O") && b5 == ("O") && b7 == ("O"))
        {
            oTest = oCount ;
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
         jButton3.setBackground(Color.PINK);
         jButton9.setBackground(Color.PINK);
         jButton11.setBackground(Color.PINK);
         
         jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        jButton10.setText("");
        jButton9.setText("");
        jButton8.setText("");
        
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
        }
        
        




            //Conditions for X Player
        
        
        
        
        
        
        
        if (b1==("X") && b2 == ("X") && b3 == ("X"))
        {
          xTest = xCount ;
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
         jButton1.setBackground(Color.PINK);
         jButton2.setBackground(Color.PINK);
         jButton3.setBackground(Color.PINK);
         
         jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        jButton10.setText("");
        jButton9.setText("");
        jButton8.setText("");
        
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
        }
        
        if (b4==("X") && b5 == ("X") && b6 == ("X"))
        {
            xTest = xCount ;
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton10.setBackground(Color.YELLOW);
         jButton9.setBackground(Color.YELLOW);
         jButton8.setBackground(Color.YELLOW);
         
         jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        jButton10.setText("");
        jButton9.setText("");
        jButton8.setText("");
        
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
        }
        
        if (b7==("X") && b8 == ("X") && b9 == ("X"))
        {
            xTest = xCount ;
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
         jButton11.setBackground(Color.MAGENTA);
         jButton12.setBackground(Color.MAGENTA);
         jButton13.setBackground(Color.MAGENTA);
         
         jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        jButton10.setText("");
        jButton9.setText("");
        jButton8.setText("");
        
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
        }
        
        if (b1==("X") && b4 == ("X") && b7 == ("X"))
        {
            xTest = xCount ;
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
         jButton1.setBackground(Color.MAGENTA);
         jButton10.setBackground(Color.MAGENTA);
         jButton11.setBackground(Color.MAGENTA);
         
         jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        jButton10.setText("");
        jButton9.setText("");
        jButton8.setText("");
        
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
        }
        
        if (b2==("X") && b5 == ("X") && b8 == ("X"))
        {
            xTest = xCount ;
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
         jButton2.setBackground(Color.MAGENTA);
         jButton9.setBackground(Color.MAGENTA);
         jButton12.setBackground(Color.MAGENTA);
         jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        jButton10.setText("");
        jButton9.setText("");
        jButton8.setText("");
        
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
        }
        
        if (b3==("X") && b6 == ("X") && b9 == ("X"))
        {
            xTest = xCount ;
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
         jButton3.setBackground(Color.PINK);
         jButton8.setBackground(Color.PINK);
         jButton13.setBackground(Color.PINK);
         jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        jButton10.setText("");
        jButton9.setText("");
        jButton8.setText("");
        
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
        }
        
        if (b1==("X") && b5 == ("X") && b9 == ("X"))
        {
            xTest = xCount ;
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
         jButton1.setBackground(Color.PINK);
         jButton9.setBackground(Color.PINK);
         jButton13.setBackground(Color.PINK);
         jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        jButton10.setText("");
        jButton9.setText("");
        jButton8.setText("");
        
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
        }
        
        if (b3==("X") && b5 == ("X") && b7 == ("X"))
        {
            xTest = xCount ;
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
         jButton3.setBackground(Color.PINK);
         jButton9.setBackground(Color.PINK);
         jButton11.setBackground(Color.PINK);
         jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        jButton10.setText("");
        jButton9.setText("");
        jButton8.setText("");
        
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
        }
        
        if((b1!=("")) && (b2!=("")) && (b3!=("")) && (b4!=(""))&& (b5!=("")) && (b6!=("")) && (b7!=("")) && (b8!=("")) && (b9!=("")) && (xCount-xTest)==0  && (oCount-oTest)==0)
        
        
        {
            JOptionPane.showMessageDialog(this,"Draw", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE); 
            jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        jButton10.setText("");
        jButton9.setText("");
        jButton8.setText("");
        
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
            
        }
   
    
    }
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jlblPlayerX = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jlblPlayerO = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Player X:");
        jPanel6.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jlblPlayerX.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("jLabel3");
        jPanel7.add(jlblPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton10, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Player O:");
        jPanel11.add(jLabel5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jlblPlayerO.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("jLabel4");
        jPanel12.add(jlblPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton11, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton12, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton13, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel16.add(jbtnReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private JFrame frame ;                                 

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        jButton2.setText(startGame);
        
        
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton2.setForeground(Color.GREEN);
        }
        else
        {
            jButton2.setForeground(Color.BLUE);
        }
        choose_a_Player() ; 
        winningGame () ;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         
        jButton10.setText(startGame);
        
        
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton10.setForeground(Color.GREEN);
        }
        else
        {
            jButton10.setForeground(Color.BLUE);
        }
        choose_a_Player() ;
        winningGame () ;
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        
        jButton10.setText("");
        jButton9.setText("");
        jButton8.setText("");
        
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed

        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION);
        {
            System.exit(0);
        }
        
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        jButton1.setText(startGame);
        
        
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton1.setForeground(Color.GREEN);
        }
        else
        {
            jButton1.setForeground(Color.BLUE);
        }
        choose_a_Player() ; 
        winningGame () ;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        jButton11.setText(startGame);
        
        
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton11.setForeground(Color.GREEN);
        }
        else
        {
            jButton11.setForeground(Color.BLUE);
        }
        choose_a_Player() ;
        winningGame () ;
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        
        jButton12.setText(startGame);
        
        
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton12.setForeground(Color.GREEN);
        }
        else
        {
            jButton12.setForeground(Color.BLUE);
        }
        choose_a_Player() ;
        winningGame () ;
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       
        jButton9.setText(startGame);
        
        
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton9.setForeground(Color.GREEN);
        }
        else
        {
            jButton9.setForeground(Color.BLUE);
        }
        choose_a_Player() ;
        winningGame () ;
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        jButton3.setText(startGame);
        
        
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton3.setForeground(Color.GREEN);
        }
        else
        {
            jButton3.setForeground(Color.BLUE);
        }
        choose_a_Player() ;
        winningGame () ;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
        jButton8.setText(startGame);
        
        
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton8.setForeground(Color.GREEN);
        }
        else
        {
            jButton8.setForeground(Color.BLUE);
        }
        choose_a_Player() ; 
        winningGame () ;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       
        jButton13.setText(startGame);
        
        
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton13.setForeground(Color.GREEN);
        }
        else
        {
            jButton13.setForeground(Color.BLUE);
        }
        choose_a_Player() ;
        winningGame () ;
    }//GEN-LAST:event_jButton13ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_s().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    // End of variables declaration//GEN-END:variables
}
