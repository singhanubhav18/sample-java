//
// Generated By:JAX-WS RI IBM 2.2.1-07/09/2014 01:53 PM(foreman)- (JAXB RI IBM 2.2.3-07/07/2014 12:56 PM(foreman)-)
//


package com.fcpy.example.jaxwsboot.client.converter;

import javax.xml.ws.WebFault;

@WebFault(name = "UnsupportedEncodingException", targetNamespace = "http://service.jaxwsboot.example.fcpy.com/")
public class UnsupportedEncodingException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private UnsupportedEncodingException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public UnsupportedEncodingException_Exception(String message, UnsupportedEncodingException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param message
     * @param cause
     */
    public UnsupportedEncodingException_Exception(String message, UnsupportedEncodingException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.fcpy.example.jaxwsboot.client.converter.UnsupportedEncodingException
     */
    public UnsupportedEncodingException getFaultInfo() {
        return faultInfo;
    }

}
