import javax.swing.*;

class SpamUI
{
	JTextField tf1,tf2,tf3;
	JLabel l1,l2,l3;
	JPanel p;
	
	public SpamUI()
	{
		createComponents();
		addComponents();
	}
	
	void createComponents()
	{
		tf1 = new JTextField();
		tf1.setBounds(250,20,200,30);
		
		tf2 = new JTextField();
		tf2.setBounds(250,80,200,30);
		
		tf3 = new JTextField();
		tf3.setBounds(250,140,200,30);
		
		
		l1 = new JLabel("Type of spam :  ");
		l1.setBounds(100,20,100,30);
		
		l2 = new JLabel("IS SPAM(Y/N):  ");
		l2.setBounds(100,80,100,30);
		
		l3 = new JLabel("ResolveID:  ");
		l3.setBounds(100,140,100,30);
		
		
		p = new JPanel(null);
		p.setBounds(0,0,600,400);
	}
	
	void addComponents()
	{
		p.add(l1);
		p.add(tf1);
		p.add(l2);
		p.add(tf2);
		p.add(l3);
		p.add(tf3);
		
		//add(p1);
	}
}
