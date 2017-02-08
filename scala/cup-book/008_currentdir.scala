val filesHere = (new java.io.File(".")).listFiles

/*
for (
  file <- filesHere
  if file.isFile
  if file.getName.endsWith(".scala")
     
)println(file)
*/

val scalaFile = filesHere.filter ( file => 
  file.isFile && 
  file.getName.endsWith(".scala")
)

scalaFile.map( file => 
  println(file)
)

