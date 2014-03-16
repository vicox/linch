package com.linchproject.linch.controllers;

import com.linchproject.linch.Controller;
import com.linchproject.core.Params;
import com.linchproject.core.Result;

/**
 * @author Georg Schmidl
 */
public class AppController extends Controller {

    public Result index(Params params) {
        return render("index", context().put("hello", "Hello Linch"));
    }
}