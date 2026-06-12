package pekan9_2511532027;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontMetrics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

public class PetaKota_2511532027 extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, List<String>> graph_2027;
    private Map<String, Point>        nodePos_2027;
    private List<String>              visitedNodes_2027;
    private Set<String>               highlightPath_2027;
    private Set<String>               highlightVisited_2027;

    private JComboBox<String> cbStart_2027;
    private JComboBox<String> cbGoal_2027;
    private JTextArea         resultArea_2027;
    private GraphPanel_2027   graphPanel_2027;

    private static final Color C_BG         = new Color(15,  23,  42);
    private static final Color C_PANEL      = new Color(30,  41,  59);
    private static final Color C_CARD       = new Color(51,  65,  85);
    private static final Color C_ACCENT     = new Color(99,  102, 241);
    private static final Color C_GREEN      = new Color(16,  185, 129);
    private static final Color C_YELLOW     = new Color(245, 158, 11);
    private static final Color C_RED        = new Color(239, 68,  68);
    private static final Color C_NODE       = new Color(71,  85,  105);
    private static final Color C_NODE_START = new Color(99,  102, 241);
    private static final Color C_NODE_GOAL  = new Color(239, 68,  68);
    private static final Color C_NODE_VISIT = new Color(245, 158, 11);
    private static final Color C_NODE_PATH  = new Color(16,  185, 129);
    private static final Color C_EDGE       = new Color(100, 116, 139);
    private static final Color C_EDGE_PATH  = new Color(16,  185, 129);
    private static final Color C_TEXT       = new Color(226, 232, 240);
    private static final Color C_TEXT_DIM   = new Color(148, 163, 184);

    public PetaKota_2511532027() {
        initGraph_2027();
        initNodePositions_2027();
        visitedNodes_2027     = new ArrayList<>();
        highlightPath_2027    = new HashSet<>();
        highlightVisited_2027 = new HashSet<>();
        buildGUI_2027();
    }

    private void initGraph_2027() {
        graph_2027 = new LinkedHashMap<>();

        String[] nodes_2027 = {
            "Rumah", "Rumah Sakit", "Kantor Polisi", "Sekolah (SD)",
            "Sekolah (SMA)", "Masjid", "Lapangan Olahraga",
            "Pom Bensin", "Restoran Soerabi", "Swalayan",
            "Kantor Pos", "Sekolah (SMP)", "Food Court",
            "Tugu Pahlawan", "Jam Gadang", "Pasar Atas",
            "Ramayana", "Istana Bung Hatta", "Hotel",
            "KFC", "Pizza Hut"
        };
        for (String n : nodes_2027) graph_2027.put(n, new ArrayList<>());

        String[][] edges_2027 = {
            {"Rumah",             "Rumah Sakit"},
            {"Rumah",             "Kantor Polisi"},
            {"Rumah",             "Sekolah (SD)"},
            {"Rumah",             "Sekolah (SMA)"},
            {"Kantor Polisi",     "Sekolah (SD)"},
            {"Kantor Polisi",     "Sekolah (SMA)"},
            {"Rumah Sakit",       "Sekolah (SMA)"},
            {"Sekolah (SD)",      "Masjid"},
            {"Sekolah (SMA)",     "Lapangan Olahraga"},
            {"Rumah Sakit",       "Lapangan Olahraga"},
            {"Lapangan Olahraga", "Pom Bensin"},
            {"Lapangan Olahraga", "Restoran Soerabi"},
            {"Restoran Soerabi",  "Swalayan"},
            {"Pom Bensin",        "Kantor Pos"},
            {"Kantor Pos",        "Sekolah (SMP)"},
            {"Kantor Pos",        "Food Court"},
            {"Sekolah (SMP)",     "Food Court"},
            {"Sekolah (SMP)",     "Tugu Pahlawan"},
            {"Tugu Pahlawan",     "Jam Gadang"},
            {"Jam Gadang",        "Pasar Atas"},
            {"Jam Gadang",        "Ramayana"},
            {"Jam Gadang",        "Istana Bung Hatta"},
            {"Istana Bung Hatta", "Hotel"},
            {"Hotel",             "Ramayana"},
            {"Ramayana",          "KFC"},
            {"KFC",               "Pizza Hut"}
        };
        for (String[] e : edges_2027) {
            graph_2027.get(e[0]).add(e[1]);
            graph_2027.get(e[1]).add(e[0]);
        }
    }

    private void initNodePositions_2027() {
        nodePos_2027 = new LinkedHashMap<>();
        nodePos_2027.put("Rumah",             new Point(80,  180));
        nodePos_2027.put("Kantor Polisi",      new Point(230, 100));
        nodePos_2027.put("Sekolah (SD)",       new Point(230, 240));
        nodePos_2027.put("Masjid",             new Point(370, 240));
        nodePos_2027.put("Rumah Sakit",        new Point(80,  310));
        nodePos_2027.put("Sekolah (SMA)",      new Point(230, 360));
        nodePos_2027.put("Lapangan Olahraga",  new Point(380, 360));
        nodePos_2027.put("Pom Bensin",         new Point(510, 270));
        nodePos_2027.put("Restoran Soerabi",   new Point(510, 430));
        nodePos_2027.put("Swalayan",           new Point(640, 430));
        nodePos_2027.put("Kantor Pos",         new Point(640, 270));
        nodePos_2027.put("Sekolah (SMP)",      new Point(760, 180));
        nodePos_2027.put("Food Court",         new Point(760, 340));
        nodePos_2027.put("Tugu Pahlawan",      new Point(880, 100));
        nodePos_2027.put("Jam Gadang",         new Point(980, 230));
        nodePos_2027.put("Pasar Atas",         new Point(1100, 130));
        nodePos_2027.put("Ramayana",           new Point(1100, 300));
        nodePos_2027.put("Istana Bung Hatta",  new Point(980, 370));
        nodePos_2027.put("Hotel",              new Point(1100, 430));
        nodePos_2027.put("KFC",                new Point(1200, 300));
        nodePos_2027.put("Pizza Hut",          new Point(1280, 400));
    }

    public List<String> BFS_2027(String start_2027, String goal_2027) {
        visitedNodes_2027 = new ArrayList<>();
        Map<String, String> parent_2027 = new HashMap<>();
        Queue<String>       queue_2027  = new LinkedList<>();
        Set<String>         seen_2027   = new LinkedHashSet<>();

        queue_2027.add(start_2027);
        seen_2027.add(start_2027);
        parent_2027.put(start_2027, null);

        while (!queue_2027.isEmpty()) {
            String cur_2027 = queue_2027.poll();
            visitedNodes_2027.add(cur_2027);
            if (cur_2027.equals(goal_2027)) return buildPath_2027(parent_2027, goal_2027);
            for (String nb_2027 : graph_2027.getOrDefault(cur_2027, Collections.emptyList())) {
                if (!seen_2027.contains(nb_2027)) {
                    seen_2027.add(nb_2027);
                    parent_2027.put(nb_2027, cur_2027);
                    queue_2027.add(nb_2027);
                }
            }
        }
        return null;
    }

    public List<String> DFS_2027(String start_2027, String goal_2027) {
        visitedNodes_2027 = new ArrayList<>();
        Map<String, String> parent_2027 = new HashMap<>();
        Set<String>         seen_2027   = new LinkedHashSet<>();
        parent_2027.put(start_2027, null);
        boolean found_2027 = dfsRec_2027(start_2027, goal_2027, seen_2027, parent_2027);
        return found_2027 ? buildPath_2027(parent_2027, goal_2027) : null;
    }

    private boolean dfsRec_2027(String cur_2027, String goal_2027,
                                  Set<String> seen_2027,
                                  Map<String, String> parent_2027) {
        seen_2027.add(cur_2027);
        visitedNodes_2027.add(cur_2027);
        if (cur_2027.equals(goal_2027)) return true;
        for (String nb_2027 : graph_2027.getOrDefault(cur_2027, Collections.emptyList())) {
            if (!seen_2027.contains(nb_2027)) {
                parent_2027.put(nb_2027, cur_2027);
                if (dfsRec_2027(nb_2027, goal_2027, seen_2027, parent_2027)) return true;
            }
        }
        return false;
    }

    private List<String> buildPath_2027(Map<String, String> parent_2027, String goal_2027) {
        LinkedList<String> path_2027 = new LinkedList<>();
        for (String c = goal_2027; c != null; c = parent_2027.get(c))
            path_2027.addFirst(c);
        return path_2027;
    }

    public void displayPath_2027(List<String> path_2027, String algo_2027) {
        StringBuilder sb_2027 = new StringBuilder();
        sb_2027.append("[ ").append(algo_2027).append(" ]\n\n");

        if (path_2027 == null) {
            sb_2027.append("Jalur tidak ditemukan.\n\n");
            highlightPath_2027 = new HashSet<>();
        } else {
            sb_2027.append("Jalur Ditemukan :\n  ")
                   .append(String.join(" -> ", path_2027))
                   .append("\n\n");
            highlightPath_2027 = new HashSet<>(path_2027);
        }

        sb_2027.append("Node Dikunjungi :\n  ")
               .append(String.join(" -> ", visitedNodes_2027))
               .append("\n\n")
               .append("Jumlah Node Dieksplorasi : ")
               .append(visitedNodes_2027.size());

        if (path_2027 != null)
            sb_2027.append("\nPanjang Jalur : ")
                   .append(path_2027.size() - 1).append(" langkah");

        highlightVisited_2027 = new HashSet<>(visitedNodes_2027);
        resultArea_2027.setText(sb_2027.toString());
        resultArea_2027.setCaretPosition(0);
        graphPanel_2027.repaint();
    }

    public void displayGraph_2027() {
        highlightPath_2027    = new HashSet<>();
        highlightVisited_2027 = new HashSet<>();
        resultArea_2027.setText(
            "Hasil Pencarian :\n\nJalur :\n\nNode Dikunjungi :\n\nJumlah Node Dieksplorasi : 0");
        graphPanel_2027.repaint();
    }

    public void resetGraph_2027() {
        visitedNodes_2027     = new ArrayList<>();
        highlightPath_2027    = new HashSet<>();
        highlightVisited_2027 = new HashSet<>();
        cbStart_2027.setSelectedIndex(0);
        cbGoal_2027.setSelectedIndex(0);
        displayGraph_2027();
    }

    private void buildGUI_2027() {
        setTitle("PENCARIAN JALUR MENGGUNAKAN BFS DAN DFS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(0, 0));
        getContentPane().setBackground(C_BG);

        JPanel header_2027 = new JPanel(new BorderLayout());
        header_2027.setBackground(C_PANEL);
        header_2027.setBorder(new EmptyBorder(14, 20, 14, 20));
        JLabel titleLbl_2027 = new JLabel(
            "PENCARIAN JALUR MENGGUNAKAN BFS DAN DFS",
            SwingConstants.CENTER);
        titleLbl_2027.setFont(new Font("Segoe UI", Font.BOLD, 18));
        titleLbl_2027.setForeground(C_TEXT);
        header_2027.add(titleLbl_2027, BorderLayout.CENTER);
        add(header_2027, BorderLayout.NORTH);

        graphPanel_2027 = new GraphPanel_2027();
        JScrollPane graphScroll_2027 = new JScrollPane(graphPanel_2027);
        graphScroll_2027.setBorder(BorderFactory.createLineBorder(C_CARD, 1));
        graphScroll_2027.getViewport().setBackground(C_BG);

        JPanel rightPanel_2027 = buildRightPanel_2027();

        JPanel centerRow_2027 = new JPanel(new BorderLayout(8, 0));
        centerRow_2027.setBackground(C_BG);
        centerRow_2027.setBorder(new EmptyBorder(6, 6, 6, 6));
        centerRow_2027.add(graphScroll_2027, BorderLayout.CENTER);
        centerRow_2027.add(rightPanel_2027,  BorderLayout.EAST);
        add(centerRow_2027, BorderLayout.CENTER);

        setSize(1720, 780);
        setMinimumSize(new Dimension(1000, 600));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel buildRightPanel_2027() {
        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        p.setBackground(C_BG);
        p.setBorder(new EmptyBorder(2, 6, 4, 2));
        p.setPreferredSize(new Dimension(380, 600));

        JPanel card_2027 = new JPanel(new GridBagLayout());
        card_2027.setBackground(C_PANEL);
        card_2027.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(C_CARD, 1),
            new EmptyBorder(14, 14, 14, 14)));
        card_2027.setMaximumSize(new Dimension(Integer.MAX_VALUE, 180));

        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(6, 4, 6, 4);
        gc.fill   = GridBagConstraints.HORIZONTAL;

        String[] nodeArr_2027 = graph_2027.keySet().toArray(new String[0]);

        gc.gridx = 0; gc.gridy = 0; gc.weightx = 0;
        card_2027.add(makeLabel_2027("Lokasi Awal   :"), gc);
        gc.gridx = 1; gc.weightx = 1;
        cbStart_2027 = makeCombo_2027(nodeArr_2027);
        card_2027.add(cbStart_2027, gc);

        gc.gridx = 0; gc.gridy = 1; gc.weightx = 0;
        card_2027.add(makeLabel_2027("Lokasi Tujuan :"), gc);
        gc.gridx = 1; gc.weightx = 1;
        cbGoal_2027 = makeCombo_2027(nodeArr_2027);
        cbGoal_2027.setSelectedIndex(Math.min(5, nodeArr_2027.length - 1));
        card_2027.add(cbGoal_2027, gc);

        JPanel btnRow_2027 = new JPanel(new GridLayout(1, 3, 8, 0));
        btnRow_2027.setBackground(C_PANEL);
        btnRow_2027.setMaximumSize(new Dimension(Integer.MAX_VALUE, 38));

        JButton btnBFS_2027 = makeButton_2027("[ BFS ]", C_GREEN);
        btnBFS_2027.addActionListener(e -> {
            String s = (String) cbStart_2027.getSelectedItem();
            String g = (String) cbGoal_2027.getSelectedItem();
            if (s.equals(g)) {
                resultArea_2027.setText("Lokasi awal dan tujuan tidak boleh sama!");
                return;
            }
            displayPath_2027(BFS_2027(s, g), "BFS (Breadth First Search)");
        });

        JButton btnDFS_2027 = makeButton_2027("[ DFS ]", C_YELLOW);
        btnDFS_2027.addActionListener(e -> {
            String s = (String) cbStart_2027.getSelectedItem();
            String g = (String) cbGoal_2027.getSelectedItem();
            if (s.equals(g)) {
                resultArea_2027.setText("Lokasi awal dan tujuan tidak boleh sama!");
                return;
            }
            displayPath_2027(DFS_2027(s, g), "DFS (Depth First Search)");
        });

        JButton btnReset_2027 = makeButton_2027("[ RESET ]", C_RED);
        btnReset_2027.addActionListener(e -> resetGraph_2027());

        btnRow_2027.add(btnBFS_2027);
        btnRow_2027.add(btnDFS_2027);
        btnRow_2027.add(btnReset_2027);

        gc.gridx = 0; gc.gridy = 2; gc.gridwidth = 2; gc.weightx = 1;
        gc.insets = new Insets(14, 0, 4, 0);
        card_2027.add(btnRow_2027, gc);

        p.add(card_2027);
        p.add(Box.createVerticalStrut(10));

        JLabel resultTitle_2027 = new JLabel("Hasil Pencarian");
        resultTitle_2027.setFont(new Font("Segoe UI", Font.BOLD, 13));
        resultTitle_2027.setForeground(C_TEXT);
        resultTitle_2027.setAlignmentX(Component.LEFT_ALIGNMENT);
        p.add(resultTitle_2027);
        p.add(Box.createVerticalStrut(4));

        resultArea_2027 = new JTextArea();
        resultArea_2027.setFont(new Font("Consolas", Font.PLAIN, 11));
        resultArea_2027.setForeground(C_TEXT);
        resultArea_2027.setBackground(C_CARD);
        resultArea_2027.setCaretColor(C_TEXT);
        resultArea_2027.setEditable(false);
        resultArea_2027.setLineWrap(true);
        resultArea_2027.setWrapStyleWord(true);
        resultArea_2027.setBorder(new EmptyBorder(8, 10, 8, 10));
        resultArea_2027.setText(
            "Hasil Pencarian :\n\nJalur :\n\nNode Dikunjungi :\n\nJumlah Node Dieksplorasi : 0");

        JScrollPane rScroll_2027 = new JScrollPane(resultArea_2027);
        rScroll_2027.setBorder(BorderFactory.createLineBorder(C_ACCENT, 1));
        rScroll_2027.setAlignmentX(Component.LEFT_ALIGNMENT);
        rScroll_2027.setPreferredSize(new Dimension(370, 260));
        rScroll_2027.setMaximumSize(new Dimension(Integer.MAX_VALUE, 300));
        p.add(rScroll_2027);
        p.add(Box.createVerticalStrut(10));

        p.add(buildLegend_2027());

        return p;
    }

    private JPanel buildLegend_2027() {
        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        p.setBackground(C_BG);

        JLabel title_2027 = new JLabel("Keterangan Warna Node :");
        title_2027.setFont(new Font("Segoe UI", Font.BOLD, 12));
        title_2027.setForeground(C_TEXT_DIM);
        p.add(title_2027);
        p.add(Box.createVerticalStrut(4));

        addLegRow_2027(p, C_NODE_START, "Node Awal (Start)");
        addLegRow_2027(p, C_NODE_GOAL,  "Node Tujuan (Goal)");
        addLegRow_2027(p, C_NODE_PATH,  "Node dalam Jalur");
        addLegRow_2027(p, C_NODE_VISIT, "Node Dikunjungi");
        addLegRow_2027(p, C_NODE,       "Node Biasa");
        return p;
    }

    private void addLegRow_2027(JPanel p, Color c, String txt) {
        JPanel row = new JPanel(new FlowLayout(FlowLayout.LEFT, 6, 1));
        row.setBackground(C_BG);
        JLabel dot = new JLabel("●");
        dot.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        dot.setForeground(c);
        JLabel lbl = new JLabel(txt);
        lbl.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lbl.setForeground(C_TEXT_DIM);
        row.add(dot); row.add(lbl);
        p.add(row);
    }

    private JLabel makeLabel_2027(String text) {
        JLabel l = new JLabel(text);
        l.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        l.setForeground(C_TEXT);
        return l;
    }

    private JComboBox<String> makeCombo_2027(String[] items) {
        JComboBox<String> cb = new JComboBox<>(items);
        cb.setFont(new Font("Segoe UI", Font.PLAIN, 12));

        cb.setRenderer(new BasicComboBoxRenderer() {
            public Component getListCellRendererComponent(
                    JList list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                JLabel lbl = (JLabel) super.getListCellRendererComponent(
                    list, value, index, isSelected, cellHasFocus);
                lbl.setFont(new Font("Segoe UI", Font.PLAIN, 12));
                if (isSelected) {
                    lbl.setBackground(C_ACCENT);
                    lbl.setForeground(Color.WHITE);
                } else {
                    lbl.setBackground(C_CARD);
                    lbl.setForeground(C_TEXT);
                }
                lbl.setBorder(new EmptyBorder(4, 8, 4, 8));
                return lbl;
            }
        });

        cb.setUI(new javax.swing.plaf.basic.BasicComboBoxUI() {
            @Override
            protected JButton createArrowButton() {
                JButton btn = new JButton("▼");
                btn.setFont(new Font("Segoe UI", Font.PLAIN, 9));
                btn.setForeground(C_TEXT);
                btn.setBackground(C_CARD);
                btn.setBorder(BorderFactory.createEmptyBorder(0, 4, 0, 4));
                btn.setFocusPainted(false);
                btn.setContentAreaFilled(true);
                return btn;
            }

            @Override
            public void paintCurrentValue(Graphics g, Rectangle bounds, boolean hasFocus) {

                g.setColor(C_CARD);
                g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);

                String val = (String) comboBox.getSelectedItem();
                if (val != null) {
                    Graphics2D g2 = (Graphics2D) g;
                    g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                                        RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                    g2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
                    g2.setColor(C_TEXT);
                    FontMetrics fm = g2.getFontMetrics();
                    int y = bounds.y + (bounds.height + fm.getAscent() - fm.getDescent()) / 2;
                    g2.drawString(val, bounds.x + 6, y);
                }
            }

            @Override
            public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
                g.setColor(C_CARD);
                g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
            }
        });

        cb.setBackground(C_CARD);
        cb.setForeground(C_TEXT);
        cb.setBorder(BorderFactory.createLineBorder(C_CARD, 1));
        cb.setMaximumRowCount(12);
        cb.setPreferredSize(new Dimension(220, 30));
        return cb;
    }

    private JButton makeButton_2027(String text, Color bg) {
        JButton btn = new JButton(text) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                    RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(getModel().isPressed()  ? bg.darker()   :
                            getModel().isRollover() ? bg.brighter() : bg);
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
                g2.setColor(Color.WHITE);
                g2.setFont(getFont());
                FontMetrics fm = g2.getFontMetrics();
                g2.drawString(getText(),
                    (getWidth()  - fm.stringWidth(getText())) / 2,
                    (getHeight() + fm.getAscent() - fm.getDescent()) / 2);
                g2.dispose();
            }
        };
        btn.setFont(new Font("Segoe UI", Font.BOLD, 12));
        btn.setPreferredSize(new Dimension(100, 34));
        btn.setMinimumSize(new Dimension(80, 34));
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return btn;
    }

    class GraphPanel_2027 extends JPanel {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private static final int R = 26;

        GraphPanel_2027() {
            setBackground(C_BG);
            setPreferredSize(new Dimension(1310, 530));
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            drawEdges_2027(g2);
            drawNodes_2027(g2);
        }

        private void drawEdges_2027(Graphics2D g2) {
            Set<String> drawn_2027 = new HashSet<>();
            for (Map.Entry<String, List<String>> entry : graph_2027.entrySet()) {
                String from_2027 = entry.getKey();
                Point  pf_2027   = nodePos_2027.get(from_2027);
                if (pf_2027 == null) continue;

                for (String to_2027 : entry.getValue()) {
                    String key_2027 = from_2027.compareTo(to_2027) < 0
                        ? from_2027 + "||" + to_2027
                        : to_2027   + "||" + from_2027;
                    if (drawn_2027.contains(key_2027)) continue;
                    drawn_2027.add(key_2027);

                    Point pt_2027 = nodePos_2027.get(to_2027);
                    if (pt_2027 == null) continue;

                    boolean onPath_2027 = highlightPath_2027.contains(from_2027)
                                       && highlightPath_2027.contains(to_2027);
                    if (onPath_2027) {
                        g2.setStroke(new BasicStroke(3.5f,
                            BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                        g2.setColor(C_EDGE_PATH);
                    } else {
                        g2.setStroke(new BasicStroke(1.8f,
                            BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                        g2.setColor(C_EDGE);
                    }
                    g2.drawLine(pf_2027.x, pf_2027.y, pt_2027.x, pt_2027.y);
                }
            }
        }

        private void drawNodes_2027(Graphics2D g2) {
            String start_2027 = (String) cbStart_2027.getSelectedItem();
            String goal_2027  = (String) cbGoal_2027.getSelectedItem();

            for (Map.Entry<String, Point> entry : nodePos_2027.entrySet()) {
                String node_2027 = entry.getKey();
                Point  p_2027    = entry.getValue();

                Color fill_2027;
                if      (node_2027.equals(start_2027))                fill_2027 = C_NODE_START;
                else if (node_2027.equals(goal_2027))                 fill_2027 = C_NODE_GOAL;
                else if (highlightPath_2027.contains(node_2027))      fill_2027 = C_NODE_PATH;
                else if (highlightVisited_2027.contains(node_2027))   fill_2027 = C_NODE_VISIT;
                else                                                    fill_2027 = C_NODE;

                g2.setColor(new Color(0, 0, 0, 70));
                g2.fillOval(p_2027.x - R + 3, p_2027.y - R + 3, R * 2, R * 2);

                g2.setColor(fill_2027);
                g2.fillOval(p_2027.x - R, p_2027.y - R, R * 2, R * 2);

                g2.setStroke(new BasicStroke(2f));
                g2.setColor(fill_2027.brighter());
                g2.drawOval(p_2027.x - R, p_2027.y - R, R * 2, R * 2);

                g2.setColor(Color.WHITE);
                drawLabel_2027(g2, node_2027, p_2027);
            }
        }

        private void drawLabel_2027(Graphics2D g2, String name_2027, Point p_2027) {
            Font font_2027 = new Font("Segoe UI", Font.BOLD, 8);
            g2.setFont(font_2027);
            FontMetrics fm_2027 = g2.getFontMetrics();

            String[] words_2027 = name_2027.split(" ");
            List<String> lines_2027 = new ArrayList<>();

            if (name_2027.length() <= 8 || words_2027.length == 1) {
                lines_2027.add(name_2027);
            } else {
                int mid_2027 = (words_2027.length + 1) / 2;
                StringBuilder b1 = new StringBuilder(), b2 = new StringBuilder();
                for (int i = 0; i < words_2027.length; i++) {
                    if (i < mid_2027) { if (b1.length() > 0) b1.append(' '); b1.append(words_2027[i]); }
                    else              { if (b2.length() > 0) b2.append(' '); b2.append(words_2027[i]); }
                }
                lines_2027.add(b1.toString());
                if (b2.length() > 0) lines_2027.add(b2.toString());
            }

            int lh_2027 = fm_2027.getHeight();
            int y_2027  = p_2027.y - lh_2027 * lines_2027.size() / 2 + fm_2027.getAscent() - 1;
            for (String ln_2027 : lines_2027) {
                g2.drawString(ln_2027, p_2027.x - fm_2027.stringWidth(ln_2027) / 2, y_2027);
                y_2027 += lh_2027;
            }
        }
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ignored) {}

        SwingUtilities.invokeLater(PetaKota_2511532027::new);
    }
}