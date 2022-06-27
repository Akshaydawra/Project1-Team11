
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DB {
          public static void main(String[] args)
    {
        try{
                Class.forName("org.gjt.mm.mysql.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1","root","");
                PreparedStatement stmt;
                stmt=con.prepareStatement("Create Database hospital_mg");
                stmt.executeUpdate();
                stmt=con.prepareStatement("use hospital_mg");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table users(ulogin varchar(20),upass varchar(20),utype varchar(20))");
                stmt.executeUpdate();
                stmt=con.prepareStatement("insert into users values('admin','admin123','admin')");
                stmt.executeUpdate();
                 stmt=con.prepareStatement("Create Table room(room_no varchar(20),Room_type varchar(30),Price int)");
               stmt.executeUpdate();
               stmt=con.prepareStatement("Create Table patient(patient_id varchar(20),name varchar(20),Gender varchar(10),age int,contact_no varchar(10),Address varchar(100),Disease varchar(50),doctorname varchar(20))");
                stmt.executeUpdate();
                 stmt=con.prepareStatement("Create Table room_Allocation(allocation_id varchar(10),patient_id varchar(10),name varchar(20),phone varchar(10),disease varchar(50),room_type varchar(20),room_no varchar(20),price int,date date)");
               stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table bill(billId varchar(15),patient_id varchar(10),room_no varchar(20),days int,Price int)");
                stmt.executeUpdate();
                System.out.println("Done");
        }catch(Exception ee)
        {
            System.out.println(ee);
        }
    }
}
