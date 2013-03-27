package com.daveayan.croutons
import org.junit.Test

class GiveMeTest {
  @Test
  def shoud_give_me_words {
  	println (GiveMe.a_sentence_with_(4).words())
  	println (GiveMe.a_sentence_with_(6).characters())
  }
}