package org.example

object ScalaPrac_Variables {

  // The Variable syntax will : keyword variable_name: DataType = initial_value
  val myFirstScalaVariable: Int = 5
  //we Can also declare without DataType. Scala will automaticallly takes care of it
  val a = 10

  def main(args: Array[String]): Unit = {

    //1.  println is used if you want to display each specific output on separate lines.
    println("myFirstScalaVariable " + myFirstScalaVariable)
    println(f"String Literal/interpolation : $a")
    // It just prints anything you pass it, one after the other, in the same line
    print("Hello mame")
    println()
    //printf is used for formatting text
    println("Number = %d", 123)
    printf("Number = %d", 123)

    //2.   Immutable Variable vs Mutable Variable
    // VAL vs VAR
    // VAL : val variables are Immutable variables
    // VAR : var variables are mutable variables
    var message: String = "Big Data Eng"
    println(f"message $message")
    message = "AWS Data Eng"  // if Val used=> error: reassignment to val letting you know that val cannot be reassigned a value.
    println(f"Updated Message : $message")
    val myDoubleVariable: Double = 2.75
    val myFloatVariable: Float = 2.75f
    val myBooleanVariable: Boolean = true
    println(myFloatVariable, myFloatVariable.getClass)
    println("")

    //3.  Type Casting in Scala
    //  we will follow only below order in TYPE Casting
    //  CHAR -> INT ->  LONG -> FLOAT -> DOUBLE ->  **This is Important in SCALA
    //  */
    val oldType: Long = 926371285
    val newType: Float = oldType
    println(oldType, oldType.getClass)
    println(newType, newType.getClass)

    val oldType1: Float = 45
    val newType1: Double = oldType1
    println(oldType1, oldType1.getClass)
    println(newType1, newType1.getClass)
    println("separate\nlines")     //using \n to end the line
    println("tab\tbetween\twords") //using \t to insert a tab
    println('\\')                  //using \\ to print a backslash
    println('\'')                  //using \' to print a single quotation mark
    println('\"')                  //using \" to print a double quotation mark


    // 4. Operators
    // objectName.method(argument) means that the method is being called on objectName and argument are parameters passed to the method
    // */
    val str: String = "Azure Data Engineering"
    val index_d = str.indexOf("D")   //objectName.meathod(argument)
    val index_e = str indexOf "E"    // objectName meathod argument
    println(f"index_ of W is : $index_d")
    println(f"index_ of E is : $index_e")

    //Operators
    val two_sum = 1+1
    val two_sum_ = 1.+(1)       // + is meathod 1.+(1)  -> obj.meathod(arg)
    println(f"two num sum : $two_sum  ->   $two_sum_")

    println(f"Relational Operators :")
    val operand1 = 10
    val operand2 = 7
    println(operand1 + operand2)
    println(operand1 - operand2)
    println(operand1 * operand2)
    println(operand1 / operand2)
    println(operand1 % operand2)
    println(operand1 > operand2)
    println(operand1 < operand2)
    println(operand1 >= operand2)
    println(operand1 <= operand2)
    println(operand1 != operand2)

    println(f"Logical opertors : ")
    val A = true
    val B = false
    val exp = A && B //false
    println(!A)
    println(!B)
    println(true && exp)
    println(false && exp)
    println(true || exp)
    println(false || exp)

    println(f"little Problem : check num <=75 or >8")
    // check the value check = 10 either lessthan 75 or greaterthan 10
    val check = 25
    val compareCheck = check <75 && check >=8
    println(f"compareCheck : $compareCheck")
    println(f"")


    // 5. Strings Interpolation
    // s"str $var"   ->  allows embedding variables inside the sring : Its basics level use
    // f"str $var"   ->  allows concatenate the string / variable inside the string  : It has Advanced complex levels
    // */
    val stringVar = "What is the length of this string?"
    println(stringVar.length())

    val string1 = "Hello "
    val string2 = "Big Data"
    val year = 2013
    val new_str = string1 + string2
    println(f" String Concatenated : $new_str")
    println(f" Aws + $string2 : $year years of experience")

    val pi = 3.14159F
    println(f"the value of pi is $pi%.2f")

    println(s" 3 + 4 ${3 + 4}")

    val string11 = "Educative"
    val string22 = "educative"
    val areTheyEqual = string11 == string22    //Check each char comparrision : False
    val areTheyEqualUpper = string11.toUpperCase == string22.toUpperCase
    val areTheyEqualLower = string11.toLowerCase == string22.toLowerCase()
    println(f" areTheyEqual : $areTheyEqual")
    println(f" areTheyEqualUpper when Upper : $areTheyEqualUpper")
    println(f" areTheyEqualLower when Lower : $areTheyEqualLower")

    // String str.equals(str)   - Case senseitive
    val comparingStrings = string11.equals(string22)   // Check each char comparion  : False
    println(f" comparingStrings case sensitive: $comparingStrings ")

    // String str.equalsIgnoreCase(str)   - Not Case senseitive
    val comparingStrings_ = string11.equalsIgnoreCase(string22)   // Check each char comparion  : True
    println(f" comparingStrings_ Non-Case Sensitive : $comparingStrings_ ")

    println(f"Split :")
    val splitPizza = "Pizza Dough,Tomato Sauce,Cheese,Toppings of Choice".split(",")
    println(splitPizza, splitPizza.getClass)
    splitPizza.foreach(println)


    //   6. Regular Expression (Replace)
    //   Syntax: string.replaceFirst("SearchExpression", "ReplaceExpression")
    //   */
    // replaceFirst
    val replaceIn = "8201530"
    val replaced = replaceIn.replaceFirst("[01]", "X")   //replaceing First occurance of 0 or 1 with X
    println(f" Replace String: 8201530 : with [01] -  $replaced ")

    val regularExp = "H".r
    val replacestr = "Hello World!"
    val replacedstr = regularExp.replaceFirstIn(replacestr,"J")  // Replacing First occurance of "H" with "J"
    println(f" Replace String: Hello World! : with 'J' -   $replacedstr")

    // replaceAll
    val replaceAllIn = "8201530"
    val replacedAllnum = replaceAllIn.replaceAll("[01]", "X")   //Preplace All occurances of 0 & 1 with X
    println(f" Replace String: 8201530 : with All [01] -  $replacedAllnum ")

    val regularAllExp = "[a-z]+".r
    val replaceAllstr = "dk79rx5c4lj2c8ge"
    val replacedAllStr = regularAllExp.replaceAllIn(replaceAllstr,"1")
    println(f" Replace String: dk79rx5c4lj2c8ge : replace all [a-z] with 1 -   $replacedAllStr")

    println(f"This is Test Comment")

  }
}
