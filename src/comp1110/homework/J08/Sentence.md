In this exercise, you will build a program that determines the validity of a
select few simple English sentences, according to rules detailed below. A
sentence will be represented as an array of words, which you will create as a 
static nested class `Word`.

`Word` is a good candidate for a static nested class, because every sentence 
(except the empty sentence) contains at least one word. Furthermore, the Word
class does not have much use apart from checking the validity of sentences.

Within the `comp1110.homework.J08` package of the `comp1110-homework` project,
create a class `Sentence` with an instance variable `public Word[] words`.

Furthermore:
* The class should have a constructor `Sentence(int size)`, where `size`
determines the length of the `sentence` field of a given Sentence.
* The class should have an instance method `public boolean isValid()` that
determines the validity of a sentence according to the rules detailed below.
* You may add as many more methods as you require.

Also create a public static nested class `Word`, with instance variables `String value`
and `Type type`.

Within this class, you must create:
* A public enum type `Type` that contains `NOUN`, `ADJECTIVE`, and `VERB`.
* The constructor Word(String value, Type type).

RULES FOR SENTENCE VALIDITY:

1. A sentence must have a length of at least 1.
2. A NOUN must be followed by a VERB (unless it is at the end of a sentence).
3. An ADJECTIVE must be followed only by another ADJECTIVE or a NOUN.
4. A sentence must have one and only one VERB.
5. A sentence must end in a NOUN or in a VERB.

Test your solution using the `J08` test.

Once you have it working, add and commit your work.
