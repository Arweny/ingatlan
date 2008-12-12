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

public class IngatlanGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;  //  @jve:decl-index=0:visual-constraint="10,10"
	private JLabel jLabelAzonosito = null;
	private JTextField jTextFieldAzonosito = null;
	private JLabel jLabelCim = null;
	private JTextField jTextFieldCim = null;
	private JLabel jLabelTipus = null;
	private JTextField jTextFieldTipus = null;
	private JLabel jLabelSzobakSzama = null;
	private JTextField jTextFieldSzobakSzama = null;
	private JLabel jLabelMaximalisLako = null;
	private JTextField jTextFieldMaximalisLako = null;
	private JLabel jLabelKomfortFokozat = null;
	private JTextField jTextFieldKomfortFokozat = null;
	private JLabel jLabelKiadhato = null;
	private JTextField jTextFieldKiadhato = null;
	private JLabel jLabelStatusz = null;
	private JTextField jTextFieldStatusz = null;
	private JLabel jLabelBerletiDij = null;
	private JTextField jTextFieldBerletiDij = null;
	private JLabel jLabelTerulet = null;
	private JTextField jTextFieldTerulet = null;
	private JLabel jLabelFutes = null;
	private JTextField jTextFieldFutes = null;
	private JLabel jLabelKlima = null;
	private JTextField jTextFieldKlima = null;
	private JLabel jLabelButorozott = null;
	private JTextField jTextFieldButorozott = null;
	private JLabel jLabelBelmagassag = null;
	private JLabel jLabelEpitesEve = null;
	private JTextField jTextFieldBelmagassag = null;
	private JTextField jTextFieldEpitesEve = null;
	private JLabel jLabelAllapot = null;
	private JTextField jTextFieldAllapot = null;
	private JButton jButtonKovetkez = null;
	private JButton jButtonElozo = null;
	private JButton jButtonMentes = null;
	private JButton jButtonKereses = null;

	private DBControl dbc=null;  //  @jve:decl-index=0:
	private JDialog jDialogErrorSave = null;  //  @jve:decl-index=0:visual-constraint="477,20"
	private JPanel jContentPane1 = null;
	private JLabel jLabel = null;
	private JButton jButton = null;
	private JButton jButtonTorles = null;
	/**
	 * This is the default constructor
	 */
	public IngatlanGUI() {
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
		this.setResizable(false);
		this.setContentPane(getJContentPane());
		this.setTitle("Ingatlan");

		try {
			dbc = new DBControl();
		} catch (Exception e) {

		}
	}

	/**
	 *
	 */
	public Vector<String> getIngatlanFieldVector() {
		Vector<String> data=new Vector<String>();
		data.add("azonosito");
		data.add( getJTextFieldAzonosito().getText() );
		data.add("cim");
		data.add( getJTextFieldCim().getText() );
		data.add("tipus");
		data.add( getJTextFieldTipus().getText() );
		data.add("szobak_szama");
		data.add( getJTextFieldSzobakSzama().getText() );
		data.add("maximalis_lako");
		data.add( getJTextFieldMaximalisLako().getText() );
		data.add("komfort_fokozat");
		data.add( getJTextFieldKomfortFokozat().getText() );
		data.add("kiadhato");
		data.add( getJTextFieldKiadhato().getText() );
		data.add("statusz");
		data.add( getJTextFieldStatusz().getText() );
		data.add("berleti_dij");
		data.add( getJTextFieldBerletiDij().getText() );
		data.add("terulet");
		data.add( getJTextFieldTerulet().getText() );
		data.add("futes");
		data.add( getJTextFieldFutes().getText() );
		data.add("klima");
		data.add( getJTextFieldKlima().getText() );
		data.add("butorozott");
		data.add( getJTextFieldButorozott().getText() );
		data.add("belmagassag");
		data.add( getJTextFieldBelmagassag().getText() );
		data.add("epites_eve");
		data.add( getJTextFieldEpitesEve().getText() );
		data.add("allapot");
		data.add( getJTextFieldAllapot().getText() );
		return data;
	};

	/**
	 * This method initializes jContentPane
	 *
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelAllapot = new JLabel();
			jLabelAllapot.setBounds(new Rectangle(10, 349, 100, 20));
			jLabelAllapot.setText("Állapot");
			jLabelEpitesEve = new JLabel();
			jLabelEpitesEve.setBounds(new Rectangle(10, 329, 100, 20));
			jLabelEpitesEve.setText("Építés éve");
			jLabelBelmagassag = new JLabel();
			jLabelBelmagassag.setBounds(new Rectangle(10, 309, 100, 20));
			jLabelBelmagassag.setText("Belmagasság");
			jLabelButorozott = new JLabel();
			jLabelButorozott.setBounds(new Rectangle(10, 289, 100, 20));
			jLabelButorozott.setText("Bútorozott");
			jLabelKlima = new JLabel();
			jLabelKlima.setBounds(new Rectangle(10, 269, 100, 20));
			jLabelKlima.setText("Klíma");
			jLabelFutes = new JLabel();
			jLabelFutes.setBounds(new Rectangle(10, 249, 100, 20));
			jLabelFutes.setText("Fűtés");
			jLabelTerulet = new JLabel();
			jLabelTerulet.setBounds(new Rectangle(10, 229, 100, 20));
			jLabelTerulet.setText("Terület");
			jLabelBerletiDij = new JLabel();
			jLabelBerletiDij.setBounds(new Rectangle(10, 209, 100, 20));
			jLabelBerletiDij.setText("Bérleti díj");
			jLabelStatusz = new JLabel();
			jLabelStatusz.setBounds(new Rectangle(10, 189, 100, 20));
			jLabelStatusz.setText("Státusz");
			jLabelKiadhato = new JLabel();
			jLabelKiadhato.setBounds(new Rectangle(10, 169, 100, 20));
			jLabelKiadhato.setText("Kiadható");
			jLabelKomfortFokozat = new JLabel();
			jLabelKomfortFokozat.setBounds(new Rectangle(10, 149, 100, 20));
			jLabelKomfortFokozat.setText("Komfort fokozat");
			jLabelMaximalisLako = new JLabel();
			jLabelMaximalisLako.setBounds(new Rectangle(10, 129, 100, 20));
			jLabelMaximalisLako.setText("Maximális lakó");
			jLabelSzobakSzama = new JLabel();
			jLabelSzobakSzama.setBounds(new Rectangle(10, 109, 100, 20));
			jLabelSzobakSzama.setText("Szobák száma");
			jLabelTipus = new JLabel();
			jLabelTipus.setBounds(new Rectangle(10, 89, 100, 20));
			jLabelTipus.setText("Típus");
			jLabelCim = new JLabel();
			jLabelCim.setBounds(new Rectangle(10, 69, 100, 20));
			jLabelCim.setText("Cím");
			jLabelAzonosito = new JLabel();
			jLabelAzonosito.setBounds(new Rectangle(10, 49, 100, 20));
			jLabelAzonosito.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
			jLabelAzonosito.setText("Azonosító");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setSize(new Dimension(387, 247));
			jContentPane.add(jLabelAzonosito, null);
			jContentPane.add(getJTextFieldAzonosito(), null);
			jContentPane.add(jLabelCim, null);
			jContentPane.add(getJTextFieldCim(), null);
			jContentPane.add(jLabelTipus, null);
			jContentPane.add(getJTextFieldTipus(), null);
			jContentPane.add(jLabelSzobakSzama, null);
			jContentPane.add(getJTextFieldSzobakSzama(), null);
			jContentPane.add(jLabelMaximalisLako, null);
			jContentPane.add(getJTextFieldMaximalisLako(), null);
			jContentPane.add(jLabelKomfortFokozat, null);
			jContentPane.add(getJTextFieldKomfortFokozat(), null);
			jContentPane.add(jLabelKiadhato, null);
			jContentPane.add(getJTextFieldKiadhato(), null);
			jContentPane.add(jLabelStatusz, null);
			jContentPane.add(getJTextFieldStatusz(), null);
			jContentPane.add(jLabelBerletiDij, null);
			jContentPane.add(getJTextFieldBerletiDij(), null);
			jContentPane.add(jLabelTerulet, null);
			jContentPane.add(getJTextFieldTerulet(), null);
			jContentPane.add(jLabelFutes, null);
			jContentPane.add(getJTextFieldFutes(), null);
			jContentPane.add(jLabelKlima, null);
			jContentPane.add(getJTextFieldKlima(), null);
			jContentPane.add(jLabelButorozott, null);
			jContentPane.add(getJTextFieldButorozott(), null);
			jContentPane.add(jLabelBelmagassag, null);
			jContentPane.add(jLabelEpitesEve, null);
			jContentPane.add(getJTextFieldBelmagassag(), null);
			jContentPane.add(getJTextFieldEpitesEve(), null);
			jContentPane.add(jLabelAllapot, null);
			jContentPane.add(getJTextFieldAllapot(), null);
			jContentPane.add(getJButtonKovetkez(), null);
			jContentPane.add(getJButtonElozo(), null);
			jContentPane.add(getJButtonMentes(), null);
			jContentPane.add(getJButtonKereses(), null);
			jContentPane.add(getJButtonTorles(), null);
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
			jTextFieldAzonosito.setBounds(new Rectangle(120, 49, 100, 20));
		}
		return jTextFieldAzonosito;
	}

	/**
	 * This method initializes jTextFieldCim
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldCim() {
		if (jTextFieldCim == null) {
			jTextFieldCim = new JTextField();
			jTextFieldCim.setBounds(new Rectangle(120, 69, 100, 20));
		}
		return jTextFieldCim;
	}

	/**
	 * This method initializes jTextFieldTipus
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldTipus() {
		if (jTextFieldTipus == null) {
			jTextFieldTipus = new JTextField();
			jTextFieldTipus.setBounds(new Rectangle(120, 89, 100, 20));
		}
		return jTextFieldTipus;
	}

	/**
	 * This method initializes jTextFieldSzobakSzama
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldSzobakSzama() {
		if (jTextFieldSzobakSzama == null) {
			jTextFieldSzobakSzama = new JTextField();
			jTextFieldSzobakSzama.setBounds(new Rectangle(120, 109, 100, 20));
		}
		return jTextFieldSzobakSzama;
	}

	/**
	 * This method initializes jTextFieldMaximalisLako
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldMaximalisLako() {
		if (jTextFieldMaximalisLako == null) {
			jTextFieldMaximalisLako = new JTextField();
			jTextFieldMaximalisLako.setBounds(new Rectangle(120, 129, 100, 20));
		}
		return jTextFieldMaximalisLako;
	}

	/**
	 * This method initializes jTextFieldKomfortFokozat
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldKomfortFokozat() {
		if (jTextFieldKomfortFokozat == null) {
			jTextFieldKomfortFokozat = new JTextField();
			jTextFieldKomfortFokozat.setBounds(new Rectangle(120, 149, 100, 20));
		}
		return jTextFieldKomfortFokozat;
	}

	/**
	 * This method initializes jTextFieldKiadhato
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldKiadhato() {
		if (jTextFieldKiadhato == null) {
			jTextFieldKiadhato = new JTextField();
			jTextFieldKiadhato.setBounds(new Rectangle(120, 169, 100, 20));
		}
		return jTextFieldKiadhato;
	}

	/**
	 * This method initializes jTextFieldStatusz
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldStatusz() {
		if (jTextFieldStatusz == null) {
			jTextFieldStatusz = new JTextField();
			jTextFieldStatusz.setBounds(new Rectangle(120, 189, 100, 20));
		}
		return jTextFieldStatusz;
	}

	/**
	 * This method initializes jTextFieldBerletiDij
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldBerletiDij() {
		if (jTextFieldBerletiDij == null) {
			jTextFieldBerletiDij = new JTextField();
			jTextFieldBerletiDij.setBounds(new Rectangle(120, 209, 100, 20));
		}
		return jTextFieldBerletiDij;
	}

	/**
	 * This method initializes jTextFieldTerulet
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldTerulet() {
		if (jTextFieldTerulet == null) {
			jTextFieldTerulet = new JTextField();
			jTextFieldTerulet.setBounds(new Rectangle(120, 229, 100, 20));
		}
		return jTextFieldTerulet;
	}

	/**
	 * This method initializes jTextFieldFutes
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldFutes() {
		if (jTextFieldFutes == null) {
			jTextFieldFutes = new JTextField();
			jTextFieldFutes.setBounds(new Rectangle(120, 249, 100, 20));
		}
		return jTextFieldFutes;
	}

	/**
	 * This method initializes jTextFieldKlima
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldKlima() {
		if (jTextFieldKlima == null) {
			jTextFieldKlima = new JTextField();
			jTextFieldKlima.setBounds(new Rectangle(120, 269, 100, 20));
		}
		return jTextFieldKlima;
	}

	/**
	 * This method initializes jTextFieldButorozott
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldButorozott() {
		if (jTextFieldButorozott == null) {
			jTextFieldButorozott = new JTextField();
			jTextFieldButorozott.setBounds(new Rectangle(120, 289, 100, 20));
		}
		return jTextFieldButorozott;
	}

	/**
	 * This method initializes jTextFieldBelmagassag
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldBelmagassag() {
		if (jTextFieldBelmagassag == null) {
			jTextFieldBelmagassag = new JTextField();
			jTextFieldBelmagassag.setBounds(new Rectangle(120, 309, 100, 20));
		}
		return jTextFieldBelmagassag;
	}

	/**
	 * This method initializes jTextFieldEpitesEve
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldEpitesEve() {
		if (jTextFieldEpitesEve == null) {
			jTextFieldEpitesEve = new JTextField();
			jTextFieldEpitesEve.setBounds(new Rectangle(120, 329, 100, 20));
		}
		return jTextFieldEpitesEve;
	}

	/**
	 * This method initializes jTextFieldAllapot
	 *
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextFieldAllapot() {
		if (jTextFieldAllapot == null) {
			jTextFieldAllapot = new JTextField();
			jTextFieldAllapot.setBounds(new Rectangle(120, 349, 100, 20));
		}
		return jTextFieldAllapot;
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
			jButtonMentes.setBounds(new Rectangle(10, 380, 120, 30));
			jButtonMentes.setBackground(new Color(200, 238, 200));
			jButtonMentes.setText("Mentés");
			jButtonMentes.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("Ingatlan mentés");
					try {
						//dbc.SaveData(getIngatlanFieldVector(), "ingatlan");
						dbc.DBSaveIngatlan( getIngatlanFieldVector() );
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
	 * This method initializes jButtonKereses
	 *
	 * @return javax.swing.JButton
	 */
	private JButton getJButtonKereses() {
		if (jButtonKereses == null) {
			jButtonKereses = new JButton();
			jButtonKereses.setBounds(new Rectangle(160, 380, 120, 30));
			jButtonKereses.setText("Keresés");
			jButtonKereses.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
				}
			});
		}
		return jButtonKereses;
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

	/**
	 * This method initializes jButtonTorles
	 *
	 * @return javax.swing.JButton
	 */
	private JButton getJButtonTorles() {
		if (jButtonTorles == null) {
			jButtonTorles = new JButton();
			jButtonTorles.setBounds(new Rectangle(310, 380, 120, 30));
			jButtonTorles.setBackground(new Color(238, 200, 200));
			jButtonTorles.setText("Törlés");
		}
		return jButtonTorles;
	}

}  //  @jve:decl-index=0:visual-constraint="14,17"
