FileMatcher.filesEnding("scala").map{ println(_) }
println("")
FileMatcher.filesContaining("hello").map{ println(_) }
println("")
FileMatcher.filesContaining("rational").map{ println(_) }

object FileMatcher {
  private val filesHere = (new java.io.File(".")).listFiles

  // mather (String, String) を引数としてとるわけではなく
  // (String, String)を必要な要素
  def fileMatching(matcher: String => Boolean) = {
    filesHere.filter ( file => 
      file.isFile &&
      matcher(file.getName)  // _.endsWith(_)
    )
  }

  def filesEnding(query: String) = fileMatching(_.endsWith(query))

  def filesContaining(query: String) = fileMatching(_.contains(query))

  def filesRedux(query: String) = fileMatching(_.matches(query))
  
  /*
  def filesEnding(query: String) = filesHere.filter ( file => 
    file.isFile && 
    file.getName.endsWith(query)
  )

  def filesContaining(query: String) = filesHere.filter (file => 
    file.isFile &&
    file.getName.contains(query)
  )

  def filesRedux(query: String) = filesHere.filter (file => 
    file.isFile &&
    file.getName.matches(query)
  )
  */
}



