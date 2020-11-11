/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestswing;
import javax.swing.*;
class GUI extends JavaTestSwing{
    
    JLabel lnama = new JLabel("Nama Lengkap ");
    final JTextField fnama = new JTextField(30);
    JLabel ljeniskelamin = new JLabel("Jenis Kelamin ");
    JRadioButton rblaki = new JRadioButton("Laki-laki");
    JRadioButton rbperempuan = new JRadioButton("Perempuan");
    JLabel ltanggallahir = new JLabel("Tanggal lahir ");
    JButton bsave = new JButton("Save");
    
    public GUI(){
        
    }
}
