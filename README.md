# **Kotlin Tutorial**

## **_Road map_** :

- ### **Essentials And Fundamentals Of Programming (EFP)**:

  - #### Syntax

    - A Kotlin program requires a main function as the entry point of the program.
    - No params are required since version 1.3

  - #### Comments

    - Single-line Comments
      - can be used at the end of line code
    - Multi-line Comments

  - #### Output & Input

    - print()
    - println()
    - readLine()
    - readln()

  - #### Escape characters

    - \t - Inserts tab.
    - \b - Inserts backspace.
    - \n - Inserts newline.
    - \r - Inserts carriage return.
    - \' - Inserts single quote character.
    - \" - Inserts double quote character.
    - \\ - Inserts backslash.
    - \$ - Inserts dollar character.

  - #### Variables

    - Immutable using val keyword (Constant)
    - Mutable using var keyword
    - specify the type or not
    - assign the value later
    - Variable's name
      - Names can contain letters, digits, underscores, and dollar signs
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
      - Lists
      - Arrays
      - Ranges
    - Type conversion (Casting)
    - Why we use DataType ?
      - to save memory size
      - to use the correct operations

  - #### Operators

    - Arithmetic operators : (+, -, \*, /, %, ++, --)
    - Assignment operators : (=, +=, -=, \*=, /=, %=)
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
      - positional parameters
      - named parameters
      - default arguments (=)
    - Default value of params
    - vararg Parameters
    - Return Values
    - Return Unit
    - Shorter Syntax for Return Values
    - Lambdas

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
  - #### Best practices (style guide recommendations):

    - Function names should be in camel case and should be verbs or verb phrases.
    - Each statement should be on its own line.
    - The opening curly brace should appear at the end of the line where the function begins.
    - There should be a space before the opening curly brace.
    - The function body should be indented in by 4 spaces. Do not use a tab character to indent your code, type in 4 spaces.
    - The closing curly brace is on its own line after the last line of code in the function body. The closing brace should line up with the fun keyword at the beginning of the function.
    - Variable names should be in camel case and start with a lowercase letter.
    - In a variable declaration, there should be a space after a colon when you specify the data type.
    - This diagram shows a line of code that says: val discount: Double = .20 There is an arrow pointing to the space between the colon symbol and the Double data type, with a label that says space.
    - There should be a space before and after an operator like the assignment (=), addition (+), subtraction (-), multiplication (\*), division (/) operators and more.
    - As you write more complex programs, there is a recommended limit of 100 characters per line. That ensures that you can read all the code in a program easily on your computer screen, without needing to scroll horizontally when reading code.

  - #### OOP (Classes)
    - Class naming
    - Fields (Properties)
    - Initializer & constructor
      - type of constructor (places)
      - add some fields inside constructor body
      - use multiple constructors
      - init comes before constructor
    - Getters & Setters
    - Use of private keyword
    - Inheritance and use of 'super' keyword
    - Class modifiers
      - public : it is the default one
      - private : It does not allow access to the modifier variable or function from outside
      - internal : it will be available only in the same module
      - protected :
    -
