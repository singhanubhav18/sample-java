/*
 * Copyright (c) 2015, FCPY Studio.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fcpy.spring.webutil;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * WebController acts as an entry point of WebUtil and route the request to proper service.
 */
@Controller
public class WebController {
    private static final String ENCODING = "UTF-8";
    
    /**
     * Triggers TcpClient.
     * 
     * @param httpRqst HttpServletRequest object.
     * @return Response message from the remote server.
     * @throws IOException
     */
    @RequestMapping("/tcpclient")
    @ResponseBody
    public String doTcpClient(final HttpServletRequest httpRqst) throws IOException {
        ConnectionProperties cp = new ConnectionProperties();
        cp.setHost(URLDecoder.decode(httpRqst.getParameter("host"), ENCODING));
        cp.setPort(URLDecoder.decode(httpRqst.getParameter("port"), ENCODING));
        return TcpClient.sendAndReceive(cp, URLDecoder.decode(httpRqst.getParameter("rqst"), ENCODING));
    }
}
