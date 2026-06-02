package pekan8_2511532027;

import java.util.LinkedList;
import java.util.Queue;
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

public class MergeSortGUI_2511532027 extends JFrame {
	private static final long serialVersionUID = 1L;
	private Queue<int[]> mergeQueue_2027 = new LinkedList<>();
	private int[] temp_2027;
	private int[] array_2027;
	private JLabel[] labelArray_2027;
	private JButton stepButton_2027, resetButton_2027, setButton_2027;
	private JTextField inputField_2027;
	private JPanel panelArray_2027;
	private JTextArea stepArea_2027;
	private int left_2027, mid_2027, right_2027;
	private int i_2027 = 1, j_2027, k_2027;
	private boolean copying_2027 = false;
	private boolean isMerging_2027 = false;
	private int stepCount_2027 = 1;

	/**
	 * Create the frame.
	 */
	public MergeSortGUI_2511532027() {
		setTitle("Merge Sort Langkah per Langkah");
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
				for (int i_2027 = 0; i_2027 < parts_2027.length; i_2027++) {
					array_2027[i_2027] = Integer.parseInt(parts_2027[i_2027].trim());
				}} catch (NumberFormatException e_2027) {
					JOptionPane.showMessageDialog(this, "Masukkan hanya angka!",
				"Error", JOptionPane.ERROR_MESSAGE);
				return; }
				labelArray_2027 = new JLabel[array_2027.length];
				panelArray_2027.removeAll();
				for (int i_2027 = 0; i_2027 < array_2027.length; i_2027++) {
					labelArray_2027[i_2027] = new JLabel(String.valueOf(array_2027[i_2027]));
					labelArray_2027[i_2027].setFont(new Font("Arial", Font.BOLD, 24));
					labelArray_2027[i_2027].setOpaque(true);
					labelArray_2027[i_2027].setBackground(Color.WHITE);
					labelArray_2027[i_2027].setBorder(BorderFactory.createLineBorder(Color.BLACK));
					labelArray_2027[i_2027].setPreferredSize(new Dimension(50, 50));
					labelArray_2027[i_2027].setHorizontalAlignment(SwingConstants.CENTER);
					panelArray_2027.add(labelArray_2027[i_2027]);
				}
				mergeQueue_2027.clear();
				generateMergeSteps_2027(0, array_2027.length - 1);
				stepButton_2027.setEnabled(true);
				stepArea_2027.setText("");
				stepCount_2027 = 1;
				isMerging_2027 = false;
				panelArray_2027.revalidate();
				panelArray_2027.repaint();
			}
			private void performStep_2027() {
				resetHighlights_2027();
				if (!isMerging_2027 && !mergeQueue_2027.isEmpty()) {
					int[] range_2027 = mergeQueue_2027.poll();
					left_2027 = range_2027[0];
					mid_2027 = range_2027[1];
					right_2027 = range_2027[2];
					temp_2027 = new int[right_2027 - left_2027 + 1];
					i_2027 = left_2027;
					j_2027 = mid_2027 + 1;
					k_2027 = 0;
					copying_2027 = false;
					isMerging_2027 = false;
					stepArea_2027.append("Langkah " + stepCount_2027++ +
							": Mulai merge dari " + left_2027 + " ke " + right_2027 + "\n");
					return; }
					if (isMerging_2027 && !copying_2027) {
						if (i_2027 <= mid_2027 && j_2027 <= right_2027) {
							labelArray_2027[i_2027].setBackground(Color.CYAN);
							labelArray_2027[j_2027].setBackground(Color.CYAN);
							if (array_2027[i_2027] <= array_2027[j_2027]) {
								temp_2027[k_2027++] = array_2027[i_2027++];
							} else {
								temp_2027[k_2027++] = array_2027[j_2027++];
							}
							stepArea_2027.append("Langkah " + stepCount_2027++ + ": Bandingkan dan salin elemen\n");
							return;
						} else if (i_2027 <= mid_2027) {
							temp_2027[k_2027++] = array_2027[i_2027++];
							stepArea_2027.append("Langkah " + stepCount_2027++ + ": Salin sisa kiri\n");
							return;
						} else if (j_2027 <= right_2027) {
							temp_2027[k_2027++] = array_2027[j_2027++];
							stepArea_2027.append("Langkah " + stepCount_2027++ + ": Salin sisa kanan\n");
							return;
						} else {
							copying_2027 = true;
							k_2027 = 0;
							return;
						}
					}
					if (copying_2027 && k_2027 < temp_2027.length) {
						array_2027[left_2027 + k_2027] = temp_2027[k_2027];
						labelArray_2027[left_2027 + k_2027].setText(String.valueOf(temp_2027[k_2027]));
						labelArray_2027[left_2027 + k_2027].setBackground(Color.GREEN);
						k_2027++;
						stepArea_2027.append("Langkah " + stepCount_2027++ + ": Tempelkan ke array utama\n");
						return;
					}
					if (copying_2027 && k_2027 == temp_2027.length) {
						isMerging_2027 = false;
						copying_2027 = false;
					}
					if (mergeQueue_2027.isEmpty() && !isMerging_2027) {
						stepArea_2027.append("Selesai.\n");
						stepButton_2027.setEnabled(false);
						JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
					}
				}
			private void resetHighlights_2027() {
				if (labelArray_2027 == null) return;
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
				mergeQueue_2027.clear();
				isMerging_2027 = false;
				stepCount_2027 = 1;
			}
			private void generateMergeSteps_2027(int left_2027, int right_2027) {
				if (left_2027 < right_2027) {
					int mid_2027 = (left_2027 + right_2027) / 2;
					generateMergeSteps_2027(left_2027, mid_2027);
					generateMergeSteps_2027(mid_2027 + 1, right_2027);
					mergeQueue_2027.add(new int[] {left_2027, mid_2027, right_2027});
				}
			}
			public static void main(String[] args) {
				SwingUtilities.invokeLater(() -> {
					MergeSortGUI_2511532027 gui_2027 = new MergeSortGUI_2511532027();
					gui_2027.setVisible(true);
				});
			}
		}
