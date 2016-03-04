# TestKata - Application that	converts	a	number	into	a	Roman	Numeral.
Caveat:	Only	support	numbers	between	1	and	3999
-----
Logic
-----
Symbols are placed from left to right in order of value, starting with the largest. However,

I placed before V or X indicates one less, so four is IV (one less than five) and nine is IX (one less than ten)
X placed before L or C indicates ten less, so forty is XL (ten less than fifty) and ninety is XC (ten less than a hundred)
C placed before D or M indicates a hundred less, so four hundred is CD (a hundred less than five hundred) and nine hundred is CM (a hundred less than a thousand)

Implementaion
-------------

1)Spring MVC framework to accept the number through the web browser
  The path to contoller is http://localhost:8080/convertToRoman/{number}
  ex: http://localhost:8080/convertToRoman/100
  The output is displayed on the browser
2)Added loggings whereever necessary
3)Application throws IllegalArgumentExpection is the number is out of range ie, [1-3999]
