package GreedyMethod;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GreedyMethod extends JFrame {

    private static final long serialVersionUID = -1508220487443708466L;
    private static final int width = 360;// 面板的宽度
    private static final int height = 300;// 面板的高度
    public int M;
    public int[] w;
    public int[] p;
    public int length;

    public GreedyMethod() {
        //
        // 初始Frame参数设置
        this.setTitle("贪心算法");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(width, height);
        Container c = getContentPane();
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        setLocation(350, 150);

        //
        // 声明一些字体样式
        Font topF1 = new Font("宋体", Font.BOLD, 28);
        Font black15 = new Font("宋体", Font.PLAIN, 20);
        Font bold10 = new Font("宋体", Font.BOLD, 15);
        // 声明工具栏及属性设置
        JPanel barPanel = new JPanel();
        JMenuBar topBar = new JMenuBar();
        JMenu aboutMenu = new JMenu("程序说明(A)");
        JMenu helpMenu = new JMenu("帮助(H)");
        topBar.add(aboutMenu);
        topBar.add(helpMenu);
        topBar.setLocation(1, 1);
        barPanel.add(topBar);
        //
        // 面板1和顶部标签属性设置
        JPanel p1 = new JPanel();
        JLabel topLabel = new JLabel("背包问题");
        topLabel.setForeground(Color.blue);
        topLabel.setFont(topF1);
        p1.add(topLabel);
        //
        // 中间面板和标签及输入框属性设置
        JPanel p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        JLabel wLabel = new JLabel("请输入重量:");
        JLabel pLabel = new JLabel("请输入效益:");
        wLabel.setFont(black15);
        pLabel.setFont(black15);
        //
        final JTextField wText = new JTextField(8);
        final JTextField pText = new JTextField(8);
        // wText.setText("10,8,7,5,9,6");
        // pText.setText("15,14,7,10,17,7");
        p2.add(wLabel);
        p2.add(wText);
        p2.add(pLabel);
        p2.add(pText);
        //  
        // 中下部面板和标签属性设置
        JPanel p3 = new JPanel();
        JLabel bottomLabel = new JLabel(
                "           注意：数据输入时请添加分割符 ','");
        bottomLabel.setFont(bold10);
        bottomLabel.setForeground(Color.red);
        bottomLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        p3.add(bottomLabel);

        //
        JPanel p5 = new JPanel();
        p5.setLayout(new BoxLayout(p5, BoxLayout.Y_AXIS));
        JLabel mLabel = new JLabel("请输入背包总重量:");
        mLabel.setFont(black15);
        final JTextField mText = new JTextField(8);
        p5.add(mLabel);
        p5.add(mText);

        // 面板和按钮的设置
        JPanel p4 = new JPanel();
        JButton submit = new JButton("确定");
        JButton eButton = new JButton("示例");
        //
        // 添加事件监听的
        eButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                pText.setText("15,14,7,10,17,7");
                wText.setText("10,8,7,5,9,6");
                mText.setText("36");
            }
        });
        submit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String s1 = pText.getText();
                String s2 = wText.getText();
                String s3 = mText.getText();

                String s1Copy, s2Copy, s3Copy;
                s1Copy = s1;
                s2Copy = s2;
                s3Copy = s3;

                s1Copy = s1Copy.replaceAll(",", "");
                s2Copy = s2Copy.replaceAll(",", "");
                s3Copy = s3Copy.replaceAll(",", "");

                try {
                    Integer.parseInt(s1Copy);
                } catch (NumberFormatException e5) {
                    JOptionPane.showMessageDialog(null, "效益部分数字格式不合法!");

                }
                try {
                    Integer.parseInt(s2Copy);
                } catch (NumberFormatException e6) {
                    JOptionPane.showMessageDialog(null, "重量数字格式不合法!");
                }
                try {
                    Integer.parseInt(s3Copy);
                } catch (NumberFormatException e7) {
                    JOptionPane.showMessageDialog(null, "背包总重量数字格式不合法!");
                }

                try {
                    String[] temp = s1.split(",");// 按照','分割字符串
                    p = new int[temp.length];
                    for (int i = 0; i < temp.length; i++) {
                        p[i] = Integer.parseInt(temp[i]);//
                    }
                    temp = s2.split(",");
                    w = new int[temp.length];
                    for (int i = 0; i < temp.length; i++) {
                        w[i] = Integer.parseInt(temp[i]);//
                    }
                    if (w.length == p.length) {
                        length = w.length;
                    } else {
                        JOptionPane.showMessageDialog(null, "长度不等,请检查后重新输入!");
                    }
                    M = Integer.parseInt(s3);
                } catch (NumberFormatException e2) {
                    if (s1.equals("")) {
                        JOptionPane.showMessageDialog(null, "效益值不能为空!");
                    }
                    if (s2.equals("")) {
                        JOptionPane.showMessageDialog(null, "重量不能为空!");
                    }
                    if (s3.equals("")) {
                        JOptionPane.showMessageDialog(null, "总重量不能为空!");
                    }
                }
                //可以执行贪心算法了
                int[] wCopy = new int[w.length];
                int[] pCopy = new int[w.length];

                float temp2;
                int temp1;
                float totalx = 0;
                float[] x = new float[w.length];//效益和重量的比值
                float[] n = new float[w.length];//记录个数
                float[] nCopy = new float[w.length];

                for (int i = 0; i < w.length; i++) {
                    wCopy[i] = w[i];
                    pCopy[i] = p[i];
                }
                for (int i = 0; i < w.length; i++) {
                    x[i] = (float) ((p[i] * 1.0) / w[i]);
                }

                for (int i = 0; i < w.length; i++) {
                    for (int j = i + 1; j < w.length; j++) {
                        if (x[i] < x[j]) {
                            temp2 = x[j];
                            x[j] = x[i];
                            x[i] = temp2;

                            temp1 = p[j];
                            p[j] = p[i];
                            p[i] = temp1;

                            temp1 = w[j];
                            w[j] = w[i];
                            w[i] = temp1;
                        }
                    }//效益重量比值排序
                }
                Backpack b = new Backpack(M, w, p, n);

                for (int i = 0; i < w.length; i++) {
                    for (int j = 0; j < w.length; j++) {
                        if (wCopy[i] == w[j] && pCopy[i] == p[j]) {
                            nCopy[i] = b.n[i];
                        }
                    }
                }
                for (int j = 0; j < w.length; j++) {
                    totalx = totalx + n[j] * p[j];
                }
                ShowResult s = new ShowResult(p, w, length, n, totalx);
            }//actionPerformed
        });
        p4.add(submit);
        p4.add(eButton);
        //

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));

        topPanel.add(p1);
        topPanel.add(p2);
        topPanel.add(p5);
        topPanel.add(p3);
        topPanel.add(p4);

        c.add(barPanel);
        c.add(topPanel);

        setVisible(true);
    }// 构造方法

    public static void main(String[] args) {

        GreedyMethod g = new GreedyMethod();

    }//end main
}

