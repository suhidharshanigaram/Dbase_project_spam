import javax.swing.*;
class LoginUI
{
	JTextField tf1,tf2;
	JLabel l1,l2;
	JPanel p;
	
	public LoginUI()
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
		
		
		l1 = new JLabel("Username:  ");
		l1.setBounds(100,20,100,30);
		
		l2 = new JLabel("Password :  ");
		l2.setBounds(100,80,100,30);
		
		
		p = new JPanel(null);
		p.setBounds(0,0,600,400);
	}
	
	void addComponents()
	{
		p.add(l1);
		p.add(tf1);
		p.add(l2);
		p.add(tf2);
		
	}
}
