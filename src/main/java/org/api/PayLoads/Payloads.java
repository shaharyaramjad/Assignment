package org.api.PayLoads;


import org.api.Variables.Variables;

public class Payloads {
    Variables v = new Variables();
    String store = v.name;


    public String Create_User()
    {


        return "{\n" +
                "    \"name\": \" " + v.name + "\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
    }


    public String Update_User()
    {
        return "{\n" +
                "    \"name\": \""+ store +"\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";
    }


    public String Patch_Update_User(){
        return "{\n" +
                "    \"name\": \""+ store +"\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";

    }

    public String Register_User() {
        return "{\n" +
                "    \"email\": \""+ v.email+"\",\n" +
                "    \"password\": \""+v.password+"\"\n" +
                "}";

    }

    public String Register_User_Unsuccess() {
        return "{\n" +
                "    \"email\": \""+v.email+"\"\n" +
                "}";
    }

    public String Login_User_Success(){
        return "{\n" +
                "    \"email\": \""+v.email+"\",\n" +
                "    \"password\": \""+v.password+"\"\n" +
                "}";
    }

    public String Login_User_UnSuccessfull() {
        return "{\n" +
                "    \"email\": \""+v.email+"\"\n" +
                "}";
    }










}
