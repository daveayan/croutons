package com.daveayan.croutons

/**
 * Usage: 
 * GiveMe.a_date_in_next(4).weeks()
 * GiveMe.a_date_in_next(4).weeks_except_weekend()
 * 
 * GiveMe.a_date_in_next(4).months()
 * GiveMe.a_date_in_next(4).months_except_weekend()
 * 
 * GiveMe.a_date_in_next(4).years()
 * GiveMe.a_date_in_next(4).years_except_weekend()
 * 
 * GiveMe.text_with_(1).lines()
 * GiveMe.text_with_(2).lines()
 * 
 * GiveMe.text_with_(1).paragraphs()
 * GiveMe.text_with_(2).paragraphs()
 */
object GiveMe {
  def text_with_(number_of: Int) : StringProvider = {
    return new StringProvider(number_of)
  }
  
  def a_date_in_next(number_of: Int) : DateProvider = {
    return new DateProvider(number_of)
  }
}