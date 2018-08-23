package com.google.android.gms.p028c;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import org.json.JSONObject;

@fn
public class el extends Handler {
    private final ek f2907a;

    public el(Context context) {
        this(new em(context));
    }

    public el(ek ekVar) {
        this.f2907a = ekVar;
    }

    private void m4498a(JSONObject jSONObject) {
        try {
            this.f2907a.mo716a(jSONObject.getString("request_id"), jSONObject.getString("base_url"), jSONObject.getString("html"));
        } catch (Exception e) {
        }
    }

    public void handleMessage(Message message) {
        try {
            Bundle data = message.getData();
            if (data != null) {
                JSONObject jSONObject = new JSONObject(data.getString("data"));
                if ("fetch_html".equals(jSONObject.getString("message_name"))) {
                    m4498a(jSONObject);
                }
            }
        } catch (Exception e) {
        }
    }
}
