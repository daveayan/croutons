croutons
========
[![Build Status](https://travis-ci.org/daveayan/croutons.png?branch=master)](https://travis-ci.org/daveayan/croutons)

Built in Scala, this library provides random data for your test cases.


#### usage


From your java code one of the following methods can be used

###### To get a random date in next few weeks

`GiveMe.a_date_in_next(4).weeks()`

`GiveMe.a_date_in_next(4).weeks_except_weekend()`

###### To get a random date in next few months

`GiveMe.a_date_in_next(4).months()`

`GiveMe.a_date_in_next(4).months_except_weekend()`

###### To get a random date in next few years

`GiveMe.a_date_in_next(4).years()`

`GiveMe.a_date_in_next(4).years_except_weekend()`

###### To get a random sentence

`GiveMe.text_with_(1).lines()`

`GiveMe.text_with_(2).lines()`
