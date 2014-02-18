package com.linchproject.app.controllers;

import com.linchproject.mvc.Controller;
import com.linchproject.core.Params;
import com.linchproject.core.Result;

/**
 * @author Georg Schmidl
 */
public class AdminController extends Controller {

    public Result _all(Params params) {
        return dispatch(route.shift("admin"));
    }
}