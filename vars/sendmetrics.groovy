#!/usr/bin/env groovy

def call(Map vars = [:]) {
    def epoch=graphiteMetrics.getepoch()
    echo "$epoch"
}