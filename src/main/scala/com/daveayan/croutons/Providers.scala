package com.daveayan.croutons
import java.util.Date

import scala.util.Random

import org.joda.time.DateTime
import org.joda.time.Duration

case class DateProvider (number_of: Int){
	def weeks() : Date = {
	  if(number_of == 0) {
	    return new Date()
	  }
	  
	  val randomizer: Random = new Random();
  	var day_selected: Int = randomizer.nextInt(7 * number_of)
	  DateTime.now.plusDays(day_selected).toDate()
	}
	
	def weeks_except_weekend() : Date = {
	  if(number_of == 0) {
	    return new Date()
	  }
	  
	  val randomizer: Random = new Random();
  	var day_selected: Int = randomizer.nextInt(7 * number_of)
	  val date_time_selected: DateTime = DateTime.now.plusDays(day_selected)
	  val day_of_week: Int = date_time_selected.getDayOfWeek()
	  if(day_of_week >= 1 && day_of_week <= 5) {
	    return date_time_selected.toDate()
	  } else {
	    return weeks_except_weekend()
	  }
	}
	
	def months() : Date = {
	  if(number_of == 0) {
	    return new Date()
	  }
	  
	  val randomizer: Random = new Random();
	  val now: DateTime = DateTime.now
	  val until: DateTime = now.plusMonths(number_of)
	  val number_of_days_available: Long = (new Duration(now, until)).getStandardDays()
	  
  	var day_selected: Int = randomizer.nextInt(number_of_days_available.toInt)
	  DateTime.now.plusDays(day_selected).toDate()
	}
	
	def months_except_weekend() : Date = {
	  if(number_of == 0) {
	    return new Date()
	  }
	  
	  val randomizer: Random = new Random();
	  val now: DateTime = DateTime.now
	  val until: DateTime = now.plusMonths(number_of)
	  val number_of_days_available: Long = (new Duration(now, until)).getStandardDays()
	  
  	var day_selected: Int = randomizer.nextInt(number_of_days_available.toInt)
	  val date_time_selected: DateTime = DateTime.now.plusDays(day_selected)
	  val day_of_week: Int = date_time_selected.getDayOfWeek()
	  if(day_of_week >= 1 && day_of_week <= 5) {
	    return date_time_selected.toDate()
	  } else {
	    return months_except_weekend()
	  }
	}
	
	def years() : Date = {
	  if(number_of == 0) {
	    return new Date()
	  }
	  
	  val randomizer: Random = new Random();
	  val now: DateTime = DateTime.now
	  val until: DateTime = now.plusYears(number_of)
	  val number_of_days_available: Long = (new Duration(now, until)).getStandardDays()
	  
  	var day_selected: Int = randomizer.nextInt(number_of_days_available.toInt)
	  DateTime.now.plusDays(day_selected).toDate()
	}
	
	def years_except_weekend() : Date = {
	  if(number_of == 0) {
	    return new Date()
	  }
	  
	  val randomizer: Random = new Random();
	  val now: DateTime = DateTime.now
	  val until: DateTime = now.plusYears(number_of)
	  val number_of_days_available: Long = (new Duration(now, until)).getStandardDays()
	  
  	var day_selected: Int = randomizer.nextInt(number_of_days_available.toInt)
	  val date_time_selected: DateTime = DateTime.now.plusDays(day_selected)
	  val day_of_week: Int = date_time_selected.getDayOfWeek()
	  if(day_of_week >= 1 && day_of_week <= 5) {
	    return date_time_selected.toDate()
	  } else {
	    return years_except_weekend()
	  }
	}
}

case class StringProvider(number_of: Int) {
	def words() : String = {
	  return " Hi !" * number_of
	}
	
	def characters() : String = {
	  return "a" * number_of
	}
	
	def paragraphs() : String = {
	  return "a" * number_of
	}
}
