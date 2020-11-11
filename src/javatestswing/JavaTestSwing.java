package javatestswing;
import javax.swing.*;
import java.awt.*;
public class JavaTestSwing {
    
    public static void main(String[] args) {
        GUI g = new GUI();     
    }
}
    class GUI extends JFrame{
    
    JLabel lnama = new JLabel("Nama Lengkap ");
    final JTextField fnama = new JTextField(30);
    JLabel ljeniskelamin = new JLabel("Jenis Kelamin ");
    JRadioButton rblaki = new JRadioButton("Laki-laki");
    JRadioButton rbperempuan = new JRadioButton("Perempuan");
    JLabel lagama = new JLabel("Agama");
    String [] namaagama = {"Islam","Kristen","HIndu","Budha","Katholik","Konghuchu"};
    JComboBox cmagama = new JComboBox(namaagama);
    JLabel ltinggal = new JLabel("Tempat Tinggal ");
    JTextField tinggal = new JTextField(30);
    JButton bsave = new JButton("Save");
    
    public GUI(){
        setTitle("registrasi");
        setSize(400,300);
        
        ButtonGroup grup = new ButtonGroup();
        grup.add(rblaki);
        grup.add(rbperempuan);
        
        setLayout(null);
        add(lnama);
        add(fnama);
        add(ljeniskelamin);
        add(rblaki);
        add(rbperempuan);
        add(lagama);
        add(cmagama);
        add(ltinggal);
        add(tinggal);
        add(bsave);
        
        lnama.setBounds(10, 10, 120, 20);
        fnama.setBounds(130, 10, 150, 20);
        ljeniskelamin.setBounds(10, 30, 120, 20);
        rblaki.setBounds(130, 35, 100, 20);
        rbperempuan.setBounds(230, 35, 100, 20);
        lagama.setBounds(10, 60, 150, 20);
        cmagama.setBounds(130, 60, 150, 20);
        ltinggal.setBounds(10, 85, 120, 20);
        tinggal.setBounds(130, 85, 150, 20);
        bsave.setBounds(100, 130, 120, 20);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
    }
}

