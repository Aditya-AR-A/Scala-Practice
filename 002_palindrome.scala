// Implement a function that checks if a string is a palindrome.

import scala.util.control.Breaks._

def isPalindrome(str: String): Boolean = {
    val cleanString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase
    val len: Int = cleanString.length
    var isPalindromic = true

    breakable {
        for (i <- 0 until len / 2) {
            if (cleanString(i) != cleanString(len - i - 1)) {
                isPalindromic = false
                break() // Exit the loop
            }
        }
    }

    isPalindromic
}

@main def main(): Unit = {
    val str: String = "baanab"
    val result = isPalindrome(str)
    if (result) {
        println(s">>> $str is a Palindrome")
    } else {
        println(s">>> $str is not a Palindrome")
    }
}

