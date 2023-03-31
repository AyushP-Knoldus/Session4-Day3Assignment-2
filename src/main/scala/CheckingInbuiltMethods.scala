package com.knoldus

class CheckingInbuiltMethods(firstList : List[Int] , secondList : List[Int]) {
  def checkingEqualsMethod: Boolean=firstList.equals(secondList)

  def checkingEqualsEqualsToMethod: Boolean=firstList == secondList

  def checkingNotEqualsToMethod: Boolean=firstList != secondList

  def checkingNeMethod: Boolean=firstList.ne(secondList)

  def checkingEqMethod: Boolean=firstList.eq(secondList)
}
