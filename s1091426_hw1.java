// app18_4, 加入可關閉視窗的按鈕
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class s1091426_hw1 extends Frame implements ActionListener
{
	static s1091426_hw1 frm=new s1091426_hw1();
	//static Frame frm=new Frame("chess");
	static Label lab=new Label();
	static Button btn1=new Button("");
	static Button btn2=new Button("");
	static Button btn3=new Button("");
	static Button btn4=new Button("");
	static Button btn5=new Button("");
	static Button btn6=new Button("");
	static Button btn7=new Button("");
	static Button btn8=new Button("");
	static Button btn9=new Button("");
	int round=0;
	public static void main(String args[])
	{
		frm.setLayout(null);
		frm.setTitle("chess");
		frm.setSize(700,700);      // 設定視窗的大小為200*150
        frm.setLocation(100,50); 
		lab.setText("chess");
		lab.setLocation(20,40);          // 設定標籤位置
		lab.setSize(120,20);             // 設定標籤大小
		lab.setFont(new Font("Serief",Font.ITALIC+Font.BOLD,18));
		frm.add(lab);
		     // 設定視窗位置為(100,50)
		btn1.setBounds(20,70,100,100);
		btn2.setBounds(120,70,100,100);
		btn3.setBounds(220,70,100,100);
		btn4.setBounds(20,170,100,100);
		btn5.setBounds(120,170,100,100);
		btn6.setBounds(220,170,100,100);
		btn7.setBounds(20,270,100,100);
		btn8.setBounds(120,270,100,100);
		btn9.setBounds(220,270,100,100);
		btn1.addActionListener(frm);
		btn2.addActionListener(frm);
		btn3.addActionListener(frm);
		btn4.addActionListener(frm);
		btn5.addActionListener(frm);
		btn6.addActionListener(frm);
		btn7.addActionListener(frm);
		btn8.addActionListener(frm);
		btn9.addActionListener(frm);
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.add(btn4);
		frm.add(btn5);
		frm.add(btn6);
		frm.add(btn7);
		frm.add(btn8);
		frm.add(btn9);
		
		frm.setVisible(true);
   }

    public void actionPerformed(ActionEvent e)
    {
		Button btn=(Button) e.getSource();// 取得事件來源的物件
		if (round%2==0){
			btn.setLabel("o");
			if ((btn1.getLabel() == btn2.getLabel() && btn2.getLabel() == btn3.getLabel() && btn1.getLabel() != "")// 如果是按下btn1按鈕
			|| (btn4.getLabel() == btn5.getLabel() && btn5.getLabel() == btn6.getLabel() && btn4.getLabel() != "")
			|| (btn7.getLabel() == btn8.getLabel() && btn8.getLabel() == btn9.getLabel() && btn7.getLabel() != "")
			|| (btn1.getLabel() == btn4.getLabel() && btn4.getLabel() == btn7.getLabel() && btn1.getLabel() != "")
			|| (btn2.getLabel() == btn5.getLabel() && btn5.getLabel() == btn8.getLabel() && btn2.getLabel() != "")
			|| (btn3.getLabel() == btn6.getLabel() && btn6.getLabel() == btn9.getLabel() && btn3.getLabel() != "")
			|| (btn1.getLabel() == btn5.getLabel() && btn5.getLabel() == btn9.getLabel() && btn1.getLabel() != "")
			|| (btn3.getLabel() == btn5.getLabel() && btn5.getLabel() == btn7.getLabel() && btn3.getLabel() != "")){
				JFrame jf = new JFrame();
				JOptionPane.showMessageDialog(jf, "O win!");
				System.exit(0);
			}
			round++;
			if(round==9){
				JFrame jf = new JFrame();
				JOptionPane.showMessageDialog(jf, "tie!");
				System.exit(0);
			}
		}
		else if(round%2==1&&round!=9){
			btn.setLabel("x");
			if ((btn1.getLabel() == btn2.getLabel() && btn2.getLabel() == btn3.getLabel() && btn1.getLabel() != "")// 如果是按下btn2按鈕
			|| (btn4.getLabel() == btn5.getLabel() && btn5.getLabel() == btn6.getLabel() && btn4.getLabel() != "")
			|| (btn7.getLabel() == btn8.getLabel() && btn8.getLabel() == btn9.getLabel() && btn7.getLabel() != "")
			|| (btn1.getLabel() == btn4.getLabel() && btn4.getLabel() == btn7.getLabel() && btn1.getLabel() != "")
			|| (btn2.getLabel() == btn5.getLabel() && btn5.getLabel() == btn8.getLabel() && btn2.getLabel() != "")
			|| (btn3.getLabel() == btn6.getLabel() && btn6.getLabel() == btn9.getLabel() && btn3.getLabel() != "")
			|| (btn1.getLabel() == btn5.getLabel() && btn5.getLabel() == btn9.getLabel() && btn1.getLabel() != "")
			|| (btn3.getLabel() == btn5.getLabel() && btn5.getLabel() == btn7.getLabel() && btn3.getLabel() != "")){
				JFrame jf = new JFrame();
				JOptionPane.showMessageDialog(jf, "X win!");
				System.exit(0);
			}
			round ++;
			
		}
		
   }
}