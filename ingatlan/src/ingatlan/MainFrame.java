package ingatlan;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;


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
	private JMenu Kilepes = null;



	/**
	 * This method initializes mainMenu
	 *
	 * @return javax.swing.JMenuBar
	 */
	private JMenuBar getMainMenu() {
		if (mainMenu == null) {
			mainMenu = new JMenuBar();
			mainMenu.add(getIngatlanok());
			mainMenu.add(getSzerzodesek());
			mainMenu.add(getKilepes());
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
		}

		return Szerzodesek;
	}

	/**
	 * This method initializes jMenuItem
	 *
	 * @return javax.swing.JMenuItem
	 */
	private JMenu getKilepes() {
		if (Kilepes == null) {
			Kilepes = new JMenu();
			Kilepes.setText("Kilépés");
			Kilepes.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
		}

		return Kilepes;
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
		this.setSize(800,600);
		this.setJMenuBar(getMainMenu());
		this.setContentPane(getJContentPane());
		this.setTitle("Ingatlan bérbeadási nyilvíntartás");
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
		}

		return jContentPane;
	}

}
