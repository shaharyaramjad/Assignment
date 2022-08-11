package org.example.constants;

public class EndPoints {

    public static final String GET_LIST_USERS = "/api/users?page=2";
    public static final String GET_SINGLE_USER = "api/users/2";
    public static final String GET_SINGLE_USER_NOT_FOUND = "api/users/23";
    public static final String GET_LIST_RESOURCE = "/api/unknown";
    public static final String GET_SINGLE_RESOURCE = "/api/unknown/2";
    public static final String GET_SINGLE_RESOURCE_NOT_FOUND = "/api/unknown/23";



    public static final String POST_CREATE_USER = "/api/users";
    public static final String PUT_UPDATE_USER = "/api/users/2";
    public static final String PATCH_UPDATE_USER = "/api/users/2";
    public static final String DELETE_SINGLE_USER = "/api/users/2";

    public static final String POST_REGISTER_USER_SUCCESS = "/api/register";
    public static final String POST_REGISTER_USER_UN_SUCCESS = "/api/register";

    public static final String POST_LOGIN_USER_SUCCESS = "/api/login";
    public static final String POST_LOGIN_USER_UN_SUCCESS = "/api/login";

    public static final String GET_DELAYED_RESPONSE_USERS = "/api/users?delay=3";


}
