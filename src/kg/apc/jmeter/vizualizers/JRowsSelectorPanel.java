/*
 * JRowsSelectorPanel.java
 *
 * Created on Dec 29, 2010, 2:09:35 AM
 */

package kg.apc.jmeter.vizualizers;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Stephane Hoblingre
 */
public class JRowsSelectorPanel extends javax.swing.JPanel implements GraphRendererInterface {

    /** Creates new form JRowsSelectorPanel */
    public JRowsSelectorPanel() {
        initComponents();
    }

    public void setTable(Component table)
    {
        jPanelRowsTable.add(table, BorderLayout.CENTER);
    }

    public void refreshPreview()
    {
        jPanelGraphPreview.invalidate();
        jPanelGraphPreview.repaint();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelLogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelMain = new javax.swing.JPanel();
        jPanelRowsTable = new javax.swing.JPanel();
        jPanelGraphPreview = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        setLayout(new java.awt.BorderLayout());

        jPanelLogo.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kg/apc/jmeter/vizualizers/logoSimple.png"))); // NOI18N
        jPanelLogo.add(jLabel1);

        add(jPanelLogo, java.awt.BorderLayout.PAGE_END);

        jPanelMain.setLayout(new java.awt.GridBagLayout());

        jPanelRowsTable.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanelMain.add(jPanelRowsTable, gridBagConstraints);

        jPanelGraphPreview.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 4);
        jPanelMain.add(jPanelGraphPreview, gridBagConstraints);

        jLabel2.setText("Graph Preview:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanelMain.add(jLabel2, gridBagConstraints);

        add(jPanelMain, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelGraphPreview;
    private javax.swing.JPanel jPanelLogo;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelRowsTable;
    // End of variables declaration//GEN-END:variables

    @Override
    public JPanel getGraphDisplayPanel()
    {
        return jPanelGraphPreview;
    }

}
