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



}
