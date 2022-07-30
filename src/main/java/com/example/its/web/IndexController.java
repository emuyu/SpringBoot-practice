package com.example.its.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @GetMapping //HTTP GET リクエストを特定のハンドラーメソッドにマッピングするためのアノテーション。
    //@ResponseBody// メソッドの戻り値を Web レスポンスの本文にバインドする必要があることを示すアノテーション。
    public String index() {
        return "index";
    }
}
