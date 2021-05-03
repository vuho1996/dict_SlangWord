/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dic_slangword;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author macintoshhd
 */
public class quizSWFrame extends javax.swing.JFrame {

    /**
     * Creates new form quizSWFrame
     */
    int score = 0;
    int answered = 0;
    int correctAnswer = 0;
    String compare_Answer = "";
    
            
    public quizSWFrame() throws FileNotFoundException {
        initComponents();
        
        //centerRenderer.setHorizontalAlignment( JLabel.CENTER )
        setDefaultCloseOperation(addFrame.DISPOSE_ON_CLOSE);
        txtA.setEditable(false);
        txtB.setEditable(false);
        txtC.setEditable(false);
        txtD.setEditable(false);
        

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        btnRestart.setEnabled(false);
        quiz_SW();
        
//     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        grAnwers = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        labQuestion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnNext = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        txtD = new javax.swing.JTextField();
        radA = new javax.swing.JRadioButton();
        radB = new javax.swing.JRadioButton();
        radC = new javax.swing.JRadioButton();
        radD = new javax.swing.JRadioButton();
        lbScore = new javax.swing.JLabel();
        lbCorectAnswer = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnRestart = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbAnswered = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Câu Hỏi:");

        labQuestion.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labQuestion.setText("???");

        btnNext.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        btnNext.setText("Câu Tiếp Theo");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel3.setText("Điểm:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel4.setText("Số câu trả lời đúng:");

        txtA.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        txtB.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        txtC.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        txtD.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        grAnwers.add(radA);
        radA.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        radA.setText("A");
        radA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radAActionPerformed(evt);
            }
        });

        grAnwers.add(radB);
        radB.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        radB.setText("B");
        radB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBActionPerformed(evt);
            }
        });

        grAnwers.add(radC);
        radC.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        radC.setText("C");
        radC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCActionPerformed(evt);
            }
        });

        grAnwers.add(radD);
        radD.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        radD.setText("D");
        radD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radD, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(radC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(radB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(radA, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtD, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addComponent(txtC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtA, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(radA)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radD))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        lbScore.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lbScore.setText("0");

        lbCorectAnswer.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lbCorectAnswer.setText("0");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnRestart.setText("Chơi Lại");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel2.setText("Số câu đã Trả lời:");

        lbAnswered.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lbAnswered.setText("0/10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbScore)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCorectAnswer)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbAnswered)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labQuestion)
                                .addGap(30, 30, 30)))))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(lbScore)
                    .addComponent(lbCorectAnswer)
                    .addComponent(jLabel2)
                    .addComponent(lbAnswered))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radAActionPerformed
        // TODO add your handling code here:
         if(radA.isSelected()){
             if(txtA.getText().equals(compare_Answer)){
                 txtA_While_Green();
                 score = score + 10;
                 correctAnswer++;
                 lbScore.setText(String.valueOf(score));
                 lbCorectAnswer.setText(String.valueOf(correctAnswer));
             }else{
                 if(txtB.getText().equals(compare_Answer)){
                     txtB_While_Green();
                 }else if(txtC.getText().equals(compare_Answer)){
                     txtC_While_Green();
                 }else{
                     txtD_While_Green();
                 }
             }
         }
         
        rad_EnableFalse();  
    }//GEN-LAST:event_radAActionPerformed

    private void radBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBActionPerformed
        // TODO add your handling code here:
        if(radB.isSelected()){
             if(txtB.getText().equals(compare_Answer)){
                 txtB_While_Green();
                 score = score + 10;
                 correctAnswer++;
                 lbScore.setText(String.valueOf(score));
                 lbCorectAnswer.setText(String.valueOf(correctAnswer));
             }else{
                 if(txtA.getText().equals(compare_Answer)){
                     txtA_While_Green();
                 }else if(txtC.getText().equals(compare_Answer)){
                     txtC_While_Green();
                 }else{
                     txtD_While_Green();
                 }
             }
         }
         
           rad_EnableFalse();                 
    }//GEN-LAST:event_radBActionPerformed

    private void radCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCActionPerformed
        // TODO add your handling code here:
        if(radC.isSelected()){
             if(txtC.getText().equals(compare_Answer)){
                 txtC_While_Green();   
                 score = score + 10;
                 correctAnswer++;
                 lbScore.setText(String.valueOf(score));
                 lbCorectAnswer.setText(String.valueOf(correctAnswer));
             }else{
                 if(txtB.getText().equals(compare_Answer)){
                     txtB_While_Green();
                 }else if(txtA.getText().equals(compare_Answer)){
                     txtA_While_Green();
                 }else{
                     txtD_While_Green();
                 }
             }
         }
         
        rad_EnableFalse();            
    }//GEN-LAST:event_radCActionPerformed

    private void radDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radDActionPerformed
        // TODO add your handling code here:
         if(radD.isSelected()){
             if(txtD.getText().equals(compare_Answer)){
                 txtD_While_Green();    
                 score = score+ 10;
                 correctAnswer++;
                 lbScore.setText(String.valueOf(score));
                 lbCorectAnswer.setText(String.valueOf(correctAnswer));
             }else{
                 if(txtB.getText().equals(compare_Answer)){
                     txtB_While_Green();
                 }else if(txtC.getText().equals(compare_Answer)){
                     txtC_While_Green();
                 }else{
                     txtA_While_Green();
                 }
             }
         }
         
         rad_EnableFalse();                
    }//GEN-LAST:event_radDActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try {
            if(radA.isSelected() | radB.isSelected() | radC.isSelected() | radD.isSelected()){
                    
                    quiz_SW();
                    rad_EnableTrue();
                    txtColor_Default();
                    
                   
            }else{
                JOptionPane.showMessageDialog(rootPane, "Bạn chựa chọn câu trả lời");
               
            }
            
            answered++;
            lbAnswered.setText(String.valueOf(answered) + "/10");
            
            if(answered == 10){
                btnNext.setEnabled(false);
                btnRestart.setEnabled(true);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(quizSWFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnNextActionPerformed
        
    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        // TODO add your handling code here:
        resetJframe();
        
        try {
            quiz_SW();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(quizSWFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRestartActionPerformed

    //
    public void resetJframe(){
        score = 0;
        answered = 0;
        correctAnswer = 0;
        btnNext.setEnabled(true);
        
        radA.setEnabled(true);
        radB.setEnabled(true);
        radC.setEnabled(true);
        radD.setEnabled(true);
        grAnwers.clearSelection();
        
        txtColor_Default();
        
        lbScore.setText("0");
        lbCorectAnswer.setText("0");
        lbAnswered.setText("0");
        
        btnRestart.setEnabled(false);
        
    }
    // Set màu cho textfied lựa chọn A nếu đúng
    public void txtA_While_Green(){
        txtA.setForeground(Color.WHITE);
                txtB.setForeground(Color.BLACK);
                txtC.setForeground(Color.BLACK);
                txtD.setForeground(Color.BLACK);
                 
                txtA.setBackground(Color.GREEN);
                txtB.setBackground(Color.red);
                txtC.setBackground(Color.red);
                txtD.setBackground(Color.red);
                        
    }
    
     // Set màu cho textfied lựa chọn B nếu đúng
    public void txtB_While_Green(){
        txtB.setForeground(Color.WHITE);
                txtA.setForeground(Color.BLACK);
                txtC.setForeground(Color.BLACK);
                txtD.setForeground(Color.BLACK);
                
                txtB.setBackground(Color.GREEN);
                txtA.setBackground(Color.red);
                txtC.setBackground(Color.red);
                txtD.setBackground(Color.red);
                          
    }
   
     // Set màu cho textfied lựa chọn C nếu đúng
    public void txtC_While_Green(){
        txtC.setForeground(Color.WHITE);
                txtB.setForeground(Color.BLACK);
                txtA.setForeground(Color.BLACK);
                txtD.setForeground(Color.BLACK);
                
                txtC.setBackground(Color.GREEN);
                txtB.setBackground(Color.red);
                txtA.setBackground(Color.red);
                txtD.setBackground(Color.red);               
    }
    
    // Set màu cho textfied lựa chọn D nếu đúng
    public void txtD_While_Green(){
        txtD.setForeground(Color.WHITE);
                txtB.setForeground(Color.BLACK);
                txtC.setForeground(Color.BLACK);
                txtA.setForeground(Color.BLACK);
                
                txtD.setBackground(Color.GREEN);
                txtB.setBackground(Color.red);
                txtC.setBackground(Color.red);
                txtA.setBackground(Color.red);
                
                
    }
    
    //set màu defaut cho textfied
    public void txtColor_Default(){
        txtA.setForeground(Color.BLACK);
        txtB.setForeground(Color.BLACK);
        txtC.setForeground(Color.BLACK);
        txtD.setForeground(Color.BLACK);
        
        
        txtA.setBackground(Color.WHITE);
        txtB.setBackground(Color.WHITE);
        txtC.setBackground(Color.WHITE);
        txtD.setBackground(Color.WHITE);
    } 
    
    public void rad_EnableFalse(){
        radA.setEnabled(false);
        radB.setEnabled(false);
        radC.setEnabled(false);
        radD.setEnabled(false);
    }
    
    public void rad_EnableTrue(){
        radA.setEnabled(true);
        radB.setEnabled(true);
        radC.setEnabled(true);
        radD.setEnabled(true);
        
        grAnwers.clearSelection();
    
    }
    /**
     * @param args the command line arguments
     */
    public HashMap<String, List<String>> getData() throws FileNotFoundException{
        HashMap<String, List<String>> list = new HashMap<String, List<String>>();
        dao_SW db =  new dao_SW();
        list = db.getData();
        return list;
    }
    
    // Danh Sách Các Key Slang Word
    public List<String> key_SW() throws FileNotFoundException{
        List<String> key = new ArrayList<String>();
        for (String item : getData().keySet()) {
        key.add(item);
    }
        return key;
    }
    
    public List<List<String>> value_SW() throws FileNotFoundException{
        List<List<String>> value = new ArrayList<>();
        for (List<String> item : getData().values()) {
        value.add(item);
    }
        return value;
    }
    
    public List<String> questions_SW(List<String> question) throws FileNotFoundException{
        
        List<String> key = new ArrayList<String>();
        
        Random rand = new Random();
        String slang = key_SW().get(rand.nextInt(key_SW().size()));
        String meaning =  getData().get(slang).get(rand.nextInt(getData().get(slang).size()));
        
        question.add(slang);
        question.add(meaning.trim());
        
        return question;
    }
    
    public List<String> answers_SW(List<String> question, List<String> answer) throws FileNotFoundException {
        int i = 0;
        String meaning = "";
        Random rand = new Random();
        
        List<String> key = new ArrayList<String>();
        
        answer.add(question.get(1).trim());

        while(i<3){
           key = value_SW().get(rand.nextInt(value_SW().size()));
           meaning = key.get(new Random().nextInt(key.size())).trim();
           if(!meaning.equals(question.get(1).trim())){
               answer.add(meaning);
               i++;
           }
        }
        return answer;
//       
    }
    
    public List<List<String>> quiz_DataSW() throws FileNotFoundException{
        
        List<List<String>> quiz = new ArrayList();
        List<String> question = new ArrayList();
        List<String> answers = new ArrayList();
        
        
        questions_SW(question);
        answers_SW(question, answers);
        
        quiz.add(question);
       
        Collections.shuffle(answers, new Random());
        quiz.add(answers);
        
//        
//        labQuestion.setText("Nghĩa của từ '" + question.get(0)+ "' là gì?");
//        txtA.setText(answers.get(0));
//        txtB.setText(answers.get(1));
//        txtC.setText(answers.get(2));
//        txtD.setText(answers.get(3));
//        
        return quiz;
        
    }
    
    public void quiz_SW() throws FileNotFoundException{
         
         List<List<String>> quizData = new ArrayList();
         quizData = quiz_DataSW();
         compare_Answer =  quizData.get(0).get(1);
         labQuestion.setText("Nghĩa của từ '" + quizData.get(0).get(0)+ "' là gì?");
         txtA.setText(quizData.get(1).get(0));
         txtB.setText(quizData.get(1).get(1));
         txtC.setText(quizData.get(1).get(2));
         txtD.setText(quizData.get(1).get(3));
         
         System.out.println(quizData);
                 
        
    }
    
   
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
            java.util.logging.Logger.getLogger(quizSWFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quizSWFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quizSWFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quizSWFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new quizSWFrame().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(quizSWFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnRestart;
    private javax.swing.ButtonGroup grAnwers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labQuestion;
    private javax.swing.JLabel lbAnswered;
    private javax.swing.JLabel lbCorectAnswer;
    private javax.swing.JLabel lbScore;
    private javax.swing.JRadioButton radA;
    private javax.swing.JRadioButton radB;
    private javax.swing.JRadioButton radC;
    private javax.swing.JRadioButton radD;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtD;
    // End of variables declaration//GEN-END:variables
}
