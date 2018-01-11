
build: base-build
	tar -czf website.tar website/
	docker build -t web-image .

base-build:
	docker build -t web-base -f Dockerfile.base .

logger-build:
	docker build -t log-image -f Dockerfile.log .

run:
	# go to http://localhost/website
	docker run -d -p 80:80 web-image
