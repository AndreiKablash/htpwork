package com.htp.tasks.task9.util;

public class User {
    public static void main(String[] args) throws Exception {
        Validator v=new Validator();
        Validator[] validators = new Validator[3];
        validators[0]=new Validator("111", "12r","arrut.tu","RogatKa22", "33rirkfr11");
        validators[1]=new Validator("Sergei", "16","arrut@gmail.com","Artur11", "r23r42");
        validators[2]=new Validator("q", "23r","v.egorov@mail.ru","Aurt", "aeryt");
        Validator.CheckUser(validators);
    }
}
