package appLayer;

public class User {

    public boolean isValidUserCredentials(String sUsername, String sUserPassword){

        if(sUsername.equals("luis@luis.dk") && sUserPassword.equals("test123")){
            return true;
        }
        return false;
    }
}
