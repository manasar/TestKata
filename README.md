# TestKata - Application that	converts	a	number	into	a	Roman	Numeral.
Caveat:	Only	support	numbers	between	1	and	3999
-----
Logic
-----
[Value-Symbol]
[1-I]
[5-V]
[10-X]
[50-L]
[100-C]
[500-D]
[1000-M]

Numbers are formed by combining symbols and adding the values, so II is two (two ones) and XIII is thirteen (a ten and three ones). Because each numeral has a fixed value rather than representing multiples of ten, one hundred and so on, according to position, there is no need for "place keeping" zeros, as in numbers like 207 or 1066; those numbers are written as CCVII (two hundreds, a five and two ones) and MLXVI (a thousand, a fifty, a ten, a five and a one).

Symbols are placed from left to right in order of value, starting with the largest. However, in a few specific cases, to avoid four characters being repeated in succession (such as IIII or XXXX), subtractive notation is often used as follows:
I placed before V or X indicates one less, so four is IV (one less than five) and nine is IX (one less than ten)
X placed before L or C indicates ten less, so forty is XL (ten less than fifty) and ninety is XC (ten less than a hundred)
C placed before D or M indicates a hundred less, so four hundred is CD (a hundred less than five hundred) and nine hundred is CM (a hundred less than a thousand)

Implementaion
-------------

1)Spring MVC framework to accept the number through the web browser
  The path to contoller is http://localhost:8080/convertToRoman/{number}
  ex: http://localhost:8080/convertToRoman/100
  The output is displayed on the browser
2)Logs added where ever necessary
3)Application throws IllegalArgumentExpection if the number is out of range ie, [1-3999]
