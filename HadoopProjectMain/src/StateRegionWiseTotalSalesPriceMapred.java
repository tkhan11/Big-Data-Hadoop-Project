/**
 *
 * @author tanveerlaptop
 */

import java.util.Date;
import java.util.*;
import org.apache.hadoop.util.*;
import org.apache.hadoop.conf.*;
import java.io.*;
import java.net.*;
import org.apache.hadoop.io.*;
import org.apache.hadoop.fs.*;

public class StateRegionWiseTotalSalesPriceMapred extends javax.swing.JFrame {

    public StateRegionWiseTotalSalesPriceMapred() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        DesktopPanevar = new javax.swing.JDesktopPane();
        bodypanel = new javax.swing.JPanel();
        Executevar = new javax.swing.JButton();
        savevar = new javax.swing.JButton();
        exitvar = new javax.swing.JButton();
        Showvar = new javax.swing.JButton();
        maptextareascrollvar = new javax.swing.JScrollPane();
        mapredtextareavar = new javax.swing.JTextArea();
        imagepanelvar = new javax.swing.JPanel();
        mapredimagevar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("State Wise Total Sales");
        DesktopPanevar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                DesktopPanevarAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Executevar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Executevar.setText("Execute");
        Executevar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Executevar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecutevarActionPerformed(evt);
            }
        });

        savevar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        savevar.setText("Save");
        savevar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        savevar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savevarActionPerformed(evt);
            }
        });

        exitvar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        exitvar.setText("Exit");
        exitvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitvarActionPerformed(evt);
            }
        });

        Showvar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Showvar.setText("Show Report");
        Showvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Showvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowvarActionPerformed(evt);
            }
        });

        mapredtextareavar.setColumns(20);
        mapredtextareavar.setRows(5);
        mapredtextareavar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                mapredtextareavarAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        maptextareascrollvar.setViewportView(mapredtextareavar);

        mapredimagevar.setIcon(new javax.swing.ImageIcon("/home/cloudera/Desktop/HadoopProjectMain/images/mapreduceimg.png")); // NOI18N

        javax.swing.GroupLayout imagepanelvarLayout = new javax.swing.GroupLayout(imagepanelvar);
        imagepanelvar.setLayout(imagepanelvarLayout);
        imagepanelvarLayout.setHorizontalGroup(
            imagepanelvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagepanelvarLayout.createSequentialGroup()
                .addComponent(mapredimagevar, javax.swing.GroupLayout.DEFAULT_SIZE, 1056, Short.MAX_VALUE)
                .addContainerGap())
        );
        imagepanelvarLayout.setVerticalGroup(
            imagepanelvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mapredimagevar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bodypanelLayout = new javax.swing.GroupLayout(bodypanel);
        bodypanel.setLayout(bodypanelLayout);
        bodypanelLayout.setHorizontalGroup(
            bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodypanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Executevar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savevar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Showvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addComponent(maptextareascrollvar)
                .addContainerGap())
            .addComponent(imagepanelvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodypanelLayout.setVerticalGroup(
            bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodypanelLayout.createSequentialGroup()
                .addComponent(imagepanelvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodypanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Executevar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(Showvar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(savevar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(exitvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodypanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maptextareascrollvar, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        DesktopPanevar.setLayer(bodypanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopPanevarLayout = new javax.swing.GroupLayout(DesktopPanevar);
        DesktopPanevar.setLayout(DesktopPanevarLayout);
        DesktopPanevarLayout.setHorizontalGroup(
            DesktopPanevarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DesktopPanevarLayout.setVerticalGroup(
            DesktopPanevarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPanevarLayout.createSequentialGroup()
                .addComponent(bodypanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPanevar)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPanevar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1086, 620));
        setLocationRelativeTo(null);
    }
    
    private void ExecutevarActionPerformed(java.awt.event.ActionEvent evt) {
		String args[]={"Superstoredata/superstore.csv","Superstoredata/outputdir/StateRegionWiseTotalSalesPrice"};
                   
			try{
				 StateRegionWiseTotalSalesPrice.Driver(args); 	   
			} catch(Exception e){}
	
	}
    private void exitvarActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
    }

    private void DesktopPanevarAncestorAdded(javax.swing.event.AncestorEvent evt) {
	
	}
	
    private void savevarActionPerformed(java.awt.event.ActionEvent evt) {
	
		try{
			String record="";
			Configuration conf = new Configuration();
			FileSystem fs = FileSystem.get(conf);
			FileOutputStream fout=new FileOutputStream("/home/cloudera/Desktop/Reports/StateRegionWiseTotalSalesPrice");
			BufferedReader br=new BufferedReader(new InputStreamReader(fs.open(new Path("Superstoredata/outputdir/StateRegionWiseTotalSalesPrice/part-r-00000/"))));
			while ((record = br.readLine()) != null) {
				byte[] character=record.getBytes();
				fout.write(character);
			}		
			fout.close();
			br.close();
		}catch(Exception e){
			System.out.println("Unable to read.....\n " + e);
		}
	
	}
	
    private void ShowvarActionPerformed(java.awt.event.ActionEvent evt) {
		mapredtextareavar.setText("");
		try{
			String record="";
			Configuration conf = new Configuration();
			FileSystem fs = FileSystem.get(conf);
			BufferedReader br=new BufferedReader(new InputStreamReader(fs.open(new Path("Superstoredata/outputdir/StateRegionWiseTotalSalesPrice/part-r-00000/"))));
			while ((record = br.readLine()) != null) {
				mapredtextareavar.append(record + "\n");
			}
			br.close();
		}catch(Exception e){
			System.out.println("Unable to read.....\n " + e);
		}
	}
	
    private void mapredtextareavarAncestorAdded(javax.swing.event.AncestorEvent evt) {
	
	}
	
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StateRegionWiseTotalSalesPriceMapred.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StateRegionWiseTotalSalesPriceMapred.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StateRegionWiseTotalSalesPriceMapred.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StateRegionWiseTotalSalesPriceMapred.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StateRegionWiseTotalSalesPriceMapred().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPanevar;
    private javax.swing.JButton Executevar;
    private javax.swing.JButton Showvar;
    private javax.swing.JPanel bodypanel;
    private javax.swing.JButton exitvar;
    private javax.swing.JPanel imagepanelvar;
    private javax.swing.JLabel mapredimagevar;
    private javax.swing.JTextArea mapredtextareavar;
    private javax.swing.JScrollPane maptextareascrollvar;
    private javax.swing.JButton savevar;
    // End of variables declaration//GEN-END:variables
}
