object Q2_10 {
  def countLetterOccurrences(words: List[String]): Int = {
    // Map each word to its length (number of letters)
    val wordLengths = words.map(_.length)

    // Reduce the list of word lengths to calculate the total count
    val totalLetterCount = wordLengths.reduce((count1, count2) => count1 + count2)

    totalLetterCount
  }

  def main(args: Array[String]): Unit = {
    val wordList = List("apple","banana","cherry","date")
    val totalCount = countLetterOccurrences(wordList)
    println(s"Total letter occurrences: $totalCount")
  }
}
