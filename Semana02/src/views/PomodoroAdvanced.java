/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import enums.Status;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.Timer;

/**
 *
 * @author Windows
 */
public class PomodoroAdvanced extends javax.swing.JFrame {


    public PomodoroAdvanced() {
        initComponents();
        time = this.createTimer();
    }
    
    private Timer time;
    private final int FOCUS_TIME = 25;
    private final int FAST_BREAK_TIME = 5;
    private final int LONG_BREAK_TIME = 15;
    private final int ROUNDS = 4;
    
    private int focusTime = 25;
    private int fastBreakTime = 5;
    private int longBreakTime = 15;
    private int rounds = 4;
    private int countRound = 0;
    
    private int tempoRestante = 25 * 60;
    private boolean isStopped = true;
    
    private Status statusAtual = Status.PAUSED;
    private Status statusAnterior = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        timer = new javax.swing.JPanel();
        timerLabel = new javax.swing.JLabel();
        playAndPauseBtn = new javax.swing.JLabel();
        settingsBtn = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        settings = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        focusTimeSlider = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        focusTimeLabel = new javax.swing.JLabel();
        breakFastSlider = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        breakFastLabel = new javax.swing.JLabel();
        breakLongSlider = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        breakLongLabel = new javax.swing.JLabel();
        roundSlider = new javax.swing.JSlider();
        jLabel8 = new javax.swing.JLabel();
        roundLabel = new javax.swing.JLabel();
        aplyBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();

        setAutoRequestFocus(false);

        main.setLayout(new java.awt.CardLayout());

        timerLabel.setFont(new java.awt.Font("Segoe UI", 0, 55)); // NOI18N
        timerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timerLabel.setText("25:00");

        playAndPauseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/play.png"))); // NOI18N
        playAndPauseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playAndPauseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playAndPauseBtnMouseClicked(evt);
            }
        });

        settingsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/engrenagem.png"))); // NOI18N
        settingsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsBtnMouseClicked(evt);
            }
        });

        statusLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        statusLabel.setText("Tempo de Foco");

        javax.swing.GroupLayout timerLayout = new javax.swing.GroupLayout(timer);
        timer.setLayout(timerLayout);
        timerLayout.setHorizontalGroup(
            timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(timerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerLayout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addGroup(timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerLayout.createSequentialGroup()
                        .addGroup(timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(statusLabel)
                            .addComponent(playAndPauseBtn))
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerLayout.createSequentialGroup()
                        .addComponent(settingsBtn)
                        .addGap(49, 49, 49))))
        );
        timerLayout.setVerticalGroup(
            timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(settingsBtn)
                .addGap(43, 43, 43)
                .addComponent(timerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(playAndPauseBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(statusLabel)
                .addGap(83, 83, 83))
        );

        main.add(timer, "timer");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/claro.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        focusTimeSlider.setMaximum(50);
        focusTimeSlider.setMinimum(1);
        focusTimeSlider.setValue(25);
        focusTimeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                focusTimeSliderStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tempo de Foco");

        focusTimeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        focusTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        focusTimeLabel.setText("25:00");
        focusTimeLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        breakFastSlider.setMaximum(15);
        breakFastSlider.setMinimum(1);
        breakFastSlider.setValue(5);
        breakFastSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                breakFastSliderStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Break curto");

        breakFastLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        breakFastLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        breakFastLabel.setText("5:00");
        breakFastLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        breakLongSlider.setMaximum(30);
        breakLongSlider.setMinimum(1);
        breakLongSlider.setValue(15);
        breakLongSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                breakLongSliderStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Break longo");

        breakLongLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        breakLongLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        breakLongLabel.setText("15:00");
        breakLongLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        roundSlider.setMaximum(10);
        roundSlider.setMinimum(1);
        roundSlider.setValue(4);
        roundSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                roundSliderStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Rounds");

        roundLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        roundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roundLabel.setText("4");
        roundLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        aplyBtn.setText("Aply");
        aplyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplyBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingsLayout = new javax.swing.GroupLayout(settings);
        settings.setLayout(settingsLayout);
        settingsLayout.setHorizontalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(focusTimeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roundSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(breakLongSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(breakFastSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(breakLongLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(breakFastLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(focusTimeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(139, 139, 139)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(roundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)))
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aplyBtn)
                .addGap(81, 81, 81))
        );
        settingsLayout.setVerticalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(focusTimeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(focusTimeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(breakFastLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(breakFastSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(breakLongLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(breakLongSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aplyBtn)
                    .addComponent(resetBtn))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        main.add(settings, "settings");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void settingsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsBtnMouseClicked
        changePanel("settings");
    }//GEN-LAST:event_settingsBtnMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        changePanel("timer");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void focusTimeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_focusTimeSliderStateChanged
        updateSliderLabel(this.focusTimeSlider, this.focusTimeLabel); 
    }//GEN-LAST:event_focusTimeSliderStateChanged

    private void breakFastSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_breakFastSliderStateChanged
        updateSliderLabel(this.breakFastSlider, this.breakFastLabel); 
    }//GEN-LAST:event_breakFastSliderStateChanged

    private void breakLongSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_breakLongSliderStateChanged
        updateSliderLabel(this.breakLongSlider, this.breakLongLabel); 
    }//GEN-LAST:event_breakLongSliderStateChanged

    private void roundSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_roundSliderStateChanged
        int value = this.roundSlider.getValue();
        String valueFormat = String.format("%02d", value);
        this.roundLabel.setText(valueFormat);
    }//GEN-LAST:event_roundSliderStateChanged

    private void aplyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplyBtnActionPerformed
        this.focusTime = this.focusTimeSlider.getValue();
        this.fastBreakTime = this.breakFastSlider.getValue();
        this.longBreakTime = this.breakLongSlider.getValue();
        this.rounds = this.roundSlider.getValue();   
        this.tempoRestante = this.focusTime * 60;
        int minutos = this.tempoRestante / 60;
        int segundos = this.tempoRestante % 60;
        timerLabel.setText(String.format("%02d:%02d", minutos, segundos));
        changePanel("timer");
    }//GEN-LAST:event_aplyBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        this.focusTimeSlider.setValue(this.FOCUS_TIME);
        this.breakFastSlider.setValue(this.FAST_BREAK_TIME);
        this.breakLongSlider.setValue(this.LONG_BREAK_TIME);
        this.roundSlider.setValue(this.ROUNDS);
        //comecar a rodar o tempo e trocar icone no botao, 
    }//GEN-LAST:event_resetBtnActionPerformed

    private void playAndPauseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playAndPauseBtnMouseClicked
        if(isStopped){
            this.time.start();
            this.playAndPauseBtn.setIcon(new ImageIcon(getClass().getResource("/assets/pause.png")));
            //isStopped = false;
            if(this.statusAnterior == null){
                statusAtual = Status.FOCUS_TIME;
                statusAnterior = Status.PAUSED;
            }else {
                statusAtual = statusAnterior;
                statusAnterior = Status.PAUSED;
            }
        }else{
            this.time.stop();
            this.playAndPauseBtn.setIcon(new ImageIcon(getClass().getResource("/assets/play.png")));
            //isStopped = true;
        }
        this.isStopped = !this.isStopped;
        
    }//GEN-LAST:event_playAndPauseBtnMouseClicked
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aplyBtn;
    private javax.swing.JLabel breakFastLabel;
    private javax.swing.JSlider breakFastSlider;
    private javax.swing.JLabel breakLongLabel;
    private javax.swing.JSlider breakLongSlider;
    private javax.swing.JLabel focusTimeLabel;
    private javax.swing.JSlider focusTimeSlider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel main;
    private javax.swing.JLabel playAndPauseBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel roundLabel;
    private javax.swing.JSlider roundSlider;
    private javax.swing.JPanel settings;
    private javax.swing.JLabel settingsBtn;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JPanel timer;
    private javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables

    private void changePanel(String cardName){
        CardLayout cardLayout = (CardLayout) this.main.getLayout();
        cardLayout.show(this.main, cardName);
    }
    private void updateSliderLabel(JSlider slider, JLabel label) {
        int value = slider.getValue();
        String valueFormat = String.format("%02d:%02d", value, 0);
        label.setText(valueFormat);
    }
    private Timer createTimer(){
        return new Timer(1000, (ActionEvent e) -> {
            updateTimer();
        });
    }
    private void updateTimer(){
        this.tempoRestante--;
        int minutos = this.tempoRestante / 60;
        int segundos = this.tempoRestante % 60;
        this.timerLabel.setText(String.format("%02d:%02d", minutos, segundos));
        if(this.tempoRestante <= 0 ){
            this.changeStatus();
        }
    }
    private void changeStatus (){
        if(this.statusAtual == Status.FOCUS_TIME && this.rounds == this.countRound){
            this.statusAtual = Status.BREAK_LONG;
            this.statusAnterior = Status.FOCUS_TIME;
            this.countRound = 0;
            this.tempoRestante = this.longBreakTime * 60;
        }else if(this.statusAtual == Status.FOCUS_TIME && this.rounds != this.countRound){
            this.statusAtual = Status.BREAK_FAST;
            this.statusAnterior = Status.FOCUS_TIME;
            this.countRound--;
            this.tempoRestante = this.fastBreakTime * 60;
        }else if(this.statusAtual == Status.BREAK_FAST){
            this.statusAtual = Status.FOCUS_TIME;
            this.statusAnterior = Status.BREAK_FAST;
            this.countRound--;
            this.tempoRestante = this.focusTime * 60;
        }else if(this.statusAtual == Status.BREAK_LONG){
            this.statusAtual = Status.FOCUS_TIME;
            this.statusAnterior = Status.BREAK_LONG;
            this.countRound--;
            this.tempoRestante = this.focusTime * 60;
        }
    }
}
