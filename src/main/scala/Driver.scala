package com.knoldus

object Driver extends App {
  private val listOne = List(55, 43, 21, 38)
  private val listTwo = List(37, 93, 41, 62)
  //Passing 2 different lists in object of class and checking result of various inbuilt method.
  private val checkingInbuiltMethodsObject = new CheckingInbuiltMethods(listOne, listTwo)
  println("If Two lists with different contents are passed in the object")
  println(s"The lists have two different contents so equals method will give " + checkingInbuiltMethodsObject.checkingEqualsMethod + " value")
  println(s"Both the lists have different contents so == will give " + checkingInbuiltMethodsObject.checkingEqualsEqualsToMethod + " value")
  println(s"Both the lists have different content so != will give " + checkingInbuiltMethodsObject.checkingNotEqualsToMethod + " value")
  println(s"The lists have two different memory location so ne method will give " + checkingInbuiltMethodsObject.checkingNeMethod + " value")
  println(s"The lists have two different memory location so eq will give " + checkingInbuiltMethodsObject.checkingEqMethod + " value")
  //Passing two lists which are pointing same memory location.
  private val listOneCopy = listOne
  private val checkingInbuiltMethodsObjectTwo = new CheckingInbuiltMethods(listOne, listOneCopy)
  println(s"\nIf two lists with same reference are passed")
  println(s"The two lists have same contents so equals method will give " + checkingInbuiltMethodsObjectTwo.checkingEqualsMethod + " value")
  println(s"Both the lists have same contents so == will give " + checkingInbuiltMethodsObjectTwo.checkingEqualsEqualsToMethod + " value")
  println(s"Both the lists have same content so != will give " + checkingInbuiltMethodsObjectTwo.checkingNotEqualsToMethod + " value")
  println(s"The lists have same memory location so ne method will give " + checkingInbuiltMethodsObjectTwo.checkingNeMethod + " value")
  println(s"The lists have same memory location so eq method will give " + checkingInbuiltMethodsObjectTwo.checkingEqMethod + " value")
  //Passing two lists with same content but different memory location
  private val sameAsList2 = List(37, 93, 41, 62)
  private val checkingInbuiltMethodsObjectThree = new CheckingInbuiltMethods(listTwo, sameAsList2)
  println(s"\nIf two lists of same contents but different location are passed")
  println(s"The two lists have same contents so equals method will give " + checkingInbuiltMethodsObjectThree.checkingEqualsMethod + " value")
  println(s"Both the lists have same contents so == will give " + checkingInbuiltMethodsObjectThree.checkingEqualsEqualsToMethod + " value")
  println(s"Both the lists have same content so != will give " + checkingInbuiltMethodsObjectThree.checkingNotEqualsToMethod + " value")
  println(s"The lists have two different memory location so ne method will give " + checkingInbuiltMethodsObjectThree.checkingNeMethod + " value")
  println(s"The lists have two different memory location so eq will give " + checkingInbuiltMethodsObjectThree.checkingEqMethod + " value")
}

