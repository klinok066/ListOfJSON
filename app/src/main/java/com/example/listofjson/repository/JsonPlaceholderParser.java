package com.example.listofjson.repository;

import com.example.listofjson.domain.Address;
import com.example.listofjson.domain.Company;
import com.example.listofjson.domain.Geo;
import com.example.listofjson.domain.User;

import org.json.JSONArray;

import org.json.JSONException;

import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonPlaceholderParser {

    JsonPlaceholderRepository repository = new JsonPlaceholderRepository();

    List<User> userArray = new ArrayList<>();

//    public User getUser(int index) throws IOException, JSONException {
//
//        String rawUserJson = repository.getRawJson("/users/" + index);
//        JSONObject userRootJson = new JSONObject(rawUserJson);
//        JSONObject addressJson = userRootJson.getJSONObject("address");
//        JSONObject geoJson = addressJson.getJSONObject("geo");
//        JSONObject companyJson = userRootJson.getJSONObject("company");
//
//
//        int id = userRootJson.getInt("id");
//        String name = userRootJson.getString("name");
//        String userName = userRootJson.getString("username");
//        String email = userRootJson.getString("email");
//        String phone = userRootJson.getString("phone");
//        String website = userRootJson.getString("website");
//
//
//        String addressStreet = addressJson.getString("street");
//        String addressSuite = addressJson.getString("suite");
//        String addressCity = addressJson.getString("city");
//        String addressZipcode = addressJson.getString("zipcode");
//
//
//        double geoLat = geoJson.getDouble("lat");
//        double geoLng = geoJson.getDouble("lng");
//
//
//        String companyName = companyJson.getString("name");
//        String companyCatchPhrase = companyJson.getString("catchPhrase");
//        String companyBs = companyJson.getString("bs");
//
//
//        Geo geo = new Geo(geoLat, geoLng);
//        Address address = new Address(addressStreet, addressSuite, addressCity, addressZipcode, geo);
//        Company company = new Company(companyName, companyCatchPhrase, companyBs);
//
//        return new User(id, name, userName, email, address, phone, website, company);
//    }

    public ArrayList getUserArray() throws IOException, JSONException {

        String rawUserJson = repository.getRawJson("/users");
        JSONArray userRootJsonArray = new JSONArray(rawUserJson);

        for (int i = 0; i < userRootJsonArray.length(); i++) {

            JSONObject userRootJson = userRootJsonArray.getJSONObject(i);
            JSONObject addressJson = userRootJson.getJSONObject("address");
            JSONObject geoJson = addressJson.getJSONObject("geo");
            JSONObject companyJson = userRootJson.getJSONObject("company");


            int id = userRootJson.getInt("id");
            String name = userRootJson.getString("name");
            String userName = userRootJson.getString("username");
            String email = userRootJson.getString("email");
            String phone = userRootJson.getString("phone");
            String website = userRootJson.getString("website");


            String addressStreet = addressJson.getString("street");
            String addressSuite = addressJson.getString("suite");
            String addressCity = addressJson.getString("city");
            String addressZipcode = addressJson.getString("zipcode");


            double geoLat = geoJson.getDouble("lat");
            double geoLng = geoJson.getDouble("lng");

            String companyName = companyJson.getString("name");
            String companyCatchPhrase = companyJson.getString("catchPhrase");
            String companyBs = companyJson.getString("bs");


            Geo geo = new Geo(geoLat, geoLng);
            Address address = new Address(addressStreet, addressSuite, addressCity, addressZipcode, geo);
            Company company = new Company(companyName, companyCatchPhrase, companyBs);

           userArray.add(new User(id, name, userName, email, address, phone, website, company));
        }
        return (ArrayList) userArray;
    }
}