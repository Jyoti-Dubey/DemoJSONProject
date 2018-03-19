package com.jyoti.demojsonproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created By : Jyoti on 29 Jan 2018 (Monday)
 * Functionality : This class will show JSON Example
 * Nevigation :
 */
public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";

    public TextView txtParseData;

    private String json1 = "\n" +
            "{\n" +
            "  \"id\": 1,\n" +
            "  \"ip_address\": \"68.237.226.148\"\n" +
            "}";

    private String json2 = "{\n" +
            "  \"invoiceID\": \"171125-PEH-71919\",\n" +
            "  \"date\": \"November 25, 2017 3:06 AM\",\n" +
            "  \"itemsPurchased\": 7,\n" +
            "  \"items\": \"avocado,bread,milk,avocado,poptarts,butter,avocado\",\n" +
            "  \"card\": \"4539-1657-0706-1191\",\n" +
            "  \"total\": \"$12.98\"\n" +
            "}";

    private String json3 = "[{\n" +
            "  \"ip_address\": \"21.60.171.165\",\n" +
            "  \"app_name\": \"Zamit\"\n" +
            "}]";

    private String parse3data = "", final3parse = "";

    private String json4 = "[{\n" +
            "  \"animal_id\": \"875f2504-6987-4b07-803e-34d66c2ccb89\",\n" +
            "  \"animal_name\": \"Physignathus cocincinus\"\n" +
            "}, {\n" +
            "  \"animal_id\": \"a29d6990-f89b-4ff3-b9bb-cb55e7a96f6e\",\n" +
            "  \"animal_name\": \"Threskionis aethiopicus\"\n" +
            "}, {\n" +
            "  \"animal_id\": \"f5c2e642-73d1-4b4b-83fe-b7888cf3bfc7\",\n" +
            "  \"animal_name\": \"Heloderma horridum\"\n" +
            "}]";

    private String parse4data = "", final4parse = "";

    private String json5 = "{\n" +
            "  \"id\": \"User\",\n" +
            "  \"type\": \"object\",\n" +
            "  \"properties\": {\n" +
            "    \"username\": {\n" +
            "      \"type\": \"string\",\n" +
            "      \"maxLength\": 30,\n" +
            "      \"pattern\": \"[a-z\\\\d~+-]+\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"required\": [\"username\"]\n" +
            "}\n";
    private String parse5data = "", parse5data55 = "", parse5data5 = "";

    private String json6 = "{\n" +
            "  \"kind\": \"youtube#searchListResponse\",\n" +
            "  \"etag\": \"\\\"m2yskBQFythfE4irbTIeOgYYfBU/PaiEDiVxOyCWelLPuuwa9LKz3Gk\\\"\",\n" +
            "  \"nextPageToken\": \"CAUQAA\",\n" +
            "  \"regionCode\": \"KE\",\n" +
            "  \"pageInfo\": {\n" +
            "    \"totalResults\": 4249,\n" +
            "    \"resultsPerPage\": 5\n" +
            "  }\n" +
            "}\n";

    private String parse6data = "", parse6data6 = "";

    private String json7 = "{\n" +
            "  \"checked\": false,\n" +
            "  \"dimensions\": {\n" +
            "    \"width\": 5,\n" +
            "    \"height\": 10\n" +
            "  },\n" +
            "  \"id\": 1,\n" +
            "  \"name\": \"A green door\",\n" +
            "  \"price\": 12.5,\n" +
            "  \"tags\": [\n" +
            "    \"home\",\n" +
            "    \"green\"\n" +
            "  ]\n" +
            "}";

    private String parse7data = "", parse7data7 = "", parse7data77 = "", parse7data777 = "";

    private String json8 = "{\n" +
            "  \"information\": \"data information\",\n" +
            "  \"dimensions\": {\n" +
            "    \"width\": 5,\n" +
            "    \"height\": 10,\n" +
            "\"depth\": 10\n" +
            "  }\n" +
            "}";

    private String parse8data = "", parse8data8 = "";

    private String json9 = "{\n" +
            "\n" +
            "  \"version\": 3.1,\n" +
            "\n" +
            "  \"demo\": true,\n" +
            "  \"person\": {\n" +
            "    \"id\": 12345,\n" +
            "    \"name\": \"John Doe\",\n" +
            "    \"phones\": {\n" +
            "      \"home\": \"800-123-4567\",\n" +
            "      \"mobile\": \"877-123-1234\"\n" +
            "    }\n" +
            "  }\n" +
            "}";

    private String parse9data = "", parse9data9 = "", parse9data99 = "";

    private String json10 = "[\n" +
            "  {\n" +
            "     \"modeName\": \"bus1\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"towards\": \"East Ham or Manor Park\",\n" +
            "    \"modeName\": \"bus2\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"lineId\": \"25\",\n" +
            "    \"modeName\": \"bus3\"\n" +
            "  }\n" +
            "]";

    private String parse10data = "", parse10data10 = "", parse10data1010 = "";

    private String json11 = "{\"rows\":[{\"Item\":2,\"Odd or Even\":\"number 2 is even\",\"Multiplication\":\n" +
            "[{ \"Value of 1\": 1 },\n" +
            "{ \"Value of 2\": 5 }]},\n" +
            "{\"Item\":5,\"Odd or Even\":\"number 5 is odd\"},{\"Item\":6,\"Odd or Even\":\"number 6 is even\"}]}";

    private String parse11data = "", parse11data11 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtParseData = findViewById(R.id.txtParseData);

        //parseJSON1();

        //parseJSON2();

        //parseJSON3();

        // parseJSON4();

        // parseJSON5();

        //parseJSON6();

        //parseJSON7();

        //parseJSON8();

        //parseJSON9();

        // parseJSON10();

        parseJSON11();

    }// end of onCreate

    private void parseJSON11() {
        txtParseData.setText("json");

        try {
            JSONObject jsonObject = new JSONObject(json11);

            JSONArray jsonArray = jsonObject.optJSONArray("rows");

            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject object = jsonArray.optJSONObject(i);

                if (object.optString("Item") != null && object.optString("Odd or Even") != null) {

                    parse11data += "Item :" + object.optString("Item") + "\n" +
                            "Odd or Even :" + object.optString("Odd or Even") + "\n";

                    Log.d(TAG, "parseJSON11: " + object.optString("Item") + "\n" + object.optString("Odd or Even"));

                    txtParseData.setText(parse11data + "\n------------------------------------------\n");

                    JSONArray array = object.optJSONArray("Multiplication");

                    for (int j = 0; j < array.length(); j++) {

                        parse11data11 += i + " :" + array.optString(i) + "\n";

                        Log.d(TAG, "parseJSON11: " + array.optString(i) + "\n" + array.optString(i));

                        txtParseData.append(parse11data11 + "\n------------------------------------------\n");
                    }
                }
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }//end of parseJSON11


    private void parseJSON10() {
        txtParseData.setText("json");

        try {
            JSONArray jsonArray = new JSONArray(json10);

            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject jsonObject = jsonArray.optJSONObject(i);

                if (jsonObject.optString("modeName") != null) {

                    parse10data = parse10data + "modeName :" + jsonObject.optString("modeName") + "\n";
                    Log.d(TAG, "parseJSON10: " + jsonObject.optString("modeName"));

                    txtParseData.append(parse10data + "\n-----------------------------\n");

                }

                if (jsonObject.opt("towards") != null) {

                    Log.d(TAG, "parseJSON10: " + jsonObject.optString("towards"));

                    parse10data10 = parse10data10 + "towards :" + jsonObject.opt("towards") + "\n" +
                            "modeName :" + jsonObject.opt("modeName") + "\n";

                    txtParseData.append(parse10data10 + "\n-----------------------------\n");
                }

                if (jsonObject.opt("lineId") != null) {

                    Log.d(TAG, "parseJSON10: " + jsonObject.optString("lineId"));

                    parse10data1010 = parse10data1010 + "lineId :" + jsonObject.opt("lineId") + "\n" +
                            "modeName :" + jsonObject.opt("modeName") + "\n";

                    txtParseData.append(parse10data1010 + "\n---------------------------\n");
                }
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }//end of parseJSON10

    private void parseJSON9() {
        txtParseData.setText("json");
        try {
            JSONObject jsonObject = new JSONObject(json9);

            parse9data = "version :" + jsonObject.optString("version") + "\n" +
                    "demo :" + jsonObject.optString("demo") + "\n";

            txtParseData.setText(parse9data + "\n-------------------------------------\n");

            JSONObject object = jsonObject.optJSONObject("person");

            parse9data9 = "id :" + object.optString("id") + "\n" +
                    "name :" + object.optString("name") + "\n";

            txtParseData.append(parse9data9 + "\n-------------------------------------\n");

            JSONObject object1 = object.optJSONObject("phones");

            parse9data99 = "home :" + object1.optString("home") + "\n" +
                    "mobile :" + object1.optString("mobile") + "\n";

            txtParseData.append(parse9data99 + "\n-------------------------------------\n");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }//end of parseJSON9

    private void parseJSON8() {
        txtParseData.setText("json");

        try {
            JSONObject jsonObject = new JSONObject(json8);

            parse8data = "information :" + jsonObject.optString("information") + "\n";

            txtParseData.setText(parse8data + "\n-------------------------------------\n");

            JSONObject object = jsonObject.optJSONObject("dimensions");

            parse8data8 = "width :" + object.optString("width") + "\n" +
                    "height :" + object.optString("height") + "\n" +
                    "depth :" + object.optString("depth") + "\n";

            txtParseData.append(parse8data8 + "\n-------------------------------------\n");

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }//end of parseJSON8

    private void parseJSON7() {
        txtParseData.setText("json");

        try {
            JSONObject jsonObject = new JSONObject(json7);

            parse7data = "checked :" + jsonObject.optString("checked") + "\n";

            txtParseData.setText(parse7data + "\n-------------------------------------\n");

            JSONObject object = jsonObject.optJSONObject("dimensions");

            parse7data7 = "width :" + object.optString("width") + "\n" +
                    "height :" + object.optString("height") + "\n";

            txtParseData.append(parse7data7 + "\n-------------------------------------\n");

            parse7data77 = "id :" + jsonObject.optString("id") + "\n" +
                    "name :" + jsonObject.optString("name") + "\n" +
                    "price :" + jsonObject.optString("price") + "\n";

            txtParseData.append(parse7data77 + "\n-------------------------------------\n");

            JSONArray jsonArray = jsonObject.getJSONArray("tags");

            for (int i = 0; i < jsonArray.length(); i++) {
                parse7data777 += i + " :" + jsonArray.optString(i) + "\n";
            }

            txtParseData.append(parse7data777 + "\n-------------------------------------\n");

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }//end of parseJSON7

    private void parseJSON6() {
        txtParseData.setText("json");

        try {
            JSONObject jsonObject = new JSONObject(json6);

            parse6data = "kind :" + jsonObject.optString("kind") + "\n" +
                    "etag :" + jsonObject.optString("etag") + "\n" +
                    "nextPageToken :" + jsonObject.optString("nextPageToken") + "\n" +
                    "regionCode :" + jsonObject.optString("regionCode") + "\n";

            txtParseData.setText(parse6data + "\n-------------------------------------\n");

            JSONObject object = jsonObject.optJSONObject("pageInfo");

            parse6data6 = "totalResults :" + object.optString("totalResults") + "\n" +
                    "resultsPerPage :" + object.optString("resultsPerPage") + "\n";

            txtParseData.append(parse6data6 + "\n-------------------------------------\n");


        } catch (JSONException e) {
            e.printStackTrace();
        }

    }//end of parseJSON6

    private void parseJSON5() {

        txtParseData.setText("json");
        try {
            JSONObject jsonObject = new JSONObject(json5);

            parse5data = "";
            parse5data5 = "";
            txtParseData.setText("json");

            parse5data = "id :" + jsonObject.optString("id") + "\n" +
                    "type :" + jsonObject.optString("type");

            txtParseData.setText(parse5data + "\n-------------------------------------\n");

            JSONObject object = jsonObject.optJSONObject("properties");

            JSONObject object1 = object.optJSONObject("username");

            parse5data5 = "type :" + object1.optString("type") + "\n" +
                    "maxLength :" + object1.optString("maxLength") + "\n" +
                    "pattern :" + object1.optString("pattern") + "\n";

            txtParseData.append(parse5data5 + "\n-------------------------------------\n");

            JSONArray jsonArray = jsonObject.getJSONArray("required");

            for (int i = 0; i < jsonArray.length(); i++) {
                parse5data55 = "0 :" + jsonArray.optString(i) + "\n";
            }

            txtParseData.append(parse5data55 + "\n-------------------------------------\n");

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }//end of parseJSON5

    private void parseJSON4() {

        txtParseData.setText("json");
        try {
            JSONArray jsonArray = new JSONArray(json4);
            final4parse = "";
            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject jsonObject = jsonArray.getJSONObject(i);

                parse4data = "animal_id :" + jsonObject.get("animal_id") + "\n" +
                        "animal_name :" + jsonObject.get("animal_name") + "\n";

                final4parse = final4parse + parse4data + "\n--------------\n";
                // final4parse  + = parse4data;

            }
            txtParseData.setText(final4parse);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }//end of parseJSON4

    private void parseJSON3() {

        txtParseData.setText("json");
        try {
            JSONArray jsonArray = new JSONArray(json3);

            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject jsonObject = jsonArray.getJSONObject(i);

                parse3data = "ip_address :" + jsonObject.get("ip_address") + "\n" +
                        "app_name :" + jsonObject.get("app_name") + "\n";

                final3parse = final3parse + parse3data;

                txtParseData.setText(this.final3parse);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }//end of parseJSON3

    private void parseJSON2() {
        txtParseData.setText("json");
        try {
            JSONObject jsonObject = new JSONObject(json2);
            txtParseData.append("invoiceID :" + jsonObject.optString("invoiceID") + "\n");
            txtParseData.append("date :" + jsonObject.optString("date") + "\n");
            txtParseData.append("itemsPurchased :" + jsonObject.optString("itemsPurchased") + "\n");
            txtParseData.append("items :" + jsonObject.optString("items") + "\n");
            txtParseData.append("card :" + jsonObject.optString("card") + "\n");
            txtParseData.append("total :" + jsonObject.optString("total") + "\n");

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }//end of parseJSON2

    private void parseJSON1() {

        txtParseData.setText("json");
        try {
            JSONObject jsonObject = new JSONObject(json1);
            txtParseData.append("id :" + jsonObject.optString("id") + "\n");
            txtParseData.append("ip_address :" + jsonObject.optString("ip_address"));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }//end of parseJSON1
}//end of MainActivity
