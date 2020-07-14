/**
 *
 * @author tanveerlaptop
 */
import org.apache.hadoop.util.*;
import org.apache.hadoop.conf.*;
import java.io.*;
import java.net.*;
import org.apache.hadoop.io.*;
import org.apache.hadoop.fs.*;
 
public class HadoopInterface extends javax.swing.JFrame {
    public HadoopInterface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        parentpanel = new javax.swing.JPanel();
        bodypanel1 = new javax.swing.JPanel();
        bodypanel1child1 = new javax.swing.JLabel();
        bodypanel2 = new javax.swing.JPanel();
        bodypanel2child2 = new javax.swing.JPanel();
        bp2child2ScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        outputvar = new javax.swing.JLabel();
        bodypanel2child1 = new javax.swing.JPanel();
        ShowDatavar = new javax.swing.JButton();
        parentmenu = new javax.swing.JMenuBar();
        Profilevar = new javax.swing.JMenu();
        profilevar1 = new javax.swing.JMenuItem();
        exitvar = new javax.swing.JMenuItem();
        filevar = new javax.swing.JMenu();
        Mapreducevar = new javax.swing.JMenu();
        mr1var = new javax.swing.JMenuItem();
        mr2var = new javax.swing.JMenuItem();
        mr3var = new javax.swing.JMenuItem();
        mr4var = new javax.swing.JMenuItem();
        mr5var = new javax.swing.JMenuItem();
        mr6var = new javax.swing.JMenuItem();
        mr7var = new javax.swing.JMenuItem();
        mr8var = new javax.swing.JMenuItem();
        Regionvar = new javax.swing.JMenu();
        cityvar = new javax.swing.JMenuItem();
        statevar = new javax.swing.JMenuItem();
        newsvar = new javax.swing.JMenuItem();
        othersvar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hadoop");

        parentpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bodypanel1child1.setIcon(new javax.swing.ImageIcon("/home/cloudera/Desktop/HadoopProjectMain/images/1280px-Hadoop_logo_new.svg.png")); // NOI18N

        javax.swing.GroupLayout bodypanel1Layout = new javax.swing.GroupLayout(bodypanel1);
        bodypanel1.setLayout(bodypanel1Layout);
        bodypanel1Layout.setHorizontalGroup(
            bodypanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodypanel1child1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodypanel1Layout.setVerticalGroup(
            bodypanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodypanel1child1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, Short.MAX_VALUE)
        );

        textarea.setColumns(100);
        textarea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textarea.setLineWrap(true);
        textarea.setRows(100);
        textarea.setTabSize(5);
        textarea.setWrapStyleWord(true);
        textarea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textarea.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                textareaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        bp2child2ScrollPane1.setViewportView(textarea);

