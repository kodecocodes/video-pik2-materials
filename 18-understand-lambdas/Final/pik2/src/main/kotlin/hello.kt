/*
 * Copyright (c) 2022 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * This project and source code may use libraries or frameworks that are
 * released under various Open-Source licenses. Use of those libraries and
 * frameworks are governed by their own individual licenses.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

fun main() {
  val email: String? = "mail@mail.com"
  val password: String? = "password"

  fun validateString(input: String?, inputType: String) =
    if (input == null || input.isBlank()) {
      false
    } else if (inputType == "Password") {
      input.length >= 10
    } else if (inputType == "Email") {
      input.contains("@")
    } else {
      println("Cannot verify this input type")

      false
    }

  fun validateString(input: String?, validator: (String) -> Boolean) =
    if (input == null || input.isBlank()) {
      false
    } else {
      validator(input)
    }

  validateString("Hello World", "Welcome Message")

  val isValidEmail = validateString(email, "Email")
  println(isValidEmail)

//  val isValidPassword = validateString(password, { it.length >= 10 })
  val isValidPassword = validateString(password) { input -> input.length >= 10 }
  println(isValidPassword)

  fun validatePassword(password: String) = password.length >= 10

  val isValidPword = validateString(password, ::validatePassword)
  println(isValidPword)

  val passwordValidator = ::validatePassword
  println(passwordValidator("Weak PW"))

  val validator: (String?) -> Boolean = {input ->
    input != null && validatePassword(input)
  }
  println(validator("ReallyStrongPassword123"))
}