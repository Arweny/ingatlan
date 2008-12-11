package egyedek;

import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.awt.Dimension;
import javax.swing.JButton;

import adatbazis.*;

import java.awt.Color;
import javax.swing.JDialog;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class SzerzodesGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;  //  @jve:decl-index=0:visual-constraint="10,10"
	private JLabel jLabelAzonosito = null;
	private JTextField jTextFieldAzonosito = null;
	private JLabel jLabelSzigSzam = null;
	private JTextField jTextFieldSzigSzam = null;
	private JLabel jLabelVezetekNev = null;
	private JTextField jTextFieldVezetekNev = null;
	private JLabel jLabelKeresztNev = null;
	private JTextField jTextFieldKeresztNev = null;
	private JLabel jLabelLeanykoriNev = null;
	private JTextField jTextFieldLeanykoriNev = null;
	private JLabel jLabelSzuletesiHely = null;
	private JTextField jTextFieldSzuletesiHely = null;
	private JLabel jLabelSzuletesiIdo = null;
	private JTextField jTextFieldSzuletesiIdo = null;
	private JLabel jLabelAnyjaNeve = null;
	private JTextField jTextFieldAnyjaNeve = null;
	private JLabel jLabelCsaladiAllapota = null;
	private JTextField jTextFieldCsaladiAllapota = null;
	private JButton jButtonKovetkez = null;
	private JButton jButtonElozo = null;
	private JButton jButtonMentes = null;
	private JButton jButtonMegsem = null;

	private DBControl dbc=null;  //  @jve:decl-index=0:
	private JDialog jDialogErrorSave = null;  //  @jve:decl-index=0:visual-constraint="477,20"
	private JPanel jContentPane1 = null;
	private JLabel jLabel = null;
	private JButton jButton = null;
	private String m_tablename = "szerzodes";

	/**
	 * This is the default constructor
	 */
	public SzerzodesGUI() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 *
	 * @return void
	 */
	private void initialize() {
		this.setSize(450, 450);
		this.setContentPane(getJContentPane());
		this.setTitle("Szerződések");

		try {
			dbc = new DBControl();
		} catch (Exception e) {

		}
	}

	/**
	 *
	 */
	public Vector<String> getSzerzodesFieldVector() {
		Vector<String> data=new Vector<String>();
		data.add("azonosito");
		data.add( getJTextFieldAzonosito().getText() );
		data.add("szigszam");
		data.add( getJTextFieldSzigSzam().getText() );
		data.add("vezeteknev");
		data.add( getJTextFieldVezetekNev().getText() );
		data.add("keresztnev");
		data.add( getJTextFieldKeresztNev().getText() );
		data.add("leanykori_nev");
		data.add( getJTextFieldLeanykoriNev().getText() );
		data.add("szuletesi_hely");
		data.add( getJTextFieldSzuletesiHely().getText() );
		data.add("szuletesi_ido");
		data.add( getJTextFieldSzuletesiIdo().getText() );
		data.add("anyja_neve");
		data.add( getJTextFieldAnyjaNeve().getText() );
		data.add("csaladi_allapota");
		data.add( getJTextFieldCsaladiAllapota().getText() );
		return data;
	};

	/**
	 * This method initializes jContentPane
	 *
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelCsaladiAllapota = new JLabel();
			jLabelCsaladiAllapota.setBounds(new Rectangle(10, 209, 120, 20));
			jLabelCsaladiAllapota.setText("Családi állapota");
			jLabelAnyjaNeve = new JLabel();
			jLabelAnyjaNeve.setBounds(new Rectangle(10, 189, 120, 20));
			jLabelAnyjaNeve.setText("Anyja neve");
			jLabelSzuletesiIdo = new JLabel();
			jLabelSzuletesiIdo.setBounds(new Rectangle(10, 169, 120, 20));
			jLabelSzuletesiIdo.setText("Születési idő");
			jLabelSzuletesiHely = new JLabel();
			jLabelSzuletesiHely.setBounds(new Rectangle(10, 149, 120, 20));
			jLabelSzuletesiHely.setText("Születési hely");
			jLabelLeanykoriNev = new JLabel();
			jLabelLeanykoriNev.setBounds(new Rectangle(10, 129, 120, 20));
			jLabelLeanykoriNev.setText("Leánykori név");
			jLabelKeresztNev = new JLabel();
			jLabelKeresztNev.setBounds(new Rectangle(10, 109, 120, 20));
			jLabelKeresztNev.setText("Keresztnév");
			jLabelVezetekNev = new JLabel();
			jLabelVezetekNev.setBounds(new Rectangle(10, 89, 120, 20));
			jLabelVezetekNev.setText("Vezetéknév");
			jLabelSzigSzam = new JLabel();
			jLabelSzigSzam.setBounds(new Rectangle(10, 69, 120, 20));
			jLabelSzigSzam.setText("Személyi ig. szám");
			jLabelAzonosito = new JLabel();
			jLabelAzonosito.setBounds(new Rectangle(10, 49, 120, 20));
			jLabelAzonosito.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabelAzonosito.setText("Azonosító");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setSize(new Dimension(387, 247));
			jContentPane.add(jLabelAzonosito, null);
			jContentPane.add(getJTextFieldAzonosito(), null);
			jContentPane.add(jLabelSzigSzam, null);
			jContentPane.add(getJTextFieldSzigSzam(), null);
			jContentPane.add(jLabelVezetekNev, null);
			jContentPane.add(getJTextFieldVezetekNev(), null);
			jContentPane.add(jLabelKeresztNev, null);
			jContentPane.add(getJTextFieldKeresztNev(), null);
			jContentPane.add(jLabelLeanykoriNev, null);
			jContentPane.add(getJTextFieldLeanykoriNev(), null);
			jContentPane.add(jLabelSzuletesiHely, null);
			jContentPane.add(getJTextFieldSzuletesiHely(), null);
			jContentPane.add(jLabelSzuletesiIdo, null);
			jContentPane.add(getJTextFieldSzuletesiIdo(), null);
			jContentPane.add(jLabelAnyjaNeve, null);
			jContentPane.add(getJTextFieldAnyjaNeve(), null);
			jContentPane.add(jLabelCsaladiAllapota, null);
			jContentPane.add(getJTextFieldCsaladiAllapota(), null);
			jContentPane.add(getJButtonKovetkez(), null);
			jContentPane.add(getJButtonElozo(), null);
			jContentPane.add(getJButtonMentes(), null);
			jContentPane.add(getJButtonMegsem(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jTextFieldAzonosito
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldAzonosito() {
		if (jTextFieldAzonosito == null) {
			jTextFieldAzonosito = new JTextField();
			jTextFieldAzonosito.setBounds(new Rectangle(140, 49, 100, 20));
		}
		return jTextFieldAzonosito;
	}

	/**
	 * This method initializes jTextFieldSzigSzam
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldSzigSzam() {
		if (jTextFieldSzigSzam == null) {
			jTextFieldSzigSzam = new JTextField();
			jTextFieldSzigSzam.setBounds(new Rectangle(140, 69, 100, 20));
		}
		return jTextFieldSzigSzam;
	}

	/**
	 * This method initializes jTextFieldTipus
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldVezetekNev() {
		if (jTextFieldVezetekNev == null) {
			jTextFieldVezetekNev = new JTextField();
			jTextFieldVezetekNev.setBounds(new Rectangle(140, 89, 100, 20));
		}
		return jTextFieldVezetekNev;
	}

	/**
	 * This method initializes jTextFieldKeresztNev
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldKeresztNev() {
		if (jTextFieldKeresztNev == null) {
			jTextFieldKeresztNev = new JTextField();
			jTextFieldKeresztNev.setBounds(new Rectangle(140, 109, 100, 20));
		}
		return jTextFieldKeresztNev;
	}

	/**
	 * This method initializes jTextFieldLeanykoriNev
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldLeanykoriNev() {
		if (jTextFieldLeanykoriNev == null) {
			jTextFieldLeanykoriNev = new JTextField();
			jTextFieldLeanykoriNev.setBounds(new Rectangle(140, 129, 100, 20));
		}
		return jTextFieldLeanykoriNev;
	}

	/**
	 * This method initializes jTextFieldSzuletesiHely
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldSzuletesiHely() {
		if (jTextFieldSzuletesiHely == null) {
			jTextFieldSzuletesiHely = new JTextField();
			jTextFieldSzuletesiHely.setBounds(new Rectangle(140, 149, 100, 20));
		}
		return jTextFieldSzuletesiHely;
	}

	/**
	 * This method initializes jTextFieldSzuletesiIdo
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldSzuletesiIdo() {
		if (jTextFieldSzuletesiIdo == null) {
			jTextFieldSzuletesiIdo = new JTextField();
			jTextFieldSzuletesiIdo.setBounds(new Rectangle(140, 169, 100, 20));
		}
		return jTextFieldSzuletesiIdo;
	}

	/**
	 * This method initializes jTextFieldAnyjaNeve
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldAnyjaNeve() {
		if (jTextFieldAnyjaNeve == null) {
			jTextFieldAnyjaNeve = new JTextField();
			jTextFieldAnyjaNeve.setBounds(new Rectangle(140, 189, 100, 20));
		}
		return jTextFieldAnyjaNeve;
	}

	/**
	 * This method initializes jTextFieldCsaladiAllapota
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldCsaladiAllapota() {
		if (jTextFieldCsaladiAllapota == null) {
			jTextFieldCsaladiAllapota = new JTextField();
			jTextFieldCsaladiAllapota.setBounds(new Rectangle(140, 209, 100, 20));
		}
		return jTextFieldCsaladiAllapota;
	}

	/**
	 * This method initializes jButtonKovetkez
	 *
	 * @return javax.swing.JButton
	 */
	private JButton getJButtonKovetkez() {
		if (jButtonKovetkez == null) {
			jButtonKovetkez = new JButton();
			jButtonKovetkez.setBounds(new Rectangle(310, 10, 120, 30));
			jButtonKovetkez.setText("Következő");
			jButtonKovetkez.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
				}
			});
		}
		return jButtonKovetkez;
	}

	/**
	 * This method initializes jButtonElozo
	 *
	 * @return javax.swing.JButton
	 */
	private JButton getJButtonElozo() {
		if (jButtonElozo == null) {
			jButtonElozo = new JButton();
			jButtonElozo.setBounds(new Rectangle(10, 10, 120, 30));
			jButtonElozo.setText("Előző");
			jButtonElozo.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
				}
			});
		}
		return jButtonElozo;
	}

	/**
	 * This method initializes jButtonMentes
	 *
	 * @return javax.swing.JButton
	 */
	private JButton getJButtonMentes() {
		if (jButtonMentes == null) {
			jButtonMentes = new JButton();
			jButtonMentes.setBounds(new Rectangle(50, 380, 120, 30));
			jButtonMentes.setBackground(new Color(238, 200, 200));
			jButtonMentes.setText("Mentés");
			jButtonMentes.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("Szerződes mentés");
					try {
						dbc.SaveData(getSzerzodesFieldVector(), m_tablename);
					} catch (Exception ex) {
						System.out.println("Print Stack Trace:");
						ex.printStackTrace();
						getJDialogErrorSave().setVisible(true);
					}
				}
			});
		}
		return jButtonMentes;
	}

	/**
	 * This method initializes jButtonMegsem
	 *
	 * @return javax.swing.JButton
	 */
	private JButton getJButtonMegsem() {
		if (jButtonMegsem == null) {
			jButtonMegsem = new JButton();
			jButtonMegsem.setBounds(new Rectangle(280, 380, 120, 30));
			jButtonMegsem.setText("Mégsem");
			jButtonMegsem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
				}
			});
		}
		return jButtonMegsem;
	}

	/**
	 * This method initializes jDialogErrorSave
	 *
	 * @return javax.swing.JDialog
	 */
	private JDialog getJDialogErrorSave() {
		if (jDialogErrorSave == null) {
			jDialogErrorSave = new JDialog(this);
			jDialogErrorSave.setSize(new Dimension(215, 123));
			jDialogErrorSave.setTitle("Error");
			jDialogErrorSave.setModal(true);
			jDialogErrorSave.setContentPane(getJContentPane1());
		}
		return jDialogErrorSave;
	}

	/**
	 * This method initializes jContentPane1
	 *
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane1() {
		if (jContentPane1 == null) {
			jLabel = new JLabel();
			jLabel.setText("Hiba történt a mentés során!");
			jLabel.setHorizontalTextPosition(SwingConstants.CENTER);
			jLabel.setBackground(new Color(238, 80, 80));
			jLabel.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabel.setForeground(new Color(200, 51, 51));
			jLabel.setHorizontalAlignment(SwingConstants.CENTER);
			jContentPane1 = new JPanel();
			jContentPane1.setLayout(new BorderLayout());
			jContentPane1.add(jLabel, BorderLayout.CENTER);
			jContentPane1.add(getJButton(), BorderLayout.SOUTH);
		}
		return jContentPane1;
	}

	/**
	 * This method initializes jButton
	 *
	 * @return javax.swing.JButton
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("OK");
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					getJDialogErrorSave().setVisible(false);
				}
			});
		}
		return jButton;
	}

}  //  @jve:decl-index=0:visual-constraint="14,17"
