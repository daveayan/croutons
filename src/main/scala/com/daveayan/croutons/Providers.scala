package com.daveayan.croutons
import java.util.Date

case class DateProvider (number_of: Int){
	def weeks() : Date = {
	  return new Date()
	}
	def weeks_except_weekends() : Date = {
	  return new Date()
	}
	
	def months() : Date = {
	  return new Date()
	}
	def months_except_weekends() : Date = {
	  return new Date()
	}
}

case class StringProvider(number_of: Int) {
	def words() : String = {
	  return " Hi !" * number_of
	}
	
	def characters() : String = {
	  return "a" * number_of
	}
}