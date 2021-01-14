package libreria;

import java.sql.*;
public class MyDBConnection {
   
    private Connection myConnection;
    
    /** Creates a new instance of MyDBConnection */
    public MyDBConnection() {

    }

    public void init(){
    
       try{
        this.myConnection=DriverManager.getConnection(
                "jdbc:mysql://localhost/tienda","root", ""
                );
        }
        catch(Exception e){
            System.out.println("Failed to get connection");
            e.printStackTrace();
        }
    }
    
    
    public Connection getMyConnection(){
        return this.myConnection;
    }
    
    public Statement getStatement() throws SQLException{
        Statement statement = myConnection.createStatement(); 
        return statement; 
    }
    
    
    public void close(ResultSet rs){
        
        if(rs !=null){
            try{
               rs.close();
            }
            catch(Exception e){}
        
        }
    }
    
     public void close(java.sql.Statement stmt){
        
        if(stmt !=null){
            try{
               stmt.close();
            }
            catch(Exception e){}
        
        }
    }
     
  public void destroy(){
  
    if(myConnection !=null){
    
         try{
               myConnection.close();
            }
            catch(Exception e){}
        
        
    }
  }
    
}