        outputvar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        outputvar.setText("Input File");
        outputvar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout bodypanel2child2Layout = new javax.swing.GroupLayout(bodypanel2child2);
        bodypanel2child2.setLayout(bodypanel2child2Layout);
        bodypanel2child2Layout.setHorizontalGroup(
            bodypanel2child2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bp2child2ScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1101, Short.MAX_VALUE)
            .addComponent(outputvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodypanel2child2Layout.setVerticalGroup(
            bodypanel2child2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodypanel2child2Layout.createSequentialGroup()
                .addComponent(outputvar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bp2child2ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ShowDatavar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ShowDatavar.setText("Show Data");
        ShowDatavar.setToolTipText("");
        ShowDatavar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ShowDatavar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDatavarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodypanel2child1Layout = new javax.swing.GroupLayout(bodypanel2child1);
        bodypanel2child1.setLayout(bodypanel2child1Layout);
        bodypanel2child1Layout.setHorizontalGroup(
            bodypanel2child1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodypanel2child1Layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(ShowDatavar)
                .addGap(29, 29, 29))
        );
        bodypanel2child1Layout.setVerticalGroup(
            bodypanel2child1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodypanel2child1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(ShowDatavar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bodypanel2Layout = new javax.swing.GroupLayout(bodypanel2);
        bodypanel2.setLayout(bodypanel2Layout);
        bodypanel2Layout.setHorizontalGroup(
            bodypanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodypanel2Layout.createSequentialGroup()
                .addComponent(bodypanel2child1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bodypanel2child2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        bodypanel2Layout.setVerticalGroup(
            bodypanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodypanel2Layout.createSequentialGroup()
                .addGroup(bodypanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bodypanel2child2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bodypanel2child1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout parentpanelLayout = new javax.swing.GroupLayout(parentpanel);
        parentpanel.setLayout(parentpanelLayout);
        parentpanelLayout.setHorizontalGroup(
            parentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodypanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parentpanelLayout.createSequentialGroup()
                .addComponent(bodypanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        parentpanelLayout.setVerticalGroup(
            parentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parentpanelLayout.createSequentialGroup()
                .addComponent(bodypanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodypanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(parentpanel, java.awt.BorderLayout.CENTER);

        parentmenu.setBackground(new java.awt.Color(204, 204, 255));
        parentmenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        parentmenu.setAlignmentY(0.5F);
        parentmenu.setAutoscrolls(true);
        parentmenu.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        parentmenu.setPreferredSize(new java.awt.Dimension(120, 40));

        Profilevar.setBackground(new java.awt.Color(255, 204, 204));
        Profilevar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Profilevar.setText("Profile");
        Profilevar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Profilevar.setPreferredSize(new java.awt.Dimension(95, 40));

        profilevar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        profilevar1.setText("Manage");
        profilevar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        profilevar1.setPreferredSize(new java.awt.Dimension(92, 35));
        profilevar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilevar1ActionPerformed(evt);
            }
        });
        Profilevar.add(profilevar1);

        exitvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        exitvar.setText("Sign out");
        exitvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitvar.setPreferredSize(new java.awt.Dimension(92, 35));
        exitvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitvarActionPerformed(evt);
            }
        });
        Profilevar.add(exitvar);

        parentmenu.add(Profilevar);

        filevar.setBackground(new java.awt.Color(255, 204, 204));
        filevar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        filevar.setText("File");
        filevar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        filevar.setPreferredSize(new java.awt.Dimension(149, 40));

        Mapreducevar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mapreducevar.setText("MapReduce");
        Mapreducevar.setToolTipText("");
        Mapreducevar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Mapreducevar.setHideActionText(true);
        Mapreducevar.setPreferredSize(new java.awt.Dimension(149, 35));
        Mapreducevar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                MapreducevarAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        mr1var.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mr1var.setText("Customer Total Purchase Price");
        mr1var.setToolTipText("");
        mr1var.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mr1var.setPreferredSize(new java.awt.Dimension(260, 35));
        mr1var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mr1varActionPerformed(evt);
            }
        });
        Mapreducevar.add(mr1var);

        mr2var.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mr2var.setText("Category Wise Total Sales");
        mr2var.setToolTipText("");
        mr2var.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mr2var.setPreferredSize(new java.awt.Dimension(92, 35));
        mr2var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mr2varActionPerformed(evt);
            }
        });
        Mapreducevar.add(mr2var);

