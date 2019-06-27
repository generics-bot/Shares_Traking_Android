package com.example.shares_traking_android.network;

import android.util.Log;

import com.example.shares_traking_android.model.Share;
import com.example.shares_traking_android.model.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Response;

public class ResponseHandler {

    // FIELDS

    private static Gson gson = new GsonBuilder().create();

    // INTERFACE IMPLEMENTATIONS WITH GETTERS

    private static CallBackAPI toRegisterUser = new CallBackAPI() {
        @Override
        public void onResponse(Response response) {
            Resources.setCurrentUser(gson.fromJson(response.body().toString(), User.class));
            // TODO
        }

        @Override
        public void onFailure(Throwable t) {
            Resources.setCurrentUser(null);
            Log.d("HANDLER - ", "ONFAILURE", t);
        }
    };

    public static CallBackAPI getToRegisterUser() { return toRegisterUser; }

    //////////////////////////////////////////

    private static CallBackAPI toLoginUser = new CallBackAPI() {
        @Override
        public void onResponse(Response response) {
            Resources.setCurrentUser(gson.fromJson(response.body().toString(), User.class));
            // TODO
        }

        @Override
        public void onFailure(Throwable t) {
            Resources.setCurrentUser(null);
            Log.d("HANDLER - ", "ONFAILURE", t);
        }
    };

    public static CallBackAPI getToLoginUser() { return toLoginUser; }

    //////////////////////////////////////////

    private static CallBackAPI toUpdateUser = new CallBackAPI() {
        @Override
        public void onResponse(Response response) {
            Resources.setChecker(true);
            // TODO
        }

        @Override
        public void onFailure(Throwable t) {
            Resources.setChecker(false);
            Log.d("HANDLER - ", "ONFAILURE", t);
        }
    };

    public static CallBackAPI getToUpdateUser() { return toUpdateUser; }

    //////////////////////////////////////////

    private static CallBackAPI toDeleteUser = new CallBackAPI() {
        @Override
        public void onResponse(Response response) {
            Resources.setChecker(true);
            // TODO
        }

        @Override
        public void onFailure(Throwable t) {
            Resources.setChecker(false);
            Log.d("HANDLER - ", "ONFAILURE", t);
        }
    };

    public static CallBackAPI getToDeleteUser() { return toDeleteUser; }

    //////////////////////////////////////////

    private static CallBackAPI toGetShares = new CallBackAPI() {
        @Override
        public void onResponse(Response response) {
            Resources.setShares(gson.fromJson(response.body().toString(), Share[].class));
            Resources.setChecker(true);
            // TODO
        }

        @Override
        public void onFailure(Throwable t) {
            Resources.setShares(null);
            Resources.setChecker(false);
            Log.d("HANDLER - ", "ONFAILURE", t);
        }
    };

    public static CallBackAPI getToGetShares() { return toGetShares; }

    //////////////////////////////////////////

    private static CallBackAPI toGetCompanies = new CallBackAPI() {
        @Override
        public void onResponse(Response response) {

        }

        @Override
        public void onFailure(Throwable t) {

        }
    };

    public static CallBackAPI getToGetCompanies() { return toGetCompanies; }

    //////////////////////////////////////////


}