package com.daveayan.croutons
import org.joda.time.DateTime
import java.util.Date

case class DateProvider (number_of: Int){
	def weeks() : Date = {
	  def dt: DateTime = DateTime.now()
	  return dt.toDate()
	}
	def weeks_except_weekends() : Date = {
	  def dt: DateTime = DateTime.now()
	  return dt.toDate()
	}
	
	def months() : Date = {
	  def dt: DateTime = DateTime.now()
	  return dt.toDate()
	}
	def months_except_weekends() : Date = {
	  def dt: DateTime = DateTime.now()
	  return dt.toDate()
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