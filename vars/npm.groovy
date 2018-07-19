#!/usr/local/env groovy

def call(String command){
    sh "npm $command"
}