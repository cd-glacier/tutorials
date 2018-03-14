FROM ruby:2.3.3
RUN apt-get update -qq && apt-get install -y build-essential libpq-dev nodejs
WORKDIR /src
COPY ./src/Gemfile /src/Gemfile
COPY ./src/Gemfile.lock /src/Gemfile.lock
RUN bundle install
COPY ./src /src
