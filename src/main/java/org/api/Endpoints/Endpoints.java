package org.api.Endpoints;

import org.api.Variables.Variables;

public class Endpoints {
    Variables v = new Variables();
    public String Get_List_Users = "api/users?page=2";
    public String Get_Single_User = "api/users/"+v.id;
    public String Get_Single_User_Not_Found = "api/users/23";
    public String Get_List_Resource ="/api/unknown";
    public String Get_Single_Resource = "/api/unknown/"+v.id;
    public String Get_Single_Resource_Not_Found ="/api/unknown/23";

    public String POST_Create_User = "/api/users";
    public String PUT_Update_User = "/api/users/"+v.id;
    public String Patch_Update_User = "/api/users/"+v.id;

    public String Delete_Single_User = "/api/users/"+v.id;
    public String Post_Register_User_Success_full = "/api/register";
    public String Post_Register_User_Un_Success_full = "/api/register";
    public String Post_Login_User_Success_full = "/api/login";
    public String Post_Login_User_Un_Success_full = "/api/login";
    public String Get_Delayed_Response_Users = "/api/users?delay=3";
}
