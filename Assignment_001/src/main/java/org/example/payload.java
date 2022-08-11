package org.example;

public class payload {

    variables v = new variables();

    void Set_Create_User(String name, String job)
    {



    }

    void Set_Update_User()
    {


    }

    void Set_Patch_Update_User()
    {


    }

    void Set_Register_User(){



    }

    void Set_Register_User_Unsuccess(){


    }


    void Set_Login_User_Success(){


    }

    void Set_Login_User_UnSuccessfull(){


    }



    public String Create_User()
    {
        String store = v.name;

        return "{\n" +
                "    \"name\": \" " + v.name + "\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
    }


    public String Update_User()
    {
        return "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";
    }


    public String Patch_Update_User(){
        return "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";

    }

    public String Register_User() {
        return "{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"pistol\"\n" +
                "}";

    }

    public String Register_User_Unsuccess() {
        return "{\n" +
                "    \"email\": \"sydney@fife\"\n" +
                "}";
    }

    public String Login_User_Success(){
      return "{\n" +
              "    \"email\": \"eve.holt@reqres.in\",\n" +
              "    \"password\": \"pistol\"\n" +
              "}";
    }

    public String Login_User_UnSuccessfull() {
        return "{\n" +
                "    \"email\": \"peter@klaven\"\n" +
                "}";
    }












}
