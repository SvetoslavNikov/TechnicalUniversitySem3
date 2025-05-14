We want to add the necessary functionality, so that for each label we can specify how it
should appear to the end-user. The programmer should be able to request that zero, one
or more of the following styles apply (the ¬ symbol denotes a space character in the
string):

## Capitalize
If the first character of the label is a letter, then it is capitalized, e.g.
"some¬text" becomes "Some¬text".

## LeftTrim
Whitespace is trimmed at the beginning of the label, e.g.
"¬some¬text" becomes "some¬text".
Page 2 of 11 This work is licensed under CC BY-NC-SA 4.0

## RightTrim
Whitespace is trimmed at the end of the label, e.g.
"some¬text¬" becomes "some¬text".

## NormalizeSpace
Labels never contain more than one consecutive space, e.g.
"some¬¬¬text" becomes "some¬text".

## Decorate
Labels are bracketed with "-={" and "}=-", e.g.
"abc" becomes "-={¬abc¬}=-"

## Censor(W)
Censors a specific string W containing L characters by replacing all of its occurrences in the label with L asterisks, e.g.
if W="abc", then "¬abc¬def¬abcdef" becomes "¬***¬def¬***def"

## Replace(A,B)
Replaces (case-sensitive) all occurrences of the string A with the string B, e.g.
if A="abc" and B="d", then "¬abc¬abcdef" becomes "¬d_ddef"
Your solution must not break the existing code, which relies on the Label interface.
