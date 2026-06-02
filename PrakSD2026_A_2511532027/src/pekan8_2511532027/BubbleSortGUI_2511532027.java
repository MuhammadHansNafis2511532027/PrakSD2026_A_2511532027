package pekan8_2511532027;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class BubbleSortGUI_2511532027 extends JFrame {
	private static final long serialVersionUID = 1L;
	private int[] array_2027;
	private JLabel[] labelArray_2027;
	private JButton stepButton_2027, resetButton_2027, setButton_2027;
	private JTextField inputField_2027;
	private JPanel panelArray_2027;
	private JTextArea stepArea_2027;
	private int i_2027 = 1, j_2027;
	private boolean sorting_2027 = false;
	private int stepCount_2027 = 1;

	/**
	 * Create the frame.
	 */
	public BubbleSortGUI_2511532027() {
		setTitle("Bubble Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		//Panel input
		JPanel inputPanel_2027 = new JPanel (new FlowLayout());
		inputField_2027 = new JTextField(30);
		setButton_2027 = new JButton("Set Array");
		inputPanel_2027.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
		inputPanel_2027.add(inputField_2027);
		inputPanel_2027.add(setButton_2027);
		
		// Panel array visual
		panelArray_2027 = new JPanel();
		panelArray_2027.setLayout(new FlowLayout());
		
		// Panel kontrol
		JPanel controlPanel_2027 = new JPanel();
		stepButton_2027 = new JButton("Langkah Selanjutnya");
		resetButton_2027 = new JButton("Reset");
		stepButton_2027.setEnabled(false);
		controlPanel_2027.add(stepButton_2027);
		controlPanel_2027.add(resetButton_2027);
		
		// Area teks untuk log langkah-langkah
		stepArea_2027 = new JTextArea(8, 60);
		stepArea_2027.setEditable(false);
		stepArea_2027.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_2027 = new JScrollPane(stepArea_2027);
		
		// Tambahkan panel ke frame
		add(inputPanel_2027, BorderLayout.NORTH);
		add(panelArray_2027, BorderLayout.CENTER);
		add(controlPanel_2027, BorderLayout.SOUTH);
		add(scrollPane_2027, BorderLayout.EAST);
		
		// Event Set Array
		setButton_2027.addActionListener(e_2027 -> setArrayFromInput_2027());
		
		// Event Langkah Selanjutnya
		stepButton_2027.addActionListener(e_2027 -> performStep_2027());
		
		// Event Reset
		resetButton_2027.addActionListener(e_2027 -> reset_2027());}
		
		private void setArrayFromInput_2027() {
			String text_2027 = inputField_2027.getText().trim();
			if (text_2027.isEmpty()) return;
			String[] parts_2027 = text_2027.split(",");
			array_2027 = new int[parts_2027.length];
			try {
				for (int k_2027 = 0; k_2027 < parts_2027.length; k_2027++) {
					array_2027[k_2027] = Integer.parseInt(parts_2027[k_2027].trim());
				}} catch (NumberFormatException e_2027) {
					JOptionPane.showMessageDialog(this, "Masukkan hanya angka " 
				+ "yang dipisahkan koma!", "Error", JOptionPane.ERROR_MESSAGE);
				return; }
				i_2027 = 0;
				j_2027 = 0;
				stepCount_2027 = 1;
				sorting_2027 = true;
				stepButton_2027.setEnabled(true);
				stepArea_2027.setText("");
				panelArray_2027.removeAll();
				labelArray_2027 = new JLabel[array_2027.length];
				for (int k_2027 = 0; k_2027 < array_2027.length; k_2027++) {
					labelArray_2027[k_2027] = new JLabel(String.valueOf(array_2027[k_2027]));
					labelArray_2027[k_2027].setFont(new Font("Arial", Font.BOLD, 24));
					labelArray_2027[k_2027].setOpaque(true);
					labelArray_2027[k_2027].setBackground(Color.WHITE);
					labelArray_2027[k_2027].setBorder(BorderFactory.createLineBorder(Color.BLACK));
					labelArray_2027[k_2027].setPreferredSize(new Dimension(50, 50));
					labelArray_2027[k_2027].setHorizontalAlignment(SwingConstants.CENTER);
					panelArray_2027.add(labelArray_2027[k_2027]);
				}
				panelArray_2027.revalidate();
				panelArray_2027.repaint();
			}
			private void performStep_2027() {
				if (!sorting_2027 || i_2027 >= array_2027.length - 1) {
					sorting_2027 = false;
					stepButton_2027.setEnabled(false);
					JOptionPane.showMessageDialog(this, "Sorting selesai!");
					return; }
				resetHighlights_2027();
					StringBuilder stepLog_2027 = new StringBuilder();
					labelArray_2027[j_2027].setBackground(Color.CYAN);
					labelArray_2027[j_2027 + 1].setBackground(Color.CYAN);
					if (array_2027[j_2027] > array_2027[j_2027 + 1]) {
					// swap
					int temp_2027 = array_2027[j_2027];
					array_2027[j_2027] = array_2027[j_2027 + 1];
					array_2027[j_2027 + 1] = temp_2027;
					labelArray_2027[j_2027].setBackground(Color.RED);
					labelArray_2027[j_2027 + 1].setBackground(Color.RED);
					stepLog_2027.append("Langkah ").append(stepCount_2027).append(": Menukar elemen ke-")
					.append(j_2027).append(" (").append(array_2027[j_2027 + 1]).append(") dengan ke-")
					.append(j_2027 + 1).append(" (").append(array_2027[j_2027]).append(")\n");
			} else {
				stepLog_2027.append("Langkah ").append(stepCount_2027).append(": Tidak ada pertukaran antara ke-")
				.append(j_2027).append(" dan ke-").append(j_2027 + 1).append("\n");
				stepLog_2027.append("Hasil: ").append(arrayToString_2027(array_2027)).append("\n\n");
				stepArea_2027.append(stepLog_2027.toString());
				updateLabels_2027();
				j_2027++;
				if (j_2027 >= array_2027.length - i_2027 - 1) {
					j_2027 = 0;
					i_2027++;
				}
				stepCount_2027++;
				if (i_2027 >= array_2027.length - 1) {
					sorting_2027 = false;
					stepButton_2027.setEnabled(false);
					JOptionPane.showMessageDialog(this, "Sorting selesai!");
				}
			}
				}
			
			private void updateLabels_2027() {
				for (int k_2027 = 0; k_2027 < array_2027.length; k_2027++) {
					labelArray_2027[k_2027].setText(String.valueOf(array_2027[k_2027]));
				}
			}
			
			private void resetHighlights_2027() {
				for (JLabel label : labelArray_2027) {
					label.setBackground(Color.WHITE);
				}
			}
			
			private void reset_2027() {
				inputField_2027.setText("");
				panelArray_2027.removeAll();
				panelArray_2027.revalidate();
				panelArray_2027.repaint();
				stepArea_2027.setText("");
				stepButton_2027.setEnabled(false);
				sorting_2027 = false;
				i_2027 = 0;
				j_2027 = 0;
				stepCount_2027 = 1;
			}
			private String arrayToString_2027(int[] arr_2027) {
				StringBuilder sb_2027 = new StringBuilder();
				for (int k_2027 = 0; k_2027 < arr_2027.length; k_2027++) {
					sb_2027.append(arr_2027[k_2027]);
					if (k_2027 < arr_2027.length - 1) sb_2027.append(", ");
				}
				return sb_2027.toString();
			}
			public static void main(String[] args) {
				SwingUtilities.invokeLater(() -> {
					BubbleSortGUI_2511532027 gui_2027 = new BubbleSortGUI_2511532027();
					gui_2027.setVisible(true);
				});
			}
		}
