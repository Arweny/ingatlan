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
	private JLabel jLabelKezdete = null;
	private JTextField jTextFieldKezdete = null;
	private JLabel jLabelLejarat = null;
	private JTextField jTextFieldLejarat = null;
	private JLabel jLabelHosszabbitas1 = null;
	private JTextField jTextFieldHosszabbitas1 = null;
	private JLabel jLabelHosszabbitas2 = null;
	private JTextField jTextFieldHosszabbitas2 = null;
	private JLabel jLabelHosszabbitas3 = null;
	private JTextField jTextFieldHosszabbitas3 = null;
	private JLabel jLabelFelmondasTipusa = null;
	private JTextField jTextFieldFelmondasTipusa = null;
	private JLabel jLabelFelmondasIndoka = null;
	private JTextField jTextFieldFelmondasIndoka = null;
	private JLabel jLabelFelmondta = null;
	private JTextField jTextFieldFelmondta = null;
	private JLabel jLabelLakokSzama = null;
	private JTextField jTextFieldLakokSzama = null;
	private JLabel jLabelBerloAzonosito = null;
	private JTextField jTextFieldBerloAzonosito = null;
	private JLabel jLabelIngatlanAzonosito = null;
	private JTextField jTextFieldIngatlanAzonosito = null;
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
		this.setTitle("Szerződés");

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
		data.add("kezdete");
		data.add( getJTextFieldKezdete().getText() );
		data.add("lejarat");
		data.add( getJTextFieldLejarat().getText() );
		data.add("hosszabbitas1");
		data.add( getJTextFieldHosszabbitas1().getText() );
		data.add("hosszabbitas2");
		data.add( getJTextFieldHosszabbitas2().getText() );
		data.add("hosszabbitas3");
		data.add( getJTextFieldHosszabbitas3().getText() );
		data.add("felmondas_tipusa");
		data.add( getJTextFieldFelmondasTipusa().getText() );
		data.add("felmondas_indoka");
		data.add( getJTextFieldFelmondasIndoka().getText() );
		data.add("felmondta");
		data.add( getJTextFieldFelmondta().getText() );
		data.add("lakok_szama");
		data.add( getJTextFieldLakokSzama().getText() );
		data.add("berlo_azonosito");
		data.add( getJTextFieldBerloAzonosito().getText() );
		data.add("ingatlan_azonosito");
		data.add( getJTextFieldIngatlanAzonosito().getText() );
		return data;
	};

	/**
	 * This method initializes jContentPane
	 *
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelIngatlanAzonosito = new JLabel();
			jLabelIngatlanAzonosito.setBounds(new Rectangle(10, 269, 120, 20));
			jLabelIngatlanAzonosito.setText("Ingatlan azonosító");
			jLabelBerloAzonosito = new JLabel();
			jLabelBerloAzonosito.setBounds(new Rectangle(10, 249, 120, 20));
			jLabelBerloAzonosito.setText("Bérlő azonosító");
			jLabelLakokSzama = new JLabel();
			jLabelLakokSzama.setBounds(new Rectangle(10, 229, 120, 20));
			jLabelLakokSzama.setText("Lakók száma");
			jLabelFelmondta = new JLabel();
			jLabelFelmondta.setBounds(new Rectangle(10, 209, 120, 20));
			jLabelFelmondta.setText("Felmondta");
			jLabelFelmondasIndoka = new JLabel();
			jLabelFelmondasIndoka.setBounds(new Rectangle(10, 189, 120, 20));
			jLabelFelmondasIndoka.setText("Felmondás indoka");
			jLabelFelmondasTipusa = new JLabel();
			jLabelFelmondasTipusa.setBounds(new Rectangle(10, 169, 120, 20));
			jLabelFelmondasTipusa.setText("Felmondás tipusa");
			jLabelHosszabbitas3 = new JLabel();
			jLabelHosszabbitas3.setBounds(new Rectangle(10, 149, 120, 20));
			jLabelHosszabbitas3.setText("Hosszabbítás3");
			jLabelHosszabbitas2 = new JLabel();
			jLabelHosszabbitas2.setBounds(new Rectangle(10, 129, 120, 20));
			jLabelHosszabbitas2.setText("Hosszabbítás2");
			jLabelHosszabbitas1 = new JLabel();
			jLabelHosszabbitas1.setBounds(new Rectangle(10, 109, 120, 20));
			jLabelHosszabbitas1.setText("Hosszabbítás1");
			jLabelLejarat = new JLabel();
			jLabelLejarat.setBounds(new Rectangle(10, 89, 120, 20));
			jLabelLejarat.setText("Lejárat");
			jLabelKezdete = new JLabel();
			jLabelKezdete.setBounds(new Rectangle(10, 69, 120, 20));
			jLabelKezdete.setText("Kezdet");
			jLabelAzonosito = new JLabel();
			jLabelAzonosito.setBounds(new Rectangle(10, 49, 120, 20));
			jLabelAzonosito.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabelAzonosito.setText("Azonosító");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setSize(new Dimension(387, 247));
			jContentPane.add(jLabelAzonosito, null);
			jContentPane.add(getJTextFieldAzonosito(), null);
			jContentPane.add(jLabelKezdete, null);
			jContentPane.add(getJTextFieldKezdete(), null);
			jContentPane.add(jLabelLejarat, null);
			jContentPane.add(getJTextFieldLejarat(), null);
			jContentPane.add(jLabelHosszabbitas1, null);
			jContentPane.add(getJTextFieldHosszabbitas1(), null);
			jContentPane.add(jLabelHosszabbitas2, null);
			jContentPane.add(getJTextFieldHosszabbitas2(), null);
			jContentPane.add(jLabelHosszabbitas3, null);
			jContentPane.add(getJTextFieldHosszabbitas3(), null);
			jContentPane.add(jLabelFelmondasTipusa, null);
			jContentPane.add(getJTextFieldFelmondasTipusa(), null);
			jContentPane.add(jLabelFelmondasIndoka, null);
			jContentPane.add(getJTextFieldFelmondasIndoka(), null);
			jContentPane.add(jLabelFelmondta, null);
			jContentPane.add(getJTextFieldFelmondta(), null);
			jContentPane.add(jLabelLakokSzama, null);
			jContentPane.add(getJTextFieldLakokSzama(), null);
			jContentPane.add(jLabelBerloAzonosito, null);
			jContentPane.add(getJTextFieldBerloAzonosito(), null);
			jContentPane.add(jLabelIngatlanAzonosito, null);
			jContentPane.add(getJTextFieldIngatlanAzonosito(), null);
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
	 * This method initializes jTextFieldKezdete
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldKezdete() {
		if (jTextFieldKezdete == null) {
			jTextFieldKezdete = new JTextField();
			jTextFieldKezdete.setBounds(new Rectangle(140, 69, 100, 20));
		}
		return jTextFieldKezdete;
	}

	/**
	 * This method initializes jTextFieldTipus
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldLejarat() {
		if (jTextFieldLejarat == null) {
			jTextFieldLejarat = new JTextField();
			jTextFieldLejarat.setBounds(new Rectangle(140, 89, 100, 20));
		}
		return jTextFieldLejarat;
	}

	/**
	 * This method initializes jTextFieldHosszabbitas1
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldHosszabbitas1() {
		if (jTextFieldHosszabbitas1 == null) {
			jTextFieldHosszabbitas1 = new JTextField();
			jTextFieldHosszabbitas1.setBounds(new Rectangle(140, 109, 100, 20));
		}
		return jTextFieldHosszabbitas1;
	}

	/**
	 * This method initializes jTextFieldHosszabbitas2
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldHosszabbitas2() {
		if (jTextFieldHosszabbitas2 == null) {
			jTextFieldHosszabbitas2 = new JTextField();
			jTextFieldHosszabbitas2.setBounds(new Rectangle(140, 129, 100, 20));
		}
		return jTextFieldHosszabbitas2;
	}

	/**
	 * This method initializes jTextFieldHosszabbitas3
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldHosszabbitas3() {
		if (jTextFieldHosszabbitas3 == null) {
			jTextFieldHosszabbitas3 = new JTextField();
			jTextFieldHosszabbitas3.setBounds(new Rectangle(140, 149, 100, 20));
		}
		return jTextFieldHosszabbitas3;
	}

	/**
	 * This method initializes jTextFieldFelmondasTipusa
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldFelmondasTipusa() {
		if (jTextFieldFelmondasTipusa == null) {
			jTextFieldFelmondasTipusa = new JTextField();
			jTextFieldFelmondasTipusa.setBounds(new Rectangle(140, 169, 100, 20));
		}
		return jTextFieldFelmondasTipusa;
	}

	/**
	 * This method initializes jTextFieldFelmondasIndoka
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldFelmondasIndoka() {
		if (jTextFieldFelmondasIndoka == null) {
			jTextFieldFelmondasIndoka = new JTextField();
			jTextFieldFelmondasIndoka.setBounds(new Rectangle(140, 189, 100, 20));
		}
		return jTextFieldFelmondasIndoka;
	}

	/**
	 * This method initializes jTextFieldFelmondta
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldFelmondta() {
		if (jTextFieldFelmondta == null) {
			jTextFieldFelmondta = new JTextField();
			jTextFieldFelmondta.setBounds(new Rectangle(140, 209, 100, 20));
		}
		return jTextFieldFelmondta;
	}

	/**
	 * This method initializes jTextFieldLakokSzama
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldLakokSzama() {
		if (jTextFieldLakokSzama == null) {
			jTextFieldLakokSzama = new JTextField();
			jTextFieldLakokSzama.setBounds(new Rectangle(140, 229, 100, 20));
		}
		return jTextFieldLakokSzama;
	}

	/**
	 * This method initializes jTextFieldBerloAzonosito
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldBerloAzonosito() {
		if (jTextFieldBerloAzonosito == null) {
			jTextFieldBerloAzonosito = new JTextField();
			jTextFieldBerloAzonosito.setBounds(new Rectangle(140, 249, 100, 20));
		}
		return jTextFieldBerloAzonosito;
	}

	/**
	 * This method initializes jTextFieldIngatlanAzonosito
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldIngatlanAzonosito() {
		if (jTextFieldIngatlanAzonosito == null) {
			jTextFieldIngatlanAzonosito = new JTextField();
			jTextFieldIngatlanAzonosito.setBounds(new Rectangle(140, 269, 100, 20));
		}
		return jTextFieldIngatlanAzonosito;
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
						dbc.addItem(getSzerzodesFieldVector(), m_tablename);
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
