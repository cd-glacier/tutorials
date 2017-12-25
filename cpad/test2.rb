require 'net/http'
require 'uri'
require 'json'


to = ARGV[1]
from = ARGV[0]

def parseUri(to) 
  return URI.parse('https://pn-c9759a75.herokuapp.com/' + to) 
end

def ship(from, to)
  puts from 

  if from.to_s == to.to_s
    return
  end

  uri = parseUri(from)
  https = Net::HTTP.new(uri.host, uri.port)
  https.use_ssl = true
  res = https.start {
    https.get(uri.request_uri)
  }

  body = JSON.parse(res.body)
  routes = body["routes"]
  address = body["address"]

  routes.each{ |k, v|
    if to.to_s.include?(k.to_s) then
      ship(v, to)
      return
    end
  }
  ship(routes["default"], to)
end

ship(from, to)
