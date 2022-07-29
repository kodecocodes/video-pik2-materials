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
//  val country1 = "Benin"
//  val country2 = "Burkina Faso"
//  val country3 = "Cape Verde"

  val countries = arrayOf(
    "Benin", "Burkina Faso", "Cape Verde", "Côte D'Ivoire",
    "Gambia", "Ghana", "Guinea", "Guinea-Bissau", "Liberia",
    "Mali", "Mauritania", "Niger", "Nigeria", "Senegal", "Sierra Leone", "Togo"
  )

  println(countries)
  println(countries.size)
  println(countries[3])
  println(countries.get(3))

//  println(countries[20])
//  println(countries[-1])

  val updatedArray = countries + "Mauritius"
  println(updatedArray.size)

  countries[3] = "Ivory Coast"
  println(countries[3])

  val sizedArray = Array(10) {""}
  val emptyArray = emptyArray<String>()

  val arrayOfInts = intArrayOf(2, 3, 4, 5, 6, 7)
  println(arrayOfInts)

  val intArray = IntArray(10)
  println(intArray)

  println(countries.lastIndex)
  println(countries.last())
  println(countries.first())

  val currentCountry = "Mauritius"
  println(countries.contains(currentCountry))

  val isWestAfricanCountry = currentCountry in countries
  val isNotWestAfricanCountry = currentCountry !in countries

  println(isWestAfricanCountry)
  println(isNotWestAfricanCountry)
}