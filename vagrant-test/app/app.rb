require "rubygems"
require "sinatra"
require "sinatra/base"
require "sinatra/reloader"
require 'mysql'

before do
	@client = Mysql.connect('localhost', 'root', 'root', 'test')
end

get "/ping" do
	"pong"
end

get "/api/test" do
	result = ""
	@client.query("SELECT * FROM test_table;").each do |text|
		result = text
	end
	result
end

post "/api/test" do
	stmt = @client.prepare("INSERT INTO test_table VALUES(1, ?);")
	stmt.execute("hoge")
end
