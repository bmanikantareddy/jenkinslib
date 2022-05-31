#!/usr/bin/env groovy
package com.dev


class graphiteMetrics {
    /**
    * From a git URI, get the name of the repository
    */
    @NonCPS
    static String getepoch() {
        Date latestdate = new Date();
        return latestdate.getTime()
    }
}