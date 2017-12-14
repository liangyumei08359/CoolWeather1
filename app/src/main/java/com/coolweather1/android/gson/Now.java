package com.coolweather1.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liangyumei on 2017/12/13.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
