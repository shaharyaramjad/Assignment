package org.example;

public class endpoints {

    variables v = new variables();





    public String Get_List_Users = "api/users?page=" + v.page;
    public String Get_Single_User = "api/users/" + v.id;
    public String Get_Single_User_Not_Found = "api/users/23";
    public String Get_List_Resource ="/api/unknown";
    public String Get_Single_Resource = "/api/unknown/" + v.resource;
    public String Get_Single_Resource_Not_Found ="/api/unknown/23";

    public String POST_Create_User = "/api/users";
    public String PUT_Update_User = "/api/users/2";
    public String Patch_Update_User = "/api/users/2";

    public String Delete_Single_User = "/api/users/2";
    public String Post_Register_User_Successfull = "/api/register";
    public String Post_Register_User_UnSuccessfull = "/api/register";
    public String Post_Login_User_Successfull = "/api/login";
    public String Post_Login_User_UnSuccessfull = "/api/login";
    public String Get_Delayed_Response_Users = "/api/users?delay=3";




}
