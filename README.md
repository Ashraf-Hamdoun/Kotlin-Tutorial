# **Kotlin Tutorial**

## **_Road map_**:
- ### **Essentials**:
  - #### Syntax
    - main function
    - No params since version 1.3

  - #### Output
    - print()
    - println()
    - readLine()
    - readln()

  - #### Comments
    - Single-line Comments
      - can be used at the end of line code
    - Multi-line Comments

  - #### Variables
    - Immutable using val keyword
    - Mutable using var keyword
    - specify the type or not
    - assign the value later
    - Variable's name
      - Names can contain letters, digits, underscores, and dollar signs 
      - Names should start with a letter
      - Names can also begin with $ and _
      - Names are case-sensitive
      - Names should start with a lowercase letter, and it cannot contain whitespace 
      - Reserved words cannot be used as names
  
  - #### Data types
    - Types :
      - Numbers
        - Integer : Byte, Short, Int and Long
        - Float
        - Double
      - Characters
        - must be surrounded by single quotes
      - Booleans
        - ture or false
      - Strings
        - list of Chars
        - must be surrounded by double quotes
      - Lists (Arrays)
    - Type conversion (Casting)
  
  - #### Operators
    - Arithmetic operators : (+, -, *, /, %, ++, --)
    - Assignment operators : (=, +=, -=, *=, /=, %=)
    - Comparison operators : (==, !=, <, >, <=, >=)
    - Logical operators : (&&, ||, !)

  - #### Strings
    - Access a String
    - String Length
    - String format functions
    - Comparing Strings
    - Finding a String in a String
    - Quotes Inside a String
    - String Concatenation
    - String Templates/Interpolation
  
  - #### Booleans
    - Boolean Expression
  
  - #### Conditions :
    - if ... else if ... else
      - If..Else Expressions
    - When (Switch)
      - with or without else (default value)
      - Combine multiple branches in one using comma
      - check by using (in Range)
      - check by using (is Type)
      - check by using (isEven() or isOdd())
  
  - #### Loops :
    - for
      - for => in
      - arr.indices
      - (index, value) in arr.withIndex()
      - Ranges
        - from..to (int or alphabet)
        - from downTo to
        - form..to step stepValue
    - while
    - do ... while

  - #### break & continue
    - outer@ , inner@
    - break@outer, break@inner

  - #### Arrays
    - arrayOf(), intArrayOf(), ...
      - Array Length / Size
      - arr.get(index), arr[index]
      - set.set(index, value), arr[index] = value
      - Check if an Element Exists
      - Loop Through an Array

  - #### Functions
    - Parameters
      - positional
    - Default value of params
    - vararg Parameters
    - Return Values
    - Shorter Syntax for Return Values
  
  - #### Null safety
    - (?) nullable :
      - can be null
      - check if it's null
    - (?.) Only safe (Safe Call operator) :
      - if it's not null do ...
    - (?:) Elvis Operator :
      - return a non-null value or a default value
    - (!!.) Not null assertion : !! Operator :
      - non-null asserted
      - the value can't be null
  
  - #### Expression, Statement and Block