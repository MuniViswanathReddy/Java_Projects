package com.hl.app;


import jakarta.ws.rs.*;


@Path("/sbi/accounts/{mobile-no}/balance")
public class Accounts {
  /*  @GET
    public  String getBalance(@QueryParam("account-no") String accountNo){
        return "balance :  "+12346+"  AccountNo : "+accountNo;
    }*/

   /* @GET
    public String getBalance(@HeaderParam("account-no") String accountNo) {
        return "balance :  "+12345+"  AccountNo : "+accountNo;
    }*/

/*    @GET
    public String getBalance(@HeaderParam("account-no") String account) {
        return "balance : " + 12345+"  Account : " + account;
    }
    @GET
    @Path("/mobile")
    public String getBalance(@HeaderParam("account-no")String account, @QueryParam("mobile-no")String mobileNo){
        return "balance : " + 12345+"  Account : " + account+" MobileNo : " + mobileNo;
    }*/

   /* @GET
    public String getBalance(@PathParam("mobile-no") String mobileNo,@MatrixParam("account-no")String accountNo){
        return "balance : "+123456+" Mobile_no : "+mobileNo +" Account_no : "+accountNo;
    }*/

    @GET
    public String getBalance(@MatrixParam("account-no") String accountNo) {
    return "balance : "+123456+"  accountNo : "+accountNo;
    }
}
