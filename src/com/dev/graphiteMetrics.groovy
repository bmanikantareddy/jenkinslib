#!/usr/bin/env groovy
package com.dev


class graphiteMetrics {
    static String getepoch() {
        Date latestdate = new Date();
        return latestdate.getTime()
    }
}
