package com.grigrigo.groovy.test

//hello groovy
//class HelloGroovy {
//	def name
//	
//	HelloGroovy(who)	{
//		name = who[0].toUpperCase() + who[1..-1]
//	}
//	
//	def hello()	{
//		println "Hello $name!"
//	}
//}
//
//g = new HelloGroovy('grigri')

//file handling
myFileDirectory = "D:\\Temp\\"
myFileName = "groovy_test.txt"
//println myFileDirectory + myFileName
myFile = new File(myFileDirectory + myFileName)

printFileLine = { println "file line: " + it }

myFile.eachLine { printFileLine }