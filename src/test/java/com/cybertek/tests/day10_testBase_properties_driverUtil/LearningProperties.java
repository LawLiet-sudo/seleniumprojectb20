package com.cybertek.tests.day10_testBase_properties_driverUtil;

import org.testng.annotations.Test;
/*
"file.separator"	Character that separates components of a file path. This is "/" on UNIX and "\" on Windows.
"java.class.path"	Path used to find directories and JAR archives containing class files. Elements of the class path are separated by a platform-specific character specified in the path.separator property.
"java.home"	Installation directory for Java Runtime Environment (JRE)
"java.vendor"	JRE vendor name
"java.vendor.url"	JRE vendor URL
"java.version"	JRE version number
"line.separator"	Sequence used by operating system to separate lines in text files
"os.arch"	Operating system architecture
"os.name"	Operating system name
"os.version"	Operating system version
"path.separator"	Path separator character used in java.class.path
"user.dir"	User working directory
"user.home"	User home directory
"user.name"	User account name
 */

public class LearningProperties {
    @Test
    public void java_properties_test(){

        System.out.println("System.getProperty(\"windows.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"os.version\") = " + System.getProperty("os.version"));
        System.out.println("System.getProperty(\"os.arch\") = " + System.getProperty("os.arch"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));

    }
}
