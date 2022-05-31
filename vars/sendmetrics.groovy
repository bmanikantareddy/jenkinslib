#!/usr/bin/env groovy
import com.dev.graphiteMetrics

def call(Map vars = [:]) {
    def epoch=graphiteMetrics.getepoch()
    echo "$epoch"
}
