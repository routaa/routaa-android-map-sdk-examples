
# Routaa Map SDK for Android - Examples

## Overview

This repository contains example projects demonstrating how to use the Routaa Map SDK for Android. These examples cover various features and use cases to help you get started quickly and understand how to integrate the SDK into your own applications.

## Prerequisites

Before running the examples, make sure you have the following:

- A valid API key for the Map SDK
- Credentials for accessing the Routaa Maven repository where the SDK is hosted

## Setup

First, you need to add the Routaa Maven repository to your `build.gradle (project)` file

    maven {  
	     url = uri("https://repo.routaa.ir/repository/maven-routaa-public")  
	     credentials {  
           username = "YOUR_MAVEN_USERNAME"  
	       password = "YOUR_MAVEN_PASSWORD"  
	     }
    }
You also need to add routaa map sdk dependency to your `build.grade (module:app)` file

    dependencies {  
		implementation("com.routaa.maps:android:1.3.0")  
    }
Then add your API Key to `strings.xml`

    <string name="routaa_access_token">PASTE_YOUR_API_TOKEN_HERE</string>

## Usage
Add the MapView in your XML layout file:

    <com.mapbox.maps.MapView  
      android:layout_width="match_parent"  
      android:layout_height="match_parent"  
      android:id="@+id/mapView"/>

