package com.example.darwis.androidcafeserver.Common;

import com.example.darwis.androidcafeserver.Model.User;

/**
 * Created by Darwis on 10/16/2018.
 */

public class Common {
    public static User currentUser;

    public static final String UPDATE = "Cập nhật";
    public static final String DELETE = "Xóa";

    public static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToStatus(String code) {
        if (code.equals("0"))
            return "Placed";
        else if (code.equals("1"))
            return "On the Go";
        else
            return "Shipped";
    }
}
