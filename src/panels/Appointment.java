package panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class Appointment extends JPanel {

	/**
	 * Create the panel.
	 */
	public Appointment() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{216, 17, 0, 0};
		gridBagLayout.rowHeights = new int[]{14, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblSda = new JLabel("sda");
		GridBagConstraints gbc_lblSda = new GridBagConstraints();
		gbc_lblSda.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblSda.gridx = 2;
		gbc_lblSda.gridy = 4;
		add(lblSda, gbc_lblSda);

	}

}
