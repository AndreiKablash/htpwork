package com.htp.tasks.task9.util;

import com.htp.tasks.task9.domain.EmailFormatException;
import com.htp.tasks.task9.domain.MyFirstException;
import com.htp.tasks.task9.domain.MySecondException;

public class Validator {
    private static final int MAX_LENGTH_FOR_FIELD = 30;
    private static final int MIN_LENGTH_FOR_FIELD = 2;
    private static final int AGE_LIMIT = 16;
    private static final String EMAIL_SYMBOL ="@";
    private String userName;
    private String userAge;
    private String userEmail;
    private String userLogin;
    private String UserPassword;

    public Validator() {
    }

    public Validator(String userName, String userAge, String userEmail, String userLogin, String userPassword) {
        this.userName = userName;
        this.userAge = userAge;
        this.userEmail = userEmail;
        this.userLogin = userLogin;
        UserPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public static void CheckUser(Validator[] array) throws Exception{
            for(Validator v: array) {
                try{
                    if (v.getUserName().length()<MIN_LENGTH_FOR_FIELD
                            || v.getUserName().length()>MAX_LENGTH_FOR_FIELD){
                    throw new MyFirstException(v.getUserName());
                    }
                } catch(MyFirstException e) {
                    v.setUserName(e + "");
                }

                try{
                    if(Integer.parseInt(v.getUserAge())<AGE_LIMIT){
                        throw new MySecondException();
                        }
                }catch(NumberFormatException e ){
                    v.setUserAge("Invalid number format for field age: '" + v.getUserAge()+".'");
                }catch(MySecondException e){
                    v.setUserAge(e+"");
                }

                try{
                    if(!v.getUserEmail().contains(EMAIL_SYMBOL)) {
                        throw new EmailFormatException(v.getUserEmail());
                        }
                    }catch(EmailFormatException e){
                        v.setUserEmail(e+"");
                    }
                System.out.println(v);
            }
    }

    @Override
    public String toString() {
        return "New user registration form:\n" +
                "Name:'" + userName +'\''+ '\n' +
                "Age:'" + userAge +'\''+'\n'+
                "Email:'" + userEmail +'\''+ '\n' +
                "Login:'" + userLogin + '\''+'\n' +
                "Password:'" + UserPassword +'\''+ ".";
    }
}
