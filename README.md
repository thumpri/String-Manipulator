# String-Manipulator
To design and submit running code of a string manipulator in Java while achieving the following 4 levels: 

1. Word Break problem using Dynamic Programming.
2. Word Circle using Depth First Search.
3. Anagram Finder using dictionary.
4. Word Ladder using Breadth First Search.

## Platform/technology to be used for implementation 


### Word Break problem using Dynamic Programming.
Given an input string and a dictionary of words, find out if the input string can be segmented into a space-separated sequence of dictionary words. 

### Word Circle using Depth First Search. 
Given an array of strings, find if the given strings can be chained to form a circle. A string X can be put before another string Y in circle if the last character of X is same as first character of Y.

### Anagram Finder using dictionary.
Write a function to find the same length anagram of a given string are anagram . An anagram of a string is another string that contains same characters, only the order of characters can be different. For example, “abcd” and “dabc” are anagram of each other.

### Breadth First Search.

Given a dictionary, and two words ‘start’ and ‘target’ (both of same length). Find length of the smallest chain from ‘start’ to ‘target’ if it exists, such that adjacent words in the chain only differ by one character and each word in the chain is a valid word i.e., it exists in the dictionary. It may be assumed that the ‘target’ word exists in dictionary and length of all dictionary words is same.

The idea is to use BFS. We start from the given start word, traverse all words that adjacent (differ by one character) to it and keep doing so until we find the target word or we have traversed all words.

