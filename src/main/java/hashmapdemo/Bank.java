package hashmapdemo;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
class Bank
{
	private static final String username="root";
    private static final String password="root";
    private static final String dataConn = "jdbc:mysql://localhost:3306/companydata";
    Connection sqlConn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
	public void login()
	{
		String loginname,loginpassword;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you Username");
		loginname=sc.nextLine();
		System.out.println("Enter Your Password");
		loginpassword=sc.nextLine();
		System.out.print("Welcome ="+loginname);
		System.out.println("Login Successfully");
		
		try
        {
          Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
          
        }
        catch(ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (SQLException ex) 
        {
                java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }   
		
		
		
	}
	public void signup()
	{
		try {
			String username,password,address,email;
			int phone;
			Scanner sc=new Scanner(System.in);
			 Class.forName("com.mysql.jdbc.Driver");
             
	          sqlConn = DriverManager.getConnection(dataConn,username,password);
	          pst=sqlConn.prepareStatement("insert into companydata(loginname, email,contact,address,password) values(?,?,?,?,?)"); 
	          pst.setString(1,loginname.getText());
	          pst.setString(2,email.getText());
	          pst.setString(3,contact.getText());
	          pst.setString(4,address.getText());
	          pst.setString(5,password.getText());
	        
		
		
		System.out.println("Enter you Username");
		username=sc.nextLine();
		System.out.println("Enter you Email");
		email=sc.nextLine();
		System.out.println("Enter you Address");
		address=sc.nextLine();
		System.out.println("Enter Your Password");
		password=sc.nextLine();
		System.out.println("Enter you Phone Number=");
		phone=sc.nextInt();
		pst = sqlConn.prepareStatement(insert into signup vlaues loginname=?,email=?,address=?,password=?, phone=?);
		pst.setString(1, companyName);
		pst.setString(2, address);
		pst.setInt(3, totalEmployee);
		pst.setString(4, webSite);
		}
		catch()
		{
		}
		}
		try
        {
          Class.forName("com.mysql.jdbc.Driver");
                  
          sqlConn = DriverManager.getConnection(dataConn,username,password);
          pst=sqlConn.prepareStatement("insert into companydata(companyid, name,address,gst,mobile,state,district) values(?,?,?,?,?,?,?)"); 
          txtcompanyid.requestFocus();
          pst.setString(1,txtcompanyid.getText());
          pst.setString(2,txt_companyname.getText());
          pst.setString(3,txtarea_address.getText());
          pst.setString(4,txt_mobile_No.getText());
          pst.setString(5,txt_gstNo.getText());
          pst.setString(6,(String)m_lst_state.getSelectedItem());
          pst.setString(7,(String)m_lst_district.getSelectedItem());
          
          pst.executeUpdate();
          JOptionPane.showMessageDialog(this,"Company Details Added Successfully");
          updateDB();
          
         }
		
		
	}
	public void passbook()
	{
		
	}
	public void account()
	{
		
	}
	public void withdraw()
	{
		
	}
	public void transfer()
	{
		
	}
	public void view_Passbook()
	{
		
	}
	
	
	
	public static void main(String []args)
	{
		Bank b=new Bank();
		b.login();
		b.signup();
	}
}