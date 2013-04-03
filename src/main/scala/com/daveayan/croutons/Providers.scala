package com.daveayan.croutons
import java.util.Date

import scala.util.Random

import org.joda.time.DateTime
import org.joda.time.Duration

case class DateProvider(number_of: Int) {
  def weeks(): Date = {
    if (number_of == 0) {
      return new Date()
    }

    val randomizer: Random = new Random();
    var day_selected: Int = randomizer.nextInt(7 * number_of)
    DateTime.now.plusDays(day_selected).toDate()
  }

  def weeks_except_weekend(): Date = {
    if (number_of == 0) {
      return new Date()
    }

    val randomizer: Random = new Random();
    var day_selected: Int = randomizer.nextInt(7 * number_of)
    val date_time_selected: DateTime = DateTime.now.plusDays(day_selected)
    val day_of_week: Int = date_time_selected.getDayOfWeek()
    if (day_of_week >= 1 && day_of_week <= 5) {
      return date_time_selected.toDate()
    } else {
      return weeks_except_weekend()
    }
  }

  def months(): Date = {
    if (number_of == 0) {
      return new Date()
    }

    val randomizer: Random = new Random();
    val now: DateTime = DateTime.now
    val until: DateTime = now.plusMonths(number_of)
    val number_of_days_available: Long = (new Duration(now, until)).getStandardDays()

    var day_selected: Int = randomizer.nextInt(number_of_days_available.toInt)
    DateTime.now.plusDays(day_selected).toDate()
  }

  def months_except_weekend(): Date = {
    if (number_of == 0) {
      return new Date()
    }

    val randomizer: Random = new Random();
    val now: DateTime = DateTime.now
    val until: DateTime = now.plusMonths(number_of)
    val number_of_days_available: Long = (new Duration(now, until)).getStandardDays()

    var day_selected: Int = randomizer.nextInt(number_of_days_available.toInt)
    val date_time_selected: DateTime = DateTime.now.plusDays(day_selected)
    val day_of_week: Int = date_time_selected.getDayOfWeek()
    if (day_of_week >= 1 && day_of_week <= 5) {
      return date_time_selected.toDate()
    } else {
      return months_except_weekend()
    }
  }

  def years(): Date = {
    if (number_of == 0) {
      return new Date()
    }

    val randomizer: Random = new Random();
    val now: DateTime = DateTime.now
    val until: DateTime = now.plusYears(number_of)
    val number_of_days_available: Long = (new Duration(now, until)).getStandardDays()

    var day_selected: Int = randomizer.nextInt(number_of_days_available.toInt)
    DateTime.now.plusDays(day_selected).toDate()
  }

  def years_except_weekend(): Date = {
    if (number_of == 0) {
      return new Date()
    }

    val randomizer: Random = new Random();
    val now: DateTime = DateTime.now
    val until: DateTime = now.plusYears(number_of)
    val number_of_days_available: Long = (new Duration(now, until)).getStandardDays()

    var day_selected: Int = randomizer.nextInt(number_of_days_available.toInt)
    val date_time_selected: DateTime = DateTime.now.plusDays(day_selected)
    val day_of_week: Int = date_time_selected.getDayOfWeek()
    if (day_of_week >= 1 && day_of_week <= 5) {
      return date_time_selected.toDate()
    } else {
      return years_except_weekend()
    }
  }
}

case class StringProvider(number_of: Int) {
  val nouns = List("Apparatus", "Person", "Sense", "Education", "Protest", "Fire", "Weather", "Thought", "Statement", "Sound", "Brass", "Structure", "Burn", "Son", "Adjustment", "Addition", "Unit", "Rest", "Music", "Butter", "Attempt", "Animal", "Observation", "Steam", "Fear", "Cotton", "Lift", "Owner", "Shock")
  val adjectives = List("The Determined", "The Dazzling", "The Funny", "The Boring", "The Acoustic", "A Careful", "A Noisy", "A Infamous", "A Burly", "A Puzzling", "A Irate", "A Beautiful", "A Bite-sized", "A Icky", "A Scary", "A Rambunctious")
  val verbs = List("Lobby", "Localize", "Respond", "Probe", "Improve", "Train", "Report", "Schedule", "Conciliate", "Orientate", "Accommodate", "Observe", "Display", "Maintain", "Clarify", "Discuss", "Familiarize", "Measure", "Confer", "Modify", "Volunteer", "Begin", "Publish", "Describe", "Widen", "Sketch", "Settle")

  def lines(): String = {
    val randomizer: Random = new Random();
    var lines_created: StringBuffer = new StringBuffer()

    for (x <- 1 to number_of) {
      val index_adjective_1: Int = randomizer.nextInt(adjectives.size);
      val index_noun_1: Int = randomizer.nextInt(nouns.size);
      val index_verb_1: Int = randomizer.nextInt(verbs.size);
      val index_adjective_2: Int = randomizer.nextInt(adjectives.size);
      val index_noun_2: Int = randomizer.nextInt(nouns.size);

      val adjective_1: String = adjectives(index_adjective_1);
      val noun_1: String = nouns(index_noun_1);
      val verb_1: String = verbs(index_verb_1);
      val adjective_2: String = adjectives(index_adjective_2);
      val noun_2: String = nouns(index_noun_2);

      lines_created.append(adjective_1 + " " + noun_1.toLowerCase() + " " + verb_1.toLowerCase() + "s " + adjective_2.toLowerCase() + " " + noun_2.toLowerCase() + ". ")
    }

    return lines_created.toString()
  }

  def words(): String = {
    return " Hi !" * number_of
  }

  def characters(): String = {
    return "a" * number_of
  }

  def paragraphs(): String = {
    return "a" * number_of
  }
}
