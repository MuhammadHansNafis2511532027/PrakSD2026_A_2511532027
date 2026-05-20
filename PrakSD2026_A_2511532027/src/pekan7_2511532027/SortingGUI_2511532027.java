package pekan7_2511532027;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SortingGUI_2511532027 extends JFrame {
    private static final long serialVersionUID = 1L;

    // Komponen GUI
    private JTextField namaField_2027;
    private JTextField nimField_2027;
    private JTextField prodiField_2027;
    private JButton tambahButton_2027;
    private JButton sortingButton_2027;
    private JComboBox<String> comboBox_2027;
    private JTextArea outputArea_2027;

    // ArrayList utama
    private ArrayList<Mahasiswa_2511532027> dataMahasiswa_2027;

    // Constructor
    public SortingGUI_2511532027() {
        setTitle("Visualisasi Sorting Mahasiswa");
        setSize(850, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        dataMahasiswa_2027 = new ArrayList<>();

        // ================= PANEL INPUT =================

        JPanel inputPanel_2027 = new JPanel(new FlowLayout());
        namaField_2027 = new JTextField(10);
        nimField_2027 = new JTextField(10);
        prodiField_2027 = new JTextField(10);
        tambahButton_2027 = new JButton("Tambah Data");
        sortingButton_2027 = new JButton("Mulai Sorting");
        comboBox_2027 = new JComboBox<>();
        comboBox_2027.addItem("Insertion Sort");
        comboBox_2027.addItem("Selection Sort");
        comboBox_2027.addItem("Bubble Sort");

        inputPanel_2027.add(new JLabel("Nama"));
        inputPanel_2027.add(namaField_2027);
        inputPanel_2027.add(new JLabel("NIM"));
        inputPanel_2027.add(nimField_2027);
        inputPanel_2027.add(new JLabel("Prodi"));
        inputPanel_2027.add(prodiField_2027);
        inputPanel_2027.add(tambahButton_2027);
        inputPanel_2027.add(comboBox_2027);
        inputPanel_2027.add(sortingButton_2027);

        // ================= TEXT AREA =================

        outputArea_2027 = new JTextArea();
        outputArea_2027.setEditable(false);
        JScrollPane scrollPane_2027 = new JScrollPane(outputArea_2027);
        add(inputPanel_2027, BorderLayout.NORTH);
        add(scrollPane_2027, BorderLayout.CENTER);

        // ================= EVENT =================

        // Tambah data
        tambahButton_2027.addActionListener(e_2027 -> tambahData_2027());

        // Mulai sorting
        sortingButton_2027.addActionListener(e_2027 -> mulaiSorting_2027());
    }

    // ================= TAMBAH DATA =================

    private void tambahData_2027() {
        String nama_2027 = namaField_2027.getText();
        String nim_2027 = nimField_2027.getText();
        String prodi_2027 = prodiField_2027.getText();

        // Validasi
        if (nama_2027.isEmpty() || nim_2027.isEmpty() || prodi_2027.isEmpty()) {
            JOptionPane.showMessageDialog( this, "Data belum lengkap!");
            return;
        }

        // Tambah ke ArrayList
        Mahasiswa_2511532027 mhs_2027 = new Mahasiswa_2511532027(nama_2027, nim_2027, prodi_2027);
        dataMahasiswa_2027.add(mhs_2027);
        tampilkanData_2027();

        // Kosongkan field
        namaField_2027.setText("");
        nimField_2027.setText("");
        prodiField_2027.setText("");
    }

    // ================= TAMPILKAN DATA =================

    private void tampilkanData_2027() {
        outputArea_2027.setText("");
        outputArea_2027.append("===== DATA MAHASISWA =====\n\n");
        for (Mahasiswa_2511532027 mhs_2027 : dataMahasiswa_2027) {
            outputArea_2027.append(mhs_2027.getNama_2027() + " | "
                    + mhs_2027.getNim_2027() + " | "
                    + mhs_2027.getProdi_2027() + "\n");
        }
    }

    // ================= MULAI SORTING =================

    private void mulaiSorting_2027() {
        if (dataMahasiswa_2027.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data mahasiswa kosong!");
            return;
        }

        // Membuat salinan data lama
        ArrayList<Mahasiswa_2511532027> copyData_2027 = new ArrayList<>();
        for (Mahasiswa_2511532027 mhs_2027 : dataMahasiswa_2027) {
            copyData_2027.add(new Mahasiswa_2511532027(
                            mhs_2027.getNama_2027(),
                            mhs_2027.getNim_2027(),
                            mhs_2027.getProdi_2027()));
        }

        String pilihan_2027 = comboBox_2027.getSelectedItem().toString();
        outputArea_2027.append("\n\n==============================\n");
        outputArea_2027.append("DATA AWAL : " + arrayToString_2027(copyData_2027) + "\n\n");

        // INSERTION SORT
        if (pilihan_2027.equals("Insertion Sort")) {
            outputArea_2027.append("=== INSERTION SORT ===\n\n");
            insertionSort_2027(copyData_2027);
        }

        // SELECTION SORT
        else if (pilihan_2027.equals("Selection Sort")) {
            outputArea_2027.append("=== SELECTION SORT ===\n\n");
            selectionSort_2027(copyData_2027);
        }

        // BUBBLE SORT
        else {
            outputArea_2027.append("=== BUBBLE SORT ===\n\n");
            bubbleSort_2027(copyData_2027);
        }
        outputArea_2027.append("\nHASIL AKHIR : " + arrayToString_2027(copyData_2027) + "\n");
        outputArea_2027.append("==============================\n");
    }

    // ================= INSERTION SORT =================

    private void insertionSort_2027(
            ArrayList<Mahasiswa_2511532027> data_2027) {
        for (int i_2027 = 1; i_2027 < data_2027.size(); i_2027++) {
            Mahasiswa_2511532027 key_2027 = data_2027.get(i_2027);
            int j_2027 = i_2027 - 1;
            while (j_2027 >= 0 && data_2027.get(j_2027).getNama_2027()
                    .compareToIgnoreCase(key_2027.getNama_2027()) > 0) {
                data_2027.set(j_2027 + 1, data_2027.get(j_2027));
                j_2027--;
            }
            data_2027.set(j_2027 + 1, key_2027);
            outputArea_2027.append("Langkah " + i_2027 + " : "
                    + arrayToString_2027(data_2027) + "\n");
        }
    }

    // ================= SELECTION SORT =================

    private void selectionSort_2027(
            ArrayList<Mahasiswa_2511532027> data_2027) {
        for (int i_2027 = 0; i_2027 < data_2027.size() - 1; i_2027++) {
            int minIndex_2027 = i_2027;
            for (int j_2027 = i_2027 + 1; j_2027 < data_2027.size(); j_2027++) {
                if (data_2027.get(j_2027).getNama_2027().compareToIgnoreCase(
                                data_2027.get(minIndex_2027).getNama_2027()) < 0) {
                    minIndex_2027 = j_2027;
                }
            }
            Mahasiswa_2511532027 temp_2027 = data_2027.get(i_2027);
            data_2027.set(i_2027, data_2027.get(minIndex_2027));
            data_2027.set(minIndex_2027, temp_2027);
            outputArea_2027.append("Pass " + (i_2027 + 1) + " : "
                    + arrayToString_2027(data_2027) + "\n");
        }
    }

    // ================= BUBBLE SORT =================

    private void bubbleSort_2027(
            ArrayList<Mahasiswa_2511532027> data_2027) {
        for (int i_2027 = 0; i_2027 < data_2027.size() - 1; i_2027++) {
            for (int j_2027 = 0; j_2027 < data_2027.size() - i_2027 - 1; j_2027++) {
                if (data_2027.get(j_2027).getNama_2027().compareToIgnoreCase(
                                data_2027.get(j_2027 + 1).getNama_2027()) > 0) {
                    Mahasiswa_2511532027 temp_2027 = data_2027.get(j_2027);
                    data_2027.set(j_2027, data_2027.get(j_2027 + 1));
                    data_2027.set(j_2027 + 1, temp_2027);
                }
            }
            outputArea_2027.append("Pass " + (i_2027 + 1) + " : "
                    + arrayToString_2027(data_2027) + "\n");
        }
    }

    // ================= ARRAYLIST KE STRING =================

    private String arrayToString_2027(
            ArrayList<Mahasiswa_2511532027> data_2027) {
        String hasil_2027 = "[";
        for (int i_2027 = 0; i_2027 < data_2027.size(); i_2027++) {
            hasil_2027 += data_2027.get(i_2027).getNama_2027();
            if (i_2027 < data_2027.size() - 1) {
                hasil_2027 += ", ";
            }
        }
        hasil_2027 += "]";
        return hasil_2027;
    }

    // ================= MAIN =================

    public static void main(String[] args) {
        SortingGUI_2511532027 gui_2027 = new SortingGUI_2511532027();
        gui_2027.setVisible(true);
    }
}