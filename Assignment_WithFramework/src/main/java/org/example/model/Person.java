package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "email",
        "first_name",
        "last_name",
        "avatar"


})

public class Person {

    @JsonProperty("id")
    private String id;
    @JsonProperty("email")
    private String email;
    @JsonProperty("first_name")
    private String first_name;
    @JsonProperty("last_name")
    private String last_name;
    @JsonProperty("avatar")
    private String avatar;

    @JsonIgnore
    private Map<String,Object> additionalProperties = new HashMap<>();

    @JsonProperty("id")
    public String get_id(){
        return id;
    }

    @JsonProperty("id")
    public void set_id(String id)
    {
        this.id = id;
    }

    @JsonProperty("email")
    public String get_email(){
        return email;
    }

    @JsonProperty("email")
    public void set_email(String email)
    {
        this.email = email;
    }


    @JsonProperty("first_name")
    public String get_first_name(){
        return first_name;
    }

    @JsonProperty("first_name")
    public void set_first_name(String first_name)
    {
        this.first_name = first_name;
    }

    @JsonProperty("last_name")
    public String get_last_name(){
        return last_name;
    }

    @JsonProperty("last_name")
    public void set_last_name(String last_name)
    {
        this.last_name = last_name;
    }


    @JsonProperty("avatar")
    public String get_avatar(){
        return avatar;
    }

    @JsonProperty("avatar")
    public void set_avatar(String avatar)
    {
        this.avatar = avatar;
    }

}
