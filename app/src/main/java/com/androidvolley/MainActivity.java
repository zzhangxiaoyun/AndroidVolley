package com.androidvolley;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends Activity {

    private String url = "http://www.bytespace.cn/web/infos?pagesize=20&pageindex=1&type=gndy";
    private RequestQueue mRequestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRequestQueue = Volley.newRequestQueue(this);

    }


    public void load(View view) {
        loadObject();


//        loadGson();
//        loadString();
    }

    void loadGson() {




    }

    void log(Object txt) {
        Log.i("tag", txt.toString());
    }


    public void loadObject(){
        ObjectRequest<Data> request = new ObjectRequest<Data>(url, Data.class, new Response.Listener<Data>() {
            @Override
            public void onResponse(Data response) {



                log(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                log(error);
            }
        });
        request.setRetryPolicy(new RetryPolicy() {
            @Override
            public int getCurrentTimeout() {
                return 5000;
            }

            @Override
            public int getCurrentRetryCount() {
                return 5;
            }

            @Override
            public void retry(VolleyError error) throws VolleyError {
                log("retry:"+error.toString());
            }
        });

        mRequestQueue.add(request);



    }


    void loadString() {


        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.i("tag", response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i("tag", error.toString());
            }
        });
        mRequestQueue.add(request);
    }
}
