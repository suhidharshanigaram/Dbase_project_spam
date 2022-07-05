import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MainUI extends JFrame implements ActionListener
{
	UserUI ob1;
	LoginUI ob2;
	MessageUI ob3;
	SpamUI ob4;
	ResolveUI ob5;
	
	JButton submit,modify,delete,m1,m2,m3,m4,m5;
	JPanel p1,p2,p3,p4,p5,pb;
	JMenuBar mb;
	
	public MainUI()
	{
		setSize(600,550);
		setLayout(null);
		setVisible(true);
		setTitle("DBASE PROJECT SPAM");
		
		ob1 = new UserUI();
		ob2 = new LoginUI();
		ob3 = new MessageUI();
		ob4 = new SpamUI();
		ob5 = new ResolveUI();
		
		createPanels();
		createMenu();	
		createButtons();
		addComponents();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void createPanels()
	{
		p1 = ob1.p;
		p2 = ob2.p;
		p3 = ob3.p;
		p4 = ob4.p;
        p5 = ob5.p;		
		
		pb = new JPanel(new FlowLayout(FlowLayout.CENTER,50,0));
		pb.setBounds(0,400,600,150);
	}
	
	void createMenu()
	{
		mb = new JMenuBar();
		
		m1 = new JButton("User");
		m1.setFocusable(false);
		
		m2 = new JButton("Login");
		m2.setFocusable(false);
		
		
		m3 = new JButton("Message");
		m3.setFocusable(false);
		
		m4 = new JButton("Spam");
		m4.setFocusable(false);
		
		
		m5 = new JButton("Resolve");
		m5.setFocusable(false);
		
		
		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		m4.addActionListener(this);
		m5.addActionListener(this);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		mb.add(m5);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		remove(p1);
		remove(p2);
		remove(p3);
		remove(p4);
		remove(p5);
		
		if(e.getSource()==m1)
			add(p1);
		
		else if(e.getSource()==m2)
			add(p2);
		else if(e.getSource()==m3)
			add(p3);
		
		
		else if(e.getSource()==m4)
			add(p4);
		
		else
			add(p5);
		
	}
	
	void createButtons()
	{
		submit = new JButton("Submit");
		submit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(new JFrame(),"Successfully Inserted!","NOTICE",JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		
		
		modify = new JButton("Modify");
		modify.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(new JFrame(),"Successfully Modified!","NOTICE",JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		
		
		delete = new JButton("Delete");
		delete.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(new JFrame(),"Successfully Deleted!","NOTICE",JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		
		pb.add(submit);
		pb.add(modify);
		pb.add(delete);
	}
	
	void addComponents()
	{
		add(p1);
		add(pb);
		setJMenuBar(mb);
	}
	
	public static void main(String a[])
	{
		new MainUI();
	}
}
