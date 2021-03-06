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
package com.fcpy.example.jaxwsboot.service;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.apache.commons.codec.binary.Hex;

import com.fcpy.example.jaxwsboot.bean.ResponseBean;

public class Converter {
	public ResponseBean encodeHex(String data, String encoding) throws UnsupportedEncodingException {
		ResponseBean rspnBean = new ResponseBean();
		rspnBean.setResult(Hex.encodeHexString(data.getBytes(encoding)));
		rspnBean.setExecutionTime(new Date());
		return rspnBean;
	}

	public ResponseBean toUpperCase(String data) {
		ResponseBean rspnBean = new ResponseBean();
		rspnBean.setResult(data.toUpperCase());
		rspnBean.setExecutionTime(new Date());
		return rspnBean;
	}
}
