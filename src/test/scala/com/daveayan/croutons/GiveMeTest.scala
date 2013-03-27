package com.daveayan.croutons
import java.util.Date

import org.joda.time.DateTime
import org.junit.Test

import junit.framework.Assert

class GiveMeTest {
  
  @Test
  def should_give_me_day_in_next_week() {
    val now: DateTime = DateTime.now
    
    for(i <- 1 to 15) {
      val end: DateTime = DateTime.now.plusWeeks(i)
	    for(a <- 0 to 500) {
	      val date: Date = GiveMe.a_date_in_next(i).weeks()
	      val dt: DateTime = new DateTime(date)
        Assert.assertTrue("Expected the date to be after now - " + now, dt.isAfter(now))
        Assert.assertTrue("Expected the date to be before - " + end, dt.isBefore(end))
	    }  
    }
  }
  
  @Test
  def should_give_me_day_in_next_week_except_weekend() {
    val now: DateTime = DateTime.now
    
    for(i <- 1 to 15) {
      val end: DateTime = DateTime.now.plusWeeks(i)
	    for(a <- 0 to 500) {
	      val date: Date = GiveMe.a_date_in_next(i).weeks_except_weekend()
	      val dt: DateTime = new DateTime(date)
        Assert.assertTrue("Expected the date to be not a weekend (i, a, date) - (" + i + ", " + a + ", " + date + ")", 
            dt.getDayOfWeek() >= 1 && dt.getDayOfWeek() <= 5)
        Assert.assertTrue("Expected the date to be after now - " + now, dt.isAfter(now))
        Assert.assertTrue("Expected the date to be before - " + end, dt.isBefore(end))
	    }  
    }
  }
  
  @Test
  def should_give_me_day_in_next_month() {
    val now: DateTime = DateTime.now
    
    for(i <- 1 to 15) {
      val end: DateTime = DateTime.now.plusMonths(i)
	    for(a <- 0 to 500) {
	      val date: Date = GiveMe.a_date_in_next(i).months()
	      val dt: DateTime = new DateTime(date)
        Assert.assertTrue("Expected the date to be after now - " + now, dt.isAfter(now))
        Assert.assertTrue("Expected the date to be before - " + end, dt.isBefore(end))
	    }  
    }
  }
  
  @Test
  def should_give_me_day_in_next_month_except_weekend() {
    val now: DateTime = DateTime.now
    
    for(i <- 1 to 15) {
      val end: DateTime = DateTime.now.plusMonths(i)
	    for(a <- 0 to 500) {
	      val date: Date = GiveMe.a_date_in_next(i).months_except_weekend()
	      val dt: DateTime = new DateTime(date)
        Assert.assertTrue("Expected the date to be not a weekend (i, a, date) - (" + i + ", " + a + ", " + date + ")", 
            dt.getDayOfWeek() >= 1 && dt.getDayOfWeek() <= 5)
        Assert.assertTrue("Expected the date to be after now - " + now, dt.isAfter(now))
        Assert.assertTrue("Expected the date to be before - " + end, dt.isBefore(end))
	    }  
    }
  }
  
  @Test
  def should_give_me_day_in_next_year() {
    val now: DateTime = DateTime.now
    
    for(i <- 1 to 15) {
      val end: DateTime = DateTime.now.plusYears(i)
	    for(a <- 0 to 500) {
	      val date: Date = GiveMe.a_date_in_next(i).years()
	      val dt: DateTime = new DateTime(date)
        Assert.assertTrue("Expected the date to be after now - " + now, dt.isAfter(now))
        Assert.assertTrue("Expected the date to be before - " + end, dt.isBefore(end))
	    }  
    }
  }
  
  @Test
  def should_give_me_day_in_next_year_except_weekend() {
    val now: DateTime = DateTime.now
    
    for(i <- 1 to 15) {
      val end: DateTime = DateTime.now.plusYears(i)
	    for(a <- 0 to 500) {
	      val date: Date = GiveMe.a_date_in_next(i).years_except_weekend()
	      val dt: DateTime = new DateTime(date)
        Assert.assertTrue("Expected the date to be not a weekend (i, a, date) - (" + i + ", " + a + ", " + date + ")", 
            dt.getDayOfWeek() >= 1 && dt.getDayOfWeek() <= 5)
        Assert.assertTrue("Expected the date to be after now - " + now, dt.isAfter(now))
        Assert.assertTrue("Expected the date to be before - " + end, dt.isBefore(end))
	    }  
    }
  }
}