package orm;
// Generated Jan 5, 2022 8:39:30 PM by Hibernate Tools 4.3.1



/**
 * UserState generated by hbm2java
 */
public class UserState  implements java.io.Serializable {


     private int id;
     private int userRegistationId;
     private String state;

    public UserState() {
    }

	
    public UserState(int id, int userRegistationId) {
        this.id = id;
        this.userRegistationId = userRegistationId;
    }
    public UserState(int id, int userRegistationId, String state) {
       this.id = id;
       this.userRegistationId = userRegistationId;
       this.state = state;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getUserRegistationId() {
        return this.userRegistationId;
    }
    
    public void setUserRegistationId(int userRegistationId) {
        this.userRegistationId = userRegistationId;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }




}