class Backpack {
    //M=36
    //重量:10,8,7,5,9,6
    //效益:15,14,7,10,17,7

    private int capacity;
    int length;//数组元素个数
    float[] n;

    public Backpack(int M, int[] w, int[] p, float[] n) {
        this.capacity = M;
        this.length = w.length;
        this.n = n;

        int i;

        for (i = 0; i < length; i++) {
            if (w[i] > capacity) {
                break;
            } else {
                n[i] = 1;
                capacity = capacity - w[i];
            }
        }//end for

        if (i < length) {
            n[i] = (float) ((capacity * 1.0) / w[i]);
        }
    }//构造方法 
}

class ShowResult extends JFrame {

    private static final long serialVersionUID = 6592095135353992914L;

    ShowResult(int[] p, int[] w, int length, float[] n, float totalx) {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        setSize(360, 300);
        setLocation(400, 200);
        setTitle("最后结果");
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");

        String ps = null;
        String ws = null;
        String ns = null;

        ps = Integer.toString(p[0]) + ",";
        ws = Integer.toString(w[0]) + ",";
        ns = Float.toString(n[0]) + "个,";

        //格式化小数部分
        for (int j = 0; j < n.length; j++) {
            n[j] = Float.parseFloat(df.format(n[j]));
        }

        for (int i = 1; i < w.length; i++) {
            ps = ps + Integer.toString(p[i]) + ",";
            ws = ws + Integer.toString(w[i]) + ",";
            ns = ns + Float.toString(n[i]) + "个,";
        }
        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        JLabel pLabel = new JLabel("效益值分别是:");
        JLabel wLabel = new JLabel("重量值分别是:");
        JLabel nLabel = new JLabel("个数分别是:");
        JLabel tLabel = new JLabel("总效益是:");

        JTextField pt = new JTextField(8);
        pt.setText(ps);
        pt.setEditable(false);
        JTextField wt = new JTextField(8);
        wt.setEditable(false);
        wt.setText(ws);
        JTextField nt = new JTextField(8);
        nt.setEditable(false);
        nt.setText(ns);
        JTextField tt = new JTextField(8);
        tt.setEditable(false);
        tt.setText(Float.toString(totalx));

        p1.add(pLabel);
        p1.add(pt);
        p1.add(wLabel);
        p1.add(wt);
        p1.add(nLabel);
        p1.add(nt);
        p1.add(tLabel);
        p1.add(tt);

        c.add(p1);
        setVisible(true);
    }
}
