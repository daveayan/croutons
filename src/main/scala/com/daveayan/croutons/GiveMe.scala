package com.daveayan.croutons
import com.daveayan.croutons.DateProvider
import com.daveayan.croutons.StringProvider

object GiveMe {
  def a_sentence_with_(number_of: Int) : StringProvider = {
    return new StringProvider(number_of)
  }
  
  def a_date_in_next(number_of: Int) : DateProvider = {
    return new DateProvider(number_of)
  }
}