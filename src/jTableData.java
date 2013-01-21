import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class jTableData extends JFrame{

//This Vector Of A String Vector will be used to hold data from 
// database table to display in JTable.
static Vector<Vector<String>> data=new Vector<Vector<String>>();
static JTable table = new JTable();
public jTableData()
{

    super("JTabe with MySql Database");

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel topPanel=new JPanel();

    javax.swing.JButton button1=new javax.swing.JButton("Back");
    button1.setPreferredSize(new Dimension(200,30));


     javax.swing.JButton button2=new javax.swing.JButton("Edit");
     button2.setPreferredSize(new Dimension(200,30));


    topPanel.add(button1);
    button1.addActionListener(new java.awt.event.ActionListener() {
        @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }

        });
    topPanel.add(button2);
    button2.addActionListener(new java.awt.event.ActionListener() {
        @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }

        });

    getContentPane().add(topPanel,BorderLayout.NORTH);

    Vector<String> headers=new Vector<String>();

    headers.add("id");
    headers.add("Author Name");
    headers.add("Book Name");
    headers.add("ISBN Number");
    headers.add("Quantity");
    headers.add("Available");
    
    getData();
    
    //this is the model which contain actual body of JTable
    DefaultTableModel model = new DefaultTableModel(data, headers);
    table=new JTable(model);
    table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    header_size();
    JScrollPane scroll = new JScrollPane(table);
    scroll.setHorizontalScrollBarPolicy(
    JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    scroll.setVerticalScrollBarPolicy(
    JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    getContentPane().add(scroll,BorderLayout.SOUTH);
    pack();
    setResizable(false);
    setVisible(true);
}
//button1 is a back button
private void button1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
        this.dispose();
    }
//button2 is update button
private void button2ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new updateWindow().setVisible(true);
            }
        });
        this.dispose();
    } 

/**
* Setting the particular Column Size in JTable
*/
public static void header_size() {
        TableColumn column = table.getColumnModel().getColumn(0);
        column.setPreferredWidth(60);

        column = table.getColumnModel().getColumn(1);
        column.setPreferredWidth(95);
        
        column = table.getColumnModel().getColumn(2);
        column.setPreferredWidth(95);
        
        column = table.getColumnModel().getColumn(3);
        column.setPreferredWidth(95);

        column = table.getColumnModel().getColumn(4);
        column.setPreferredWidth(95);

        column = table.getColumnModel().getColumn(5);
        column.setPreferredWidth(95);
}
/**
* Fetching Data From MySql Database 
* and storing in a Vector of a Vector
* to Display in JTable
*/
private static void getData()
{
// Enter Your MySQL Database Table name in below Select Query.
    String str="select * from displaytable";
    Connection cn;
    ResultSet rs;
    Statement st;
    data.clear();
    try {
// Change the database name, hosty name, 
// port and password as per MySQL installed in your PC.

        cn=DriverManager.getConnection("jdbc:mysql://" +
        "localhost:3306/bird_db","root","sadi");

        st=cn.createStatement();
        rs=st.executeQuery(str);

        while(rs.next())
        {
            Vector <String> d=new Vector<String>();
            d.add(rs.getString("id"));
            d.add(rs.getString("Author_Name"));
            d.add(rs.getString("Book_Name"));
            d.add(rs.getString("ISBN_Number"));
            d.add(rs.getString("Qunatity"));
            d.add(rs.getString("Available"));
            d.add("\n\n\n\n\n\n\n");
            data.add(d);
          }
         } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new jTableData();
    }

}

