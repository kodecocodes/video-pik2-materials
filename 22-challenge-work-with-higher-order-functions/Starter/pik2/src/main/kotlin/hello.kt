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

/*
Challenge:

In this final challenge, you will have a list of app names with associated ratings they’ve been given.
Note — these are all fictional apps!

Create the data map like so:

    val appRatings = mapOf(
      "Calendar Pro" to arrayOf(1, 5, 5, 4, 2, 1, 5, 4),
      "The Messenger" to arrayOf(5, 4, 2, 5, 4, 1, 1, 2),
      "Socialise" to arrayOf(2, 1, 2, 2, 1, 2, 4, 2)
    )

First,
- create a map called `averageRatings` which will contain a mapping of app names to average ratings.

- Use forEach to iterate through the appRatings map,

- then use `reduce` to calculate the average rating and store this rating in the `averageRatings` map.

- Finally, use `filter` and `map` chained together to get a list of the app names whose average rating is greater than 3.
 */

fun main() {
  val appRatings = mapOf(
    "Calendar Pro" to arrayOf(1, 5, 5, 4, 2, 1, 5, 4),
    "The Messenger" to arrayOf(5, 4, 2, 5, 4, 1, 1, 2),
    "Socialise" to arrayOf(2, 1, 2, 2, 1, 2, 4, 2)
  )
}