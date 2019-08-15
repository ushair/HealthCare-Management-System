package panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Recomendation extends JPanel {

	/**
	 * Create the panel.
	 */
	public Recomendation() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{30, 67, 51, 97, 111, 0};
		gridBagLayout.rowHeights = new int[]{14, 33, 20, 39, 63, 23, 23, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblDoctorsRecommendation = new JLabel("Doctor's Recommendation Pad");
		lblDoctorsRecommendation.setHorizontalAlignment(SwingConstants.TRAILING);
		GridBagConstraints gbc_lblDoctorsRecommendation = new GridBagConstraints();
		gbc_lblDoctorsRecommendation.anchor = GridBagConstraints.NORTH;
		gbc_lblDoctorsRecommendation.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDoctorsRecommendation.insets = new Insets(0, 0, 5, 0);
		gbc_lblDoctorsRecommendation.gridwidth = 4;
		gbc_lblDoctorsRecommendation.gridx = 1;
		gbc_lblDoctorsRecommendation.gridy = 0;
		add(lblDoctorsRecommendation, gbc_lblDoctorsRecommendation);
		
		JLabel lblNewLabel = new JLabel("Patient Name ");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.NORTH;
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 2;
		add(comboBox, gbc_comboBox);
		
		JLabel lblMessage = new JLabel("Message");
		GridBagConstraints gbc_lblMessage = new GridBagConstraints();
		gbc_lblMessage.anchor = GridBagConstraints.NORTH;
		gbc_lblMessage.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMessage.insets = new Insets(0, 0, 5, 5);
		gbc_lblMessage.gridx = 1;
		gbc_lblMessage.gridy = 4;
		add(lblMessage, gbc_lblMessage);
		
		JTextPane textPane = new JTextPane();
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.insets = new Insets(0, 0, 5, 0);
		gbc_textPane.gridwidth = 2;
		gbc_textPane.gridx = 3;
		gbc_textPane.gridy = 4;
		add(textPane, gbc_textPane);
		
		JLabel lblSharing = new JLabel("Sharing ");
		GridBagConstraints gbc_lblSharing = new GridBagConstraints();
		gbc_lblSharing.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSharing.insets = new Insets(0, 0, 5, 5);
		gbc_lblSharing.gridx = 1;
		gbc_lblSharing.gridy = 5;
		add(lblSharing, gbc_lblSharing);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Update");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.anchor = GridBagConstraints.NORTH;
		gbc_chckbxNewCheckBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 3;
		gbc_chckbxNewCheckBox.gridy = 5;
		add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Delete");
		GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_1.anchor = GridBagConstraints.NORTH;
		gbc_chckbxNewCheckBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_1.gridx = 4;
		gbc_chckbxNewCheckBox_1.gridy = 5;
		add(chckbxNewCheckBox_1, gbc_chckbxNewCheckBox_1);
		
		JButton btnSubmit = new JButton("Submit");
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.anchor = GridBagConstraints.NORTH;
		gbc_btnSubmit.gridwidth = 2;
		gbc_btnSubmit.gridx = 3;
		gbc_btnSubmit.gridy = 6;
		add(btnSubmit, gbc_btnSubmit);

	}
}
