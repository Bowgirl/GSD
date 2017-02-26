/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Andrea
 */
public class GSD extends javax.swing.JFrame {

   /**
    * Creates new form GSD
    */
   public GSD() {
      initComponents();
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      CompileLoadPanel = new javax.swing.JPanel();
      CompileFileLocation = new javax.swing.JLabel();
      CompileFileBrowseBtn = new javax.swing.JButton();
      ResultsPanel = new javax.swing.JPanel();
      TaskBtn = new javax.swing.JButton();
      Test1Btn = new javax.swing.JButton();
      Test2Btn = new javax.swing.JButton();
      Test3Btn = new javax.swing.JButton();
      Test4Btn = new javax.swing.JButton();
      ResultBtn = new javax.swing.JButton();
      ResultScrollPane = new javax.swing.JScrollPane();
      ResultTextPanel = new javax.swing.JTextPane();
      TestPanel = new javax.swing.JPanel();
      StartBtn = new javax.swing.JButton();
      PauseBtn = new javax.swing.JButton();
      CancelBtn = new javax.swing.JButton();
      ResumeBtn = new javax.swing.JButton();
      StopBtn = new javax.swing.JButton();
      SaveResultBtn = new javax.swing.JButton();
      ResultSavePanel = new javax.swing.JPanel();
      ResultsFileLocation = new javax.swing.JLabel();
      ResultFileBrowseBtn = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      CompileLoadPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      CompileFileLocation.setText("Compile File Location");

      CompileFileBrowseBtn.setText("Browse");
      CompileFileBrowseBtn.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            CompileFileBrowseBtnActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout CompileLoadPanelLayout = new javax.swing.GroupLayout(CompileLoadPanel);
      CompileLoadPanel.setLayout(CompileLoadPanelLayout);
      CompileLoadPanelLayout.setHorizontalGroup(
         CompileLoadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(CompileLoadPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(CompileFileLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(CompileFileBrowseBtn)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      CompileLoadPanelLayout.setVerticalGroup(
         CompileLoadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(CompileLoadPanelLayout.createSequentialGroup()
            .addGap(48, 48, 48)
            .addGroup(CompileLoadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(CompileFileLocation)
               .addComponent(CompileFileBrowseBtn))
            .addContainerGap(57, Short.MAX_VALUE))
      );

      ResultsPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      TaskBtn.setText("Task");
      TaskBtn.setPreferredSize(new java.awt.Dimension(100, 23));
      TaskBtn.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            TaskBtnActionPerformed(evt);
         }
      });

      Test1Btn.setText("Test #1");
      Test1Btn.setPreferredSize(new java.awt.Dimension(100, 23));

      Test2Btn.setText("Test #2");
      Test2Btn.setPreferredSize(new java.awt.Dimension(100, 23));

      Test3Btn.setText("Test #3");
      Test3Btn.setPreferredSize(new java.awt.Dimension(100, 23));

      Test4Btn.setText("Test #4");
      Test4Btn.setPreferredSize(new java.awt.Dimension(100, 23));

      ResultBtn.setText("Result");
      ResultBtn.setPreferredSize(new java.awt.Dimension(100, 23));

      ResultScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
      ResultScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      ResultScrollPane.setViewportView(ResultTextPanel);

      javax.swing.GroupLayout ResultsPanelLayout = new javax.swing.GroupLayout(ResultsPanel);
      ResultsPanel.setLayout(ResultsPanelLayout);
      ResultsPanelLayout.setHorizontalGroup(
         ResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(ResultsPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(ResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(ResultScrollPane)
               .addGroup(ResultsPanelLayout.createSequentialGroup()
                  .addGroup(ResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(ResultsPanelLayout.createSequentialGroup()
                        .addComponent(TaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Test1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Test2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(ResultsPanelLayout.createSequentialGroup()
                        .addComponent(Test3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Test4Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ResultBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
      );
      ResultsPanelLayout.setVerticalGroup(
         ResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(ResultsPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(ResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(TaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(Test2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(Test1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(ResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(Test3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(ResultBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(Test4Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(ResultScrollPane)
            .addContainerGap())
      );

      TestPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      StartBtn.setText("Start");

      PauseBtn.setText("Pause");

      CancelBtn.setText("Cancel");

      ResumeBtn.setText("Resume");

      StopBtn.setText("Stop");

      SaveResultBtn.setText("Save Result");

      javax.swing.GroupLayout TestPanelLayout = new javax.swing.GroupLayout(TestPanel);
      TestPanel.setLayout(TestPanelLayout);
      TestPanelLayout.setHorizontalGroup(
         TestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TestPanelLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SaveResultBtn)
            .addGap(133, 133, 133))
         .addGroup(TestPanelLayout.createSequentialGroup()
            .addGap(63, 63, 63)
            .addGroup(TestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addGroup(TestPanelLayout.createSequentialGroup()
                  .addComponent(StartBtn)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(PauseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(TestPanelLayout.createSequentialGroup()
                  .addComponent(CancelBtn)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(TestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(StopBtn)
                     .addComponent(ResumeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      TestPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CancelBtn, PauseBtn, ResumeBtn, StartBtn, StopBtn});

      TestPanelLayout.setVerticalGroup(
         TestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(TestPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(TestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(StartBtn)
               .addComponent(PauseBtn))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(TestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(CancelBtn)
               .addComponent(ResumeBtn))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(StopBtn)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
            .addComponent(SaveResultBtn)
            .addContainerGap())
      );

      ResultSavePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      ResultsFileLocation.setText("Result File Location");

      ResultFileBrowseBtn.setText("Browse");
      ResultFileBrowseBtn.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            ResultFileBrowseBtnActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout ResultSavePanelLayout = new javax.swing.GroupLayout(ResultSavePanel);
      ResultSavePanel.setLayout(ResultSavePanelLayout);
      ResultSavePanelLayout.setHorizontalGroup(
         ResultSavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(ResultSavePanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(ResultsFileLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(ResultFileBrowseBtn)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      ResultSavePanelLayout.setVerticalGroup(
         ResultSavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(ResultSavePanelLayout.createSequentialGroup()
            .addGap(48, 48, 48)
            .addGroup(ResultSavePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(ResultsFileLocation)
               .addComponent(ResultFileBrowseBtn))
            .addContainerGap(57, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(CompileLoadPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(TestPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(ResultSavePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(ResultsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(CompileLoadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(TestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(ResultSavePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(0, 0, Short.MAX_VALUE))
               .addComponent(ResultsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void TaskBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaskBtnActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_TaskBtnActionPerformed

   private void CompileFileBrowseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompileFileBrowseBtnActionPerformed
      JFileChooser fc = new JFileChooser();
      int returnVal = fc.showOpenDialog(GSD.this);
      
      if (returnVal == JFileChooser.APPROVE_OPTION) {
         File file = fc.getSelectedFile();
         CompileFileLocation.setText(file.getPath());
      }
   }//GEN-LAST:event_CompileFileBrowseBtnActionPerformed

   private void ResultFileBrowseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultFileBrowseBtnActionPerformed
      JFileChooser fc = new JFileChooser();
      int returnVal = fc.showSaveDialog(GSD.this);
      
      if (returnVal == JFileChooser.APPROVE_OPTION) {
         File file = fc.getSelectedFile();
         ResultsFileLocation.setText(file.getPath());
      }
   }//GEN-LAST:event_ResultFileBrowseBtnActionPerformed

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
         java.util.logging.Logger.getLogger(GSD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(GSD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(GSD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(GSD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
        //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new GSD().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton CancelBtn;
   private javax.swing.JButton CompileFileBrowseBtn;
   private javax.swing.JLabel CompileFileLocation;
   private javax.swing.JPanel CompileLoadPanel;
   private javax.swing.JButton PauseBtn;
   private javax.swing.JButton ResultBtn;
   private javax.swing.JButton ResultFileBrowseBtn;
   private javax.swing.JPanel ResultSavePanel;
   private javax.swing.JScrollPane ResultScrollPane;
   private javax.swing.JTextPane ResultTextPanel;
   private javax.swing.JLabel ResultsFileLocation;
   private javax.swing.JPanel ResultsPanel;
   private javax.swing.JButton ResumeBtn;
   private javax.swing.JButton SaveResultBtn;
   private javax.swing.JButton StartBtn;
   private javax.swing.JButton StopBtn;
   private javax.swing.JButton TaskBtn;
   private javax.swing.JButton Test1Btn;
   private javax.swing.JButton Test2Btn;
   private javax.swing.JButton Test3Btn;
   private javax.swing.JButton Test4Btn;
   private javax.swing.JPanel TestPanel;
   // End of variables declaration//GEN-END:variables
}
