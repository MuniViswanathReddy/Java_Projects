package com.rest.resource;


import com.sun.net.httpserver.Authenticator;
import modal.AccountInfo;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;


@Path("/sbi/accounts")
public class AccountsResource {
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

   /* @GET
    public String getBalance(@MatrixParam("account-no") String accountNo) {
    return "balance : "+123456+"  accountNo : "+accountNo;
    }*/

    @GET
    public String getBalnce(@CookieParam("mobile-no") String mobileNo,@CookieParam("account-no") String accountNo){
        return "AccountNo : "+accountNo+" and MobileNo : "+mobileNo;
    }

    @POST
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public String createAccount(AccountInfo accountInfo){

        return accountInfo.toString();
    }

    @PUT
    @Path("{account-no}")
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public AccountInfo UpdateAccount(@PathParam("account-no") String accountNo, AccountInfo accountInfo) {
        return new AccountInfo(accountInfo.getAccountHolderName(),accountInfo.getAccountType(),accountInfo.getBankName(),accountInfo.getPhoneNo(),accountInfo.getBalance());
    }

    @DELETE
    @Path("{account-no}")
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public String  deleteAccount(@PathParam("account-no") String accountNo,AccountInfo accountInfo){
        return "Successfully deleted  "+accountInfo.getAccountHolderName()+" Sbi account ,accountNo :"+accountNo;
    }
}