        mr3var.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mr3var.setText("Sub Category Wise Total Sales");
        mr3var.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mr3var.setPreferredSize(new java.awt.Dimension(92, 35));
        mr3var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mr3varActionPerformed(evt);
            }
        });
        Mapreducevar.add(mr3var);

        mr4var.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mr4var.setText("Total Profit Attained by Customer");
        mr4var.setToolTipText("");
        mr4var.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mr4var.setPreferredSize(new java.awt.Dimension(92, 35));
        mr4var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mr4varActionPerformed(evt);
            }
        });
        Mapreducevar.add(mr4var);

        mr5var.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mr5var.setText("Segment Wise Sales");
        mr5var.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mr5var.setPreferredSize(new java.awt.Dimension(92, 35));
        mr5var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mr5varActionPerformed(evt);
            }
        });
        Mapreducevar.add(mr5var);

        mr6var.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mr6var.setText("Quantity Based Analysis");
        mr6var.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mr6var.setPreferredSize(new java.awt.Dimension(92, 35));
        mr6var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mr6varActionPerformed(evt);
            }
        });
        Mapreducevar.add(mr6var);

        mr7var.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mr7var.setText("Total Transactions Per Customer");
        mr7var.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mr7var.setPreferredSize(new java.awt.Dimension(92, 35));
        mr7var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mr7varActionPerformed(evt);
            }
        });
        Mapreducevar.add(mr7var);

        mr8var.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mr8var.setText("Average Total Sales Per Customer");
        mr8var.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mr8var.setPreferredSize(new java.awt.Dimension(92, 35));
        mr8var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mr8varActionPerformed(evt);
            }
        });
        Mapreducevar.add(mr8var);

        Regionvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Regionvar.setText("Region Wise Sales");
        Regionvar.setToolTipText("");
        Regionvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Regionvar.setPreferredSize(new java.awt.Dimension(149, 35));

        cityvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cityvar.setText("City");
        cityvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cityvar.setPreferredSize(new java.awt.Dimension(92, 35));
        cityvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityvarActionPerformed(evt);
            }
        });
        Regionvar.add(cityvar);

        statevar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        statevar.setText("State");
        statevar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        statevar.setPreferredSize(new java.awt.Dimension(92, 35));
        statevar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statevarActionPerformed(evt);
            }
        });
        Regionvar.add(statevar);

        newsvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        newsvar.setText("NEWS");
        newsvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        newsvar.setPreferredSize(new java.awt.Dimension(92, 35));
        newsvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newsvarActionPerformed(evt);
            }
        });
        Regionvar.add(newsvar);

        Mapreducevar.add(Regionvar);

        filevar.add(Mapreducevar);

        othersvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        othersvar.setText("Others");
        othersvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        othersvar.setPreferredSize(new java.awt.Dimension(149, 35));
        filevar.add(othersvar);

        parentmenu.add(filevar);

        setJMenuBar(parentmenu);

        setSize(new java.awt.Dimension(1412, 987));
        setLocationRelativeTo(null);
    }
    
    private void exitvarActionPerformed(java.awt.event.ActionEvent evt) {
       if(evt.getSource()==exitvar){
           System.exit(0);	}
    }
    
    private void MapreducevarAncestorAdded(javax.swing.event.AncestorEvent evt) {
		// for Mapreduce menu 
	}
    private void mr1varActionPerformed(java.awt.event.ActionEvent evt) {
       new CustomerTotalPurchasepricemapred().setVisible(true);
    }
    private void mr2varActionPerformed(java.awt.event.ActionEvent evt) {
       //  if(evt.getSource()==mr2var){
       new CategoryWiseTotalSalesMapred().setVisible(true);
       
    }
    
    private void textareaAncestorAdded(javax.swing.event.AncestorEvent evt) {
	
	}
    private void mr3varActionPerformed(java.awt.event.ActionEvent evt) {
		new SubCategoryWiseTotalSalesMapred().setVisible(true);
	}
    private void mr4varActionPerformed(java.awt.event.ActionEvent evt) {
		new TotalProfitAttainedByCustMapred().setVisible(true);
	}
    private void mr5varActionPerformed(java.awt.event.ActionEvent evt) {
		new SegmentWiseTotalSalesMapred().setVisible(true);
	}

    private void mr6varActionPerformed(java.awt.event.ActionEvent evt) {
		new QuantityBasedAnalysisMapred().setVisible(true);
	}
    private void mr7varActionPerformed(java.awt.event.ActionEvent evt) {
		new TotalTransactionsPerCustomerMapred().setVisible(true);
	}
    private void mr8varActionPerformed(java.awt.event.ActionEvent evt) {
		new	AvgTotSalesPurchsePricePerCustMapred().setVisible(true);
	}
    private void cityvarActionPerformed(java.awt.event.ActionEvent evt) {
		new CityRegionWiseTotalSalesPriceMapred().setVisible(true);
	}
    private void statevarActionPerformed(java.awt.event.ActionEvent evt) {
		new	StateRegionWiseTotalSalesPriceMapred().setVisible(true);
	}
    private void newsvarActionPerformed(java.awt.event.ActionEvent evt) {
		new	ZoneRegionWiseTotalSalesPriceMapred().setVisible(true);
	}
    private void profilevar1ActionPerformed(java.awt.event.ActionEvent evt) {
	
	}
    private void ShowDatavarActionPerformed(java.awt.event.ActionEvent evt) {
		textarea.setText("");
        try{
			String record="";
			Configuration conf = new Configuration();
			FileSystem fs = FileSystem.get(conf);
			BufferedReader br=new BufferedReader(new InputStreamReader(fs.open(new Path("Superstoredata/superstore.csv"))));
			while ((record = br.readLine()) != null) {
				textarea.append(record + "\n");
				
			}
		}catch(Exception e){
			System.out.println("Unable to read.....\n " + e);
		}
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
            java.util.logging.Logger.getLogger(HadoopInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HadoopInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HadoopInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HadoopInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HadoopInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Mapreducevar;
    private javax.swing.JMenu Profilevar;
    private javax.swing.JMenu Regionvar;
    private javax.swing.JButton ShowDatavar;
    private javax.swing.JPanel bodypanel1;
    private javax.swing.JLabel bodypanel1child1;
    private javax.swing.JPanel bodypanel2;
    private javax.swing.JPanel bodypanel2child1;
    private javax.swing.JPanel bodypanel2child2;
    private javax.swing.JScrollPane bp2child2ScrollPane1;
    private javax.swing.JMenuItem cityvar;
    private javax.swing.JMenuItem exitvar;
    private javax.swing.JMenu filevar;
    private javax.swing.JMenuItem mr1var;
    private javax.swing.JMenuItem mr2var;
    private javax.swing.JMenuItem mr3var;
    private javax.swing.JMenuItem mr4var;
    private javax.swing.JMenuItem mr5var;
    private javax.swing.JMenuItem mr6var;
    private javax.swing.JMenuItem mr7var;
    private javax.swing.JMenuItem mr8var;
    private javax.swing.JMenuItem newsvar;
    private javax.swing.JMenu othersvar;
    private javax.swing.JLabel outputvar;
    private javax.swing.JMenuBar parentmenu;
    private javax.swing.JPanel parentpanel;
    private javax.swing.JMenuItem profilevar1;
    private javax.swing.JMenuItem statevar;
    private javax.swing.JTextArea textarea;
    // End of variables declaration//GEN-END:variables
}
