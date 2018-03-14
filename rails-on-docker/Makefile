
init:
	cd src && echo "source 'https://rubygems.org'" >> Gemfile
	cd src && echo "gem 'rails'" >> Gemfile
	cd src && touch Gemfile.lock
	docker-compose run web rails new . --force --database=mysql
	docker-compose build

up:
	docker-compose up -d

clean:
	rm -rf src
	mkdir src
