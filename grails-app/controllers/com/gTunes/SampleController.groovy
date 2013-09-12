package com.gTunes

class SampleController {

    static defaultAction = "index1"

    def index1() {
        log.info('Inside index1 action')
        render "Index"
        render "${actionName} <br/> ${actionUri}  <br/> ${controllerName} ${controllerUri}  <br/> ${flash} <br/> ${log} <br/> ${params} <br/> ${request.getRequestURL()}"
    }

    def index2() {

        Enumeration em = request.getAttributeNames();
       // String sb = ""
       while(em.hasMoreElements()){
           println(em.nextElement())
       }
        render "Index 2   "
    }
}
