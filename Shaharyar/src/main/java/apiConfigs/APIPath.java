package apiConfigs;

public class APIPath {
    public static  final  class apiPath{
        public static final String Get_List_Users = "api/users?page=2";
        public static final String Get_Single_User = "api/users/2";
        public static final String Get_Single_User_Not_Found = "api/users/23";
        public static final String Get_List_Resource ="/api/unknown";
        public static final String Get_Single_Resource = "/api/unknown/2";
        public static final String Get_Single_Resource_Not_Found ="/api/unknown/23";

        public static final String POST_Create_User = "/api/users";
        public static final String PUT_Update_User = "/api/users/2";
        public static final String Patch_Update_User = "/api/users/2";

        public static final String Delete_Single_User = "/api/users/2";
        public static final String Post_Register_User_Success_full = "/api/register";
        public static final String Post_Register_User_Un_Success_full = "/api/register";
        public static final String Post_Login_User_Success_full = "/api/login";
        public static final String Post_Login_User_Un_Success_full = "/api/login";
        public static final String Get_Delayed_Response_Users = "/api/users?delay=3";








    }

    public static void main(String[] args){
        System.out.println(apiPath.Get_List_Users);
    }
}
