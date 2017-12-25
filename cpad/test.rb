
STDIN.each_line {|line|
  line = line.split("{")[1]
  raw_colors = line.split("}")[0]
  flower = line.split("}")[1]
  colors = raw_colors.split(",")

  for color in colors do
    puts color + flower
  end
}



