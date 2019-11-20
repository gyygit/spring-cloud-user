package com.lean.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class ApiUtils {

    public static void setRequestPar(HttpServletRequest request, HashMap<String, Object> par) {

        Map<String, String[]> parameterMap = request.getParameterMap();

        for (String key : parameterMap.keySet()) {
            if (parameterMap.get(key) != null && parameterMap.get(key).length == 1) {
                par.put(key, parameterMap.get(key)[0]);
            }
        }

    }

}
