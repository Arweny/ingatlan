package ingatlan;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JDialog;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JTable;

import egyedek.*;
import adatbazis.*;

/**
 * @author zmaros
 *
 */
public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JMenuBar mainMenu = null;
	private JMenu Ingatlanok = null;
	private JMenuItem addIngatlanok = null;
	private JMenuItem delIngatlanok = null;
	private JMenu Szerzodesek = null;
	private JMenu jMenu = null;
	private JMenuItem jMenuItem = null;
	private JMenuItem jMenuItem1 = null;
	private JMenuItem jMenuItem2 = null;
	private JMenuItem jMenuItem3 = null;
	private JMenuItem jMenuItem4 = null;
	private JMenuItem jMenuItem5 = null;
	private JMenuItem jMenuItem6 = null;
	private JMenu jMenu1 = null;
	private JMenuItem jMenuItem7 = null;
	private JDialog jDialogNevjegy = null;  //  @jve:decl-index=0:visual-constraint="840,16"
	private JPanel jContentPane1 = null;
	private JInternalFrame jInternalFrame = null;
	private JPanel jContentPane2 = null;
	private JTable jTable = null;
	/**
	 * This method initializes mainMenu
	 *
	 * @return javax.swing.JMenuBar
	 */
	private JMenuBar getMainMenu() {
		if (mainMenu == null) {
			mainMenu = new JMenuBar();
			mainMenu.add(getJMenu());
			mainMenu.add(getIngatlanok());
			mainMenu.add(getSzerzodesek());
			mainMenu.add(getJMenu1());
		}

		return mainMenu;
	}


	/**
	 * This method initializes Ingatlanok
	 *
	 * @return javax.swing.JMenuItem
	 */
	private JMenu getIngatlanok() {
		if (Ingatlanok == null) {
			Ingatlanok = new JMenu();
			Ingatlanok.setText("Ingatlanok");
			Ingatlanok.add(getAddIngatlanok());
			Ingatlanok.add(getJMenuItem3());
			Ingatlanok.add(getDelIngatlanok());
		}

		return Ingatlanok;
	}


	/**
	 * This method initializes addIngatlanok
	 *
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getAddIngatlanok() {
		if (addIngatlanok == null) {
			addIngatlanok = new JMenuItem();
			addIngatlanok.setText("Hozzáadás");
			addIngatlanok.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					JFrame ingatlan = new IngatlanGUI();
					ingatlan.setVisible(true);
				}
			});
		}

		return addIngatlanok;
	}


	/**
	 * This method initializes delIngatlanok
	 *
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getDelIngatlanok() {
		if (delIngatlanok == null) {
			delIngatlanok = new JMenuItem();
			delIngatlanok.setText("Törlés");
		}

		return delIngatlanok;
	}


	/**
	 * This method initializes Ingatlanok
	 *
	 * @return javax.swing.JMenuItem
	 */
	private JMenu getSzerzodesek() {
		if (Szerzodesek == null) {
			Szerzodesek = new JMenu();
			Szerzodesek.setText("Szerződések");
			Szerzodesek.add(getJMenuItem4());
			Szerzodesek.add(getJMenuItem5());
			Szerzodesek.add(getJMenuItem6());
		}

		return Szerzodesek;
	}

	/**
	 * This method initializes jMenu
	 *
	 * @return javax.swing.JMenu
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("Ügyfelek");
			jMenu.add(getJMenuItem());
			jMenu.add(getJMenuItem1());
			jMenu.add(getJMenuItem2());
		}
		return jMenu;
	}


	/**
	 * This method initializes jMenuItem
	 *
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getJMenuItem() {
		if (jMenuItem == null) {
			jMenuItem = new JMenuItem();
			jMenuItem.setText("Hozzáadás");
			jMenuItem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					JFrame ugyfel = new UgyfelGUI();
					ugyfel.setVisible(true);
				}
			});
		}
		return jMenuItem;
	}


	/**
	 * This method initializes jMenuItem1
	 *
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getJMenuItem1() {
		if (jMenuItem1 == null) {
			jMenuItem1 = new JMenuItem();
			jMenuItem1.setText("Módosítás");
		}
		return jMenuItem1;
	}


	/**
	 * This method initializes jMenuItem2
	 *
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getJMenuItem2() {
		if (jMenuItem2 == null) {
			jMenuItem2 = new JMenuItem();
			jMenuItem2.setText("Törlés");
		}
		return jMenuItem2;
	}


	/**
	 * This method initializes jMenuItem3
	 *
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getJMenuItem3() {
		if (jMenuItem3 == null) {
			jMenuItem3 = new JMenuItem();
			jMenuItem3.setText("Módosítás");
		}
		return jMenuItem3;
	}


	/**
	 * This method initializes jMenuItem4
	 *
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getJMenuItem4() {
		if (jMenuItem4 == null) {
			jMenuItem4 = new JMenuItem();
			jMenuItem4.setText("Hozzáadás");
			jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					JFrame szerzodes = new SzerzodesGUI();
					szerzodes.setVisible(true);
				}
			});
		}
		return jMenuItem4;
	}


	/**
	 * This method initializes jMenuItem5
	 *
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getJMenuItem5() {
		if (jMenuItem5 == null) {
			jMenuItem5 = new JMenuItem();
			jMenuItem5.setText("Módosítás");
		}
		return jMenuItem5;
	}


	/**
	 * This method initializes jMenuItem6
	 *
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getJMenuItem6() {
		if (jMenuItem6 == null) {
			jMenuItem6 = new JMenuItem();
			jMenuItem6.setText("Törlés");
		}
		return jMenuItem6;
	}


	/**
	 * This method initializes jMenu1
	 *
	 * @return javax.swing.JMenu
	 */
	private JMenu getJMenu1() {
		if (jMenu1 == null) {
			jMenu1 = new JMenu();
			jMenu1.setText("Segítség");
			jMenu1.add(getJMenuItem7());
		}
		return jMenu1;
	}


	/**
	 * This method initializes jMenuItem7
	 *
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getJMenuItem7() {
		if (jMenuItem7 == null) {
			jMenuItem7 = new JMenuItem();
			jMenuItem7.setText("Névjegy");
			jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					JDialog about = getJDialogNevjegy();
					about.setVisible(true);
				}
			});
		}
		return jMenuItem7;
	}


	/**
	 * This method initializes jDialogNevjegy
	 *
	 * @return javax.swing.JDialog
	 */
	private JDialog getJDialogNevjegy() {
		if (jDialogNevjegy == null) {
			jDialogNevjegy = new JDialog(this);
			jDialogNevjegy.setSize(new Dimension(300, 190));
			jDialogNevjegy.setTitle("Névjegy");
			jDialogNevjegy.setContentPane(getJContentPane1());
		}
		return jDialogNevjegy;
	}


	/**
	 * This method initializes jContentPane1
	 *
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane1() {
		if (jContentPane1 == null) {
			BorderLayout borderLayout = new BorderLayout();
			borderLayout.setHgap(5);
			borderLayout.setVgap(5);
			jContentPane1 = new JPanel();
			jContentPane1.setLayout(borderLayout);
			jContentPane1.add(getJInternalFrame(), BorderLayout.CENTER);
		}
		return jContentPane1;
	}


	/**
	 * This method initializes jInternalFrame
	 *
	 * @return javax.swing.JInternalFrame
	 */
	private JInternalFrame getJInternalFrame() {
		if (jInternalFrame == null) {
			jInternalFrame = new JInternalFrame();
			jInternalFrame.setContentPane(getJContentPane2());
		}
		return jInternalFrame;
	}


	/**
	 * This method initializes jContentPane2
	 *
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane2() {
		if (jContentPane2 == null) {
			jContentPane2 = new JPanel();
			jContentPane2.setLayout(new BorderLayout());
		}
		return jContentPane2;
	}


	/**
	 * This method initializes jTable
	 *
	 * @return javax.swing.JTable
	 */
	private JTable getJTable() {
		if (jTable == null) {
			jTable = new JTable();
		}
		return jTable;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainFrame thisClass = new MainFrame();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}


	/**
	 * This is the default constructor
	 */
	public MainFrame() {
		super();
		initialize();
	}


	/**
	 * This method initializes this
	 *
	 * @return void
	 */
	private void initialize() {
		this.setSize(457, 298);
		this.setJMenuBar(getMainMenu());
		this.setContentPane(getJContentPane());
		this.setTitle("Ingatlan bérbeadási nyilvántartás");
	}


	/**
	 * This method initializes jContentPane
	 *
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());

			jContentPane.add(getJTable(), BorderLayout.CENTER);
		}

		return jContentPane;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
