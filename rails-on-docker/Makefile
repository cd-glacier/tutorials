
init:
	cd src && echo "source 'https://rubygems.org'" >> Gemfile
	cd src && echo "gem 'rails', '5.0.0.1'" >> Gemfile
	cd src && touch Gemfile.lock
	docker-compose run web rails new . --force --database=mysql
	docker-compose build

up:
	docker-compose up


