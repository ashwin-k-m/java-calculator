import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class calculator{
	static float x=0,y=0,r=0;
	static String s,m;
	static int t1,t2,t3,t4,i=0;
public static void main(String args[]){
	JFrame j=new JFrame("calculator");
	JTextField t=new JTextField(50);
	j.setBounds(450,150,380,600);
	j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	j.setVisible(true);
	j.setLayout(null);
	j.add(t);
	t.setBounds(50,50,260,100);
	t.setBackground(Color.LIGHT_GRAY);
	t.setHorizontalAlignment(SwingConstants.RIGHT);
	JButton b7=new JButton("7");
	JButton b8=new JButton("8");
	JButton b9=new JButton("9");
	JButton b4=new JButton("4");
	JButton b5=new JButton("5");
	JButton b6=new JButton("6");
	JButton b1=new JButton("1");
	JButton b2=new JButton("2");
	JButton b3=new JButton("3");
	JButton b=new JButton(".");
	JButton b0=new JButton("0");
	JButton be=new JButton("=");
	JButton bd=new JButton("/");
	JButton bm=new JButton("*");
	JButton bs=new JButton("-");
	JButton ba=new JButton("+");
	JButton bc=new JButton("clear");
	b7.setBounds(50,170,50,50);
	b8.setBounds(120,170,50,50);
	b9.setBounds(190,170,50,50);
	bd.setBounds(260,170,50,50);
	b4.setBounds(50,240,50,50);
	b5.setBounds(120,240,50,50);
	b6.setBounds(190,240,50,50);
	bm.setBounds(260,240,50,50);
	b1.setBounds(50,310,50,50);
	b2.setBounds(120,310,50,50);
	b3.setBounds(190,310,50,50);
	bs.setBounds(260,310,50,50);
	b.setBounds(50,380,50,50);
	b0.setBounds(120,380,50,50);
	be.setBounds(190,380,50,50);
	ba.setBounds(260,380,50,50);
	bc.setBounds(130,450,100,50);
	j.add(b);
	j.add(b1);
	j.add(b2);
	j.add(b3);
	j.add(b4);
	j.add(b5);
	j.add(b6);
	j.add(b7);
	j.add(b8);
	j.add(b9);
	j.add(b0);
	j.add(be);
	j.add(ba);
	j.add(bs);
	j.add(bm);
	j.add(bd);
	j.add(bc);
	b.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(i==1){
				m=t.getText();
				t.setText("");
				i=0;
			}
			m=t.getText();
			t.setText(m+".");
		}
	});
	b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(i==1){
				m=t.getText();
				t.setText("");
				i=0;
			}
			m=t.getText();
			t.setText(m+"1");
		}
	});
	b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(i==1){
				m=t.getText();
				t.setText("");
				i=0;
			}
			m=t.getText();
			t.setText(m+"2");
		}
	});
	b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(i==1){
				m=t.getText();
				t.setText("");
				i=0;
			}
			m=t.getText();
			t.setText(m+"3");
		}
	});
	b4.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(i==1){
				m=t.getText();
				t.setText("");
				i=0;
			}
			m=t.getText();
			t.setText(m+"4");
		}
	});
	b5.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(i==1){
				m=t.getText();
				t.setText("");
				i=0;
			}
			m=t.getText();
			t.setText(m+"5");
		}
	});
	b6.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(i==1){
				m=t.getText();
				t.setText("");
				i=0;
			}
			m=t.getText();
			t.setText(m+"6");
		}
	});
	b7.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(i==1){
				m=t.getText();
				t.setText("");
				i=0;
			}
			m=t.getText();
			t.setText(m+"7");
		}
	});
	b8.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(i==1){
				m=t.getText();
				t.setText("");
				i=0;
			}
			m=t.getText();
			t.setText(m+"8");
		}
	});
	b9.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(i==1){
				m=t.getText();
				t.setText("");
				i=0;
			}
			m=t.getText();
			t.setText(m+"9");
		}
	});
	b0.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(i==1){
				m=t.getText();
				t.setText("");
				i=0;
			}
			m=t.getText();
			t.setText(m+"0");
		}
	});
	ba.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(x==0){
				x=x+Float.parseFloat(t.getText());
				t.setText("");
				t1=i=1;
				t2=t3=t4=0;
			}else{
				x=x+Float.parseFloat(t.getText());
				s=String.valueOf(x);
				t.setText(s);
				t1=i=1;
				t2=t3=t4=0;
			}
		}
	});
	bs.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(x==0){
				x=x+Float.parseFloat(t.getText());
				t.setText("");
				t2=i=1;
				t1=t3=t4=0;
			}else{
				x=x-Float.parseFloat(t.getText());
				s=String.valueOf(x);
				t.setText(s);
				t2=i=1;
				t1=t3=t4=0;
			}
		}
	});
	bm.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(x==0){
				x=x+Float.parseFloat(t.getText());
				t.setText("");
				t3=i=1;
				t1=t2=t4=0;
			}else{
				x=x*Float.parseFloat(t.getText());
				s=String.valueOf(x);
				t.setText(s);
				t3=i=1;
				t1=t2=t4=0;
			}
		}
	});
	bd.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(x==0){
				x=x+Float.parseFloat(t.getText());
				t.setText("");
				t1=t2=t3=0;
				t4=i=1;
			}else{
				x=x/Float.parseFloat(t.getText());
				s=String.valueOf(x);
				t.setText(s);
				t1=t2=t3=0;
				t4=i=1;
			}
		}
	});
	be.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			y=Float.parseFloat(t.getText());
			if(t1==1){
				r=x+y;
			}
			if(t2==1){
				r=x-y;
			}
			if(t3==1){
				r=x*y;
			}
			if(t4==1){
				r=x/y;
			}
			s=String.valueOf(r);
			t.setText(s);
			x=y=r=0;
			t1=t2=t3=t4=i=0;
			s="";
		}
	});
	bc.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			t.setText("");
			s="";
			x=y=r=0;
			t1=t2=t3=t4=i=0;
		}
	});
}
}