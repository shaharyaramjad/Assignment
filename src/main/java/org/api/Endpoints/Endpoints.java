package org.api.Endpoints;

import org.api.Variables.Variables;

public class Endpoints {
    Variables v = new Variables();
    public final String Get_List_Users = "/api/users?page=2";
    public final String Get_Single_User = "api/users/"+v.id;

    public final String POST_Create_User = "/api/users";
    public final String PUT_Update_User = "/api/users/"+v.id;


    public final String Delete_Single_User = "/api/users/"+v.id;

}
